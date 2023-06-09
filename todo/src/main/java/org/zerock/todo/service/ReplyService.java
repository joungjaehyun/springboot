package org.zerock.todo.service;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.todo.dto.PageRequestDTO;
import org.zerock.todo.dto.PageResponseDTO;
import org.zerock.todo.dto.ReplyDTO;

@Transactional
public interface ReplyService {

    Long register (ReplyDTO replyDTO);
    
    PageResponseDTO<ReplyDTO> getList(Long tno, PageRequestDTO pageRequestDTO);

    ReplyDTO getOne(Long tno);

}
