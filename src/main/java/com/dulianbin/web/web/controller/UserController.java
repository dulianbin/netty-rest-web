package com.dulianbin.web.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.dulianbin.web.web.vo.User;
import com.dulianbin.web.base.annotation.*;
import com.dulianbin.web.base.rest.HttpStatus;
import com.dulianbin.web.base.rest.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//默认为单例，singleton = false表示启用多例。
//@RestController(singleton = false)
@RestController
@RequestMapping("/users")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @GetMapping("save")
    @JsonResponse
    public ResponseEntity<User> listUser() {
        logger.info("44444");
        logger.debug("4455555");
        // 查询用户
        User user = new User();
        user.setId(1);
        user.setName("Leo");
        user.setAge((short)18);
        return ResponseEntity.ok().build(user);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> putMethod(@PathVariable("id") int id, @RequestBody String body) {
        // 更新用户
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMethod(@PathVariable int id) {
        // 删除用户
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    
    @PostMapping("save")
    public ResponseEntity<?> postMethod(@RequestBody String body) {
        System.out.println("1111");
        // 添加用户
        JSONObject json = JSONObject.parseObject(body);
        User user = new User();
        user.setId(json.getIntValue("id"));
        user.setName(json.getString("name"));
        user.setAge(json.getShortValue("age"));
        return ResponseEntity.status(HttpStatus.CREATED).build(user);
    }

}
