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
public class SubjectComment extends IdEntity {

    private Long subjectId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private Date createTime;

    private Integer showStatus;

}