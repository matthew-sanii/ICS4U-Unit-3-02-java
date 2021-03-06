import java.util.ArrayList;

public class MrCoxallStack {
  /**
  * The arrayList creator called theStack.
  */
  private ArrayList<Integer> theStack = new ArrayList<Integer>();

  /**
  * the push method.
  *
  * @param pushValue the value that is being added to the stack.
  */
  public void push(final int pushValue) {
    System.out.println("Adding " + pushValue + " to stack.");
    theStack.add(pushValue);
  }

  /**
  * The showStack method.
  */
  public void showStack() {
    System.out.println("The stacklist.");
    for (Integer aSingleElement : theStack) {
      System.out.println(aSingleElement);
    }
    System.out.println("End of stacklist. \n");
  }

  /**
  * The pop method.
  */
  public void pop() {
    System.out.println("Popping top element.");
    theStack.remove(0);
    System.out.println("The stacklist.");
    for (Integer aSingleElement : theStack) {
      System.out.println(aSingleElement);
    }
    System.out.println("End of stacklist. \n");
  }
}
