package cn.wpin.mall.content.mapper;

import cn.wpin.mall.content.entity.SubjectComment;
import cn.wpin.mall.content.example.SubjectCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectCommentMapper {

    long countByExample(SubjectCommentExample example);

    int deleteByExample(SubjectCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SubjectComment record);

    int insertSelective(SubjectComment record);

    List<SubjectComment> selectByExample(SubjectCommentExample example);

    SubjectComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SubjectComment record, @Param("example") SubjectCommentExample example);

    int updateByExample(@Param("record") SubjectComment record, @Param("example") SubjectCommentExample example);

    int updateByPrimaryKeySelective(SubjectComment record);

    int updateByPrimaryKey(SubjectComment record);
}