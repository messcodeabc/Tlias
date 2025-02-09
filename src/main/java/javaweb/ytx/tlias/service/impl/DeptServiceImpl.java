package javaweb.ytx.tlias.service.impl;

import javaweb.ytx.tlias.mapper.DeptMapper;
import javaweb.ytx.tlias.pojo.Dept;
import javaweb.ytx.tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {

        return deptMapper.list();
    }

    public int delete(Integer id){
        return deptMapper.delete(id);
    }
}
