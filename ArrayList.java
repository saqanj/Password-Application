import java.util.NoSuchElementException;
/**
 * An ArrayList implementation that supports dynamic resizing and iteration.
 * 
 * @author Saqlain Anjum
 */
public class ArrayList<E> implements List<E>, Iterable<E> {

    /**
     * All necessary field variables: default array capacity, underlying array, and
     * element size.
     */
    private static final int DEFAULT_CAPACITY = 8;
    private E[] underlyingArray;
    private int size = 0;

    /**
     * ArrayList constructor with a default capacity.
     */
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * ArrayList constructor with a customized capacity.
     * 
     * @param customCapacity customized ArrayList capacity.
     */
    public ArrayList(int customCapacity) {
        underlyingArray = (E[]) new Object[customCapacity]; // safe cast.
    }

    /**
     * Checks whether the given index range is valid and throws an exception
     * otherwise.
     * 
     * @param i
     * @param n
     * @throws IndexOutOfBoundsException
     */
    private void checkIndex(int index, int maxCapacity) throws IndexOutOfBoundsException {
        if (index >= maxCapacity || 0 > index)
            throw new IndexOutOfBoundsException("INVALID INDEX: " + index);
    }

    /**
     * Returns the number of elements in this list.
     * 
     * @return number of elements in the list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns whether the list is empty or not.
     *
     * @return true if empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the element at index i.
     * 
     * @param i the index to access.
     * @return the element stored at the specified index.
     * @throws IndexOutOfBoundsException if an illegal index is passed as a
     *                                   parameter.
     */
    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        return underlyingArray[i];
    }

    /**
     * Replaces the element at index i with element e, and returns the replaced
     * element.
     * 
     * @param i the index to manipulate.
     * @param e the element to set the current element to.
     * @return the previous element that has been changed.
     * @throws IndexOutOfBoundsException if an illegal index is passed as a
     *                                   parameter.
     */
    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E toReturn = underlyingArray[i];
        underlyingArray[i] = e;
        return toReturn;
    }

    /**
     * Inserts element e to be at index i.
     * 
     * @param i the index at which to insert.
     * @param e the element to insert at the specified index.
     * @throws IndexOutOfBoundsException if an illegal index is passed as a
     *                                   parameter.
     */
    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i, size + 1);
        if (size == underlyingArray.length)
            resize(2 * underlyingArray.length);
        for (int index = size - 1; index >= i; index--)
            underlyingArray[index + 1] = underlyingArray[index];
        underlyingArray[i] = e;
        size++;
    }

    /**
     * Removes and returns the element at index i.
     * 
     * @param i the index at which an element should be removed.
     * @return the removed element.
     * @throws IndexOutOfBoundsException if an illegal index is passed as parameter.
     */
    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E toReturn = underlyingArray[i];
        for (int index = i; index < size - 1; index++)
            underlyingArray[index] = underlyingArray[index + 1];
        underlyingArray[size - 1] = null;
        size--;
        return toReturn;
    }

    /**
     * Resizes the underlying array once capacity is reached.
     * 
     * @param capacity the new capacity to resize to.
     */
    private void resize(int capacity) {
        E[] newArray = (E[]) new Object[capacity]; // safe cast.
        for (int index = 0; index < size; index++)
            newArray[index] = underlyingArray[index];
        underlyingArray = newArray;
    }

    /**
     * Returns an ArrayIterator object.
     * 
     * @return the ArrayIterator object.
     */
    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>();
    }

    /**
     * Nested ArrayIterator class, allowing for iteration to occur on ArrayList
     * objects.
     */
    private class ArrayIterator<E> implements Iterator<E> {

        /**
         * Private field variable for the array index during iteration.
         */
        private int index = 0;

        /**
         * Determines if the collection contains a next element.
         * 
         * @return true if a next element exists, false otherwise.
         */
        @Override
        public boolean hasNext() {
            return index < size;
        }

        /**
         * Retries the next element in the collection.
         * 
         * @return the next element in the collection.
         * @throws NoSuchElementException if no next element exists.
         */
        @Override
        public E next() throws NoSuchElementException {
            if (hasNext()) {
                return (E) underlyingArray[index++];
            } else {
                throw new NoSuchElementException("No next element!");
            }
        }

    }
}