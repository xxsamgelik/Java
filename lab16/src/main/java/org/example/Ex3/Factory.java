package org.example.Ex3;

class Factory {
    private Mediator mediator;

    public Factory(Mediator mediator) {
        this.mediator = mediator;
    }

    public void produce(String deviceType, String brand) {
        mediator.sendDevice(deviceType, brand);
    }
}
