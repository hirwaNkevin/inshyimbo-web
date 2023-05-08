package com.inshyimboweb.inshyimbo.service;

import java.util.List;

import com.inshyimboweb.inshyimbo.model.Level;

public interface LevelService {
    public Level addLevel(Level level);
    public Boolean deleteLevel(String Id);
    public Level updateLevel(Level level);
    public Level getLevel(String Id);

    public List<Level> findAll();
}
