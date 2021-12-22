package strategy;

/**
 * @author Abk on 12/22/2021
 * @project
 */
public class Dog extends Animal {
  public Dog() {
    super(new CantFliesImpl());
  }
}
