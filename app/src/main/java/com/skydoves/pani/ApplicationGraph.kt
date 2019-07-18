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

package com.skydoves.pani

import com.skydoves.pani.presenters.AlarmScreenPresenter
import com.skydoves.pani.presenters.MainPresenter
import com.skydoves.pani.presenters.MakeAlarmPresenter
import com.skydoves.pani.presenters.SelectDrinkPresenter
import com.skydoves.pani.presenters.SetGoalPresenter
import com.skydoves.pani.presenters.SetLocalPresenter
import com.skydoves.pani.ui.activities.intro.StartActivity
import com.skydoves.pani.ui.activities.settings.SetBubbleColorActivity
import com.skydoves.pani.ui.fragments.main.AlarmFragment
import com.skydoves.pani.ui.fragments.main.ChartFragment
import com.skydoves.pani.ui.fragments.main.DailyFragment
import com.skydoves.pani.ui.fragments.main.MainWaterFragment
import com.skydoves.pani.utils.AlarmUtils

/**
 * Developed by skydoves on 2017-08-19.
 * Copyright (c) 2017 skydoves rights reserved.
 */

interface ApplicationGraph {
  fun inject(target_: StartActivity)

  fun inject(target_: SetGoalPresenter)

  fun inject(target_: SetLocalPresenter)

  fun inject(target_: AlarmScreenPresenter)

  fun inject(target_: MakeAlarmPresenter)

  fun inject(target_: MainPresenter)

  fun inject(target_: AlarmFragment)

  fun inject(target_: AlarmUtils)

  fun inject(target_: ChartFragment)

  fun inject(target_: MainWaterFragment)

  fun inject(target_: DailyFragment)

  fun inject(target_: SelectDrinkPresenter)

  fun inject(target_: SetBubbleColorActivity)
}
