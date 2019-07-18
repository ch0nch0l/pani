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

package com.skydoves.pani.presenters

import android.content.Context
import android.os.Bundle

import com.skydoves.pani.WDApplication
import com.skydoves.pani.compose.BasePresenter
import com.skydoves.pani.events.rx.RxUpdateMainEvent
import com.skydoves.pani.models.Capacity
import com.skydoves.pani.persistence.sqlite.SqliteManager
import com.skydoves.pani.viewTypes.SelectDrinkActivityView

import javax.inject.Inject

/**
 * Developed by skydoves on 2017-09-22.
 * Copyright (c) 2017 skydoves rights reserved.
 */

class SelectDrinkPresenter : BasePresenter<SelectDrinkActivityView>() {

  @Inject
  lateinit var sqliteManager: SqliteManager

  override fun onCreate(context: Context, savedInstanceState: Bundle?) {
    super.onCreate(context, savedInstanceState)
    WDApplication.component.inject(this)
  }

  val capacityItemList: List<Capacity> by lazy {
    sqliteManager.capacityList
  }

  fun addRecrodItem(amount: Int) {
    sqliteManager.addRecord("$amount")
    RxUpdateMainEvent.getInstance().updateBadge()
  }

  fun addCapacity(capacity: Capacity) = sqliteManager.addCapacity(capacity)
  fun deleteCapacity(capacity: Capacity) = sqliteManager.deleteCapacity(capacity)
}
