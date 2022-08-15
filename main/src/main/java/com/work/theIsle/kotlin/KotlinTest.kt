package com.work.theIsle.kotlin

/**
 * @Author TIKOU
 * @Date 2022/7/22-13:50
 * @Email 1320917731@qq.com & wangweitikou1994@gmail.com
 * @Description kotlin学习
 */
class KotlinTest {
    fun test() {
        mapOf("jack" to 18, "jack" to 18)
    }

    fun mapTest() {
        val mutableMap = mutableMapOf("java" to 8)
        mutableMap.getOrPut("kotlin", getDefaultData())
        mutableMap.getOrPut("C++") { 9 }
        println(getDefaultData2())
    }

    // 函数作为返回类型
    private fun getDefaultData(): () -> Int {
        return { 4 }
    }

    private fun getDefaultData2(): (index: Int) -> Int {
        return { index -> index }
    }
}