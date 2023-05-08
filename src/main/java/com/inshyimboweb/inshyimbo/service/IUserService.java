package com.inshyimboweb.inshyimbo.service;

import com.inshyimboweb.inshyimbo.model.IUser;

public interface IUserService {
    public IUser addIUser(IUser IUser);
    public Boolean deleteIUser(String Id);
    public IUser updateIUser(IUser IUser);

    public Boolean rateLeader(int rating);
}
