package ru.playjim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    @Test
    void emptyList(){
        var list = new MyList<String>();
        assertTrue(list.isEmpty());
        assertEquals(0,list.size());
    }

    @Test
    void printEmptyList() {
        var list = new MyList<>();
        assertEquals("[]",list.toString());
    }
    @Test
    void printNotEmptyList() {
        var list = new MyList<String>();
        list.add("one");
        list.add("two");
        assertEquals("[one,two]",list.toString());
    }
}