class InboxView extends Observer {
    Inbox subject;

    InboxView(Inbox subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    void update() {
        System.out.println("Email recebido "+subject.getMessage());
    }
}