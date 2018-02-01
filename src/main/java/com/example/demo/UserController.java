
package com.example.demo;

import com.querydsl.core.types.Predicate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author binod
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public ResponseEntity<?> findAll(@RequestParam String firstName){
    	if(userRepository.count()==0) {
    		User user=new User();
        	user.setAge(10);
        	user.setEmail("a1@gmail.com");
        	user.setFirstName("A");
        	userRepository.save(user);
    	}
    	
        Predicate allStudent=QUser.user.firstName.eq(firstName);
        List<User> allUsers=(List<User>) userRepository.findAll(allStudent);
        return ResponseEntity.ok(allUsers);
        
    }
    
}
