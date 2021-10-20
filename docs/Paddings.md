### Paddings

Paddings configuration for application and a set of constant sizes to minimize use "magic number"

#### Set default sizes

```kotlin
// const sizes in SpaceSize
SpaceSize.spaceThin     // 2.dp
SpaceSize.spaceSmall    // 4.dp
SpaceSize.spaceBase     // 8.dp
SpaceSize.spaceMedium   // 16.dp
SpaceSize.spaceLarge    // 24.dp

// configuration sizes in SpaceSize default
SpaceSize.spacePageVertical     // 16.dp
SpaceSize.spacePageHorizontal   // 16.dp
SpaceSize.spaceItemVertical     // 8.dp
SpaceSize.spaceItemHorizontal   // 8.dp
SpaceSize.spaceList             // 8.dp
SpaceSize.spaceForm             // 16.dp

SpaceConfiguration.init(
    // app page top & bottom
    spacePageVertical = 16.dp,
    // app page start & and
    spacePageHorizontal = 16.dp,
    // item in list application top & bottom
    spaceItemVertical = 8.dp,
    // item in list application start & and
    spaceItemHorizontal = 8.dp,
    // item space between items in list
    spaceList = 8.dp,
    // space from inputs and other block in form
    spaceForm = 16.dp,
)
```

#### Constant sizes

#### Usage example
```kotlin
Column(
    modifier = Modifier
        .spacePageHorizontal()
        .fillMaxSize()
        .verticalScroll(listState)
) {
    Spacer(modifier = Modifier.padding(bottom = SpaceSize.spacePageVertical))
    FormTitle()
    Spacer(modifier = Modifier.spaceSmall())
    FormItem()
    Spacer(modifier = Modifier.spaceForm())
    FormItem()
    Spacer(modifier = Modifier.spaceForm())
    FormItem()
    Spacer(modifier = Modifier.padding(bottom = SpaceSize.spacePageVertical))
}
```
