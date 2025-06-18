package org.example.config;

import org.example.Alein;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

   // @Bean
    //public Alein alien(@Qualifier("desktop") Computer com){
//        public Alein alien(Computer com){
//        Alein obj = new Alein();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;

//    }

//    //@Bean(name = {"com1","com2"})
//    @Bean
//   // @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
