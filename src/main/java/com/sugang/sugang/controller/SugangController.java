package com.sugang.sugang.controller;

import com.sugang.sugang.controller.dto.AddSugangDto;
import com.sugang.sugang.controller.dto.ModifySugangDto;
import com.sugang.sugang.service.facade.SugangFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SugangController {

    private final SugangFacade sugangFacade;

    @PostMapping
    public ResponseEntity<String> addSugang(
            @RequestBody AddSugangDto.Request request
    ) {
        sugangFacade.addSugang(request);
        return ResponseEntity.ok("게시 성공");
    }

    @DeleteMapping("/{sugangId}")
    public ResponseEntity<String> deleteSugang(
            @PathVariable("sugangId") Long sugangId
    ) {
        sugangFacade.deleteSugang(sugangId);
        return ResponseEntity.ok("강의 삭제 성공");
    }

    @PutMapping("/{sugangId}")
    public ResponseEntity<String> modifySugang(
            @PathVariable("sugangId") Long sugangId,
            @RequestBody ModifySugangDto.Request request
    ) {
        sugangFacade.modifySugang(sugangId, request);
        return ResponseEntity.ok("강의 수정 성공");
    }
}
