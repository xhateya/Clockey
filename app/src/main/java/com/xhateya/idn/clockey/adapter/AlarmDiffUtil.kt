package com.xhateya.idn.clockey.adapter

import androidx.recyclerview.widget.DiffUtil
import com.xhateya.idn.clockey.room.Alarm


class AlarmDiffUtil (private val oldList: List<Alarm>, private val newList: List<Alarm>): DiffUtil.Callback(){
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition]== newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldData = oldList[oldItemPosition]
        val newData = newList[newItemPosition]
        return oldData.id == newData.id
                && oldData.date == newData.date
                && oldData.time == newData.time
                && oldData.note == newData.note
                && oldData.type == newData.type

    }

}
