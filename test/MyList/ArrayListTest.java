package MyList;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    void setUp() {
    }

    @Test
    void replaceAll() {
    }

    @Test
    void sort() {
    }

    @Test
    void spliterator() {
    }

    @Test
    void of() {
    }

    @Test
    void testOf() {
    }

    @Test
    void testOf1() {
    }

    @Test
    void testOf2() {
    }

    @Test
    void testOf3() {
    }

    @Test
    void testOf4() {
    }

    @Test
    void testOf5() {
    }

    @Test
    void testOf6() {
    }

    @Test
    void testOf7() {
    }

    @Test
    void testOf8() {
    }

    @Test
    void testOf9() {
    }

    @Test
    void testOf10() {
    }

    @Test
    void copyOf() {
    }

    @Test
    void toArray() {
    }

    @Test
    void removeIf() {
    }

    @Test
    void testSpliterator() {
    }

    @Test
    void stream() {
    }

    @Test
    void parallelStream() {
    }

    @Test
    void forEach() {
    }

    @Test
    void testSpliterator1() {
    }

    @Test
    void getList() {

    }

    @Test
    void setList() {
    }

    @Test
    void testSort() {
    }

    @Test
    void testReplaceAll() {
    }

    @Test
    void trimToSize() {
    }

    @Test
    void ensureCapacity() {
    }

    @Test
    void testClone() {
    }

    @Test
    void size() {
        MyArrayList nero = new MyArrayList(10);
        var size = nero.size();
        assertEquals(0,size);
    }

    @Test
    void isEmpty() {
        MyArrayList nero = new MyArrayList(10);
        assertFalse(nero.contains("Five"));
    }

    @Test
    void contains() {
    }

    @Test
    void iterator() {
    }

    @Test
    void testToArray() {
    }

    @Test
    void add() {
        MyArrayList nero = new MyArrayList(10);
        nero.add(8,5);
        assertTrue(nero.contains(5));
        assertEquals(8,nero.indexOf(5));
    }

    @Test
    void remove() {
    }

    @Test
    void addAll() {
    }

    @Test
    void testAddAll() {
    }

    @Test
    void clear() {
        MyArrayList nero = new MyArrayList(5);
        nero.add(10);
        nero.add(5);
        assertEquals(2,nero.size());
        nero.clear();
        assertEquals(0,nero.size());
    }

    @Test
    void get() {
        MyArrayList sk = new MyArrayList();
        sk.add("go");
        sk.add("come");
        sk.add("well");
        Object value = sk.get(2);
        assertSame(value,sk.get(2));
    }

    @Test
    void set() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void indexOf() {
        MyArrayList ner = new MyArrayList();
        ner.add(10);
        ner.add(20);
        assertEquals(1, ner.indexOf(20));
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void listIterator() {
    }

    @Test
    void testListIterator() {
    }

    @Test
    void subList() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void containsAll() {
    }

    @Test
    void testToArray1() {
    }

    @Test
    void testClone1() {
    }
}