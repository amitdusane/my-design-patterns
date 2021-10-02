package creational.absctractFactory;

public class Demo {

  public static void main(String[] args) {

    //Get Windows GUI
    GUIFActory windowsGUIFactory = new WindowsGUIFactory();
    Button button = windowsGUIFactory.createButton();
    CheckBox checkBox = windowsGUIFactory.createCheckBox();
    button.paint();
    checkBox.paint();

    //Get Mac GUI
    GUIFActory macGUIFactory = new MacGUIFactory();
    Button button1 = macGUIFactory.createButton();
    CheckBox checkBox1 = macGUIFactory.createCheckBox();
    button1.paint();
    checkBox1.paint();
  }

}
