package at.campus02.bsd; // 2nd mistake

// fastly written (not really nice) comments you should adapt
public interface IQueue {
  /**
   * Add a drink in the queue
   * */ 
  public abstract boolean offer(String obj);

  /**
   * takes last element out
   * @return
   */
  public abstract String pull();

  /**
  /* same as pull, if there is nothing in there error NoSuchElementException
   /* 1st element without dlete, otherwise null
   */
  public abstract String remove();

  /**
   * shows one element without removing
   * @return string name of the drink
   */
  public abstract String peek();

  /**
   *  element is to peek what remove is to pull
    */
  public abstract String element();
}