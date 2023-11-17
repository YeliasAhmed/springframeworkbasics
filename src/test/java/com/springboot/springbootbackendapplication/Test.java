package com.springboot.springbootbackendapplication;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("studentbean", Student.class);
        Student student1 = context.getBean("studentbean1", Student.class);
        student.display();
        student1.display();

        System.out.println();
        Question q1 = context.getBean("q", Question.class);
        q1.show();


    }
}
