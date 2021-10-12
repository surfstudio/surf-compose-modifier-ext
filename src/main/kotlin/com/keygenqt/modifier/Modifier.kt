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

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha

/**
 * Controlling element visibility based on transparency
 *
 * @property [visibility] visible/invisible
 *
 * @since 0.0.1
 * @author Vitaliy Zarubin
 */
fun Modifier.visible(visibility: Boolean): Modifier = this.then(alpha(if (visibility) 1f else 0f))

/**
 * Modifier padding configuration size
 *
 * @since 0.0.4
 * @author Vitaliy Zarubin
 */
fun Modifier.paddingXSmall(): Modifier = this.then(padding(ModifierConfiguration.xSmall))

fun Modifier.paddingSmall(): Modifier = this.then(padding(ModifierConfiguration.small))

fun Modifier.paddingMedium(): Modifier = this.then(padding(ModifierConfiguration.medium))

fun Modifier.paddingLarge(): Modifier = this.then(padding(ModifierConfiguration.large))

fun Modifier.paddingXLarge(): Modifier = this.then(padding(ModifierConfiguration.xLarge))

fun Modifier.paddingXLarge2(): Modifier = this.then(padding(ModifierConfiguration.xLarge2))

fun Modifier.paddingXLarge3(): Modifier = this.then(padding(ModifierConfiguration.xLarge3))

/**
 * Modifier padding start - end
 *
 * @since 0.0.6
 * @author Vitaliy Zarubin
 */
fun Modifier.paddingXSmallStartEnd(): Modifier = this.then(
    padding(
        start = ModifierConfiguration.xSmall,
        end = ModifierConfiguration.xSmall
    )
)

fun Modifier.paddingSmallStartEnd(): Modifier = this.then(
    padding(
        start = ModifierConfiguration.small,
        end = ModifierConfiguration.small
    )
)

fun Modifier.paddingMediumStartEnd(): Modifier = this.then(
    padding(
        start = ModifierConfiguration.medium,
        end = ModifierConfiguration.medium
    )
)

fun Modifier.paddingLargeStartEnd(): Modifier = this.then(
    padding(
        start = ModifierConfiguration.large,
        end = ModifierConfiguration.large
    )
)

fun Modifier.paddingXLargeStartEnd(): Modifier = this.then(
    padding(
        start = ModifierConfiguration.xLarge,
        end = ModifierConfiguration.xLarge
    )
)

fun Modifier.paddingXLarge2StartEnd(): Modifier = this.then(
    padding(
        start = ModifierConfiguration.xLarge2,
        end = ModifierConfiguration.xLarge2
    )
)

fun Modifier.paddingXLarge3StartEnd(): Modifier = this.then(
    padding(
        start = ModifierConfiguration.xLarge3,
        end = ModifierConfiguration.xLarge3
    )
)

/**
 * Modifier padding top - bottom
 *
 * @since 0.0.6
 * @author Vitaliy Zarubin
 */
fun Modifier.paddingXSmallTopBottom(): Modifier = this.then(
    padding(
        top = ModifierConfiguration.xSmall,
        bottom = ModifierConfiguration.xSmall
    )
)

fun Modifier.paddingSmallTopBottom(): Modifier = this.then(
    padding(
        top = ModifierConfiguration.small,
        bottom = ModifierConfiguration.small
    )
)

fun Modifier.paddingMediumTopBottom(): Modifier = this.then(
    padding(
        top = ModifierConfiguration.medium,
        bottom = ModifierConfiguration.medium
    )
)

fun Modifier.paddingLargeTopBottom(): Modifier = this.then(
    padding(
        top = ModifierConfiguration.large,
        bottom = ModifierConfiguration.large
    )
)

fun Modifier.paddingXLargeTopBottom(): Modifier = this.then(
    padding(
        top = ModifierConfiguration.xLarge,
        bottom = ModifierConfiguration.xLarge
    )
)

fun Modifier.paddingXLarge2TopBottom(): Modifier = this.then(
    padding(
        top = ModifierConfiguration.xLarge2,
        bottom = ModifierConfiguration.xLarge2
    )
)

fun Modifier.paddingXLarge3TopBottom(): Modifier = this.then(
    padding(
        top = ModifierConfiguration.xLarge3,
        bottom = ModifierConfiguration.xLarge3
    )
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.4
 * @author Vitaliy Zarubin
 */
fun Modifier.sizeXSmall(): Modifier = this.then(size(ModifierConfiguration.xSmall))

fun Modifier.sizeSmall(): Modifier = this.then(size(ModifierConfiguration.small))

fun Modifier.sizeMedium(): Modifier = this.then(size(ModifierConfiguration.medium))

fun Modifier.sizeLarge(): Modifier = this.then(size(ModifierConfiguration.large))

fun Modifier.sizeXLarge(): Modifier = this.then(size(ModifierConfiguration.xLarge))

fun Modifier.sizeXLarge2(): Modifier = this.then(size(ModifierConfiguration.xLarge2))

fun Modifier.sizeXLarge3(): Modifier = this.then(size(ModifierConfiguration.xLarge3))