package org.khairulhabib;


public class Message {

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
