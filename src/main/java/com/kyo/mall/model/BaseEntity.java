package com.kyo.mall.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseEntity {
    @JsonIgnore
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}
