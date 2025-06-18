package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )

    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//       Desktop dt = context.getBean("com1",Desktop.class);
//        Desktop dt = context.getBean("com2",Desktop.class);

         Alein alien = context.getBean(Alein.class);
        System.out.println(alien.getAge());
        alien.code();

        Alein alien1 = context.getBean(Alein.class);
        System.out.println(alien1.getAge());
        alien1.code();
//        Desktop dt = context.getBean("desktop",Desktop.class);
//       dt.compile();
//
//        Desktop dt1 = context.getBean("desktop",Desktop.class);
//        dt1.compile();







       // Alein alien1 = context.getBean("Alien", Alein.class);
//        System.out.println(alien.getAge());
//        alien.code();

       // Desktop obj = context.getBean(Desktop.class);

    }
}
