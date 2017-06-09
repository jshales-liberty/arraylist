

package arraylinkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLinkedList {
    
    MyLinkedList list = new MyLinkedList();
    
//    @BeforeClass
//    public static void setupClass() {
//        MyLinkedList list = new MyLinkedList();
//        System.out.println(list);
//    }
    
    @Before
    public void setup() {
        MyLinkedList list = new MyLinkedList();
        list.append("hi");
        list.append("yo");
        list.append("bye");
    }

    // tests the initial value of size, which should be zero
//    @Test
//    public void testNewListIsEmpty() {
//        int i = list.size();
//        assertEquals(0, i);
//    }
    
    @Test
    public void testAppend() {
        list.append("david");
        int i = this.list.size();
        assertEquals(3, i);
    }
    
    @Test
    public void testSize() {
        int i = list.size();
        assertEquals(3, i);
    }
    
    @Test
    public void testGet() {
        String x = (String) list.get(1);
        assertEquals("hi", x);
    }
    
//    @Test
//    public void testSet() {
//        list.set(1, "jonathan");
//        int i = this.list.size();
//        assertEquals(1, i);
//    }

    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        list.get(-1);
    }
}
