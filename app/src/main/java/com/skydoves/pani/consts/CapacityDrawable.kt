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

package com.skydoves.pani.consts

import com.skydoves.pani.R

/**
 * Developed by skydoves on 2017-09-22.
 * Copyright (c) 2017 skydoves rights reserved.
 */

object CapacityDrawable {
  fun getLayout(amount: Int): Int {
    return when {
      amount <= 125 -> R.drawable.ic_glass0
      amount <= 250 -> R.drawable.ic_glass01
      amount <= 350 -> R.drawable.ic_glass06
      amount <= 500 -> R.drawable.ic_glass05
      amount <= 750 -> R.drawable.ic_glass07
      else -> R.drawable.ic_glass04
    }
  }
}
