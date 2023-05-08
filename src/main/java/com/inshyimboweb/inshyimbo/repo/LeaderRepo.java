package com.inshyimboweb.inshyimbo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inshyimboweb.inshyimbo.model.Leader;

public interface LeaderRepo extends JpaRepository<Leader, String>{
    
}
