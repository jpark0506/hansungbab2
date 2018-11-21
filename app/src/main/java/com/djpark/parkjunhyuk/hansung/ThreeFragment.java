package com.djpark.parkjunhyuk.hansung;
//Copyright by Jun Hyuk Park
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class ThreeFragment extends Fragment{
    private TextView menulunchtoday3;
    private TextView todaydate3;
    protected ArrayList<String> listlunch = new ArrayList<String>();
    protected String s="업데이트 해주세요!";

    public ThreeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(com.djpark.parkjunhyuk.hansung.R.layout.fragment_three, container, false);

        menulunchtoday3 = (TextView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.menutoday3);

        if(checkMonth()==false){
            menulunchtoday3.setText(s);
        }else{
            long now = System.currentTimeMillis();

            Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "font.otf");
            // 현재 시간을 저장 한다.
            Date date = new Date(now+(long) ( 1000 * 60 * 60 * 24 ));
            SimpleDateFormat dateformat = new SimpleDateFormat("dd");
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM/dd");
            String datenow2 = dateFormat2.format(date);
            String datenow = dateformat.format(date);
            int to = Integer.parseInt(datenow);
            preparelunch();
            menulunchtoday3.setTypeface(typeface);
            menulunchtoday3.setText(listlunch.get(to-1));
        }



        return v;
    }
    protected void preparelunch(){
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listlunch.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");


    }
    public boolean checkMonth(){
        Calendar c = Calendar.getInstance();
        if(c.get(Calendar.MONTH)+1==10){

            return true;
        }else{
            return false;
        }

    }

}
