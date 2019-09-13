package cn.wpin.mall.content.controller;

import cn.wpin.mall.common.entity.CommonResult;
import cn.wpin.mall.content.entity.PrefrenceArea;
import cn.wpin.mall.content.service.PrefrenceAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品优选管理Controller
 * @author wangpin
 * @date 2019-9-12 14:54:44
 */
@RestController
@Api(tags = "商品优选管理")
@RequestMapping("/prefrenceArea")
public class PrefrenceAreaController {
    @Autowired
    private PrefrenceAreaService prefrenceAreaService;

    @ApiOperation("获取所有商品优选")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public List<PrefrenceArea> listAll() {
        return prefrenceAreaService.listAll();
    }
}
