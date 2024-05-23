package com.example.learnenglish.ui.main.web;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learnenglish.R;
import com.example.learnenglish.databinding.FragmentMaterialsBinding;

public class MaterialsFragment extends Fragment {

    FragmentMaterialsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMaterialsBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.materialCardBooks.setOnClickListener(v -> startNewActivity(BookActivity.class));
        binding.materialCardVideos.setOnClickListener(v ->startNewActivity(VideoActivity.class));
        //binding.materialCardCounter.setOnClickListener(v -> startNewActivity(QuizActivity.class));

        return view;
    }

    private void startNewActivity(Class<?> activityClass) {
        Intent intent = new Intent(requireContext(), activityClass);
        startActivity(intent);

    }
}
