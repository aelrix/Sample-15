package main;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
class Setup {
    @Bean String love() { return "I love you"; }
    @Bean String hate() { return "I hate you"; }
    @Bean("first") Manager create1() {
        Manager m = new Manager();
        m.name = "Frank Lampard";
        m.salary = 42000;
        return m;
    }
    @Bean("second") Manager create2() {
        Manager m = new  Manager();
        m.name = "Stephen Gerrard";
        m.salary = 40000;
        return m;
    }
    @Bean("my-team") Branch create3(@Qualifier ("first") Manager m) {
        Branch b = new Branch();
        b.name = "Arsenal";
        b.area = 350.0;
        b.manager = m;
        return b;
    }
}
class Branch {
    public String name;
    public double area;
    public Manager manager;
}
class Manager {
    public String name;
    double salary; // or protected double salary;
}
