package uz.itschool.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.marginLeft
import kotlinx.android.synthetic.main.activity_main.*
import uz.itschool.myapplication.test.Test

class MainActivity : AppCompatActivity() {
    var tests= arrayListOf<Test>()
    var index=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        tests.add(Test("6+1", "7", "6", "5","4","7",false))
        tests.add(Test("6*1", "7", "6", "5","4","6",false))
        tests.add(Test("6+3", "7", "6", "9","4","9",false))
        tests.add(Test("2+1", "7", "6", "5","3","3",false))

        createNumber(tests.size)
        createTest(index)
        next.setOnClickListener{

           if (index<tests.size-1){
               index++
               createTest(index)

          }
        }

    }
        fun createNumber(n:Int){
            for (i in 0 until n){
                var btn=Button(this)
                btn.marginLeft
                btn.id=i
                btn.text="${i+1}"
                if (!tests[i].status){
                    btn.setBackgroundColor(Color.BLUE)
                }
                questions_number.addView(btn)
            }

        }

    fun createTest(n:Int){
        var test=tests[n]
        question.text=tests[index].question
        radioButton1.text=tests[index].answer1
        radioButton2.text=tests[index].answe2
        radioButton3.text=tests[index].answer3
        radioButton4.text=tests[index].answer4

    }
}
