package com.kyo.mall.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "banner")
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 16)
    private String name;
    @Transient
    private String description;

    private String img;
    private String title;

    @OneToMany(mappedBy = "banner", fetch = FetchType.EAGER)
    @org.hibernate.annotations.ForeignKey(name = "null")
    private List<BannerItem> items;
}
