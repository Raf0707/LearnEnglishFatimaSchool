package com.example.learnenglish.ui.main.web;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMaterialsBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }
}