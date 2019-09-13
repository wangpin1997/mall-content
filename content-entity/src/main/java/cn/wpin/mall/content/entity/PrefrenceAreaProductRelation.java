package cn.wpin.mall.content.entity;

import cn.wpin.mall.common.entity.IdEntity;
import lombok.Data;


/**
 * @author wangpin
 */
@Data
public class PrefrenceAreaProductRelation extends IdEntity {

    private Long prefrenceAreaId;

    private Long productId;

}