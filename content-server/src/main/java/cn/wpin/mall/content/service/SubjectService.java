package cn.wpin.mall.content.service;

import cn.wpin.mall.content.entity.Subject;
import cn.wpin.mall.content.example.SubjectExample;
import cn.wpin.mall.content.mapper.SubjectMapper;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品专题Service实现类
 * @author wangpin 
 * @date 2019-9-12 14:42:20
 */
@Service
public class SubjectService {
    @Autowired
    private SubjectMapper subjectMapper;

    public List<Subject> listAll() {
        return subjectMapper.selectByExample(new SubjectExample());
    }

    public List<Subject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SubjectExample example = new SubjectExample();
        SubjectExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
