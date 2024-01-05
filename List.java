/**
 * Simple List ADT.
 * 
 * @author Saqlain Anjum
 */
public interface List<E>{
    /**
     * Returns the number of elements in this list.
     * 
     * @return number of elements in the list.
     */
    int size();

   /**
    * Returns whether the list is empty or not. 
    *
    * @return true if empty, false otherwise.
    */
    boolean isEmpty();

    /**
     * Returns (but does not remove) the element at index i.
     * 
     * @param i the index to access.
     * @return the element stored at the specified index.
     * @throws IndexOutOfBoundsException if an illegal index is passed as a parameter.
     */
    E get(int i) throws IndexOutOfBoundsException;

    /**
     * Replaces the element at index i with element e, and returns the replaced element.
     * 
     * @param i the index to manipulate.
     * @param e the element to set the current element to.
     * @return the previous element that has been changed.
     * @throws IndexOutOfBoundsException if an illegal index is passed as a parameter.
     */
    E set(int i, E e) throws IndexOutOfBoundsException;

    /**
     * Inserts element e to be at index i, shifting all subsequent elements later.
     * 
     * @param i the index at which to insert.
     * @param e the element to insert at the specified index.
     * @throws IndexOutOfBoundsException if an illegal index is passed as a parameter.
     */
    void add(int i, E e) throws IndexOutOfBoundsException;

    /**
     * Removes/returns the element at index i, shifting subsequent elements earlier.
     * 
     * @param i the index at which an element should be removed.
     * @return the removed element.
     * @throws IndexOutOfBoundsException if an illegal index is passed as parameter.
     */
    E remove(int i) throws IndexOutOfBoundsException;
}