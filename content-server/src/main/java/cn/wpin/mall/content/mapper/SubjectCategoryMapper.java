package cn.wpin.mall.content.mapper;


import cn.wpin.mall.content.entity.SubjectCategory;
import cn.wpin.mall.content.example.SubjectCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectCategoryMapper {

    long countByExample(SubjectCategoryExample example);

    int deleteByExample(SubjectCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SubjectCategory record);

    int insertSelective(SubjectCategory record);

    List<SubjectCategory> selectByExample(SubjectCategoryExample example);

    SubjectCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SubjectCategory record, @Param("example") SubjectCategoryExample example);

    int updateByExample(@Param("record") SubjectCategory record, @Param("example") SubjectCategoryExample example);

    int updateByPrimaryKeySelective(SubjectCategory record);

    int updateByPrimaryKey(SubjectCategory record);
}