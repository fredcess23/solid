package com.nearsoft.apprentice.lsp.good;

public class DeviceWithEngine {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void startEngine() {
        System.out.print("Starting engine ... ");
    }

}
