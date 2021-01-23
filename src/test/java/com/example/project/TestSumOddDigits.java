package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestSumOddDigits {

   @Test
   public void testSumOddDigits()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action

     // assertion
     assertEquals(4,Main.sumOddDigits(134));
assertEquals(1,Main.sumOddDigits(1));
assertEquals(0,Main.sumOddDigits(4682222));
assertEquals(0,Main.sumOddDigits(2));
assertEquals(20,Main.sumOddDigits(1347689));

     // undo the binding in System
     System.setOut(originalOut);
   }
}
