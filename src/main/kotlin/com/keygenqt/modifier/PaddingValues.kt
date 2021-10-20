package com.keygenqt.modifier

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