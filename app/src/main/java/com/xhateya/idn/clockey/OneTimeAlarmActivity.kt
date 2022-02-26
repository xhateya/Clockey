package com.xhateya.idn.clockey

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class OneTimeAlarmActivity : AppCompatActivity (){

    companion object{
        private const val DATE_PICKER_TAG= "DatePicker"
        private const val TIME_PICKER_ONCE_TAG="TimePicker"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_time_alarm)

        btn_set_date_one_time.setOnClickListener(this)
        btn_set_time_one_time.setOnClickListener(this)


    }

}