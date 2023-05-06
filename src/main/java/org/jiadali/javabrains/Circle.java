/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jiadali.javabrains;

import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author jiadali
 */

@Controller
public class Circle implements Shape, ApplicationEventPublisherAware{
    
    @Autowired
    private MessageSource messageSource;
    private Point center;
    private ApplicationEventPublisher publisher;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    

    public Point getCenter() {
        return center;
    }
    
    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }
    
    @PostConstruct
    public void initalizeCircle(){
        System.out.println("initialize Circle");
    }
    
    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroy of Circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle: Point is: (" + center.getX() + ", " + center.getY() + ")");
        System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
        DrawEvent drawevent = new DrawEvent(this);
        publisher.publishEvent(drawevent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
        
    }
    

}
