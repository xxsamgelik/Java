package org.example.Ex3;

class Publisher {
    private Mediator mediator;

    public Publisher(Mediator mediator) {
        this.mediator = mediator;
    }

    public void publish(String printedMedia, String recipient) {
        mediator.sendPrintedMedia(printedMedia, recipient);
    }
}
