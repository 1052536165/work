package entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class Employee {
     private int id;           //id
     @NotBlank(message = "姓名不能为空")
     private String name;      //员工姓名
     @Min(value = 1)
     @Max(value=100)
     private int age;         //年龄
     @NotBlank(message = "性别不能为空")
     private String sex;      //性别
     @NotBlank(message="地址不能为空!")
     private String address;  //地址
     @NotBlank(message="电话不能为空!")
     private String phone;    //电话
     @NotBlank(message="密码不能为空!")
     private String password;//密码

}
