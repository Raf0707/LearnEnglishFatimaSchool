package com.example.learnenglish.ui.main.web;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.learnenglish.databinding.FragmentBooksBinding;


public class BooksFragment extends Fragment {

    FragmentBooksBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBooksBinding.inflate(getLayoutInflater());



        return binding.getRoot();
    }
}