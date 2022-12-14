package in.satish.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	private Integer id;
	private String courseName;
	private String duration;
	private Double courseFee;
}
