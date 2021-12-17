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
package ru.surfstudio.compose.modifier

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Modifier configuration
 *
 * @since 0.0.8
 * @author Vitaliy Zarubin
 */
object SpaceConfiguration {

    // configuration sizes
    internal var spacePageVertical: Dp = 16.dp
    internal var spacePageHorizontal: Dp = 16.dp
    internal var spaceItemVertical: Dp = 8.dp
    internal var spaceItemHorizontal: Dp = 8.dp
    internal var spaceList: Dp = 8.dp
    internal var spaceForm: Dp = 16.dp

    fun init(
        spacePageVertical: Dp = SpaceConfiguration.spacePageVertical,
        spacePageHorizontal: Dp = SpaceConfiguration.spacePageHorizontal,
        spaceItemVertical: Dp = SpaceConfiguration.spaceItemVertical,
        spaceItemHorizontal: Dp = SpaceConfiguration.spaceItemHorizontal,
        spaceList: Dp = SpaceConfiguration.spaceList,
        spaceForm: Dp = SpaceConfiguration.spaceForm,
    ) {
        SpaceConfiguration.spacePageVertical = spacePageVertical
        SpaceConfiguration.spacePageHorizontal = spacePageHorizontal
        SpaceConfiguration.spaceItemVertical = spaceItemVertical
        SpaceConfiguration.spaceItemHorizontal = spaceItemHorizontal
        SpaceConfiguration.spaceList = spaceList
        SpaceConfiguration.spaceForm = spaceForm
    }
}