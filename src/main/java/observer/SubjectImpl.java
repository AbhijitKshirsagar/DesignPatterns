package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Abk on 12/21/2021
 * @project
 */
public class SubjectImpl implements ISubject {
  private List<IObserver> iObserverList;

  public SubjectImpl() {
    iObserverList = new LinkedList<>();
  }

  @Override
  public void register(IObserver observer) {
    iObserverList.add(observer);
  }

  @Override
  public void deRegister(IObserver observer) {
    iObserverList.remove(observer);
  }

  @Override
  public void notifyToAll() {
    iObserverList.stream()
        .forEach(
            observer -> {
              observer.update();
            });
  }
}
