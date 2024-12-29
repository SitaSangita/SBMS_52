package in.ashokit.log;


import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class UserLoggingService {
	public void saveUser() {
		log.trace("This is trace msg");
		log.debug("This is debug msg");
		log.info("This is info msg");
		log.warn("This is warn msg");
		log.error("This is error msg");
	}


}
