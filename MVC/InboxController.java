public class InboxController {
    InboxController(String message, String sender, String receiver) {
        model.setSender(sender);
        model.setReceiver(receiver);
        model.setMessage(message);
    }

}