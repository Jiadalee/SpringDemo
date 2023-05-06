
package org.jiadali.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jiadali
 */
public class TestSpring {

    public static void main(String[] args) {
        String configFile = "src/main/java/spring.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configFile);
        Triangle triangle = (Triangle) ctx.getBean("triangle");
        triangle.draw();        
    }
    
}
