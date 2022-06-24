package com.belajar.LatihanBelajarAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.belajar.LatihanBelajarAPI.model.User;
import com.belajar.LatihanBelajarAPI.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserService userService;

	@CrossOrigin
	@GetMapping("/users")
	public List<User> list() {
		return userService.listAllUser();
	}

	@CrossOrigin
	@GetMapping("/users/{id}")
	public ResponseEntity<User> users(@PathVariable int id) {
		try {
			User user = userService.getUser(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@PostMapping("/users")
	public ResponseEntity<?> users(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<>("Berhasil Simpan Data User: " + user.getFirstName(), HttpStatus.OK);
	}

	@CrossOrigin
	@PutMapping("/users/{id}")
	public ResponseEntity<?> update(@RequestBody User user, @PathVariable int id) {
		try {
			User existUser = userService.getUser(id);
			if (existUser.getId() != id) {
				return new ResponseEntity<>("ID Tidak Ada !!",HttpStatus.OK);
			}
			user.setId(id);
			userService.saveUser(user);
			return new ResponseEntity<>("Data "+ user.getFirstName() + " berhasil di update", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable int id) {
		userService.deleteUser(id);
	}

}
