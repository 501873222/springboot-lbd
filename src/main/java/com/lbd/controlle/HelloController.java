package com.lbd.controlle;

import com.lbd.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kassdin on 2018/4/17.
 */
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String hello(){
        return "hello springboot!";
    }

    @GetMapping("/person")
    public Person person1(){
        return person;
    }
}
