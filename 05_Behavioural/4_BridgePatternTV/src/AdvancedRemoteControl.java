class AdvancedRemoteControl extends BasicRemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Device muted.");  // Additional functionality
    }
}
