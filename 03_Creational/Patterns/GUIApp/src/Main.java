interface Button{
    void paint();
}

interface Checkbox{
    void paint();
}

// Concrete Product classes
class WindowsButton implements Button{
    public void paint(){
        System.out.println("Rendering win button");
    }
}

class WindowsCheckbox implements Checkbox{
    public void paint(){
        System.out.println("Rendering win Checkbox");
    }
}

class MacOSButton implements Button{
    public void paint(){
        System.out.println("Rendering MacOS button");
    }
}

class MacOSCheckbox implements Checkbox{
    public void paint(){
        System.out.println("Rendering MacOS Checkbox");
    }
}

// Abstract Factory
interface GUIFactory{
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factories - which will be creating objects of same family
class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

class Application{
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory fact){
        button = fact.createButton();
        checkbox = fact.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}

public class Main {
    public static void main(String[] args) {
        // determine the platform.....
//    platform = getPLat()
        GUIFactory fact = new WindowsFactory();//new MacOSFactory();
        Application appx = new Application(fact);
        appx.paint();
    }
}