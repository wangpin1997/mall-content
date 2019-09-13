package cn.wpin.mall.content.mapper;


import cn.wpin.mall.content.entity.TopicComment;
import cn.wpin.mall.content.example.TopicCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopicCommentMapper {

    long countByExample(TopicCommentExample example);

    int deleteByExample(TopicCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TopicComment record);

    int insertSelective(TopicComment record);

    List<TopicComment> selectByExample(TopicCommentExample example);

    TopicComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TopicComment record, @Param("example") TopicCommentExample example);

    int updateByExample(@Param("record") TopicComment record, @Param("example") TopicCommentExample example);

    int updateByPrimaryKeySelective(TopicComment record);

    int updateByPrimaryKey(TopicComment record);
}