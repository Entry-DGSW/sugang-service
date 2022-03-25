package com.sugang.sugang.controller;

import com.sugang.sugang.controller.dto.AddSugangRequest;
import com.sugang.sugang.service.AddSugangService;
import com.sugang.sugang.service.DeleteSugangService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SugangController {

    private final AddSugangService addSugangService;
    private final DeleteSugangService deleteSugangService;

    @PostMapping
    public ResponseEntity<String> addSugang(
            @RequestBody AddSugangRequest addSugangRequest
    ) {
        addSugangService.execute(addSugangRequest);
        return ResponseEntity.ok("게시 성공");
    }

    @DeleteMapping("/{sugangId}")
    public ResponseEntity<String> deleteSugang(
            @PathVariable("sugangId") Long sugangId
    ) {
        deleteSugangService.execute(sugangId);
        return ResponseEntity.ok("강의 삭제 성공");
    }
}
