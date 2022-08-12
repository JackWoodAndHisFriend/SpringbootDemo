package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.TestDTO;
import com.example.springbootdemo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("ai/websocket")
public class TestController {

    private final TestService testService;
    @ResponseBody
    @PostMapping(value = "/test")
    public String hello(@RequestBody TestDTO dto){
        System.out.println("dto=============="+dto);
        testService.create(dto);
        return "数据库插入数据成功";
    }
}
