package com.zipcodewilmington.singlylinkedlist;

import jdk.internal.jline.internal.TestAccessible;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testDecrement(){
        //given
        SinglyLinkedList sLL = new SinglyLinkedList();
        Integer expected = null;
        //when
        sLL.decrementCounter();
        Integer actual = null;
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testIncrement(){
        //given
        SinglyLinkedList sLL = new SinglyLinkedList();
        Integer expected = null;
        //when
        sLL.incrementCounter();
        Integer actual = null;
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testAdd(){
        //given
        SinglyLinkedList sLL = new SinglyLinkedList();

        //when
        sLL.add(null);
        //then

    }

    @Test
    public void testGetCounter(){
        //given

        //when

        //then
    }

    @Test
    public void testToString(){
        //given

        //when

        //then
    }
}
