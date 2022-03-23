package com.sugang.sugang.domain.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@MappedSuperclass
public class BaseEntity {

    @Column(columnDefinition = "DATETIME", nullable = false)
    private Date createdAt;
}
