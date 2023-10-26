package MyList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UndoableStringBuilderTest {

    private MyStringBuilder usb;

    @BeforeEach
    public void setup() {
        usb = new MyStringBuilder();
    }

    @Test
    public void testAppend() {
        usb.append("Hello, ");
        usb.append("world!");
        assertEquals("Hello, world!", usb.toString());
    }

    @Test
    public void testDelete() {
        usb.append("Hello, world!");
        usb.delete(5, 12);
        assertEquals("Hello!", usb.toString());
    }

    @Test
    public void testInsert() {
        usb.append("Hello, !");
        usb.insert(7, "world");
        assertEquals("Hello, world!", usb.toString());
    }

    @Test
    public void testReplace() {
        usb.append("Hello, world!");
        usb.replace(7, 12, "there");
        assertEquals("Hello, there!", usb.toString());
    }

    @Test
    public void testReverse() {
        usb.append("abcdef");
        usb.reverse();
        assertEquals("fedcba", usb.toString());
    }

    @Test
    public void testUndo() {
        usb.append("Hello, ");
        usb.append("world!");
        usb.undo();
        assertEquals("Hello, ", usb.toString());
        usb.undo();
        assertEquals("", usb.toString());
    }
}
