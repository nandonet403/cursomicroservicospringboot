package br.com.nandonet6666.rest_with_spring_boot_and_java_fazenda.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.nandonet6666.rest_with_spring_boot_and_java_fazenda.modal.Greeting;

@RestController
public class GreetingController {

    private static final String template = "Hello , %s!";
    private static AtomicLong count = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Word") String name){
        

        return new Greeting(count.incrementAndGet(), String.format(template , name));
        }
}
