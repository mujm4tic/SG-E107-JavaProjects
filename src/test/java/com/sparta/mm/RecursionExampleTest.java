package com.sparta.mm;

import com.sparta.mm.week1.fibonacci.RecursionExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursionExampleTest {

    @Test
    void checkCorrectValue(){
        Assertions.assertEquals(15, RecursionExample.addRecursively(5) );
    }
}
