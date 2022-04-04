package com.sugang.sugang.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

public class ModifySugangDto {

    @Getter
    @NoArgsConstructor
    public static class Request {

        private String chargeTeacher;
        private String name;
        private String content;
        private Date startDate;
        private Date endDate;
    }
}
