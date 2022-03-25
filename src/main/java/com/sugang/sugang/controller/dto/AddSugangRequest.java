package com.sugang.sugang.controller.dto;

import com.sugang.sugang.domain.entity.Sugang;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class AddSugangRequest {

    private String chargeTeacher;
    private String name;
    private String content;
    private Date startDate;
    private Date endDate;

    public Sugang toEntity() {
        return Sugang.builder()
                .chargeTeacher(getChargeTeacher())
                .name(getName())
                .content(getContent())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .build();
    }
}
