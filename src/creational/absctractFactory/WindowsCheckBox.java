package creational.absctractFactory;

public class WindowsCheckBox implements CheckBox{

  @Override
  public void paint() {
    System.out.println("Painting Windows Checkbox");
  }
}
