package cn.wpin.mall.content.mapper;


import cn.wpin.mall.content.entity.PrefrenceArea;
import cn.wpin.mall.content.example.PrefrenceAreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrefrenceAreaMapper {

    long countByExample(PrefrenceAreaExample example);

    int deleteByExample(PrefrenceAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrefrenceArea record);

    int insertSelective(PrefrenceArea record);

    List<PrefrenceArea> selectByExampleWithBLOBs(PrefrenceAreaExample example);

    List<PrefrenceArea> selectByExample(PrefrenceAreaExample example);

    PrefrenceArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrefrenceArea record, @Param("example") PrefrenceAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") PrefrenceArea record, @Param("example") PrefrenceAreaExample example);

    int updateByExample(@Param("record") PrefrenceArea record, @Param("example") PrefrenceAreaExample example);

    int updateByPrimaryKeySelective(PrefrenceArea record);

    int updateByPrimaryKeyWithBLOBs(PrefrenceArea record);

    int updateByPrimaryKey(PrefrenceArea record);
}