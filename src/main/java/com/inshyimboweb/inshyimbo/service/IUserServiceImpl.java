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
        IUser user2Update = (IUser) repo.findById(user.getNID()).orElse(null);
    if (user2Update != null) {
        user2Update.setNID(user.getNID());
        user2Update.setFullName(user.getFullName());
        user2Update.setPassword(user.getPassword());
        repo.save(user2Update);
        return user2Update;
    }
    return null;
    }

    @Override
    public Boolean rateLeader(int rating, String leaderId) {
        Leader leader = leadRepo.findById(leaderId).orElse(null);
        leader.setRates(leader.getRates()+1);
        leader.setRating(calcRating(leader.getRates(), rating, leader.getRating()));
        return false;
    }

    public float calcRating(int rates, int rating, float leaderRating){
        leaderRating = ((rates*leaderRating) + rating)/(rates + 1);
        return leaderRating;
    }
    
}
