package org.zerock.todo.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
    
    private Long rno;
    @NotEmpty
    private Long tno;
    @NotEmpty
    private String reply;
    @NotEmpty
    private String replyer;
    @Builder.Default
    private Long gno =0L;

    private LocalDate replyDate;
    
    private int step;
}
