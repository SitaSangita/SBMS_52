package in.sita.sangita.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private Integer uId;
	private String name;
	private String gender;
	private Double salary;

}
