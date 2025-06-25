package com.varad.SpringbootRest.Repo;


import com.varad.SpringbootRest.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<Job,Integer> {

    List<Job> findByTitleContainingOrDescriptionContaining(String Title,String Description);



}
