package com.varad.JobApp.Service;

import com.varad.JobApp.Model.Job;
import com.varad.JobApp.Repo.JobRepo;
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
}
