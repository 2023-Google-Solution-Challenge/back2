package com.example.demo.board.dto;
;
import com.example.demo.board.entity.BaseEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Long id;
    private String boardMe;
    private String boardHits;
    private String boardTitle;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

    public static BoardDTO toBoardDTO(BaseEntity boardEntity){
       BoardDTO boardDTO = new BoardDTO();
       boardDTO.setId(boardEntity.getId());

        boardDTO.setBoardMe(boardEntity.getboardMe());
        boardDTO.setBoardTitle(boardEntity.getboardTitle());
        boardDTO.setBoardHits(boardEntity.getBoardHits());
        boardDTO.setBoardCreatedTime(boardEntity.getCreatedTime());
        boardDTO.setBoardUpdatedTime(boardEntity.getUpdatedTime());
        return boardDTO;
    }
    }

