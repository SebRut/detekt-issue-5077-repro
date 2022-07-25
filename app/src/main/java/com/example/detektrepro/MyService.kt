package com.example.detektrepro

import kotlin.math.sqrt

class MyService {
    fun myMethod(): List<MyEnum> {
        return listOfNotNull(
            MyEnum.VAL_1,
            MyEnum.VAL_2.takeUnless { sqrt(2f) > 1.40f }
        )
    }
}