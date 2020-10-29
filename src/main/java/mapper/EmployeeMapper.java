package mapper;

import entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmployeeMapper {
     /*
     * 查询employee表全部信息*/
     @Select("select * from Employee")
     List<Employee> selectAllEmployee();

     /*
     * 删除
     * */
     @Delete("delete from Employee where id=#{id}")
     int deleteById(int id);

     /*
     * 修改
     * */
     @Update("update Employee set phone=#{phone}")
     int update(String phone);

     /*
     * 添加
     * */
     @Insert("INSERT INTO Employee VALUES(NULL,#{name},#{age},#{sex},#{address},#{phone},#{password});")
     int insert(Employee employee);
}
