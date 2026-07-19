package at.campus02.bsd; // 1st mistake

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private final int maxSize = 5; // has to be final

  public StringQueue() {
  }

  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  @Override
  public String pull() { // corrected Pulls -> typo! (not anymore poll)
    String element = peek();

    if (elements.size() != 0) {
     // mistake! if its not 0, if it there is something
      elements.remove(0);
    }

    return element;
  }

  @Override
  public String remove() {
    String element = pull();
    //element = ""; it actualizes it again
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}