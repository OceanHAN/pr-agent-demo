package com.example.demo;

public class UserService {

    // 故意错误1: 直接拼接 SQL，有注入风险
    public String getUserById(String id) {
        String sql = "SELECT * FROM users WHERE id = " + id;
        return executeSql(sql); 
    }

    // 故意错误2: 没有判空直接使用 length()，会有空指针异常
    public int getNameLength(String name) {
        return name.length();
    }
    //测试
    private String executeSql(String sql) { return "result"; }
}
