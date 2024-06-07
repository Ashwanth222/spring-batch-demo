package com.batch.springboot_batch_processing.config;

import com.batch.springboot_batch_processing.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student,Student> {

    @Override
    public Student process(Student student) {
        return student;
    }
}
