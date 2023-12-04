package com.example.tritypejunittest;

import static junit.framework.TestCase.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeMCDCTest{
    /* 使用的decision
      if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
              {
                  triOut = 4;
                  return (triOut);
              }
     */

    @Test
    public void testMCDC() {
        Tritype tri = new Tritype();

        // 覆盖 Side1 <= 0 为真的情况
        // condition 1 = true , condition 2 = condition 3 = false
        assertEquals(4, tri.Triang(0, 2, 3));

        // 覆盖 Side2 <= 0 为真的情况
        // condition 2 = true , condition 1 = condition 3 = false
        assertEquals(4, tri.Triang(2, 0, 3));

        // 覆盖 Side3 <= 0 为真的情况
        // condition 3 = true , condition 1 = condition 2 = false
        assertEquals(4, tri.Triang(2, 3, 0));


        // 覆盖 Side1 <= 0 为假的情况
        // condition 1 = condition 2 = condition 3 = false
        assertEquals(1, tri.Triang(3, 4, 5));

        //总共六种，但是三个Condition分别判定为false时，重复两次，所以一共四种情况

    }

}