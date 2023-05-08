package com.inshyimboweb.inshyimbo.service;

import java.util.List;

import com.inshyimboweb.inshyimbo.model.Leader;
import com.inshyimboweb.inshyimbo.model.Level;

public interface LeaderService {
    public Leader saveLeader(Leader leader);
    public Boolean deleteLeader(String Id);
    public Leader updateLeader(Leader leader);
    public Leader getLeader(String Id);
    
    public List<Leader> findAllByLevel(Level level);
}
