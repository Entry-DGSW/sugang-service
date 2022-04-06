package com.sugang.sugang.controller.dto;

import com.sugang.sugang.domain.entity.SugangRequest;
import lombok.*;

import java.util.Date;
import java.util.Set;

public class FindSugangDto {

    @Getter
    @Builder
    @AllArgsConstructor
    public static class Response {
        private Long id;
        private String chargeTeacher;
        private String name;
        private String content;
        private Date startDate;
        private Date endDate;
        private String createdTeacher;

        private int applicant;
        private Set<SugangRequest> sugangRequests;
    }
}
