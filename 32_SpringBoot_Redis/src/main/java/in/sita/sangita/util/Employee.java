package in.sita.sangita.util;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@RedisHash("EmployeeHash")
@Data
public class Employee {
	@Id
	private Integer id;
	private String name;

}
