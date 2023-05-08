package com.inshyimboweb.inshyimbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.inshyimboweb.inshyimbo.model.Leader;
import com.inshyimboweb.inshyimbo.model.Level;
import com.inshyimboweb.inshyimbo.service.LeaderService;
// import com.inshyimboweb.inshyimbo.service.LevelService;


@RestController
@RequestMapping("/leader")
public class ILeaderController{
    @Autowired
    LeaderService leaderService;

    // @Autowired
    // LevelService levelService;

    @PostMapping("/save")
    public ResponseEntity<Leader> saveLeader(@RequestBody Leader leader) {
        Leader savedLeader = leaderService.saveLeader(leader);
        return new ResponseEntity<>(savedLeader, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteLeader(@RequestParam String Id) {
        Boolean isDeleted = leaderService.deleteLeader(Id);
        return new ResponseEntity<>(isDeleted, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<Leader> updateLeader(@RequestBody Leader leader) {
        Leader savedleader = leaderService.updateLeader(leader);
        return new ResponseEntity<>(savedleader, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<Leader> getLeader(@RequestParam  String Id) {
        Leader savedLeader = leaderService.getLeader(Id);
        return new ResponseEntity<>(savedLeader, HttpStatus.FOUND);
    }

    @GetMapping("/get-all-by")
    public ResponseEntity<List<Leader>> findAllByLevel(@RequestBody Level level) {
        return null;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Leader>> findAll() {
        List<Leader> leaders = leaderService.findAll();
        return new ResponseEntity<>(leaders, HttpStatus.FOUND);
    }
    
}
