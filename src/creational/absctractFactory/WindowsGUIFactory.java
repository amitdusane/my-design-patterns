package creational.absctractFactory;

public class WindowsGUIFactory implements GUIFActory{

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WindowsCheckBox();
  }
}
