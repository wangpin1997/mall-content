package cn.wpin.mall.client.content;

import cn.wpin.mall.content.entity.PrefrenceArea;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author wangpin
 */
@FeignClient("content")
public interface PrefrenceAreaClient {

    /**
     * 获取所有商品优选
     *
     * @return
     */
    @RequestMapping(value = "prefrenceArea/listAll", method = RequestMethod.GET)
    List<PrefrenceArea> listAll();
}
