package com.example.users;

import com.example.users.entities.Role;
import com.example.users.entities.User;
import com.example.users.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UsersMicroserviceApplication {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

	/*@PostConstruct
	void init_users(){
		//ajouter les rôles
		userService.addRole(new Role(null,"ADMIN"));
		userService.addRole(new Role(null,"USER"));

		//ajouter les users
		userService.saveUser(new User(null,"admin","123",true,null));
		userService.saveUser(new User(null,"joel","123",true,null));
		userService.saveUser(new User(null,"beba","123",true,null));

		//ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("joel", "USER");
		userService.addRoleToUser("beba", "USER");
	}*/

	@Bean
	BCryptPasswordEncoder getBCE(){
		return new BCryptPasswordEncoder();
	}

}
