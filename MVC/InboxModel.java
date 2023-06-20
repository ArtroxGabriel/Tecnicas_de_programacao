// MVC - Model
class InboxModel extends Subject{
    String sender;
    String receiver;
    String message;

    String getSender() {
        return this.sender;
    }

    void setSender(String sender) {
        this.sender = sender;
        this.notifyObservers();
    }

    String getReceiver() {
        return this.receiver;
    }

    void setReceiver(String receiver) {
        this.receiver = receiver;
        this.notifyObservers();
    }

    String getMessage() {
        return this.message;
    }

    void setMessage(String message) {
        this.message = message;
        this.notifyObservers();
    }
}

