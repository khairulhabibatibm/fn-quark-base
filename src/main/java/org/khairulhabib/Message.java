package org.khairulhabib;

import java.io.Serializable;

public class Message implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7071733411217845814L;
    private String status;
    private String message;

    public Message() {
    }

    public Message(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message status(String status) {
        this.status = status;
        return this;
    }

    public Message message(String message) {
        this.message = message;
        return this;
    }


}
