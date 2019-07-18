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

/**
 * Developed by skydoves on 2017-08-18.
 * Copyright (c) 2017 skydoves rights reserved.
 */

object LocalNames {
  fun getLocalName(index: Int): String {
    when (index) {
      1 -> return "ঢাকা"
      2 -> return "খুলনা"
      3 -> return "রাজশাহী"
      4 -> return "চট্টগ্রাম"
      5 -> return "বরিশাল"
      6 -> return "সিলেট"
      7 -> return "রংপুর"
      else -> return "ঢাকা"
    }
  }
}
