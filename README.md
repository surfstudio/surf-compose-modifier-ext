Jetpack Compose Modifier Extension
===================

![picture](data/just-image.png)

#### Connection:

```gradle
repositories {
    maven("https://artifactory.keygenqt.com/artifactory/open-source")
}
dependencies {
    implementation("com.keygenqt.modifier:compose-modifier-ext:0.0.2")
}
```

### Idea

General settings for the modifier and custom features

### Usage

```kotlin
// Default configuration
ModifierConfiguration.init(
    XSmall = 2.dp,
    small = 4.dp,
    medium = 8.dp,
    large = 16.dp,
    XLarge = 24.dp,
    XLarge2 = 48.dp,
    XLarge3 = 96.dp,
)

// Example usage size
Spacer(
    modifier = Modifier.sizeLarge()
)

// Example usage padding
Box(
    modifier = Modifier
        .paddingLarge()
)
```

### Extensions

* padding{XSmall} - Padding common (XSmall, small, medium, large, XLarge, XLarge2, XLarge3)
* size{XSmall} - Size common (XSmall, small, medium, large, XLarge, XLarge2, XLarge3)
* visible - Controlling element visibility based on transparency

# License

```
Copyright 2021 Vitaliy Zarubin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```