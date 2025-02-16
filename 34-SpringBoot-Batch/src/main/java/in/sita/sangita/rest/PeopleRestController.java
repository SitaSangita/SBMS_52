package in.sita.sangita.rest;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleRestController {
	@Autowired
	private JobLauncher jobLuncher;
	
	@Autowired
	private Job job;
	
	@GetMapping("/import")
	public void sendDataToDB() throws Exception {
		JobParameters jobParameter=new JobParametersBuilder()
									.addLong("startat",System.currentTimeMillis())
									.toJobParameters();
		
		jobLuncher.run(job, jobParameter);
		}
}
