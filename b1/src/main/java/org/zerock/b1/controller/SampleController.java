package org.zerock.b1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class SampleController {
    

    @GetMapping("/ex1")
    public String[] ex1(){
        log.info("ex1.............");
        return new String[] {"AAA","BBB","CCC"};
    }
}