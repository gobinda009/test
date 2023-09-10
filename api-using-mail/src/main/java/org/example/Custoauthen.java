package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Custoauthen extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(mailconstant.SENDER,"kgqnkhmaphaqbgtf");
    }
}
