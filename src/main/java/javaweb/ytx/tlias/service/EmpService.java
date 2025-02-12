package javaweb.ytx.tlias.service;

import javaweb.ytx.tlias.pojo.Emp;
import javaweb.ytx.tlias.pojo.PageBean;
import org.springframework.stereotype.Service;


@Service
public interface EmpService {
    PageBean page(Integer page,Integer pageSize);

    Emp listById(Integer id);
}
