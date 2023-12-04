package com.example.tritypejunittest;

import static junit.framework.TestCase.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeMutantTest {
    @Test
    public void testMutant() {
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(2, 2, 4));
        assertEquals(4,tri.Triang(3, 3, 6));

        //此处的expected本应是4
        //但是由于判定Side1 == Side2成功时将triOut暂时置为2
        //导致后续对三角形边长进行判定时本该判断Side1+Side2 > Side3
        //却执行了判定Side1+Side3 > Side2
        TritypeMutantOne tri1 = new TritypeMutantOne();
        assertEquals(2, tri1.Triang(2, 2, 4));

        //此处的expected本应是4
        //但是由于对三角形边长进行判定时本该判断Side1+Side2 > Side3
        //却执行了判断Side1+Side2 >= Side3
        //等号不满足两边之和大于第三边
        TritypeMutantTwo tri2 = new TritypeMutantTwo();
        assertEquals(2, tri2.Triang(3, 3, 6));

    }

}