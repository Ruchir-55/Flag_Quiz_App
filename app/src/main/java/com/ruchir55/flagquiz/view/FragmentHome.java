package com.ruchir55.flagquiz.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ruchir55.flagquiz.R;
import com.ruchir55.flagquiz.database.DatabaseCopyHelper;
import com.ruchir55.flagquiz.databinding.FragmentHomeBinding;

import java.io.IOException;

public class FragmentHome extends Fragment {

    FragmentHomeBinding fragmentHomeBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false);

        createAndOpenDatabase();

        fragmentHomeBinding.buttonStart.setOnClickListener(v -> {
            //navigation
            /*
            NavDirections directions = FragmentHomeDirections.actionFragmentHomeToFragmentQuiz();
            NavHostFragment.findNavController(this).navigate(directions);
            */

            Navigation.findNavController(v).navigate(R.id.action_fragmentHome_to_fragmentQuiz);

        });

        return fragmentHomeBinding.getRoot();
    }

    public void createAndOpenDatabase() {

        try (DatabaseCopyHelper helper = new DatabaseCopyHelper(requireActivity())) {

            helper.createDatabase();
            helper.openDataBase();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}