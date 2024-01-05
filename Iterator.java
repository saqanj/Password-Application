import java.util.NoSuchElementException;

/**
 * Simple Iterator ADT.
 * 
 * @author Saqlain Anjum
 */
public interface Iterator<E> {
   /**
    * Determines if the collection contains a next element.
    * 
    * @return true if a next element exists, false otherwise.
    */
    public boolean hasNext();
   /**
    * Retrives the next element in the collection.
    * 
    * @return the next element in the collection.
    * @throws NoSuchElementException if no next element exists.
    */
    public E next() throws NoSuchElementException;
}
