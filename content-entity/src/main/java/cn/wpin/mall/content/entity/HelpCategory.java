package cn.wpin.mall.content.entity;

import cn.wpin.mall.common.entity.IdEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangpin
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class HelpCategory extends IdEntity {

    private String name;

    @ApiModelProperty(value = "分类图标")
    private String icon;

    @ApiModelProperty(value = "专题数量")
    private Integer helpCount;

    private Integer showStatus;

    private Integer sort;

}