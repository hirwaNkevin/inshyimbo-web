package com.inshyimboweb.inshyimbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inshyimboweb.inshyimbo.model.Leader;
import com.inshyimboweb.inshyimbo.model.Level;
import com.inshyimboweb.inshyimbo.repo.LeaderRepo;

@Service
public class LeaderServiceImpl implements LeaderService{

    @Autowired
    LeaderRepo repo;

    @Override
    public Leader saveLeader(Leader leader) {
        return repo.save(leader);
    }

    @Override
    public Boolean deleteLeader(String Id) {
        Leader leaderToDelete = (Leader) repo.findById(Id).orElse(null);
        if(leaderToDelete != null){
            repo.delete(leaderToDelete);
            return true;
        }
        return false;
    }

    @Override
    public Leader updateLeader(Leader leader) {
        Leader leader2Update = (Leader) repo.findById(leader.getId()).orElse(null);
    if (leader2Update != null) {
        leader2Update.setId(leader.getId());
        leader2Update.setFullName(leader.getFullName());
        leader2Update.setLevel(leader.getLevel());
        repo.save(leader2Update);
        return leader2Update;
    }
    return null;
    }

    @Override
    public Leader getLeader(String Id) {
        return (Leader) repo.findById(Id).orElse(null);
    }

    @Override
    public List<Leader> findAllByLevel(Level level) {
        return repo.findAll(level.getId());
    }

    @Override
    public List<Leader> findAll() {
        return repo.findAll();
    }
    
}
