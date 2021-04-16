package com.neppplus.listviewpractice_genie.datas

import android.util.Log

// 학생 하위정보 - 이름, 출생년도

class Student(
    val name : String,
    val birthYear : Int) {

    fun printName() {
        Log.d("연습용", this.name)
    }

//    2021년의 나의 나이를 결과로 내보내주는 함수.

    fun getMyAgeIn2021() : Int {
        val myAge = 2021 - this.birthYear + 1

        return myAge
    }

}