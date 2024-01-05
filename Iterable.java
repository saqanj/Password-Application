/**
 * Simple Iterable ADT.
 * 
 * @author Saqlain Anjum
 */
public interface Iterable<E> {
   /**
    * Returns an ArrayIterator object.
    * 
    * @return the ArrayIterator object.
    */
    public Iterator<E> iterator();
}
