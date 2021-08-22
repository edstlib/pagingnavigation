# PagingNavigation

![PagerNavigationView](https://i.ibb.co/wWR6T8n/nav1.jpg)
![PagerNavigationView](https://i.ibb.co/qssTDxw/nav2.jpg)

## Setup
### Gradle

Add this to your project level `build.gradle`:
```groovy
allprojects {
 repositories {
    maven { url "https://jitpack.io" }
 }
}
```
Add this to your app `build.gradle`:
```groovy
dependencies {
    implementation 'com.github.edtslib:pagingnavigation:latest'
}
```
# Usage

The PagerNavigationView is very easy to use. Just add it to your layout like any other view.
##### Via XML

Here's a basic implementation.

```xml
    <id.co.edtslib.pagingnavigation.PagingNavigation
    android:id="@+id/navigation"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:count="6"
    app:shape="@drawable/bg_test"
    app:shapeSize="@dimen/dimen_8dp"
    app:shapeSelectedWidth="20dp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintLeft_toLeftOf="parent"
    app:layout_constraintRight_toRightOf="parent"
    app:layout_constraintTop_toTopOf="parent" />
```
### Attributes information

##### _app:count_
[integer]: size of pager

##### _app:shape_
[integer]: shape form resource id, default

```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <!-- shape for selection -->
    <item android:state_selected="true">
        <shape android:shape="oval">
            <solid android:color="#1171D4" />
        </shape>
    </item>
    <!-- shape for defaul -->
    <item>
        <shape android:shape="oval">
            <solid android:color="#DCDEE3" />
        </shape>
    </item>
</selector>
```

##### _app:shapeSize_
[dimension]: size of shape, default 4dp

##### _app:shapeSelectedWidth_
[dimension]: size of shape if selected, default = shapeSize

##### _app:space_
[reference]: space between shape, default 8dp

### Listening for click actions on the PagingNavigation

You can set a listener to be notified when the user click the PagingNavigation. An example is shown below.

```kotlin
        val navigation = findViewById<PagingNavigation>(R.id.navigation)
        navigation.delegate = object : PagingNavigationDelegate {
            override fun onSelected(position: Int) {
                Toast.makeText(this@MainActivity, "Selected Index $position",
                    Toast.LENGTH_SHORT).show()
            }
        }
```

### Setting the view attributes via code
For convenience, many of the PagingNavigation attributes can be set via code.
```kotlin
        // set size of pager
        var count: Int = 0
```

### Method for navigation actions on the PagingNavigation


```kotlin
    // selected index of shape
    var selectedIndex: Int = -1
```




