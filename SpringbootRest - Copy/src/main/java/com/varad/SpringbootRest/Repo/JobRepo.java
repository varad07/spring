package com.varad.SpringbootRest.Repo;


import com.varad.SpringbootRest.Model.Job;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


@Repository
public class JobRepo {

    List<Job> jobs = new ArrayList<>(Arrays.asList(
            new Job("Java Develpoer","DXC","Develpoe Java App","Pune","100000"),
            new Job(".net Develpoer","Infosys","Develpoe .net App","Mumbai","250000"),
            new Job("C++ Develpoer","TCS","Develpoe c++ App","Banglore","150000"),
            new Job("Web Develpoer","Wipro","Develpoe web App","Hyderabad","210000")



    ));
    public List<Job> getAllJobs(){
        return jobs;
    }
    public void addJob(Job job){
        jobs.add(job);
        System.out.println(jobs);
    }
    public Job getJob(String it){
        for(Job job:jobs){
            if(Objects.equals(job.getCompany(), it)){
                return job;
            }
        }

        return null;
    }

    public void updateJob(Job job) {
        for(Job job1: jobs){
            if(Objects.equals(job1.getCompany(), job.getCompany())){
               job1.setCompany(job.getCompany());
               job1.setLocation(job.getLocation());
               job1.setTitle(job.getTitle());
               job1.setDescription(job.getDescription());
               job1.setSalary(job.getSalary());
            }
        }
    }

    public void deleteJob(String cmp) {
        for(Job job: jobs){
            if(Objects.equals(job.getCompany(), cmp)){
                jobs.remove(job);
            }
        }
    }
}
