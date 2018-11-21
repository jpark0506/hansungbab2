package com.djpark.parkjunhyuk.hansung;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ParkJunHyuk on 2016. 6. 5..
 */
public class IntroActivity extends AppCompatActivity {
    private Handler h;
    private TextView textView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.djpark.parkjunhyuk.hansung.R.layout.activity_intro);
        h= new Handler(); //딜래이를 주기 위해 핸들러 생성
        h.postDelayed(mrun, 150); // 딜레이 ( 런어블 객체는 mrun, 시간 2초)
        Typeface typeface = Typeface.createFromAsset(getAssets(), "font.otf");
        textView = (TextView)findViewById(com.djpark.parkjunhyuk.hansung.R.id.hansungko2);
        textView.setTypeface(typeface);
    }

    Runnable mrun = new Runnable(){
        @Override
        public void run(){
            Intent i = new Intent(IntroActivity.this, MainActivity.class); //인텐트 생성(현 액티비티, 새로 실행할 액티비티)
            startActivity(i);
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            //overridePendingTr
            // ansition 이란 함수를 이용하여 fade in,out 효과를줌. 순서가 중요
        }
    };
    //인트로 중에 뒤로가기를 누를 경우 핸들러를 끊어버려 아무일 없게 만드는 부분
    //미 설정시 인트로 중 뒤로가기를 누르면 인트로 후에 홈화면이 나옴.
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        h.removeCallbacks(mrun);
    }

}
