package com.varad.SpringbootRest.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Job {
    private String title;
    private String company;
    private String description;
    private String location;
    private String salary;

}
