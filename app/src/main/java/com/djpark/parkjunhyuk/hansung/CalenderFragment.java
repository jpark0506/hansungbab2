package com.djpark.parkjunhyuk.hansung;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ParkJunHyuk on 2016. 6. 6..
 */
public class CalenderFragment extends Fragment {

    private TextView menu1,menu2,lunch,dinner;
    protected ArrayList<String> listlunch = new ArrayList<String>();
    protected ArrayList<String> listdinner = new ArrayList<String>();

    public CalenderFragment(){

    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View v= inflater.inflate(com.djpark.parkjunhyuk.hansung.R.layout.fragment_calander, container, false);

        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "font.otf");

        menu1 = (TextView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.menutoday4);
        menu2 = (TextView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.menutoday5);
        lunch = (TextView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.datetoday4);
        dinner = (TextView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.datetoday5);
        menu1.setTypeface(typeface);
        menu2.setTypeface(typeface);
        lunch.setTypeface(typeface);
        dinner.setTypeface(typeface);
        preparedinner();
        preparelunch();

        CalendarView calendarView = (CalendarView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                menu1.setText(listlunch.get(dayOfMonth-1));
                menu2.setText(listdinner.get(dayOfMonth-1));
                lunch.setText(String.valueOf(month+1)+"/"+String.valueOf(dayOfMonth) +"의 중식");
                dinner.setText(String.valueOf(month+1)+"/"+String.valueOf(dayOfMonth) +"의 석식");
            }
        });
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
    protected void preparedinner() {
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
        listdinner.add("개발자의 수능으로 인해서 급식 앱의 서비스가 종료되었습니다. 12월부터 새로운 모습으로 단장된 앱을 기대하세요!");
    }
}
