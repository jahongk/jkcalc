package com.github.jahongk.calclib

import co.weverse.account.calclib.sub.CalcSub

class Calc {
    fun sum(a: Int, b: Int) = a + b
    fun printSub() = {
        CalcSub().getSubString("calclib")
    }
}