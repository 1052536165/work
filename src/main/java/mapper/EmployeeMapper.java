package mapper;

import entity.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeMapper {
     /*
     * 查询employee表全部信息*/
     @Select("select * from Employee")
     List<Employee> selectAllEmployee();
}
