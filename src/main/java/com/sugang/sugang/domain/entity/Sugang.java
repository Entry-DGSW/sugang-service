package com.sugang.sugang.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "tbl_sugang")
@DynamicInsert
@DynamicUpdate
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sugang extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String chargeTeacher;

    @Column
    private String name;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(columnDefinition = "DATETIME")
    private Date startDate;

    @Column(columnDefinition = "DATETIME")
    private Date endDate;

    @Column
    private String createdTeacher;

    @OneToMany(mappedBy = "sugang")
    private Set<SugangRequest> sugangRequests = new HashSet<>();
}
