package strategy;

/**
 * @author Abk on 12/22/2021
 * @project
 */
public class CantFliesImpl implements Flies {
  @Override
  public void fly() {
    System.out.println("Cannot fly");
  }
}
