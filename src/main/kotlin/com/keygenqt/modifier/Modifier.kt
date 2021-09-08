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
 * @since 0.0.3
 * @author Vitaliy Zarubin
 */
fun Modifier.paddingXSmall(): Modifier = this.then(padding(ModifierConfiguration.XSmall))

fun Modifier.paddingSmall(): Modifier = this.then(padding(ModifierConfiguration.small))

fun Modifier.paddingMedium(): Modifier = this.then(padding(ModifierConfiguration.medium))

fun Modifier.paddingLarge(): Modifier = this.then(padding(ModifierConfiguration.large))

fun Modifier.paddingXLarge(): Modifier = this.then(padding(ModifierConfiguration.XLarge))

fun Modifier.padding2XLarge(): Modifier = this.then(padding(ModifierConfiguration.`2XLarge`))

fun Modifier.padding3XLarge(): Modifier = this.then(padding(ModifierConfiguration.`3XLarge`))

/**
 * Modifier size configuration size
 *
 * @since 0.0.3
 * @author Vitaliy Zarubin
 */
fun Modifier.sizeXSmall(): Modifier = this.then(size(ModifierConfiguration.XSmall))

fun Modifier.sizeSmall(): Modifier = this.then(size(ModifierConfiguration.small))

fun Modifier.sizeMedium(): Modifier = this.then(size(ModifierConfiguration.medium))

fun Modifier.sizeLarge(): Modifier = this.then(size(ModifierConfiguration.large))

fun Modifier.sizeXLarge(): Modifier = this.then(size(ModifierConfiguration.XLarge))

fun Modifier.size2XLarge(): Modifier = this.then(size(ModifierConfiguration.`2XLarge`))

fun Modifier.size3XLarge(): Modifier = this.then(size(ModifierConfiguration.`3XLarge`))