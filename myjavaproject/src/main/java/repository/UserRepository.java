package repository;

import org.springframework.data.repository.CrudRepository;

import model.User;

public interface UserRepository extends CrudRepository<User,Long>{
	
//	public User save(List<User> user);

}
