package com.kyo.mall.model;

import javax.persistence.*;

@Entity
public class BannerItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img;
    private String keyword;
    private Short type;
    private String name;
//    private Long bannerId;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT), insertable = false,updatable = false, name = "bannerId")
    private Banner banner;

}
