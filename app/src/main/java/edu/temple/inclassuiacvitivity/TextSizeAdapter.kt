package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter (_context: Context, _textSizes: Array<Int>): BaseAdapter() {

    val context = _context
    val textSizes = _textSizes

    override fun getCount(): Int {
        return textSizes.size
    }

    override fun getItem(position: Int): Any {
       return textSizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if (convertView == null)
            textView = TextView(context)
        else
            textView = (convertView as TextView)

        textView.text = textSizes[position]. toString()
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = (getView(position, convertView, parent) as TextView)
        textView.textSize = textSizes[position].toFloat()
        return textView
    }


}