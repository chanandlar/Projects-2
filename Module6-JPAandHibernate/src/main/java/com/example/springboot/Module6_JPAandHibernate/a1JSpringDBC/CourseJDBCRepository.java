package com.example.springboot.Module6_JPAandHibernate.a1JSpringDBC;

import com.example.springboot.Module6_JPAandHibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String insert_query= """
            insert into course (id,name,author)
            values(?,?,?);
            """;

    private static String delete_query= """
            delete from course where id=?
            """;

    private static String select_query= """
            select * from course where id=?
            """;

    public void insert(Course course){
        springJdbcTemplate.update(insert_query,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(delete_query,id);
    }

    public Course selectById(long id){
        return springJdbcTemplate.queryForObject(select_query,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
