package service;

import entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmployeeService {
     /*
      * 查询employee表全部信息*/
     List<Employee> selectAllEmployee();

     /*
     * 删除*/
     int deleteById(int id);

     /*
      * 修改
      * */
     int update(String phone);

     /*
      * 添加
      * */
     int insert(Employee employee);
}
