package com.inshyimboweb.inshyimbo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inshyimboweb.inshyimbo.model.IUser;

public interface IUserRepo extends JpaRepository<IUser, String>{
    
}
