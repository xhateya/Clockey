package com.xhateya.idn.clockey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xhateya.idn.clockeykey.RepeatingAlarmActivity
import java.text.SimpleDateFormat
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initTimeToday()
        initDateToday()
        initAlarmType()



    }

    private fun initAlarmType() {
        iv_one_time.setOnClickListener{
            startActivity(Intent(this, OneTimeAlarmActivity::class.java))

        }
        iv_repeat_time.setOnClickListener {
            startActivity(Intent(this, RepeatingAlarmActivity::class.java))
        }
    }

    private fun initDateToday() {
        val dateNow : Date = Calendar.getInstance().time
        val dateFormat = SimpleDateFormat("E, dd, MMM yyyy", Locale.getDefault())
        val formattedDate : String = dateFormat.format(dateNow)

        tv_date_today.text = formattedDate
    }

    private fun initTimeToday() {
        val timeNow =Calendar.getInstance()
        val timeFormat=SimpleDateFormat("HH : mm")
        val formattedTime= timeFormat.format(timeNow.time)

        tv_time_today.text = formattedTime


    }
}