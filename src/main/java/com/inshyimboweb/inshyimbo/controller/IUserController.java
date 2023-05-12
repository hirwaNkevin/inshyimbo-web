package com.inshyimboweb.inshyimbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inshyimboweb.inshyimbo.model.IUser;
import com.inshyimboweb.inshyimbo.service.IUserService;

@RestController
@RequestMapping("/user")
public class IUserController {

    @Autowired
    IUserService userService;
    
    @PostMapping("/save")
    public ResponseEntity<IUser> addIUser(@RequestBody IUser IUser) {
        IUser savedUser = userService.addIUser(IUser);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<IUser> addIUser(@RequestParam String Id) {
        IUser savedUser = userService.getIUser(Id);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteIUser(@RequestParam String Id) {
        Boolean deletedUser = userService.deleteIUser(Id);
        return new ResponseEntity<>(deletedUser, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<IUser> updateIUser(@RequestBody IUser IUser) {
        IUser updatedUser = userService.updateIUser(IUser);
        return new ResponseEntity<>(updatedUser, HttpStatus.CREATED);
    }

    @PostMapping("/rate")
    public ResponseEntity<Boolean> rateLeader(@RequestParam int rating, @RequestParam String leaderId) {
        Boolean result = userService.rateLeader(rating, leaderId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
}
