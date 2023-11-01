
import exceptions.StackOverflowException;
import exceptions.StackUnderflowException;
import java.util.List;

public class LinkedStackCustom<T> {
    private Node<T> top;
    private int size;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T value) throws StackOverflowException{

    }

    public void pushAll(List<T> values) throws StackOverflowException {

    }

    public T pop() throws StackUnderflowException {
        return null;
    }

    public T peek() throws StackUnderflowException {
        return null;
    }

    public String toString() throws StackUnderflowException {
        return null;
    }

    public Node getTop() throws StackUnderflowException {
        return top;
    }

    public int getSize() {
        return size;
    }


    public T[] toArray() throws StackUnderflowException {
        return null;
    }

    public void clearAll() {
        top = null;
        size = 0;
    }

    // here you should pop a value of one single random element on the stack
    public T popRandomValue() throws StackUnderflowException {
        return null;
    }

    // here you should pop a random amount of values (at least 1)
    // do not forget to take care of the upper bound
    public List<T> popRandomValues() throws StackUnderflowException {
        return null;
    }

    // this method should be similar to the method above, except that there you can define the number of random values you want to pop from the stack
    public List<T> popRandomValuesWithinRange(int range) throws StackUnderflowException, IllegalArgumentException {
        return null;
    }
}
