/*
 * Copyright 2021 Surf LLC
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
 
package ru.surfstudio.compose.modifier.ext

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Modifier configuration
 *
 * @since 0.0.8
 * @author Vitaliy Zarubin
 */
object SpaceSize {

    // configuration sizes
    val spacePageVertical: Dp = SpaceConfiguration.spacePageVertical
    val spacePageHorizontal: Dp = SpaceConfiguration.spacePageHorizontal
    val spaceItemVertical: Dp = SpaceConfiguration.spaceItemVertical
    val spaceItemHorizontal: Dp = SpaceConfiguration.spaceItemHorizontal
    val spaceList: Dp = SpaceConfiguration.spaceList
    val spaceForm: Dp = SpaceConfiguration.spaceForm

    // not change, fix sizes
    val spaceThin: Dp = 2.dp
    val spaceSmall: Dp = 4.dp
    val spaceBase: Dp = 8.dp
    val spaceMedium: Dp = 16.dp
    val spaceLarge: Dp = 24.dp
}