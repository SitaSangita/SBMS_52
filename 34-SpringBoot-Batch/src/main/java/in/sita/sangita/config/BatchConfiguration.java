package in.sita.sangita.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

import in.sita.sangita.batch.PersonItemProcessor;
import in.sita.sangita.rcord.Person;

@Configuration
public class BatchConfiguration {

	
	@Bean
	  public FlatFileItemReader<Person> reader() {
	    return new FlatFileItemReaderBuilder<Person>()
	      .name("personItemReader")
	      .resource(new ClassPathResource("people.csv"))
	      .delimited()
	      .names("firstName", "lastName")
	      .targetType(Person.class)
	      .build();
	  }
	  @Bean
	  public PersonItemProcessor processor() {
		  return new PersonItemProcessor();
	  }
	  @Bean
	  public JdbcBatchItemWriter<Person> writer(DataSource dataSource){
		  return new JdbcBatchItemWriterBuilder<Person>()
				  .sql("INSERT INTO people (first_name, last_name) VALUES (:firstName, :lastName)")
				  .dataSource(dataSource)
				  .beanMapped()
				  .build();
	  }
	  
	  @Bean
	  public Job importUserJob(JobRepository jobRepository, Step step1) {
		return new JobBuilder("importUserJob",jobRepository)
				.start(step1)
				.build();
		  
	  }
	  
	  @Bean
	  public Step step1(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager,
			  JdbcBatchItemWriter<Person> batchItemWriter, FlatFileItemReader<Person> fileItemReader , PersonItemProcessor processor) {
		  return new StepBuilder("step1",jobRepository)
				  .<Person,Person> chunk(3,platformTransactionManager)
				  .reader(fileItemReader)
				  .processor(processor)
				  .writer(batchItemWriter)
				  .build();
	  }
	  
	   
	  
}
