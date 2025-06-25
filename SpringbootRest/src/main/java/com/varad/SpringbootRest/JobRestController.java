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

    @GetMapping("jobpost/{id}")
    public Job getJob(@PathVariable("id") int id){
        return service.getJob(id);
    }

    @PostMapping("jobpost")
    public Job addJob(@RequestBody Job job){
        service.addJob(job);
        return service.getJob(job.getId());
    }
    @PutMapping("jobpost")
    public Job updateJob(@RequestBody Job job){
        service.updateJob(job);
        return service.getJob(job.getId());
    }

    @DeleteMapping("jobpost/{id}")
    public String deleteJob(@PathVariable int id){
        service.deleteJob(id);
        return "deleted";
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }

    @GetMapping("jobposts/keyword/{keyword}")
    public List<Job> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }

}
