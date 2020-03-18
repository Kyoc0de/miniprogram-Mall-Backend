package com.kyo.mall.repository;

import com.kyo.mall.model.Spu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpuRepository extends JpaRepository<Spu, Long> {

    Spu findOneById(Long id);
}
