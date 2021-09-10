### Paddings

Paddings standardization based on baseline configuration

#### Set default sizes

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
Spacer(modifier = Modifier.paddingXSmall())
// xSmall default 4.dp
Spacer(modifier = Modifier.paddingSmall())
// xSmall default 8.dp
Spacer(modifier = Modifier.paddingMedium())
// xSmall default 16.dp
Spacer(modifier = Modifier.paddingLargel())
// xSmall default 24.dp
Spacer(modifier = Modifier.paddingXLarge())
// xSmall default 48.dp
Spacer(modifier = Modifier.paddingXLarge2())
// xSmall default 96.dp
Spacer(modifier = Modifier.paddingXLarge3())
```