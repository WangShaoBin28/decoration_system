package com.app.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Package com.app.entity
 * @ClassName User
 * @Author shaobin.wang
 * @Date 2019/02/13 16:43
 * @Version 1.0
 * @Description:
 **/
@Data
public class User {

    private Integer id;

    private String userName;

    private String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date date;
}
