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
public class TopicComment extends IdEntity {

    private String memberNickName;

    private Long topicId;

    private String memberIcon;

    private String content;

    private Date createTime;

    private Integer showStatus;
}