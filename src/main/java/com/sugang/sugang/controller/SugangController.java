package com.sugang.sugang.controller;

import com.sugang.sugang.controller.dto.AddSugangRequest;
import com.sugang.sugang.service.AddSugangService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SugangController {

    private final AddSugangService addSugangService;

    @PostMapping
    public ResponseEntity<String> addSugang(
            @RequestBody AddSugangRequest addSugangRequest
    ) {
        addSugangService.execute(addSugangRequest);
        return ResponseEntity.ok("게시 성공");
    }
}
