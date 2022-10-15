package main;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

class Start{
    public static void main(String[]data){
       ApplicationContext context;
       context = SpringApplication.run(Setup.class);
    }
}