package com.example.myapplication4.java;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication4.R;
import com.example.myapplication4.kotlin.MonthCalendar;
import com.example.myapplication4.kotlin.WeekCalendar;
import com.kizitonwose.calendar.view.CalendarView;
import com.kizitonwose.calendar.view.WeekCalendarView;

public class AppointmentsFragment extends Fragment {
    private CalendarView caland;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_appointments, container, false);

        MonthCalendar monthCalendar =new MonthCalendar();
        caland=rootView.findViewById(R.id.calendarView);
        monthCalendar.monthcalendarcaller(caland);

        // Inflate the layout for this fragment
        return rootView;
    }
}