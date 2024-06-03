package com.example.springboot.Module6_JPAandHibernate.a3SpringDataJpa;

import com.example.springboot.Module6_JPAandHibernate.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataRepository extends JpaRepository<Course,Long> {
    List<Course> findByAuthor(String author);
}
