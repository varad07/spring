package com.varad.SpringbootRest;

import com.varad.SpringbootRest.Model.Job;
import com.varad.SpringbootRest.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobposts")
    public List<Job> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobpost/{cmp}")
    public Job getJob(@PathVariable("cmp") String cmp){
        return service.getJob(cmp);
    }

    @PostMapping("jobpost")
    public Job addJob(@RequestBody Job job){
        service.addJob(job);
        return service.getJob(job.getCompany());
    }
    @PutMapping("jobpost")
    public Job updateJob(@RequestBody Job job){
        service.updateJob(job);
        return service.getJob(job.getCompany());
    }

    @DeleteMapping("jobpost/{cmp}")
    public String deleteJob(@PathVariable String cmp){
        service.deleteJob(cmp);
        return "deleted";
    }


}
