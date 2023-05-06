/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jiadali.javabrains;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author jiadali
 */
class Triangle implements Shape{
    
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    
    
    
    
    public void draw(){
        System.out.println("Drawing triangle");
        System.out.println("Point A = (" + getPointA().getX()+ ", " + getPointA().getY() + ")");
        System.out.println("Point B = (" + getPointB().getX()+ ", " + getPointB().getY() + ")");
        System.out.println("Point C = (" + getPointC().getX()+ ", " + getPointC().getY() + ")");
    }

    public void setApplicationContext(ApplicationContext context) 
            throws BeansException {
        this.context = context; 
    }

    
    public void setBeanName(String beanName) {
        System.out.println("Bean name is: " + beanName);
    }
    
    public void myInit(){
        System.out.println("My beans init method was called for Triangle class");
    }
    
    public void cleanUp(){
        System.out.println("My beans destroy method was called for Triangle class");
    }
       
}
