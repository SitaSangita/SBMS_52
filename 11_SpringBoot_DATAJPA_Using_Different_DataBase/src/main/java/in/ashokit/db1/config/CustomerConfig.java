package in.ashokit.db1.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "db1EntityManagerFactory",
	    transactionManagerRef = "db1TransactionManager",
		basePackages = { "in.ashokit.db1.repo"
				
		}
)
@EntityScan(basePackages = "in.ashokit.db1.entity")
public class CustomerConfig {
	 	@Primary
	    @Bean(name = "db1DataSource")
	    public DataSource db1DataSource() {
	        return DataSourceBuilder.create()
	                .url("jdbc:mysql://localhost:3306/springdatabase") // Replace with your DB URL
	                .username("root")                         // Replace with your DB username
	                .password("root")                       // Replace with your DB password
	                .driverClassName("com.mysql.cj.jdbc.Driver") // MySQL Driver
	                .build();
	    }

	    @Primary
	    @Bean(name = "db1EntityManagerFactory")
	    public LocalContainerEntityManagerFactoryBean db1EntityManagerFactory(
	            EntityManagerFactoryBuilder builder,
	            @Qualifier("db1DataSource") DataSource db1DataSource) {
	        // Hibernate properties
	        HashMap<String, Object> properties = new HashMap<>();
	        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	        properties.put("hibernate.hbm2ddl.auto", "update"); // Automatically update schema
	        properties.put("hibernate.show_sql", "true"); // Show SQL queries

	        return builder
	        		   .dataSource(db1DataSource)
	                   .packages("in.ashokit.db1.entity") // Entity package
	                   .persistenceUnit("db1")
	                   .properties(properties) // Apply Hibernate properties
	                   .build();
	       }

	       @Primary
	       @Bean(name = "db1TransactionManager")
	       public PlatformTransactionManager db1TransactionManager(
	               @Qualifier("db1EntityManagerFactory") EntityManagerFactory db1EntityManagerFactory) {
	           return new JpaTransactionManager(db1EntityManagerFactory);
	       }
	   
  }



