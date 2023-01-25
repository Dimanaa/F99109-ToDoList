package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

import java.util.Calendar;

public class CalendarFragment extends Fragment {
    private CalendarView calendarView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calendar_layout, container, false);
        calendarView = view.findViewById(R.id.calendar_view);
        calendarView.setMinDate(Calendar.getInstance().getTimeInMillis());
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {

            }
        });
        return view;
    }
}
