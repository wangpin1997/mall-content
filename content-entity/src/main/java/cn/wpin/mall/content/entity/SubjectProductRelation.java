package cn.wpin.mall.content.entity;

import cn.wpin.mall.common.entity.IdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangpin
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SubjectProductRelation extends IdEntity {

    private Long subjectId;

    private Long productId;

}