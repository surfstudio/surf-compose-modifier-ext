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
 * @since 0.0.3
 * @author Vitaliy Zarubin
 */
object ModifierConfiguration {

    internal var XSmall: Dp = 2.dp
    internal var small: Dp = 4.dp
    internal var medium: Dp = 8.dp
    internal var large: Dp = 16.dp
    internal var XLarge: Dp = 24.dp
    internal var XLarge2: Dp = 48.dp
    internal var XLarge3: Dp = 96.dp

    fun init(
        XSmall: Dp = ModifierConfiguration.XSmall,
        small: Dp = ModifierConfiguration.small,
        medium: Dp = ModifierConfiguration.medium,
        large: Dp = ModifierConfiguration.large,
        XLarge: Dp = ModifierConfiguration.XLarge,
        XLarge2: Dp = ModifierConfiguration.XLarge2,
        XLarge3: Dp = ModifierConfiguration.XLarge3
    ) {
        this.XSmall = XSmall
        this.small = small
        this.medium = medium
        this.large = large
        this.XLarge = XLarge
        this.XLarge2 = XLarge2
        this.XLarge3 = XLarge3
    }
}