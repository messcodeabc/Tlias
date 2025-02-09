package javaweb.ytx.tlias.service;

import javaweb.ytx.tlias.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    //查询全部部门数据
    List<Dept> list();

    int delete(Integer id);
}
