package com.kyo.mall.service;

import com.kyo.mall.model.Spu;
import com.kyo.mall.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuService {

    @Autowired
    private SpuRepository spuRepository;

    public Spu getSpu(Long id){
        return spuRepository.findOneById(id);
    }

    public List<Spu> getLatestPagingSpu(){
        return spuRepository.findAll();
    }
}
