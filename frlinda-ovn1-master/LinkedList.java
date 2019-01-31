// Fred Lindahl, grudat18 uppg 1.2/1.3

/**
 * This class creates and maintains a singly linked list.
 *
 * @param <T> data type to be stored in given instance of list.
 */
public class LinkedList<T> {

    private ListElement<T> first;   // First element in list.
    private ListElement<T> last;    // Last element in list.
    private int size;               // Number of elements in list.

    /**
     * A list element that stores a value of type T
     *
     * @param <T> data type of element created
     */
    private static class ListElement<T> {
        private T data;
        private ListElement<T> next; //

        private ListElement(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Create an empty list
     */
    public LinkedList() {
        first = null;
        last = null;
        size = 0;

    }

    /**
     * Inserts the given element at the beginning of the list
     *
     * @param element to be added
     * Time complexity: f(n) = 1
     */

    public void addFirst(T element) {
        if (element != null){

            ListElement<T> newelement = new ListElement<>(element);

            if (size == 0){
                first = newelement;
                last = newelement;
                size += 1;
            }
            else {
                newelement.next = first;
                first = newelement;
                size += 1;

            }
        }
    }

    /**
     * Inserts the given element at the end of the list
     *
     * @param element to be added
     * Time complexity: f(n) = 1
     */
    public void addLast(T element) {
        if (element != null) {
            ListElement<T> newelement = new ListElement<>(element);


            if (size == 0){
                size += 1;
                first = newelement;
                last = newelement;
            }
            else {
                size += 1;
                last.next = newelement;
                last = newelement;

            }
        }
    }

    /**
     * Returns the first element of this list.
     * Returns null if the list is empty.
     *
     * Time complexity: f(n) = 1.
     */
    public T getFirst() {
        if (size == 0) return null;
        return first.data;
    }

    /**
     * Returns the last element of this list.
     * Returns null if the list is empty.
     * Time complexity: f(n) = 1.
     */
    public T getLast() {
        if (size == 0) return null;
        return last.data;
    }

    /**
     * Returns the element at the specified position in this list.
     * Returns null if index is out of bounds.
     *
     * @return the element at index n
     * Time complexity: f(n) = n.
     */
    public T get(int index) {
        if (index < 0 || index >= size){
            return null;
        }
        if (size == 0) return null;

        if (index == size - 1){
            return last.data;
        }
        if (index == 0) {
            return first.data;
        }
        else {
            ListElement<T> element = first;
            for (int counter = 0; counter < index; counter ++) {
                element = element.next;

            }
            return element.data;

        }
    }
    /**
     * Removes and returns the first element from this list.
     * Returns null if the list is empty.
     *
     * @return the element at the top of this list
     * Time complexity: f(n) = 1.
     */
    public T removeFirst() {
        if (size == 0) return null;
        if (size == 1){
            size -= 1;
            T oldfirst = first.data;
            first.data = null;
            return oldfirst;
        }
        else {
            T oldfirst = first.data;
            size -= 1;
            ListElement<T> fooFirst = first.next;
            first.data = null;
            first = fooFirst;
            return oldfirst;
        }
    }

    /**
     * Removes all of the elements from this list.
     *
     * Time complexity: f(n) = 1.
     */
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     * Time complexity: f(n) = 1.
     */
    public int size() {
        return size;
    }

    /**
     * Returns a string representation of this list. The string
     * representation consists of a list of the elements enclosed in
     * square brackets ("[]"). Adjacent elements are separated by the
     * characters ", " (comma and space).
     *
     * @return a string representation of this list.
     * Time complexity: f(n) = n.
     */
    public String toString() {
        String printList = "[";
        if (size == 0) return null;
        ListElement<T> element = first;
        for (int counter = 0; counter < size; counter ++){
            if (element.next == null){
                printList = printList + element.data + "].";
                element = element.next;
            }
            else{
                printList = printList + element.data + ", ";
                element = element.next;
            }
        }
        return printList;
    }

    /**
     * Method to check that list is is in a healthy state.
     * Checks size against actual number of elements
     * Checks if first and last points to null if list empty, otherwise only for last.
     *
     * Time complexity: f(n) = n
     */

    public boolean healthy(){
        ListElement<T> element = first;
        int counter = 0;
        while (element != null) {
            counter ++;
            element = element.next;
        }
        if(size == counter){
            if(size == 0) {
                if (first == null && last == null) return true;
            }
            else{
                if (first.data != null && last.data != null){
                    if (last.next == null) return true;
                }
            }
        }
        return false;
    }
}