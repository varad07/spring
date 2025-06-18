package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alein {
//    @Autowired
//    @Qualifier("desktop")
    private Computer com;
    @Value("22")
    private int age;

//    public Alein(Computer com, int age) {
//        this.com = com;
//        this.age = age;
//    }

    public Alein(){
        System.out.println("Alien object created");
    }
    public Computer getCom() {
        return com;
    }
    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("coding ..");
        com.compile();
    }
}
