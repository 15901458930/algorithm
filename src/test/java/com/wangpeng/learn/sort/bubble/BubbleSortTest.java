package com.wangpeng.learn.sort.bubble;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sort() throws Exception {
        BubbleSort bb = new BubbleSort(new int[]{4,23,443,232,11,67888,88888},"desc");
        bb.sort();
        System.out.println(bb.toString());
    }
}