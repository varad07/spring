package com.varad.SpringbootRest.Service;


import com.varad.SpringbootRest.Model.Job;
import com.varad.SpringbootRest.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;


    public void addJob(Job job){
        repo.save(job);
    }
    public List<Job> getAllJobs(){
        return repo.findAll();
    }

    public Job getJob(int id) {
        return repo.findById(id).orElse(new Job());    }

    public void updateJob(Job job) {
         repo.save(job);
    }

    public void deleteJob(int id) {
        repo.deleteById(id);
    }
    public void load(){
        List<Job> jobs = new ArrayList<>(Arrays.asList(
                new Job(101,"Java Develpoer","DXC","Develpoe Java App","Pune","100000"),
                new Job(102,".net Develpoer","Infosys","Develpoe .net App","Mumbai","250000"),
                new Job(103,"C++ Develpoer","TCS","Develpoe c++ App","Banglore","150000"),
                new Job(104,"Web Develpoer","Wipro","Develpoe web App","Hyderabad","210000")



        ));
        repo.saveAll(jobs);
    }

    public List<Job> search(String keyword) {
        return repo.findByTitleContainingOrDescriptionContaining(keyword,keyword);
    }
}
