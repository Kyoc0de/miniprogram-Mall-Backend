package com.kyo.mall.service;

import com.kyo.mall.model.Banner;
import com.kyo.mall.repository.BannerRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public Banner getByName(String name) {



        return bannerRepository.findOneByName(name);
    }
}
