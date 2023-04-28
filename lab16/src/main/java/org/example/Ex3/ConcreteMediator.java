package org.example.Ex3;

class ConcreteMediator extends Mediator {
    private Publisher publisher;
    private PostOffice postOffice;
    private Factory factory;

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setPostOffice(PostOffice postOffice) {
        this.postOffice = postOffice;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public void sendPrintedMedia(String printedMedia, String recipient) {
        postOffice.sendPrintedMedia(printedMedia, recipient);
    }

    public void sendDevice(String deviceType, String brand) {
        factory.produce(deviceType, brand);
    }
}
