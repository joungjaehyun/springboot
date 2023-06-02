package org.zerock.b2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class SampleController {
    

    @GetMapping("/ex2")
    public String[] newStrings() {

        log.info("SampleController.newStrings start.......");
        return new String[] { "AAA", "BBB", "CCCC" };
    }
}
