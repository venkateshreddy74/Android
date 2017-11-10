/*
 * Copyright (c) 2017 DuckDuckGo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duckduckgo.app.browser


import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class BrowserViewModelFactory @Inject constructor() : ViewModelProvider.Factory {

    @Inject
    lateinit var queryUrlConverter: QueryUrlConverter

    override fun <T : ViewModel> create(aClass: Class<T>): T {
        if (aClass.isAssignableFrom(BrowserViewModel::class.java)) {
            return BrowserViewModel(queryUrlConverter) as T
        }
        throw IllegalArgumentException("Unknown view model")
    }
}

