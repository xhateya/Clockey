package com.xhateya.idn.clockey.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.xhateya.idn.clockey.R
import com.xhateya.idn.clockey.room.Alarm
import kotlinx.android.synthetic.main.item_added_clocky.view.*

class AlarmAdapter () : RecyclerView.Adapter<AlarmAdapter.AlarmViewHolder>(){

    var alarms = emptyList<Alarm>()

    class AlarmViewHolder (val view : View) : RecyclerView.ViewHolder(view)

    fun setData(list : List<Alarm>){
        val alarmDiffUtil = AlarmDiffUtil(alarms, list)
        val alarmDiffUtilResult = DiffUtil.calculateDiff(alarmDiffUtil)
        this.alarms = list
        alarmDiffUtilResult.dispatchUpdatesTo(this)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmViewHolder {
        return AlarmViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_added_clocky, parent, false)
        )

    }

    override fun onBindViewHolder(holder: AlarmViewHolder, position: Int) {
        val alarm = alarms[position]
        holder.view.item_time_clocky.text= alarm.time
        holder.view.item_date_clocky.text=alarm.date
        holder.view.item_note_clocky.text=alarm.note




    }

    override fun getItemCount() = alarms.size

    private fun ImageView.loadImageDrawable(context: Context, drawable : Int){
        Glide.with(context).load(drawable).into(this)
    }


}