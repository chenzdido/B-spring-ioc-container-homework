package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Foo {

    private Bar bar;

    /*public Foo(Bar bar) {
        this.bar = bar;
    }*/

    //方法2
    /*@Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
    }*/

    //方法3
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }
}
