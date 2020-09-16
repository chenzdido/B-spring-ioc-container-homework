package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bar {

    private Foo foo;

    //方法1
    /*public Bar(@Lazy Foo foo) {
        this.foo = foo;
    }*/

    public Bar(Foo foo) {
        this.foo = foo;
    }

    //方法2
    /*@Autowired
    public void setFoo(Foo foo) {
        this.foo = foo;
    }*/

    //方法3
    @PostConstruct
    public void init() {
        foo.setBar(this);
    }

    public void hi() {
        System.out.println("Hi, " + foo.name());
    }

    public String name() {
        return "Bar";
    }
}
