package spring_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
public class MvcConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".jsp");
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Bean
    public Semple getSemple() {
        return new Semple();
    }

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setUrl("");
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setUsername("");
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setPassword("");
        return dataSource;
    }
}
