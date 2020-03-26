package com.colour_cold.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//员工表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String ComName;
    private Integer code1;
    private Integer code2;
    private String location;
    private Integer isNbCom;
    private Integer isUp;
    private Integer password;
}
