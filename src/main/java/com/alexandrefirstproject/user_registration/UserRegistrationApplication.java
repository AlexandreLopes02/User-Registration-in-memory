package com.alexandrefirstproject.user_registration;

import com.alexandrefirstproject.user_registration.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserRegistrationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Alex", "a@b.com", 22, "123456");
		System.out.println(user);
	}
}
