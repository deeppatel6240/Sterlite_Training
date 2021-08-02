package com.phoenix.services;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 2/08/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * Description:
 *    User service implementation class for user in business layer
 */
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phoenix.entities.User;
import com.phoenix.exceptions.UserAlreadyExistException;
import com.phoenix.exceptions.UserNotFoundException;
import com.phoenix.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User findByUsername(String username) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> op = userRepo.findById(username);
		
		/*
		 * if (op.isPresent()) return op.get(); else throw new
		 * UserNotFoundException("Sorry! " + username + " is not found.");
		 */
		
		return userRepo.findById(username)
				.orElseThrow(() -> new UserNotFoundException("Sorry! " + username + " is not found."));
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void add(User user) throws UserAlreadyExistException {
		// TODO Auto-generated method stub
		
		Optional<User> op = userRepo.findById(user.getUsername());
		
		if (op.isPresent()) {
			throw new UserAlreadyExistException("User already exist");
		} else {
			userRepo.save(user);
		}
		
		
	}

	@Override
	public void edit(User user) {
		// TODO Auto-generated method stub
		Optional<User> op = userRepo.findById(user.getUsername());
		
		if (op.isPresent()) {
			userRepo.save(user);
		} else {
			System.out.println("Sorry! user not found.");
		}
			
	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub
		Optional<User> op = userRepo.findById(user.getUsername());
		
		if (op.isPresent()) {
			userRepo.delete(user);
		} else {
			System.out.println("Sorry! user not found.");
		}
			
	}

}
