package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeDecisionTest{
    /* 使用的decision
      if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
              {
                  triOut = 4;
                  return (triOut);
              }
     */
    @Test
    public void testDecision() {
        Tritype tri = new Tritype();
        // 覆盖整个条件为真的情况
        assertEquals(4, tri.Triang(0, 0, 0));

        // 覆盖整个条件为假的情况
        assertEquals(1, tri.Triang(2, 3, 4));

    }

}