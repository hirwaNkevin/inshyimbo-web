package com.inshyimboweb.inshyimbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inshyimboweb.inshyimbo.model.Level;
import com.inshyimboweb.inshyimbo.repo.LevelRepo;

@Service
public class LevelServiceImpl implements LevelService{

@Autowired
LevelRepo repo;

@Override
public Level addLevel(Level level) {
    return repo.save(level);
}

@Override
public Boolean deleteLevel(String Id) {
    Level levelToDelete = (Level) repo.findById(Id).orElse(null);
    if(levelToDelete != null) {
        repo.delete(levelToDelete);
        return true;
    }
    return false;
}

@Override
public Level updateLevel(Level level) {
    Level level2Update = (Level) repo.findById(level.getId()).orElse(null);
    if (level2Update != null) {
        level2Update.setId(level.getId());
        level2Update.setName(level.getName());
        repo.save(level2Update);
        return level2Update;
    }
    return null;
}

@Override
public Level getLevel(String Id) {
    return (Level) repo.findById(Id).orElse(null);
}

@Override
public List<Level> findAll() {
    return repo.findAll();
}

}