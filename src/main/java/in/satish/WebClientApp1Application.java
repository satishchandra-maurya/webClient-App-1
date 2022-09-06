package in.satish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.satish.service.BookService;

@SpringBootApplication
public class WebClientApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebClientApp1Application.class, args);
		BookService bean = context.getBean(BookService.class);
		bean.invokeGetCourse();
		//bean.saveCourse();
	}

}
