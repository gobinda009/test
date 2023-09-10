package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Properties;

@Component
public class mailhandlerclass {

    @Autowired
    mailformat obj;
    public void sendMail() {

        //addind properties
        Properties sysproperties = System.getProperties();
        sysproperties.put("mail.smtp.host", "smtp.gmail.com"); //smtp server
        sysproperties.put("mail.smtp.port", "465"); //server post
        sysproperties.put("mail.smtp.ssl.enable", "true"); //ssl-secure
        sysproperties.put("mail.smtp.auth", "true"); //authentication

        //authentication

        Authenticator custauth = new Custoauthen();
        //session
        Session mailsession = Session.getInstance(sysproperties, custauth);

        MimeMessage mailmessage = new MimeMessage(mailsession);
        try {
            mailmessage.setFrom(mailconstant.SENDER);
            mailmessage.setRecipient(Message.RecipientType.TO, new InternetAddress("gobindabauri4321@gmail.com"));
            mailmessage.setSubject("Weekly Test");


            BodyPart messagebody = new MimeBodyPart();

            messagebody.setText("This is api return obj");
            //attachment


            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messagebody);

            mailmessage.setContent(multipart);
            Transport.send(mailmessage);


        } catch (Exception ex) {
            System.out.println("Error during sending mail");
            System.out.println(ex);
        }

    }
}
