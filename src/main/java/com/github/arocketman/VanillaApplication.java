package com.github.arocketman;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VanillaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanillaApplication.class, args);
	}


	/*@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repository, UserService service) throws Exception {
		//Setup a default user if db is empty
		if (repository.count()==0)
			service.save(new User("user", "user", Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));
		builder.userDetailsService(userDetailsService(repository)).passwordEncoder(passwordEncoder);
	}

	private UserDetailsService userDetailsService(final UserRepository repository) {
		return username -> new CustomUserDetails(repository.findByUsername(username));
	}*/

}
