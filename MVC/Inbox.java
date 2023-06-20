// MVC - Model
class Inbox extends Subject{
    String sender;
    String receiver;
    String message;

    String getSender() {
        return this.sender;
    }

    void setSender(String sender) {
        this.sender = sender;
    }

    String getReceiver() {
        return this.receiver;
    }

    void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    String getMessage() {
        return this.message;
    }

    void setMessage(String message) {
        this.message = message;
    }
}

