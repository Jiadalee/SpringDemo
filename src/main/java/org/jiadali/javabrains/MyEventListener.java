package org.jiadali.javabrains;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiadali
 */

@Component
public class MyEventListener implements ApplicationListener{

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());
        
    }
    
}
