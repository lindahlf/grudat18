import static org.junit.Assert.*;

public class TreapTest {

    @org.junit.Test
    public void insert() {
        Treap myTreap = new Treap();
        myTreap.root = myTreap.insert("Volvo", myTreap.root);
        assertTrue(myTreap.checkPrio(myTreap.root));
        myTreap.root = myTreap.insert("Mercedes", myTreap.root);
        myTreap.root = myTreap.insert("BMW", myTreap.root);
        myTreap.root = myTreap.insert("Porsche", myTreap.root);
        myTreap.root = myTreap.insert("Volkswagen", myTreap.root);
        myTreap.root = myTreap.insert("Alfa Romeo", myTreap.root);
        assertTrue(myTreap.checkPrio(myTreap.root));
    }

    @org.junit.Test
    public void getSize() {
        Treap myTreap = new Treap();
        assertTrue(myTreap.getSize() == 0);
        myTreap.root = myTreap.insert("Volvo", myTreap.root);
        myTreap.root = myTreap.insert("Mercedes", myTreap.root);
        myTreap.root = myTreap.insert("BMW", myTreap.root);
        myTreap.root = myTreap.insert("Porsche", myTreap.root);
        myTreap.root = myTreap.insert("Volkswagen", myTreap.root);
        myTreap.root = myTreap.insert("Alfa Romeo", myTreap.root);
        assertTrue(myTreap.getSize() == 6);
    }

    @org.junit.Test
    public void toStringTest() {
        Treap myTreap = new Treap();
        assertEquals(null, myTreap.toString());
        myTreap.root = myTreap.insert("Volvo", myTreap.root);
        myTreap.root = myTreap.insert("Mercedes", myTreap.root);
        myTreap.root = myTreap.insert("BMW", myTreap.root);
        myTreap.root = myTreap.insert("Porsche", myTreap.root);
        myTreap.root = myTreap.insert("Volkswagen", myTreap.root);
        myTreap.root = myTreap.insert("Alfa Romeo", myTreap.root);
        String fooString = "Alfa Romeo BMW Mercedes Porsche Volkswagen Volvo ";
        assertEquals(fooString, myTreap.toString());
    }
}