package com.example.springbootdemo.repository;

import com.example.springbootdemo.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestRepository extends JpaRepository<TestEntity,String>, JpaSpecificationExecutor<TestEntity> {

}
