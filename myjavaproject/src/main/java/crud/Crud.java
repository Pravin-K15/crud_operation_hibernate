package crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import model.User;
import repository.UserRepository;

@SpringBootApplication
@EntityScan(basePackages = "model")
@EnableJpaRepositories("repository")
//@Component
public class Crud implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Crud.class, args);
	}
	
	@Autowired
	private UserRepository userRepo;

	public void run(String...args) throws Exception {

		User user = new User();
		
//create & update operation
		
//		user.setUser_id(3L);
//		user.setUsername("hhhhhhh");
//		user.setPassword("newpassword");
//		user.setFullname("Dinesh Kumar");
//		user.setEmail("9dineshkumar_s@singaporeair.com.sg");

//		System.out.println(user);
		
//		userRepo.save(user);
		
		
//read operation
		
//		Iterable<User> userList = userRepo.findAll();
//        userList.forEach((p) -> {
//            System.out.println(p.getUser_id());
//            System.out.println(p.getUsername());
//            System.out.println(p.getPassword());
//            System.out.println(p.getFullname());
//            System.out.println(p.getEmail());
//        });
		
//delete operation
		
//		userRepo.delete(user);
        
        
	}
}