package com.kyo.mall.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class BannerItem {

    @Id
    private Long id;

    private String img;

    private String keyword;

    private Short type;

    private String name;

    private Long bannerId;

}
