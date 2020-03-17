package com.kyo.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner,Long> {

    Banner findOneById(Long id);

    Banner findOneByName(String name);

}
