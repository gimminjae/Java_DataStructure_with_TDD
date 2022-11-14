package com.example.java_data_structure.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ArrayListTests {
    @Test // 테스트 기반 코드
    public void test() {
        MyArrayList myArrayList = new MyArrayList();

    }
    @Test
    public void add() {
        MyArrayList myArrayList = new MyArrayList();
        for(int i = 0; i < 5; i++) {
            myArrayList.add(i);
        }
        for(int i = 0; i < 5; i++) {
            assertThat(myArrayList.get(i)).isEqualTo(i);
        }
    }
}
