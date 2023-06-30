package com.example.demo;

import com.example.demo.repo.UserRepository;
import com.example.demo.repo2.User2Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private User2Repository user2Repo;

	@Test
	void contextLoads() {
		userRepo.findAll().forEach(data -> {
			System.out.println("Data Source 1 : ");
			System.out.println("Id : " + data.getId());
			System.out.println("Username : " + data.getUsername());
			System.out.println("Password : " + data.getPassword());
			System.out.println("Active : " + data.isActive());
			System.out.println("==================");
		});

		user2Repo.findAll().forEach(data -> {
			System.out.println("Data Source 2 : ");
			System.out.println("Id : " + data.getId());
			System.out.println("Username : " + data.getUsername());
			System.out.println("Password : " + data.getPassword());
			System.out.println("Active : " + data.isActive());
			System.out.println("==================");
		});
	}

}
