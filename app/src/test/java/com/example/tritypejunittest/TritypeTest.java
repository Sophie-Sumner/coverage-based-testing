package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void TestTriang() {
        Tritype tri1 = new Tritype();
        Tritype tri2 = new Tritype();
        Tritype tri3 = new Tritype();
        Tritype tri4 = new Tritype();
        Tritype tri5 = new Tritype();
        Tritype tri6 = new Tritype();
        Tritype tri7 = new Tritype();
        Tritype tri8 = new Tritype();

        assertEquals(4,tri1.Triang(-1,-1,-1));//边长出现非正数
        assertEquals(1,tri2.Triang(2,3,4));//普通三角形
        assertEquals(4,tri3.Triang(1,5,3));//不是三角形
        assertEquals(3,tri4.Triang(1,1,1));//等边三角形
        assertEquals(2,tri5.Triang(2,2,3));//等腰
        assertEquals(2,tri6.Triang(2,3,2));//等腰
        assertEquals(2,tri7.Triang(3,2,2));//等腰
        assertEquals(4,tri8.Triang(2,2,4));//不是三角形
    }
}