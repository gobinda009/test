package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class assemble {
    @Bean
    public mailformat Mailbody(){
        String text ="This is object create text";
        String success_msg ="Messenge Send Successfully";
        return new mailformat(text,success_msg);
    }
}
