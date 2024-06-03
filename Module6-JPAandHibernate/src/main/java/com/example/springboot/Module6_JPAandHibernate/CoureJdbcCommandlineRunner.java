package com.example.springboot.Module6_JPAandHibernate;

import com.example.springboot.Module6_JPAandHibernate.a1JSpringDBC.CourseJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CoureJdbcCommandlineRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBCRepository courseJDBCRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepository.insert(new Course(1,"Learn SpringBoot","Udemy"));
        courseJDBCRepository.insert(new Course(2,"Learn AWS","Udemy"));
        courseJDBCRepository.insert(new Course(3,"Learn Kafka","Udemy"));

        courseJDBCRepository.deleteById(1);
        System.out.println(courseJDBCRepository.selectById(2));
    }
}
