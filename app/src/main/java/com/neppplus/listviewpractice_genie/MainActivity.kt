package com.neppplus.listviewpractice_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.listviewpractice_genie.adapters.StudentAdapter
import com.neppplus.listviewpractice_genie.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("코딩티처지니", 1988) )
        mStudentList.add( Student("김민상", 1995) )
        mStudentList.add( Student("조상민", 1975) )
        mStudentList.add( Student("이영희", 1996) )
        mStudentList.add( Student("박철수", 2000) )
        mStudentList.add( Student("정민규", 1984) )
        mStudentList.add( Student("장소영", 1962) )


        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter


        studentListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 이 클릭 됨", Toast.LENGTH_SHORT).show()

        }


    }
}