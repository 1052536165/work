package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;
import service.Impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
     @Autowired
     EmployeeServiceImpl employeeService;

     @RequestMapping("aa")
     public void aa(){
          employeeService.aa();
          System.out.println("controller:"+1);
     }
}
