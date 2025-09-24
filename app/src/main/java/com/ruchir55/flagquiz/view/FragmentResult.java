package com.ruchir55.flagquiz.view;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.ruchir55.flagquiz.R;
import com.ruchir55.flagquiz.databinding.FragmentResultBinding;

import java.util.ArrayList;

public class FragmentResult extends Fragment {

    FragmentResultBinding fragmentResultBinding;
    float correctNumber = 0;
    //float emptyNumber = 0;
    float wrongNumber = 0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentResultBinding = FragmentResultBinding.inflate(inflater, container, false);

        // int correct = FragmentResultArgs.fromBundle(getArguments()).getCorrect();
        if(getArguments() != null) {
            correctNumber = (float) getArguments().getInt("correct");
            wrongNumber = (float) getArguments().getInt("wrong");
            //emptyNumber = (float) getArguments().getInt("empty");
        }

        ArrayList<BarEntry> barEntriesArrayListCorrect = new ArrayList<>();
        ArrayList<BarEntry> barEntriesArrayListWrong = new ArrayList<>();

        barEntriesArrayListCorrect.add(new BarEntry(0F, correctNumber));
        barEntriesArrayListWrong.add(new BarEntry(1F, wrongNumber));

        BarDataSet barDataSetCorrect = createBarDataSet(barEntriesArrayListCorrect, "Correct Answers", Color.GREEN, 24F, Color.BLACK);
        BarDataSet barDataSetWrong = createBarDataSet(barEntriesArrayListWrong, "Wrong Answers",Color.RED, 24F, Color.BLACK);

        BarData barData = new BarData(barDataSetCorrect, barDataSetWrong);
        fragmentResultBinding.resultChart.setData(barData);

        fragmentResultBinding.buttonNewQuiz.setOnClickListener(v -> {

            Navigation.findNavController(v).popBackStack(R.id.fragmentHome, false);
            

        });
        fragmentResultBinding.buttonExit.setOnClickListener(v -> {

            requireActivity().finish();

        });

        return fragmentResultBinding.getRoot();
    }

    public BarDataSet createBarDataSet(ArrayList<BarEntry> entries, String label, int barColor, float valueTextSize, int valueTextColor) {

        BarDataSet dataSet = new BarDataSet(entries, label);
        dataSet.setColor(barColor);
        dataSet.setValueTextSize(valueTextSize);
        dataSet.setValueTextColor(valueTextColor);
        return dataSet;
    }

}