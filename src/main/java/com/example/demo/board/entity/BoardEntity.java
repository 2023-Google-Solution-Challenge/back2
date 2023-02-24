package com.example.demo.board.entity;


import com.example.demo.board.dto.BoardDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardMe;

    @Column
    private int boardHit;

    public static BoardEntity toSaveEntity(BoardDTO boardDto){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardTitle(boardDto.getBoardTitle());
        boardEntity.setBoardMe(boardDto.getBoardMe());
        boardEntity.setBoardHit(0);
        return boardEntity;
    }
}