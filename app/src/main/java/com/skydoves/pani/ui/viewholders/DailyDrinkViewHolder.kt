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

package com.skydoves.pani.ui.viewholders

import android.content.DialogInterface
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.skydoves.pani.models.Drink
import kotlinx.android.synthetic.main.item_dailyrecord.view.*

/**
 * Developed by skydoves on 2017-08-20.
 * Copyright (c) 2017 skydoves rights reserved.
 */

class DailyDrinkViewHolder(view: View, private val delegate: Delegate) : BaseViewHolder(view) {

  private lateinit var drink: Drink

  interface Delegate {
    fun onClick(view: View, drink: Drink)
    fun onConfirm(drink: Drink)
  }

  @Throws(Exception::class)
  override fun bindData(data: Any) {
    this.drink = data as Drink

    itemView.item_dailyrecord_tv_todaydate.setText(drink.date)
    itemView.item_dailyrecord_tv_drinkamount.text = drink.amount
    itemView.item_dailyrecord_imv_main.setImageDrawable(drink.image)
    itemView.item_dailyrecord_btn_delete.setOnClickListener {
      val alertDlg = AlertDialog.Builder(it.context)
      alertDlg.setTitle("ওয়ার্নিং")

      // yes - delete
      alertDlg.setPositiveButton("হ্যাঁ") { dialog: DialogInterface, which: Int -> delegate.onConfirm(drink) }

      // no - cancel
      alertDlg.setNegativeButton("না") { dialog: DialogInterface, which: Int -> dialog.dismiss() }
      alertDlg.setMessage(String.format("আপনি কি এই রেকর্ডটি মুছে ফেলতে চান?"))
      alertDlg.show()
    }
  }

  override fun onClick(v: View) {
    delegate.onClick(this.view(), drink)
  }

  override fun onLongClick(v: View): Boolean {
    return false
  }
}
