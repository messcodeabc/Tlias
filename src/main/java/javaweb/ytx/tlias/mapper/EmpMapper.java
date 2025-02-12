package javaweb.ytx.tlias.mapper;

import javaweb.ytx.tlias.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select count(*) from tlias.emp")
    Long count();

    @Select("select * from tlias.emp limit #{start},#{pageSize}")
    List<Emp> page(Integer start,Integer pageSize);

    @Select("select * from tlias.emp where id=#{id}")
    Emp listById(Integer id);
}
