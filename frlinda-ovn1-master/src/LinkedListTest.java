import static org.junit.Assert.*;

public class LinkedListTest {

    @org.junit.Test
    public void LinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.size() == 0);
        assertTrue(list.getFirst() == null);
        assertTrue(list.getLast() == null);
        assertTrue(list.healthy());
    }

    @org.junit.Test
    public void addFirst() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Petter");
        list.addFirst("Nico");
        list.addLast("Dalbom");
        assertEquals(list.getFirst(), "Nico");
        assertTrue(list.healthy());
    }

    @org.junit.Test
    public void addLast() {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("Petter");
        assertEquals(list.getLast(), "Petter");
        assertTrue(list.healthy());
    }

    @org.junit.Test
    public void getFirst() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(list.getFirst() == null);
        list.addFirst("Dalbom");
        list.addFirst("Nico");
        list.addFirst("Schiller");
        list.addFirst("Petter");
        assertEquals(list.getFirst(), "Petter");

    }

    @org.junit.Test
    public void getLast() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(list.getLast() == null);
        list.addFirst("Dalbom");
        list.addLast("Petter");
        assertEquals(list.getLast(), "Petter");
        assertTrue(list.healthy());
    }

    @org.junit.Test
    public void get() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Dalbom");
        assertTrue(list.get(-1) == null);
        assertTrue(list.get(1) == null);
        assertEquals(list.get(0), "Dalbom");
    }

    @org.junit.Test
    public void removeFirst() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(list.removeFirst() == null);
        list.addFirst("Petter");
        assertEquals(list.removeFirst(),"Petter");
        list.addFirst("Petter");
        list.addFirst("Dalbom");
        assertEquals(list.removeFirst(), "Dalbom");
        assertEquals(list.getFirst(), "Petter");
        assertTrue(list.healthy());
    }

    @org.junit.Test
    public void clear() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Petter");
        list.addFirst("Marcus");
        list.addLast("Aron");
        list.clear();
        assertTrue(list.getFirst() == null );
        assertTrue(list.get(1) == null);
        assertTrue(list.getLast() == null);
        assertTrue(list.healthy());
    }

    @org.junit.Test
    public void size() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(list.size() == 0);
        list.addFirst("Petter");
        assertTrue(list.size() == 1);
        list.addLast("Nico");
        assertTrue(list.size() == 2);
        list.removeFirst();
        assertTrue(list.size() == 1);
    }

    @org.junit.Test
    public void toStringTest() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(list.toString() == null);
        list.addFirst("I");
        list.addLast("am");
        list.addLast("dead");
        list.addLast("inside");
        String fooString2 = "[I, am, dead, inside].";
        assertEquals(fooString2, list.toString());
    }

}