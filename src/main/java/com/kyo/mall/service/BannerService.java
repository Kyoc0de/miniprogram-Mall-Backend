package com.kyo.mall.service;

import com.kyo.mall.model.Banner;
import org.springframework.stereotype.Service;


public interface BannerService {

    Banner getByName(String name);

}
