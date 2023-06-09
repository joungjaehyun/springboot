package org.zerock.b1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/todo/")
public class TodoController {
    

    @GetMapping("list")
    public void list(){
        log.info("list get......");
    }

    @GetMapping("add")
    public void add(){
        log.info("add");
    }

@PostMapping("/add")
public String addPost(){
    log.info("addPost");
    return "redirect:/todo/list";
}

@GetMapping("read/{tno}")
public String read(){
    log.info("read");
    return "/todo/read";
}


    
@PostMapping("delete")
public String delete(){
    log.info("delete");
    return "redirect:/todo/read/{tno}";

}


@GetMapping("modify/{tno}")
public String modify(@PathVariable("tno") Long tno) {
    log.info("modify");
    return "/todo/modify";
}


@PostMapping("modify/{tno}")
public String modifyPost(@PathVariable("tno") Long tno){
    log.info("modifyPost");
    return "redirect:/todo/read/"+tno;
}
}
