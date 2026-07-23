package com.example.store;

import com.example.store.entities.Address;
import com.example.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);

//		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		OrderService orderService = context.getBean(OrderService.class);
//		orderService.placeOrder();
//		context.close();

//		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		var userService = context.getBean(UserService.class);
//		userService.registerUser(new User(1L, "dex@gmail.com","123123","Dex"));

		// var user  = new User(1L, "user", "email", "password");
		User user = User.builder()
				.id(1L)
				.name("dex")
				.email("dex@gmail.com")
				.password("123")
				.build();

		var address = Address.builder()
				.id(1L)
				.street("street")
				.zip("zip")
				.city("city")
				.state("state")
				.build();

		user.addAddress(address);
		System.out.println(user);

	}

}
