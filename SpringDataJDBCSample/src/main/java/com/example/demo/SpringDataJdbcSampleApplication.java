package com.example.demo;

import com.example.demo.entity.Test;
import com.example.demo.repository.MemberCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJdbcSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcSampleApplication.class, args)
				.getBean(SpringDataJdbcSampleApplication.class).execute();
	}
	@Autowired
	MemberCrudRepository repository;
	
	private void execute(){
		//등록
		executeInteger();
		//모든 데이터 취득
		executeSelect();
	}
	
	private void executeInteger(){
		// 엔티티 생성 (id와 자동 부여되기 때문에 null을 설정)
		Test test = new Test(null,"이순재");
		// 레파지토리를 이용해서 등록 실행하고 결과를 취득
		test = repository.save(test);
		//결과를 표시
		System.out.println("등록 데이터" + test);
	};

	private void executeSelect(){
		System.out.println("모두 취득");
		//레파지토리를 전체 취득
		Iterable <Test> tests = repository.findAll();
		//Iterable은 List와 같음 데이터베이스 모두 가져온다는 것 (<Test>형태의 tests이름)
		for(Test test : tests) {
			System.out.println(test);
		}
	}
}
