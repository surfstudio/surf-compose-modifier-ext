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

import androidx.compose.foundation.layout.PaddingValues

/**
 * PaddingValues configuration with out bottom, it's use for list paddings
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun paddingValuesSpacePage() = PaddingValues(
    top = SpaceSize.spacePageVertical,
    start = SpaceSize.spacePageHorizontal,
    end = SpaceSize.spacePageHorizontal,
)

/**
 * PaddingValues configuration with bottom value, default == 0.dp
 *
 * @since 0.0.7
 * @author Vitaliy Zarubin
 */
fun paddingValuesSpacePageWithBottom() = PaddingValues(
    top = SpaceSize.spacePageVertical,
    bottom = SpaceSize.spacePageVertical,
    start = SpaceSize.spacePageHorizontal,
    end = SpaceSize.spacePageHorizontal,
)