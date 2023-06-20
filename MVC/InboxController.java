public class InboxController {
    InboxModel model;

    InboxController ( InboxModel model){
        this.model = model;
    }

    InboxController(InboxModel model, String message, String sender, String receiver) {
        this.model = model;
        processInput(message, sender, receiver);

    }

    void processInput(String message, String sender, String receiver) {
        model.setSender(sender);
        model.setReceiver(receiver);
        model.setMessage(message);

    }

}