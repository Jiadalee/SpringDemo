/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jiadali.javabrains;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author jiadali
 */
public class DrawEvent extends ApplicationEvent{

    public DrawEvent(Object source) {
        super(source);
    }
    
    public String toString(){
        return "Draw Event Occured";
    }
    
    
    
}
