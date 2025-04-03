package com.example.board_CRUD.repository;

import com.example.board_CRUD.entity.Board;
import com.example.board_CRUD.dto.BoardListResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<BoardListResponseDto> findAllByOrderByModifiedAtDesc();
}