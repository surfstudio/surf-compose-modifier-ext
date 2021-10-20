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
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spacePage() = padding(
    top = SpaceSize.spacePageVertical,
    bottom = SpaceSize.spacePageVertical,
    start = SpaceSize.spacePageHorizontal,
    end = SpaceSize.spacePageHorizontal,
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spacePageSize() = size(
    height = SpaceSize.spacePageVertical,
    width = SpaceSize.spacePageHorizontal,
)

/**
 * Modifier padding configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spacePageVertical() = padding(
    top = SpaceSize.spacePageVertical,
    bottom = SpaceSize.spacePageVertical,
)

/**
 * Modifier padding configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spacePageHorizontal() = padding(
    start = SpaceSize.spacePageHorizontal,
    end = SpaceSize.spacePageHorizontal,
)

/**
 * Modifier padding configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceItem() = padding(
    top = SpaceSize.spaceItemVertical,
    bottom = SpaceSize.spaceItemVertical,
    start = SpaceSize.spaceItemHorizontal,
    end = SpaceSize.spaceItemHorizontal,
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceItemSize() = size(
    height = SpaceSize.spaceItemVertical,
    width = SpaceSize.spaceItemHorizontal,
)

/**
 * Modifier padding configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceItemVertical() = padding(
    top = SpaceSize.spaceItemVertical,
    bottom = SpaceSize.spaceItemVertical,
)

/**
 * Modifier padding configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceItemHorizontal() = padding(
    start = SpaceSize.spaceItemHorizontal,
    end = SpaceSize.spaceItemHorizontal,
)

/**
 * Modifier padding configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceList() = padding(
    all = SpaceSize.spaceList
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceListSize() = size(
    height = SpaceSize.spaceList,
    width = SpaceSize.spaceList,
)

/**
 * Modifier padding configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceForm() = padding(
    all = SpaceSize.spaceForm
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceFormSize() = size(
    height = SpaceSize.spaceForm,
    width = SpaceSize.spaceForm,
)

/**
 * Modifier padding fix size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceThin() = padding(
    all = SpaceSize.spaceThin
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceThinSize() = size(
    height = SpaceSize.spaceThin,
    width = SpaceSize.spaceThin,
)

/**
 * Modifier padding fix size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceSmall() = padding(
    all = SpaceSize.spaceSmall
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceSmallSize() = size(
    height = SpaceSize.spaceSmall,
    width = SpaceSize.spaceSmall,
)

/**
 * Modifier padding fix size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceBase() = padding(
    all = SpaceSize.spaceBase
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceBaseSize() = size(
    height = SpaceSize.spaceBase,
    width = SpaceSize.spaceBase,
)

/**
 * Modifier padding fix size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceMedium() = padding(
    all = SpaceSize.spaceMedium
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceMediumSize() = size(
    height = SpaceSize.spaceMedium,
    width = SpaceSize.spaceMedium,
)

/**
 * Modifier padding fix size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceLarge() = padding(
    all = SpaceSize.spaceLarge
)

/**
 * Modifier size configuration size
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun Modifier.spaceLargeSize() = size(
    height = SpaceSize.spaceMedium,
    width = SpaceSize.spaceMedium,
)