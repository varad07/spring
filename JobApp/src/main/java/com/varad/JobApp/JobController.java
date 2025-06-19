package com.varad.JobApp;

import com.varad.JobApp.Model.Job;
import com.varad.JobApp.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/","home"})
    public String home(){
        return "home";
    }

    @RequestMapping("addJob")
    public  String addjob(){
        return "addjob";

    }

    @PostMapping("saveJob")
    public  String handleform(Job job){
        service.addJob(job);
        return "sucsess";
    }

    @GetMapping("allJobs")
    public String viewAllJobs(Model m){
        List<Job> jobs = service.getAllJobs();
        m.addAttribute("jobs",jobs);
        return "viewalljobs";
    }
}
