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

import com.inshyimboweb.inshyimbo.model.Level;
import com.inshyimboweb.inshyimbo.service.LevelService;

@RestController
@RequestMapping("/level")
public class ILevelController {
    @Autowired
    LevelService levelService;

    @PostMapping("/save")
    public ResponseEntity<Level> saveLevel(@RequestBody Level level){
        Level savedLevel = levelService.addLevel(level);
        return new ResponseEntity<>(savedLevel, HttpStatus.CREATED);
    }
    
    @GetMapping("/get")
    public ResponseEntity<Level> getLevel(@RequestParam String Id){
        System.out.println(Id);
        Level savedLevel = levelService.getLevel(Id);
        return new ResponseEntity<>(savedLevel, HttpStatus.FOUND);
    }
    
    @PostMapping("/update")
    public ResponseEntity<Level> updateLevel(@RequestBody Level level){
        Level savedLevel = levelService.updateLevel(level);
        return new ResponseEntity<>(savedLevel, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteLevel(@RequestParam String Id){
        Boolean isDeleted = levelService.deleteLevel(Id);
        return new ResponseEntity<>(isDeleted, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Level>> findAll(){
        List<Level> levels = levelService.findAll();
        return new ResponseEntity<>(levels, HttpStatus.FOUND);
    }
}
