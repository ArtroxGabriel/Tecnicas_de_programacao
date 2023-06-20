class InboxView extends Observer {
    InboxModel subject;

    InboxView(InboxModel subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    void update() {
        System.out.println("Email recebido "+subject.getMessage());
    }
}