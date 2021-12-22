package strategy;

/**
 * @author Abk on 12/22/2021
 * @project Strategy means we can plug and play diff algo or behaviour :
 *     This is achieved using composition over inheritance.
 *     Super call changes should not break the subclass structure.
 *     It will be useful when certain behaviour is not common for all the subclasses in that case
 *     interface will create mess.
 */
public class Animal {
  // This define the behaviour of the animal here we are achieving using composition over
  // inheritance
  protected Flies flies;

  public Animal(Flies fly) {
    this.flies = fly;
  }
}
