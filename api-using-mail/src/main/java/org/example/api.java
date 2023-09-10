package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.Transport;

@RestController
public class api {

    @Autowired
    mailformat Mailbody;
    @Autowired
    mailhandlerclass mailsent;

    @GetMapping("api/call")
    public mailformat send(){
        mailsent.sendMail();
        return  Mailbody;
    }
}
