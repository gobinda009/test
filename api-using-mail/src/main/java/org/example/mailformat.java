package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class mailformat {
    private String text;
    private String success_msg;

    public mailformat(String text, String success_msg) {
        this.text = text;
        this.success_msg = success_msg;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSuccess_msg() {
        return success_msg;
    }

    public void setSuccess_msg(String success_msg) {
        this.success_msg = success_msg;
    }

    public String toString(){
        return "text="+text+","+"success_msg="+success_msg;
   }
}
