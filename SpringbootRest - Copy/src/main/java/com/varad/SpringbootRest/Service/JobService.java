package com.varad.SpringbootRest.Service;


import com.varad.SpringbootRest.Model.Job;
import com.varad.SpringbootRest.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(Job job){
        repo.addJob(job);
    }
    public List<Job> getAllJobs(){
        return repo.getAllJobs();
    }

    public Job getJob(String it) {
        return repo.getJob(it);    }

    public void updateJob(Job job) {
         repo.updateJob(job);
    }

    public void deleteJob(String cmp) {
        repo.deleteJob(cmp);
    }
}
