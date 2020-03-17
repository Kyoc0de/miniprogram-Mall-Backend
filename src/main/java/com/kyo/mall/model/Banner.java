package com.kyo.mall.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 16)
    private String name;
    @Transient
    private String description;

    private String img;

    private String title;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "bannerId")
    private List<BannerItem> items;
}
