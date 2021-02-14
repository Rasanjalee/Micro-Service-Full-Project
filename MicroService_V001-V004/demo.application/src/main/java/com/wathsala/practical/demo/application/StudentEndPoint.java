package com.wathsala.practical.demo.application;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author acer on 2/7/2021
 */
@Component
@Endpoint(id="student")
public class StudentEndPoint {

    Map<Integer,Student> students =  new  ConcurrentHashMap<>();

    @ReadOperation
    public Map<Integer,Student> getAllStudents(){
        return students;
    }

    @ReadOperation
    public Student getStudent(@Selector int id){
        return students.get(id);
    }
    @WriteOperation
    public void setStudent(@Selector int id, String studentName){
        students.put(id,new Student(id,studentName));
    }
    static class Student{
        int id;
        String name;

        public Student(String name) {
            this.name = name;
        }
//
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
