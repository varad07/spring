package com.dxc.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public void compile(){
        System.out.println("compiling in laptop");
    }
}
