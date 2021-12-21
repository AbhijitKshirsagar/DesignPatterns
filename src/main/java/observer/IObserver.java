package observer;

/**
 * @author Abk on 12/21/2021
 * @project -- Update method will update the data of the Observable which is required
 */
public interface IObserver {
  /*
  This method basically help to get notify from the subject changes
   */
  void update();
}
