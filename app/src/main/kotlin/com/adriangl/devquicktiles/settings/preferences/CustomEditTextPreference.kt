/*
 * Copyright (C) 2017 Adrián García
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.adriangl.devquicktiles.settings.preferences

import android.content.Context
import android.preference.EditTextPreference
import android.util.AttributeSet

/**
 * Custom [EditTextPreference] with custom behaviour for this app.
 */
class CustomEditTextPreference @JvmOverloads constructor(context: Context,
                                                         attrs: AttributeSet? = null) : EditTextPreference(context, attrs) {

    override fun persistString(value: String?): Boolean {
        return false
    }
}