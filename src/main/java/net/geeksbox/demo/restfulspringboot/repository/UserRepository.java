package net.geeksbox.demo.restfulspringboot.repository;

import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value="select * from [Users] where email=?1 and password_hash=?2",nativeQuery = true)
	public User checkAccount(String email,String password_hash);
	@Query(value="select * from Users where email=?",nativeQuery = true)
	public  Optional<User> checkemail(String email);
}
