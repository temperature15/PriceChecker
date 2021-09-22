package com.jerry.tcnrcloud110a;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.ajts.androidmads.fontutils.FontUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q0411 extends AppCompatActivity {

    private final String TAG = "tcnr13=>"; // 識別碼
    private Button b001;
    private Button b002;
    private Button b003;
    private Button b004;
    private Button b005;
    private Button b006;
    private Button b007;
    private Button b008;
    private Button b009;
    private Button b010;
    private Button b011;
    private Button b012;
    private Button b013;
    private Button b014;
    private Button b015;
    private Button b016;
    private Button b017;
    private Button b018;
    private Button b019;
    private Button b020;
    private Button b021;
    private Button b022;
    private Button b023;

    private final Intent intent = new Intent();
    private EditText a001; // 搜尋按鍵
    private String minguo; // 民國年
    private String str;
    private int n;
    private String date;
    private int nn;

    private String market_name = "";
    private Typeface typeface;
    private FontUtils fontUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q0411);
        setupViewComponent();
    }

    private void setupViewComponent() {
        // 設定class標題
        Intent intent = this.getIntent();
        String mode_title = intent.getStringExtra("class_title"); // name: 必須跟呼叫的main class設定的一樣
        this.setTitle(mode_title);
        //
        b001 = findViewById(R.id.q0411_b001);
        b002 = findViewById(R.id.q0411_b002);
        b003 = findViewById(R.id.q0411_b003);
        b004 = findViewById(R.id.q0411_b004);
        b005 = findViewById(R.id.q0411_b005);
        b006 = findViewById(R.id.q0411_b006);
        b007 = findViewById(R.id.q0411_b007);
        b008 = findViewById(R.id.q0411_b008);
        b009 = findViewById(R.id.q0411_b009);
        b010 = findViewById(R.id.q0411_b010);
        b011 = findViewById(R.id.q0411_b011);
        b012 = findViewById(R.id.q0411_b012);
        b013 = findViewById(R.id.q0411_b013);
        b014 = findViewById(R.id.q0411_b014);
        b015 = findViewById(R.id.q0411_b015);
        b016 = findViewById(R.id.q0411_b016);
        b017 = findViewById(R.id.q0411_b017);
        b020 = findViewById(R.id.q0411_b020);
        b021 = findViewById(R.id.q0411_b021);
        b022 = findViewById(R.id.q0411_b022);
        b023 = findViewById(R.id.q0411_b023);

        b018 = findViewById(R.id.q0411_b018);
        b019 = findViewById(R.id.q0411_b019);

        // 輸入文字
        a001 = findViewById(R.id.q0411_a001);

        b001.setOnClickListener(b001on);
        b002.setOnClickListener(b001on);
        b003.setOnClickListener(b001on);
        b004.setOnClickListener(b001on);
        b005.setOnClickListener(b001on);
        b006.setOnClickListener(b001on);
        b007.setOnClickListener(b001on);
        b008.setOnClickListener(b001on);
        b009.setOnClickListener(b001on);
        b010.setOnClickListener(b001on);
        b011.setOnClickListener(b001on);
        b012.setOnClickListener(b001on);
        b013.setOnClickListener(b001on);
        b014.setOnClickListener(b001on);
        b015.setOnClickListener(b001on);
        b016.setOnClickListener(b001on);
        b017.setOnClickListener(b001on);
        b020.setOnClickListener(b001on);
        b021.setOnClickListener(b001on);
        b022.setOnClickListener(b001on);
        b023.setOnClickListener(b001on);

        b018.setOnClickListener(b002on);
        b019.setOnClickListener(b003on);

        // 抓取當前時間
        SimpleDateFormat displayFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat displayFormat1 = new SimpleDateFormat("MM.dd");
        Date curDate = new Date(System.currentTimeMillis());
        str = displayFormat.format(curDate); // 西元年
        date = displayFormat1.format(curDate); // 月份日期

        // 轉換民國時間
        n = Integer.parseInt(str); // 字串轉整數
        nn = n - 1911; // 2021 - 1911 = 110
        minguo = Integer.toString(nn); // 整數轉字串

        b019.setText(getString(R.string.q0411_t017) + minguo + getString(R.string.q0411_t018) + date);

        // 設定中文字體, 檔案放在 asssets 裡面
        typeface = Typeface.createFromAsset(getAssets(), "jf-openhuninn-1.1.ttf"); // 標楷體
        fontUtils = new FontUtils();

        // 設定給某個物件用這個中文字體
        fontUtils.applyFontToView(b001, typeface); // 給顯示文字用
        fontUtils.applyFontToView(b002, typeface);
        fontUtils.applyFontToView(b003, typeface);
        fontUtils.applyFontToView(b004, typeface);
        fontUtils.applyFontToView(b005, typeface);
        fontUtils.applyFontToView(b006, typeface);
        fontUtils.applyFontToView(b007, typeface);
        fontUtils.applyFontToView(b008, typeface);
        fontUtils.applyFontToView(b009, typeface);
        fontUtils.applyFontToView(b010, typeface);
        fontUtils.applyFontToView(b011, typeface);
        fontUtils.applyFontToView(b012, typeface);
        fontUtils.applyFontToView(b013, typeface);
        fontUtils.applyFontToView(b014, typeface);
        fontUtils.applyFontToView(b015, typeface);
        fontUtils.applyFontToView(b016, typeface);
        fontUtils.applyFontToView(b017, typeface);
        fontUtils.applyFontToView(b018, typeface);
        fontUtils.applyFontToView(b019, typeface);
        fontUtils.applyFontToView(b020, typeface);
        fontUtils.applyFontToView(b021, typeface);
        fontUtils.applyFontToView(b022, typeface);
        fontUtils.applyFontToView(b023, typeface);
    }

    // 監聽 地圖縣市按鍵
    private final View.OnClickListener b001on = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // 創建一個 SpannableString物件
            SpannableString sp = new SpannableString("a");

            switch (v.getId()) {
                case R.id.q0411_b001:

                    // 設定 sp 的字串
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t004) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t004);
                    break;

                case R.id.q0411_b002:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t005) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t005);
                    break;

                case R.id.q0411_b003:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t006) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t006);
                    break;

                case R.id.q0411_b004:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t007) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t007);
                    break;

                case R.id.q0411_b005:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t008) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t008);
                    break;

                case R.id.q0411_b006:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t009) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t009);
                    break;

                case R.id.q0411_b007:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t010) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t010);
                    break;

                case R.id.q0411_b008:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t011) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t011);
                    break;

                case R.id.q0411_b009:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t012) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t012);
                    break;

                case R.id.q0411_b010:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t013) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t013);
                    break;

                case R.id.q0411_b011:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t014) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t014);
                    break;

                case R.id.q0411_b012:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t015) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t015);
                    break;

                case R.id.q0411_b013:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t016) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t016);
                    break;

                case R.id.q0411_b014:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t021) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t021);
                    break;

                case R.id.q0411_b015:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t022) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t022);
                    break;

                case R.id.q0411_b016:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t023) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t023);
                    break;

                case R.id.q0411_b017:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t024) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t024);
                    break;

                case R.id.q0411_b020:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t025) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t025);
                    break;

                case R.id.q0411_b021:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t026) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t026);
                    break;

                case R.id.q0411_b022:
                    sp = new SpannableString(getString(R.string.q0411_b019) + getString(R.string.q0411_t027) + getString(R.string.q0411_b020));
                    market_name = getString(R.string.q0411_t027);
                    break;

                case R.id.q0411_b023:
                    sp = new SpannableString(getString(R.string.q0411_b018));
                    market_name = "";
                    break;

                default:
            }
            // 這邊是字串，所以中英文符號都算1個
            // 改字體顏色
            sp.setSpan(new ForegroundColorSpan(Color.RED), 2, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            b018.setText(sp);
        }
    };

    // 監聽 水果搜尋按鍵
    private final View.OnClickListener b002on = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.q0411_b018:

                    // 設定呼叫別之CLASS
                    // name: 必須跟被呼叫的 class 設定的一樣
//                    intent.putExtra("class_title", getString(R.string.q0411_t003)); // intent 會把 string.q0411_t003 放進到 name = "classs_title"
                    intent.setClass(Q0411.this, Q0413.class);
                    intent.putExtra("class_title", market_name); // intent 會把 string.q0411_t002 放進到 name = "classs_title"
                    intent.putExtra("market_name", market_name); // intent 會把 string.q0411_t002 放進到 name = "classs_title"
                    intent.putExtra("fruit_name", a001.getText().toString()); // 傳值, 輸入搜尋的蔬果名稱
                    intent.putExtra("minguo", minguo); // 傳值, 民國
                    intent.putExtra("date", date); // 傳值, 日期
                    break;
                default:
            }
            startActivity(intent);
        }
    };

    // 監聽 選擇日期
    private final View.OnClickListener b003on = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // 設定日曆
            Calendar now = Calendar.getInstance();

            switch (v.getId()) {
                case R.id.q0411_b019:
                    // 跳出日期選擇 dialog
                    DatePickerDialog datePicDlg = new DatePickerDialog(
                            Q0411.this,
                            datePicDlgOnDateSelLis,
                            now.get(Calendar.YEAR),
                            now.get(Calendar.MONTH),
                            now.get(Calendar.DAY_OF_MONTH));

                    datePicDlg.setTitle(getString(R.string.q0411_t019));
                    datePicDlg.setMessage(getString(R.string.q0411_t020));
                    datePicDlg.setCancelable(false); // 禁止按返回按鍵

                    datePicDlg.show();
                    break;
                default:
            }
        }
    };

    // 日期選擇 dialog
    private DatePickerDialog.OnDateSetListener datePicDlgOnDateSelLis = new DatePickerDialog.OnDateSetListener() {
        private String monthb;
        private String dayOfMonthb;

        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            String yeara = Integer.toString(year);
            int montha = (month + 1);
            int dayOfMontha = (dayOfMonth);

            // 因API需求 月份小於10 前面加個0
            if (montha < 10) {
                monthb = ("0" + montha);
            } else {
                monthb = String.valueOf((montha));
            }

            // 因API需求 日期小於10 前面加個0
            if (dayOfMonth < 10) {
                dayOfMonthb = ("0" + dayOfMontha);
            } else {
                dayOfMonthb = String.valueOf((dayOfMontha));
            }

            // 轉換完的月份+日期
            date = monthb + "." + dayOfMonthb;

            // 轉換民國時間
            n = Integer.parseInt(yeara); // 字串轉整數
            nn = n - 1911; // 2021 - 1911 = 110
            minguo = Integer.toString(nn); // 整數轉字串

            b019.setText(getString(R.string.q0411_t017) + minguo + getString(R.string.q0411_t018) + date);
        }
    };

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
        Log.d(TAG, "onPause() Q0411");
    }

    @Override
    protected void onStop() {
        super.onStop();
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
        Log.d(TAG, "onBackPressed() Q0411");

        // 保留 activity 到後台, 適合用在登入頁面 (只要保留資料不需要頁面)
        // leaves your back stack as it is, just puts your task (all activities) in background.
        // Same as if user pressed Home button.
        // useful in the usual login / main activity scenario or implementing a blocking screen.
//        moveTaskToBack(true);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() Q0411");
    }
}