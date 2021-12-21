package observer;

/**
 * @author Abk on 12/21/2021
 * @project
 */
public class IObserverImpl implements IObserver {

  private ISubject iSubject;

  public IObserverImpl(ISubject iSubject) {
    this.iSubject = iSubject;
  }

  @Override
  public void update() {
    System.out.println("Got notification that observable is updated");
  }
}
