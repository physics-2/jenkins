package ru.roman;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyTest {
    @BeforeEach
    public void setup(){
        //Изуть pipelines, tools i stages
    }

    @Test
    public void test(){
        System.out.println("test");
        Assertions.assertEquals(1,2);
    }
}
