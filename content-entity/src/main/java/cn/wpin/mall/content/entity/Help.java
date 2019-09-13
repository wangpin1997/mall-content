package cn.wpin.mall.content.entity;

import cn.wpin.mall.common.entity.IdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author wangpin
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Help extends IdEntity {

    private Long categoryId;

    private String icon;

    private String title;

    private Integer showStatus;

    private Date createTime;

    private Integer readCount;

    private String content;

}