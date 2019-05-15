package com.example.android.viewpager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DayFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the fragment layout
        View fragmentLayout = inflater.inflate(R.layout.fragment_day, container, false);

        // Set up day TextView according to the arguments passed in the
        // {@link SimpleFragmentPagerAdapter}
        TextView dayTextView = fragmentLayout.findViewById(R.id.day_text_view);
        String bundleKey = getString(R.string.main_day_key);
        String day = getArguments().getString(bundleKey);
        dayTextView.setText(day);

        return fragmentLayout;
    }
}
