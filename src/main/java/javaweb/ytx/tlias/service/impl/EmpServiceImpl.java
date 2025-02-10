package javaweb.ytx.tlias.service.impl;

import javaweb.ytx.tlias.mapper.EmpMapper;
import javaweb.ytx.tlias.pojo.Emp;
import javaweb.ytx.tlias.pojo.PageBean;
import javaweb.ytx.tlias.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page,Integer pageSize){
        Long count =empMapper.count();
        Integer start = (page-1)*pageSize;
        List<Emp> empList = empMapper.page(start, pageSize);
        return new PageBean(count,empList);
    }


}
