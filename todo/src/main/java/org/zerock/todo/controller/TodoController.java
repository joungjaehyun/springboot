package org.zerock.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.todo.dto.PageRequestDTO;
import org.zerock.todo.dto.PageResponseDTO;
import org.zerock.todo.dto.TodoDTO;
import org.zerock.todo.service.TodoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/todo")
public class TodoController {
    
    private final TodoService todoService;

    @GetMapping("/list")
    public void getList(PageRequestDTO pageRequestDTO, Model model) {
        PageResponseDTO<TodoDTO> pageResponseDTO
        = todoService.getList(pageRequestDTO);

        model.addAttribute("pageResponseDTO", pageResponseDTO);

    }

    @GetMapping("/read/{tno}")
    public String read(@PathVariable("tno") Long tno, PageRequestDTO pageRequestDTO, Model model) {

        log.info("read ......");
        log.info(tno);

        TodoDTO todoDTO = TodoDTO.builder()
        .tno(tno)
        .title("Sample")
        .writer("user00")
        .dueDate("2023-06-14")
        .build();
        
        model.addAttribute("todo", todoDTO);

        return "/todo/read";

    }
}
    
