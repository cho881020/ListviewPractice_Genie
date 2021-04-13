package com.neppplus.listviewpractice_genie

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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


        studentListView.setOnItemLongClickListener { parent, view, position, id ->

            val alert = AlertDialog.Builder(this)
            alert.setTitle("학생 목록 삭제")
            alert.setMessage("정말 해당 학생을 삭제 하시겠습니까?")
            alert.setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which ->

                mStudentList.removeAt(position)

                mAdapter.notifyDataSetChanged()


            })
            alert.setNegativeButton("취소", null)
            alert.show()


            return@setOnItemLongClickListener true

        }


    }
}