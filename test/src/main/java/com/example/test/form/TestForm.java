package com.example.test.form;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestForm {

    /* 식별id*/
    private Integer id;

    /* 내용*/
    @NotBlank
    private String question;

    /* 해답*/
    private Boolean answer;

    /* 작성자*/
    @NotBlank
    private String author;

    /* 등록 or 변경 판단용*/
    private Boolean newTest;
}
