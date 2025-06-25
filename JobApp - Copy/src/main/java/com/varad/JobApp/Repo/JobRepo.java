package com.varad.JobApp.Repo;

import com.varad.JobApp.Model.Job;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
}
