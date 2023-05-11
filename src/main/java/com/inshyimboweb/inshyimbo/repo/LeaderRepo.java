package com.inshyimboweb.inshyimbo.repo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.inshyimboweb.inshyimbo.model.Leader;
// import com.inshyimboweb.inshyimbo.model.Level;

public interface LeaderRepo extends JpaRepository<Leader, String>{
    List<Leader> findAll(Sort sort);

    @Query(value = "Select * from Leader where level_Id = :level", nativeQuery = true)
    List<Leader> findAll(@Param("level") String level);
}
