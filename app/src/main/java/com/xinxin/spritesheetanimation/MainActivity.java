package com.xinxin.spritesheetanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SpriteAnimationView mSpriteAnimationView1;
    SpriteAnimationView mSpriteAnimationView2;
    SpriteAnimationView mSpriteAnimationView3;
    SpriteAnimationView mSpriteAnimationView4;
    SpriteAnimationView mSpriteAnimationView5;
    SpriteAnimationView mSpriteAnimationView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpriteAnimationView1 = findViewById(R.id.animation_view1);
        mSpriteAnimationView2 = findViewById(R.id.animation_view2);
        mSpriteAnimationView3 = findViewById(R.id.animation_view3);
        mSpriteAnimationView4 = findViewById(R.id.animation_view4);
        mSpriteAnimationView5 = findViewById(R.id.animation_view5);
        mSpriteAnimationView6 = findViewById(R.id.animation_view6);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mSpriteAnimationView1.start();
        mSpriteAnimationView2.start();
        mSpriteAnimationView3.start();
        mSpriteAnimationView4.start();
        mSpriteAnimationView5.start();
        mSpriteAnimationView6.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        mSpriteAnimationView1.stop();
        mSpriteAnimationView2.stop();
        mSpriteAnimationView3.stop();
        mSpriteAnimationView4.stop();
        mSpriteAnimationView5.stop();
        mSpriteAnimationView6.stop();
    }
}
