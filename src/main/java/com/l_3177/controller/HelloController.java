package com.l_3177.controller;


import com.l_3177.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired private UserService userService;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "查找用户",notes = "通过id查找用户",httpMethod = "GET")
    public Object getUser(@PathVariable Long id){
        System.out.println("success");
        return userService.findById(id) ;
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ApiOperation(value = "查找用户",notes = "通过id查找用户",httpMethod = "GET")
    public Object getAllUser(@RequestParam(value = "offset" ,defaultValue = "0") Integer offset,
                             @RequestParam(value = "limit" ,defaultValue = "8") Integer limit){
        System.out.println("success");
        return userService.findAll(new RowBounds(offset,limit)) ;
    }

    @ApiOperation(value = "test",notes = "test")
    @RequestMapping("/test")
    public String test(){
        return "success";
    }

}
