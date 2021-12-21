package observer;

/**
 * @author Abk on 12/21/2021
 * @project -- this si subject whose status will change and it will notify to all the observers --
 *     there are basically 3 method in subject or observable 1. register 2. deregister 3. notify
 *     observer that its changed.
 */
public interface ISubject {
  /** @param observer
     NEed to register the observaer which shlud get notify in case state of the subject changed
   **/
  void register(IObserver observer);


  /** @param observer
   Need to deregister the any observer in case it want too
   **/
  void deRegister(IObserver observer);

  /**
   * notify all the observers */
  void notifyToAll();
}
