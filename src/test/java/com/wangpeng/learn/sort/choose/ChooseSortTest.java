package com.wangpeng.learn.sort.choose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChooseSortTest {

    private ChooseSort cs;

    @Before
    public void setUp() throws Exception {

        cs = new ChooseSort(new int[]{2,3432,222,20,332343324,222},"desc");
    }

    @Test
    public void sort() throws Exception {

        cs.sort();
    }

}