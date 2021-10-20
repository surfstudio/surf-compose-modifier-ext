/*
 * Copyright 2021 Vitaliy Zarubin
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
 
package com.keygenqt.modifier

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Modifier configuration
 *
 * @since 0.0.7
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

    // not change, fix sizes
    internal var spaceThin: Dp = 2.dp
    internal var spaceSmall: Dp = 4.dp
    internal var spaceBase: Dp = 8.dp
    internal var spaceMedium: Dp = 16.dp
    internal var spaceLarge: Dp = 24.dp

    fun init(
        spacePageVertical: Dp = SpaceConfiguration.spacePageVertical,
        spacePageHorizontal: Dp = SpaceConfiguration.spacePageHorizontal,
        spaceItemVertical: Dp = SpaceConfiguration.spaceItemVertical,
        spaceItemHorizontal: Dp = SpaceConfiguration.spaceItemHorizontal,
        spaceList: Dp = SpaceConfiguration.spaceList,
        spaceForm: Dp = SpaceConfiguration.spaceForm,
    ) {
        this.spacePageVertical = spacePageVertical
        this.spacePageHorizontal = spacePageHorizontal
        this.spaceItemVertical = spaceItemVertical
        this.spaceItemHorizontal = spaceItemHorizontal
        this.spaceList = spaceList
        this.spaceForm = spaceForm
    }
}