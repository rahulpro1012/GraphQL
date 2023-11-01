package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private BookServices bookServices;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1=new Book();
		book1.setName("Hello Java");
		book1.setAuth("xyz");
		book1.setDesc("All about java");
		book1.setPrice(200.00);

		Book book2=new Book();
		book2.setName("Hello Js");
		book2.setAuth("abc");
		book2.setDesc("All about js");
		book2.setPrice(100.00);

		Book book3=new Book();
		book3.setName("Hello py");
		book3.setAuth("ijk");
		book3.setDesc("All about python");
		book3.setPrice(50.00);

		this.bookServices.create(book1);
		this.bookServices.create(book2);
		this.bookServices.create(book3);
	}
}
