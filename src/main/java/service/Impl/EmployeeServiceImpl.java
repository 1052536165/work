package service.Impl;

import entity.Employee;
import mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EmployeeService;

import java.util.List;

@Service
public
class EmployeeServiceImpl implements EmployeeService {
     @Autowired
     EmployeeMapper employeeMapper;
     
     /*
      * 查询employee表全部信息*/
     @Override
     public List<Employee> selectAllEmployee() {
          List<Employee> employees = employeeMapper.selectAllEmployee();
          System.out.println("service:"+employees);
          return employees;
     }

     /*
     * 删除
     * */
     @Override
     public int deleteById(int id) {
          int i = employeeMapper.deleteById(id);
          System.out.println("service:"+i);
          return i;
     }

     /*
     * 测试ssm整合
     * */
//     public void aa(){
//          System.out.println("service:"+1);
//     }
}
