package com.inshyimboweb.inshyimbo.service;

import com.inshyimboweb.inshyimbo.model.IUser;
import com.inshyimboweb.inshyimbo.model.Leader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inshyimboweb.inshyimbo.repo.IUserRepo;
import com.inshyimboweb.inshyimbo.repo.LeaderRepo;

@Service
public class IUserServiceImpl implements IUserService{

    @Autowired
    IUserRepo repo;
    @Autowired
    LeaderRepo leadRepo;

    @Override
    public IUser addIUser(IUser IUser) {
        return repo.save(IUser);
    }

    @Override
    public Boolean deleteIUser(String Id) {
        IUser userToDelete = (IUser) repo.findById(Id).orElse(null);
        if(userToDelete != null){
            repo.delete(userToDelete);
            return true;
        }
        return false;
    }

    @Override
    public IUser updateIUser(IUser user) {
        IUser user2Update = (IUser) repo.findById(user.getId()).orElse(null);
    if (user2Update != null) {
        user2Update.setId(user.getId());
        user2Update.setFullName(user.getFullName());
        user2Update.setPassword(user.getPassword());
        repo.save(user2Update);
        return user2Update;
    }
    return null;
    }

    @Override
    public Boolean rateLeader(int rating, String leaderId) {
        Leader leader = (Leader) leadRepo.findById(leaderId).orElse(null);
        float calculatedRating = calcRating(leader.getRates(), rating, leader.getRating());
        if(calculatedRating != (float)0.0){
            leader.setRating(calculatedRating);
            leader.setRates(leader.getRates()+1);
            leadRepo.save(leader);
            return true;
        }
        return false;
    }

    public float calcRating(int rates, int rating, float leaderRating){
        leaderRating = ((rates*leaderRating) + rating)/(rates + 1);
        return leaderRating;
    }

    @Override
    public IUser getIUser(String Id) {
        return (IUser) repo.findById(Id).orElse(null);
    }
    
}
