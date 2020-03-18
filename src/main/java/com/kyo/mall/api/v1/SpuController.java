package com.kyo.mall.api.v1;

import com.github.dozermapper.core.DozerBeanMapper;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.kyo.mall.bo.PageCounter;
import com.kyo.mall.exception.http.NotFoundException;
import com.kyo.mall.model.Banner;
import com.kyo.mall.model.Spu;
import com.kyo.mall.service.SpuService;
import com.kyo.mall.util.CommonUtil;
import com.kyo.mall.vo.PagingDozer;
import com.kyo.mall.vo.SpuSimplifyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/latest")
    public PagingDozer<Spu, SpuSimplifyVO> getLatestSpuList(@RequestParam(defaultValue = "0") Integer start,
                                                            @RequestParam(defaultValue = "10") Integer count){

        PageCounter pageCounter = CommonUtil.convertToPageParameter(start,count);

        Page<Spu> page = spuService.getLatestPagingSpu(pageCounter.getPage(),pageCounter.getCount());

        return new PagingDozer<Spu,SpuSimplifyVO>(page,SpuSimplifyVO.class);

    }
}
