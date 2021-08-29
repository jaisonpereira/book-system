package com.systembook.booksystem;

import com.systembook.booksystem.view.Menu;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
    "com.systembook"})
@EnableAutoConfiguration
public class BookSystemApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(BookSystemApplication.class).headless(false).run(args);
        Menu menu = context.getBean(Menu.class);
        menu.setVisible(true);
    }

}
