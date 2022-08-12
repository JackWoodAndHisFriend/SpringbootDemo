package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dto.TestDTO;
import com.example.springbootdemo.entity.TestEntity;
import com.example.springbootdemo.repository.TestRepository;
import com.example.springbootdemo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository repo;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void create(TestDTO dto) {
        repo.save(dto2Entity(dto, TestEntity.class));
    }

    private static <T> T dto2Entity(TestDTO dto, Class<T> clazz) {
        if (dto != null) {
            try {
                T entity = clazz.getDeclaredConstructor().newInstance();
                BeanUtils.copyProperties(dto, entity);
                return entity;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
