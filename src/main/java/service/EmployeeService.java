package service;

import entity.Employee;

import java.util.List;

public interface EmployeeService {
     /*
      * 查询employee表全部信息*/
     List<Employee> selectAllEmployee();
}
