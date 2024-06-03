package com.example.springboot.Module6_JPAandHibernate.a2JPA;

import com.example.springboot.Module6_JPAandHibernate.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course selectById(long Id){
        return entityManager.find(Course.class,Id);
    }

    public void deleteById(long Id){
        Course course=entityManager.find(Course.class,Id);
        entityManager.remove(course);
    }
}
