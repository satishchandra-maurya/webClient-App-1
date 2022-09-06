package in.satish.service;

import java.awt.print.Book;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.satish.binding.Course;

@Service
public class BookService {
	// this methid getting the data in String Format as it is json
	/*
	public void invokeGetCourse() {
					// this is url where data is availbale
		String apiUrl = "https://sms-backend-app.herokuapp.com/course"; 
		WebClient client = WebClient.create(); // create the object for WebClient interface of Implementation class
			String body = client.get()  // http get request method
				  .uri(apiUrl)  // this means that setting the url
				  .retrieve()  // this is getting the data as Response Body
				  .bodyToMono(String.class) // bind data response body to String variable
				  .block();  // this method makes it as synchrnous
			 
		System.out.println(body);
	}
     */
	// this method is used to get data in the object format
	public void invokeGetCourse() {
		String apiUrl = "https://sms-backend-app.herokuapp.com/course";
		WebClient client = WebClient.create();
			Course[] responsData = client.get()
				.uri(apiUrl)
				.retrieve()
				.bodyToMono(Course[].class)
				.block();
			
			for(Course c:responsData) {
				System.out.println(c);
			}
			
		  
			
				
	}
	
	
	
	// this method is used to send data to the server
	public void saveCourse() {
		Course course = new Course();
		course.setCourseName("Angular");
		course.setDuration("5 Months");
		course.setCourseFee(6000.00);
		
		String apiUrl = "https://sms-backend-app.herokuapp.com/course"; 
		WebClient client = WebClient.create();
			String res = client.post()
				.uri(apiUrl)
				.bodyValue(course)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		System.out.println(res);
	}
	
}
