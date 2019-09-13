package cn.wpin.mall.content.mapper;

import cn.wpin.mall.content.entity.PrefrenceAreaProductRelation;
import cn.wpin.mall.content.example.PrefrenceAreaProductRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrefrenceAreaProductRelationMapper {

    long countByExample(PrefrenceAreaProductRelationExample example);

    int deleteByExample(PrefrenceAreaProductRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrefrenceAreaProductRelation record);

    int insertSelective(PrefrenceAreaProductRelation record);

    List<PrefrenceAreaProductRelation> selectByExample(PrefrenceAreaProductRelationExample example);

    PrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrefrenceAreaProductRelation record, @Param("example") PrefrenceAreaProductRelationExample example);

    int updateByExample(@Param("record") PrefrenceAreaProductRelation record, @Param("example") PrefrenceAreaProductRelationExample example);

    int updateByPrimaryKeySelective(PrefrenceAreaProductRelation record);

    int updateByPrimaryKey(PrefrenceAreaProductRelation record);
}