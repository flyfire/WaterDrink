package com.skydoves.waterdays.viewTypes

import com.skydoves.waterdays.compose.BaseView

/**
 * Developed by skydoves on 2017-08-19.
 * Copyright (c) 2017 skydoves rights reserved.
 */

interface SetGoalActivityView : BaseView {
    fun intentMain()
    fun onSetSuccess()
    fun onSetFailure()
}
