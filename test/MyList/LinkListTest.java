package MyList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {
    LinkList linkList = new LinkList(10);
    @BeforeEach
    @Test
    void setUp() {
        assertNotNull(linkList);
    }
    @Test
    void testGetFirst(){
        assertNull(linkList.getFirst());
    }
    @Test
    void testGetLast(){
        assertNull(linkList.getLast());
    }
    @Test
    void testRemoveFirst(){

    }
}