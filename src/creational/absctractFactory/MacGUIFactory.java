package creational.absctractFactory;

public class MacGUIFactory implements GUIFActory{

  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}
