package cn.wpin.mall.content.mapper;

import cn.wpin.mall.content.entity.SubjectProductRelation;
import cn.wpin.mall.content.example.SubjectProductRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectProductRelationMapper {

    long countByExample(SubjectProductRelationExample example);

    int deleteByExample(SubjectProductRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SubjectProductRelation record);

    int insertSelective(SubjectProductRelation record);

    List<SubjectProductRelation> selectByExample(SubjectProductRelationExample example);

    SubjectProductRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SubjectProductRelation record, @Param("example") SubjectProductRelationExample example);

    int updateByExample(@Param("record") SubjectProductRelation record, @Param("example") SubjectProductRelationExample example);

    int updateByPrimaryKeySelective(SubjectProductRelation record);

    int updateByPrimaryKey(SubjectProductRelation record);
}