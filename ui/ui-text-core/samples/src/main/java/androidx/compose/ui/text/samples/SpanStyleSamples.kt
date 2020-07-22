/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.ui.text.samples

import androidx.annotation.Sampled
import androidx.compose.Composable
import androidx.compose.foundation.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.annotatedString
import androidx.compose.ui.text.withStyle
import androidx.ui.unit.sp

@Sampled
@Composable
fun SpanStyleSample() {
    Text(
        fontSize = 16.sp,
        text = annotatedString {
            withStyle(style = SpanStyle(color = Color.Red)) {
                append("Hello")
            }
            withStyle(SpanStyle(color = Color.Blue)) {
                append(" World")
            }
        }
    )
}
