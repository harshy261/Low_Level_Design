public class Main {
    public static void main(String[] args) {
        Device myTV = new TV();
        RemoteControl remote = new BasicRemoteControl(myTV);
        remote.turnOn();
        remote.setChannel(101);

        Device myRadio = new Radio();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(myRadio);
        advancedRemote.turnOn();
        advancedRemote.mute();
    }
}
