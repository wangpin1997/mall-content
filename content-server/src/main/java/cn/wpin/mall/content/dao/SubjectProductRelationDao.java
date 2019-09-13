package cn.wpin.mall.content.dao;

import cn.wpin.mall.content.entity.SubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品和专题关系操作
 * @author wangpin
 */
public interface SubjectProductRelationDao {
    int insertList(@Param("list") List<SubjectProductRelation> subjectProductRelationList);
}
