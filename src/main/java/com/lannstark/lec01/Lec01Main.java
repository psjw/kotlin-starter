package com.lannstark.lec01;

import java.util.Arrays;
import java.util.List;

public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L; // (1)
    final long number2 = 10L; // (2)

    Long number3 = 1_000L; // (3)
    Person person = new Person("최태현"); // (4)

    final List<Integer> numbers = Arrays.asList(1, 2);
    numbers.add(3);
    //연산시 Reference Type 사용 하지 마라 boxing과 unboxing으로 인해-> 불필요한 객체 생성


  }

}
