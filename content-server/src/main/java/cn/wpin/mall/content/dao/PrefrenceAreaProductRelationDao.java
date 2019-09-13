package cn.wpin.mall.content.dao;

import cn.wpin.mall.content.entity.PrefrenceAreaProductRelation;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义优选和商品关系操作
 * @author wangpin
 */
public interface PrefrenceAreaProductRelationDao {
    int insertList(@Param("list") List<PrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
