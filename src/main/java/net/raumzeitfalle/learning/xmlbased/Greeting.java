package net.raumzeitfalle.learning.xmlbased;


public class Greeting {
    
    private String message;
    
    private String recipient;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Greeting [message=" + message + ", recipient=" + recipient + "]";
    }

}
