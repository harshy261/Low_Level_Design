abstract class RemoteControl {
    protected Device device; // Reference to the device being controlled

    public RemoteControl(Device device) {
        this.device = device;
    }

    // Abstract methods that subclasses must implement
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setChannel(int channel);
}
