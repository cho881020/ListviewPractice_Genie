package com.neppplus.listviewpractice_genie.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listviewpractice_genie.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}