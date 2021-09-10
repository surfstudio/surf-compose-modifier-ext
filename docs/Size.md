### Size

Dimension standardization based on baseline configuration

```kotlin
ModifierConfiguration.init(
    xSmall = 2.dp,
    small = 4.dp,
    medium = 8.dp,
    large = 16.dp,
    xLarge = 24.dp,
    xLarge2 = 48.dp,
    xLarge3 = 96.dp,
)
```

#### Usage
```kotlin
// xSmall default 2.dp
Spacer(modifier = Modifier.sizeXSmall())
// xSmall default 4.dp
Spacer(modifier = Modifier.sizeSmall())
// xSmall default 8.dp
Spacer(modifier = Modifier.sizeMedium())
// xSmall default 16.dp
Spacer(modifier = Modifier.sizeLargel())
// xSmall default 24.dp
Spacer(modifier = Modifier.sizeXLarge())
// xSmall default 48.dp
Spacer(modifier = Modifier.sizeXLarge2())
// xSmall default 96.dp
Spacer(modifier = Modifier.sizeXLarge3())
```