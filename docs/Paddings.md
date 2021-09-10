### Paddings

Paddings standardization based on baseline configuration

#### Set default sizes

```kotlin
ModifierConfiguration.init(
    xSmall = 2.dp,   // default 2.dp
    small = 4.dp,    // default 4.dp
    medium = 8.dp,   // default 8.dp
    large = 16.dp,   // default 16.dp
    xLarge = 24.dp,  // default 24.dp
    xLarge2 = 48.dp, // default 48.dp
    xLarge3 = 96.dp, // default 96.dp
)
```

#### Usage
```kotlin
Spacer(modifier = Modifier.paddingXSmall())
Spacer(modifier = Modifier.paddingSmall())
Spacer(modifier = Modifier.paddingMedium())
Spacer(modifier = Modifier.paddingLargel())
Spacer(modifier = Modifier.paddingXLarge())
Spacer(modifier = Modifier.paddingXLarge2())
Spacer(modifier = Modifier.paddingXLarge3())
```