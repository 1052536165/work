package controller;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;
import service.Impl.EmployeeServiceImpl;

import java.util.List;

@RestController
public class EmployeeController {
     @Autowired
     EmployeeService employeeService;
     //     EmployeeServiceImpl employeeService;

     /*
     * 查询全部信息
     * */
     @RequestMapping("select" )
     public List<Employee> selectAllEmployee() {
          List<Employee> employees = employeeService.selectAllEmployee();
          System.out.println("controller:"+employees);
          return employees;
     }
     /*
      * 删除
      * */
     @RequestMapping("delete" )
     public int deleteById(int id) {
          int i = employeeService.deleteById(id);
          System.out.println("controller:"+i);
          return i;
     }

     /*
      * 修改
      * */
     @RequestMapping("update")
     public int update(String phone) {
          int update = employeeService.update(phone);
          System.out.println("controller"+update);
          return update;
     }

     /*
      * 添加*/
     @RequestMapping("insert")
     public int insert(@Validated Employee employee) {
          int insert = employeeService.insert(employee);
          System.out.println("controller:"+insert);
          return insert;
     }
     /*
      * 测试ssm整合
      * */
//     @RequestMapping("aa")
//     public void aa(){
//          employeeService.aa();
//          System.out.println("controller:"+1);
//     }
}
