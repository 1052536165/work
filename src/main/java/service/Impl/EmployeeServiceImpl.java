package service.Impl;

import entity.Employee;
import mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import service.EmployeeService;

import java.util.List;


@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
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
     * 修改
     * name="phone",required = true  数据校验
     * */
     @Override
     public int update(@RequestParam(name="phone",required = true) String phone) {
          int update = employeeMapper.update(phone);
//          int i=10/0;
          System.out.println("service:"+update);
          return update;
     }

     /*
     * 添加*/
     @Override
     public int insert(Employee employee) {
          int insert = employeeMapper.insert(employee);
          System.out.println("service:"+insert);
          return insert;
     }

     /*
     * 测试ssm整合
     * */
//     public void aa(){
//          System.out.println("service:"+1);
//     }
}
