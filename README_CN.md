# SpriteAnimationView
一个用于播放精灵图（Sprite Sheet）动画的组件

<img src="https://github.com/qianxin2016/SpriteAnimationView/blob/master/snapshot.gif" width="240" height="360" />

#### 用法:
```
<com.xinxin.spritesheetanimation.SpriteAnimationView
    android:id="@+id/animation_view"
    android:layout_width="match_parent"
    android:layout_height="80dp"
    app:sprite_sheet="@drawable/antelope" // Sprite sheet的资源ID
    app:frame_count="4"                   // 帧数量 (默认值为3)
    app:frame_width="80dp"                // 每一帧的宽度 (默认值为300)
    app:frame_height="80dp"               // 每一帧的高度 (默认值为150)
    app:frame_duration="100"              // 每一帧的停留时长 (默认值为100ms)
    app:start_frame="0"                   // 起始帧的索引号 (默认值为0)
    app:row_count="2"                     // Sprite sheet的行数 (默认值为1)
    app:row_index="1"                     // 播放sprite sheet的哪一行 (默认值为0)
    app:offset_per_second="250"           // 每秒钟移动的偏移量 (默认值为250)
    app:position="0"                      // Sprite sheet的初始偏移量 (默认值为0)
    app:in_place="false"                  // 是否循环播放动画 (默认值为true)
    app:touch_to_move="false"             // 是否通过touch事件驱动动画 (默认值为false)
    app:direction="right-to-left"         // 移动方向 (默认值为left-to-right)
/>
```

#### 微信公众号:
<img src="https://github.com/qianxin2016/SpriteAnimationView/blob/master/wechat.png" width="560" height="160" />
