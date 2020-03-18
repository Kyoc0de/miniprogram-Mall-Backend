package com.kyo.mall.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@Entity
public class SpuImg extends BaseEntity {
    @Id
    private Long id;
    private String img;
    private Long spuId;

}
