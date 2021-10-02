package creational.absctractFactory;

public class WindowsButton implements Button{

  @Override
  public void paint() {
    System.out.println("Painting Windows button");
  }
}
