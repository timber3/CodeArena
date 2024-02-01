package com.ssafy.codearena.board.service;

import com.ssafy.codearena.board.dto.BoardDetailDto;
import com.ssafy.codearena.board.dto.BoardResultDto;
import com.ssafy.codearena.board.dto.BoardWriteDto;
import com.ssafy.codearena.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;


    @Override
    public BoardResultDto boardDetail(String boardId) {

        BoardResultDto boardResultDto = new BoardResultDto();

        boardResultDto.setStatus("200");
        boardResultDto.setMsg("조회 성공");


        try {

            boardResultDto.setData(boardMapper.boardDetail(boardId));

        }
        catch (Exception e) {
            boardResultDto.setStatus("500");
            boardResultDto.setMsg("Server Internal Error");
        }

        return boardResultDto;
    }

    @Override
    public BoardResultDto boardList(Map<String, String> map) {
        return null;
    }

    @Override
    public BoardResultDto boardWrite(BoardWriteDto boardWriteDto) {

        BoardResultDto boardResultDto = new BoardResultDto();

        boardResultDto.setStatus("201");
        boardResultDto.setMsg("게시판 글쓰기 성공");

        try {
            boardMapper.boardWrite(boardWriteDto);
            boardResultDto.setData(null);
        }
        catch (Exception e) {
            boardResultDto.setStatus("500");
            boardResultDto.setMsg("Server Internal Error");
        }

        return boardResultDto;
    }

    @Override
    public BoardResultDto updateHit(String boardId) {

        return null;
    }

    @Override
    public BoardResultDto boardUpdate(BoardWriteDto boardUpdateDto) {

        return null;
    }

    @Override
    public BoardResultDto boardDelete(String boardId) {

        BoardResultDto boardResultDto = new BoardResultDto();

        boardResultDto.setStatus("200");
        boardResultDto.setMsg("게시글 삭제 성공");
        boardResultDto.setData(null);

        try {

            boardMapper.boardDelete(boardId);
        }
        catch (Exception e) {
            boardResultDto.setStatus("500");
            boardResultDto.setData("Server Internal Error");
        }

        return boardResultDto;
    }
}
