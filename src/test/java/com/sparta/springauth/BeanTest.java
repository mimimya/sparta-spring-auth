package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    Food pizza;

    @Autowired
    Food chicken;

    @Qualifier("pizza")
    @Autowired
    Food food;

    @Test
    public void test1() {
        pizza.eat();
        chicken.eat();
        food.eat();
    }
    /*  치킨을 먹습니다.
        치킨을 먹습니다.
        피자를 먹습니다.*/
}