package cn.wpin.mall.content.mapper;

import cn.wpin.mall.content.entity.TopicCategory;
import cn.wpin.mall.content.example.TopicCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopicCategoryMapper {
    
    long countByExample(TopicCategoryExample example);

    int deleteByExample(TopicCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TopicCategory record);

    int insertSelective(TopicCategory record);

    List<TopicCategory> selectByExample(TopicCategoryExample example);

    TopicCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TopicCategory record, @Param("example") TopicCategoryExample example);

    int updateByExample(@Param("record") TopicCategory record, @Param("example") TopicCategoryExample example);

    int updateByPrimaryKeySelective(TopicCategory record);

    int updateByPrimaryKey(TopicCategory record);
}