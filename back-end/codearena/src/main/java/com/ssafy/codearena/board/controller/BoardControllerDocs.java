package com.ssafy.codearena.board.controller;

import com.ssafy.codearena.alarm.dto.AlarmReceiveDto;
import com.ssafy.codearena.board.dto.BoardDetailDto;
import com.ssafy.codearena.board.dto.BoardWriteDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "게시판 API", description = "게시판 관련 API")
public interface BoardControllerDocs {

    @Operation(summary = "게시판 상세조회")
    @Parameter(name = "boardId", description = "상세보기 할 게시판의 번호", required = true)
    @ApiResponse(responseCode = "200", description = "게시판 상세 조회 성공", content = @Content(schema = @Schema(implementation = BoardDetailDto.class)))
    public ResponseEntity<?> boardDetail(String boardId);


    @Operation(summary = "게시판 글쓰기")
    @Parameter(name = "", description = "boardWriteDto", content = @Content(schema = @Schema(implementation = BoardWriteDto.class)))
    @ApiResponse(responseCode = "201", description = "게시판 글쓰기 성공")
    public ResponseEntity<?> boardWrite(BoardWriteDto boardWriteDto);


}
