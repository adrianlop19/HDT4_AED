package uvg.edu.gt;

import java.util.ArrayList;

public interface UVGStack <T>{
    public void push(T item);

    public T pop();
    public T peek();
    public boolean isEmpty();
}