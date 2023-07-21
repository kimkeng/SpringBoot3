package com.example.demo.repository;

import com.example.demo.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface MemberCrudRepository extends CrudRepository<Test,Integer> {
} //<클래스명 , 프라이머리키> 입력하면 Test클래스 자체에 레파지토리가 성립
