package cn.wpin.mall.content.service;


import cn.wpin.mall.content.entity.PrefrenceArea;
import cn.wpin.mall.content.example.PrefrenceAreaExample;
import cn.wpin.mall.content.mapper.PrefrenceAreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * @author wangpin 
 * @date 2019-9-12 14:41:44
 */
@Service
public class PrefrenceAreaService {
    
    @Autowired
    private PrefrenceAreaMapper prefrenceAreaMapper;

    public List<PrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new PrefrenceAreaExample());
    }
}
