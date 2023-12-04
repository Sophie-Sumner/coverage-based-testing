package com.example.tritypejunittest;

import static junit.framework.TestCase.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeConditionTest{
    /* 使用的decision
      if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
              {
                  triOut = 4;
                  return (triOut);
              }
     */

    @Test
    public void testCondition() {
        Tritype tri = new Tritype();

        // 使得所有条件为真、假的情况都被覆盖一遍

        // 覆盖 Side1 <= 0 为真的情况 (后面条件都为N/A)
        // condition1 = true
        assertEquals(4, tri.Triang(0, 2, 3));

        // 覆盖 Side2 <= 0 为真的情况 (前面条件为false,后面条件为N/A)
        // condition 1 = false, condition 2 = true
        assertEquals(4, tri.Triang(2, 0, 3));

        // 覆盖 Side3 <= 0 为真的情况 (前面条件为false)
        // condition 1 = condition 2 = false, condition 3 = true
        assertEquals(4, tri.Triang(2, 3, 0));

        // 覆盖 Side3 <= 0 为假的情况
        // condition 3 = false
        assertEquals(2, tri.Triang(2, 3, 3));

    }

}