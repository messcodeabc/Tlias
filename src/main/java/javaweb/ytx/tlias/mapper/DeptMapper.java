package javaweb.ytx.tlias.mapper;

import javaweb.ytx.tlias.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    //查询全部部门数据
    @Select("select * from tlias.dept")
    List<Dept> list();

    @Delete("delete from tlias.dept where id=#{id}")
    int delete(Integer id);

    @Insert("insert into tlias.dept (name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);
}
