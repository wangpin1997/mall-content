package cn.wpin.mall.content.mapper;

import cn.wpin.mall.content.entity.MemberReport;
import cn.wpin.mall.content.example.MemberReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberReportMapper {

    long countByExample(MemberReportExample example);

    int deleteByExample(MemberReportExample example);

    int insert(MemberReport record);

    int insertSelective(MemberReport record);

    List<MemberReport> selectByExample(MemberReportExample example);

    int updateByExampleSelective(@Param("record") MemberReport record, @Param("example") MemberReportExample example);

    int updateByExample(@Param("record") MemberReport record, @Param("example") MemberReportExample example);
}