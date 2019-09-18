package cn.wpin.mall.client.content;

import cn.wpin.mall.common.entity.CommonPage;
import cn.wpin.mall.content.entity.Subject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangpin
 */
@FeignClient("content")
public interface SubjectClient {

    /**
     * 获取全部商品专题
     */
    @RequestMapping(value = "subject/listAll", method = RequestMethod.GET)
    List<Subject> listAll();

    /**
     * 根据专题名称分页获取专题
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    CommonPage<Subject> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize);

    /**
     * 根据专题名称分页获取专题
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    CommonPage<Subject> getList(@RequestParam(value = "cateId", required = false) Long cateId,
                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize);
}
