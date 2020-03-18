package com.kyo.mall.api.v1;

import com.kyo.mall.exception.http.NotFoundException;
import com.kyo.mall.model.Banner;
import com.kyo.mall.model.Spu;
import com.kyo.mall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/spu")
@Validated
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/id/{id}/detail")
    public Spu getDetail(@PathVariable @Positive Long id){
        Spu spu = spuService.getSpu(id);
        if(spu == null){
            throw new NotFoundException(30003);
        }
        return spu;
    }
}
