package cn.wpin.mall.content.mapper;

import cn.wpin.mall.content.entity.HelpCategory;
import cn.wpin.mall.content.example.HelpCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HelpCategoryMapper {

    long countByExample(HelpCategoryExample example);

    int deleteByExample(HelpCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HelpCategory record);

    int insertSelective(HelpCategory record);

    List<HelpCategory> selectByExample(HelpCategoryExample example);

    HelpCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HelpCategory record, @Param("example") HelpCategoryExample example);

    int updateByExample(@Param("record") HelpCategory record, @Param("example") HelpCategoryExample example);

    int updateByPrimaryKeySelective(HelpCategory record);

    int updateByPrimaryKey(HelpCategory record);
}