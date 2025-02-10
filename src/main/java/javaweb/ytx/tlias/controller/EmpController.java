package javaweb.ytx.tlias.controller;

import javaweb.ytx.tlias.pojo.PageBean;
import javaweb.ytx.tlias.pojo.Result;
import javaweb.ytx.tlias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    public Result page(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize){
        log.info("分页查询，参数：{},{}",page,pageSize);
        PageBean pageBean=empService.page(page,pageSize);
        return Result.success(pageBean);
    }
}
