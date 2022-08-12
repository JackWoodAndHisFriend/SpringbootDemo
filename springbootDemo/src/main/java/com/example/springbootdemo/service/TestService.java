package com.example.springbootdemo.service;

import com.example.springbootdemo.dto.TestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface TestService {
    /**
     * 新增
     * @param dto
     */
    void create(TestDTO dto);
}
