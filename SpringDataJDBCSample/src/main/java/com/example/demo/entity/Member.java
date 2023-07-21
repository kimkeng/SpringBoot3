package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data //GET, SET
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //생성자의 초기값
public class Member {
    @Id //자동증가
    private Integer id;
    private String author;
}
