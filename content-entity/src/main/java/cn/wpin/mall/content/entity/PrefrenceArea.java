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
public class PrefrenceArea extends IdEntity {

    private String name;

    private String subTitle;

    private Integer sort;

    private Integer showStatus;

    @ApiModelProperty(value = "展示图片")
    private byte[] pic;

}