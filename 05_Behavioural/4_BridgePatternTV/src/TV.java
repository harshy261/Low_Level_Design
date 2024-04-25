public class TV implements Device {
    public void turnOn() {
        System.out.println("TV turned on.");
    }

    public void turnOff() {
        System.out.println("TV turned off.");
    }

    public void setChannel(int channel) {
        System.out.println("TV changed to channel " + channel);
    }
}
