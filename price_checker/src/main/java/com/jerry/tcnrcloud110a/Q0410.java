package com.jerry.tcnrcloud110a;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Q0410 extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "tcnr13=>"; // 識別碼
    private MediaPlayer startmusic;
    private ConstraintLayout layout1;
    private Intent intent = new Intent();
    private TextView t001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q0410);
        setupViewComponent();
        // 隱藏標題
        getSupportActionBar().hide();
        // 隱藏狀態
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    private void setupViewComponent() {
        layout1 = (ConstraintLayout) findViewById(R.id.layout01);
        t001 = (TextView) findViewById(R.id.textView3);
        layout1.setOnClickListener(this);

        // APP 開啟音樂
        startmusic = MediaPlayer.create(this, R.raw.vivaldirv565);
        startmusic.start();

        // APP 開啟動畫
        layout1.setAnimation(AnimationUtils.loadAnimation(this, R.anim.q0410_anim_alpha_in));

        // 點擊繼續循環動畫
        t001.setAnimation(AnimationUtils.loadAnimation(this, R.anim.q0410_anim_alpha_repeat));


        // 點擊繼續循環動畫
//        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f); // alpha 從0~1 淡入
//        AlphaAnimation fadeOut = new AlphaAnimation( 1.0f, 0.0f); // 淡出
//
//        t001.startAnimation(fadeIn); // 套用動畫
//        t001.startAnimation(fadeOut);
//
//        fadeIn.setDuration(1000); // 動畫持續時間
//        fadeOut.setDuration(1000);
//
//        fadeIn.setStartOffset(2000); // 動畫延遲時間
//        fadeOut.setStartOffset(3000);
//
//        fadeIn.setRepeatCount(Animation.INFINITE); // 無限重複
//        fadeOut.setRepeatCount(Animation.INFINITE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout01:
                intent.putExtra("class_title", getString(R.string.app_name));
                intent.setClass(Q0410.this, Q0411.class);
                startActivity(intent);

                // 關閉 activity, 讓下一個頁面不能返回
                // Note: if you call finish during a shared transition you may get a bleed through of the previous activity.
                // e.g., if you have HomeActivity -> IntermediateActivity -> FinalActivity,
                // and you call finish() in the IntermediateActivity immediately after starting the FinalActivity
                // you'll see the HomeActivity for a brief moment.
                finish();

                // 保留 activity 到後台, 適合用在登入頁面 (只要保留資料不需要頁面)
                // leaves your back stack as it is, just puts your task (all activities) in background.
                // Same as if user pressed Home button.
                // useful in the usual login / main activity scenario or implementing a blocking screen.
//                moveTaskToBack(true);
                break;

            default:
        }
    }

    // 在Logcat監看生命週期，(Verbose = v, Debug = d, info = i, Warn = w, Error = e, Assert = a.
    // 在Logcat右邊下拉選單選擇，Edit Filter Configuration，把Filter Name 跟 Log Tag 填入。

    // Log = 歷史檔, d = debug
    // 輸入onstart + TAB
    // 或是滑鼠右鍵 > Generate > Override Methods 可以一次創建多個 Methods
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() Q0411");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() Q0411");
    }

    @Override
    protected void onPause() {
        super.onPause();
        startmusic.stop();
        Log.d(TAG, "onPause() Q0411");
    }

    @Override
    protected void onStop() {
        super.onStop();
        startmusic.stop();
        Log.d(TAG, "onStop() Q0411");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() Q0411");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        startmusic.stop();
        Log.d(TAG, "onBackPressed() Q0411");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        startmusic.stop();
        Log.d(TAG, "onDestroy() Q0411");
    }
}