# SpriteAnimationView
A customized view to play sprite sheet animation

<img src="https://github.com/qianxin2016/SpriteAnimationView/blob/master/snapshot.gif" width="240" height="360" />

#### Usage:
```
<com.xinxin.spritesheetanimation.SpriteAnimationView
    android:id="@+id/animation_view"
    android:layout_width="match_parent"
    android:layout_height="80dp"
    app:sprite_sheet="@drawable/antelope" // Sprite sheet resource ID
    app:frame_count="4"                   // Frame count (3 by default)
    app:frame_width="80dp"                // Each frame's width (300 by default)
    app:frame_height="80dp"               // Each frame's height (150 by default)
    app:frame_duration="100"              // Each frame's duration (100ms by default)
    app:start_frame="0"                   // Start frame index (0 by default)
    app:row_count="2"                     // Sprite sheet's row count (1 by default)
    app:row_index="1"                     // Indicate which row of the sprite sheet should be used (0 by default)
    app:offset_per_second="250"           // Moved offset per second (250 by default)
    app:position="0"                      // Initial offset on the sprite sheet (0 by default)
    app:in_place="false"                  // Play animation in loop or not (true by default)
    app:touch_to_move="false"             // Trigger the animation via touch event or not (false by default)
    app:direction="right-to-left"         // Move direction (left-to-right by default)
/>
```

#### Wechat:
<img src="https://github.com/qianxin2016/SpriteAnimationView/blob/master/wechat.png" width="560" height="160" />
