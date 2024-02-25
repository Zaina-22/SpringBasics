package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ){
        // 2 steps - create class, use spring framework to get the object
        //i.e. to use the IOC container -ApplicationContext= bean-factory + more features interface responsible to work with that conatiner
        // ii) bean factory-outdated

        //creates a spring container for me by using xml class and the spring.xml files tell which class you have to make beans
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        //problem? : Here the container is created but we are not able to talk to spring to handle the alien class and make its object
        //answer: conversation with spring can be done through xml,java based and annotations configurations

        //ask fot the object from the container but gives a normal object so we need to typecast it into alien object
        Alien obj= (Alien) context.getBean("alien");
        //Alien obj=new Alien();
        obj.code();
    }
}
