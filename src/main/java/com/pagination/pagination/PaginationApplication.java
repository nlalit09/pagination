package com.pagination.pagination;

import com.pagination.pagination.Service.PeopleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PaginationApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(PaginationApplication.class, args);
		PeopleService bean = context.getBean(PeopleService.class);
		//bean.saveUsers();
		//bean.getAllPeople();
		bean.paginationrequest();
	}

}
