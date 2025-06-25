package com.varad.SpringbootRest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class Job {
    @Id
    private int id;
    private String title;
    private String company;
    private String description;
    private String location;
    private String salary;

}
