package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

@Service
//方法1
//@Scope(value=SCOPE_PROTOTYPE)
//方法2
//@RequestScope
public class GreetingService {

    String sayHi() {
        return "hello world";
    }
}
