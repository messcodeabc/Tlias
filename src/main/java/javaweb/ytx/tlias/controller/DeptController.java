package javaweb.ytx.tlias.controller;

import javaweb.ytx.tlias.pojo.Dept;
import javaweb.ytx.tlias.pojo.Result;
import javaweb.ytx.tlias.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
public class DeptController {
    //private static Logger log= LoggerFactory.getLogger(DeptController.class)  可以使用注解@Slf4j
    @Autowired
    private DeptService deptService;
    @RequestMapping(value = "/depts",method = RequestMethod.GET)    //指定请求方式为get   或者直接使用@GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> deptList=deptService.list();
        return Result.success(deptList);
    }

    @RequestMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除id为"+id+"的部门数据");
        int i=deptService.delete(id);
        if (i==1){
            return Result.success();
        }else {
            return Result.error("error");
        }
    }



}
