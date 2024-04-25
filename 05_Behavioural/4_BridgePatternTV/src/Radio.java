public class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio turned on.");
    }

    public void turnOff() {
        System.out.println("Radio turned off.");
    }

    public void setChannel(int channel) {
        // Radio might not use numerical channels like TV.
        System.out.println("Radio changed to station " + channel);
    }
}