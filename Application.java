package spring_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan //Выполняет рекурсивный поик по папкам проэкта
@EnableAutoConfiguration //Выполняе автоматическое конфигурирование
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
