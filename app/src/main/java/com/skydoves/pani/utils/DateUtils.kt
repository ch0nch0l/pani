/*
 * Copyright (C) 2016 skydoves
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.pani.utils

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

/**
 * Developed by skydoves on 2017-08-18.
 * Copyright (c) 2017 skydoves rights reserved.
 */

object DateUtils {

    val dateFormat: String
        get() = "yyyy-MM-dd"

    fun getFarDay(far: Int): String {
        val date = Date()
        val cal = Calendar.getInstance()
        cal.time = date
        cal.add(Calendar.DAY_OF_MONTH, far)
        val sdf = SimpleDateFormat(DateUtils.dateFormat)
        val currentDateandTime = sdf.format(cal.time)
        return currentDateandTime
    }

    fun getDateDay(date: String, dateType: String): Int {
        try {
            val dateFormat = SimpleDateFormat(dateType)
            val nDate = dateFormat.parse(date)
            val cal = Calendar.getInstance()
            cal.time = nDate
            return cal.get(Calendar.DAY_OF_WEEK) - 1
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return -1
    }

    fun getDayofWeek(data: String, dateType: String): Int {
        try {
            val dateFormat = SimpleDateFormat(dateType)
            val nDate = dateFormat.parse(data)
            val c = Calendar.getInstance()
            c.time = nDate
            val dayOfWeek = c.get(Calendar.DAY_OF_WEEK)
            return dayOfWeek
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return -1
    }

    fun getDayNameList(days: String): String {
        val builder = StringBuilder()
        if (days.contains("0"))
            builder.append("শ")
        if (days.contains("1"))
            builder.append("র")
        if (days.contains("2"))
            builder.append("সো")
        if (days.contains("3"))
            builder.append("ম")
        if (days.contains("4"))
            builder.append("বু")
        if (days.contains("5"))
            builder.append("বৃ")
        if (days.contains("6"))
            builder.append("শু")
        return builder.toString()
    }

    fun getIndexOfDayName(index: Int): String {
        val dname: String
        when (index) {
            /**1 -> dname = "월요일"
            2 -> dname = "화요일"
            3 -> dname = "수요일"
            4 -> dname = "목요일"
            5 -> dname = "금요일"
            6 -> dname = "토요일"*/
            1 -> dname = "রবিবার"
            2 -> dname = "সোমবার"
            3 -> dname = "রবিমঙ্গলবার"
            4 -> dname = "বুধবার"
            5 -> dname = "বৃহস্পতিবার"
            6 -> dname = "শুক্রবার"
            else -> dname = "শনিবার"
        }
        return dname
    }

    fun getIndexofDayNameHead(index: Int): String {
        var dayName = " (일)"
        when (index) {
            1 -> dayName = " (রবি)"
            2 -> dayName = " (সোম)"
            3 -> dayName = " (মঙ্গল)"
            4 -> dayName = " (বুধ)"
            5 -> dayName = " (বৃহস্পতি)"
            6 -> dayName = " (শুক্র)"
            7 -> dayName = " (শনি)"
        }
        return dayName
    }
}
