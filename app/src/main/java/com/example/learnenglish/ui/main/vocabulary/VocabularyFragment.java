package com.example.learnenglish.ui.main.vocabulary;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learnenglish.R;
import com.example.learnenglish.databinding.FragmentVocabularyBinding;


public class VocabularyFragment extends Fragment {

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentVocabularyBinding b = FragmentVocabularyBinding.inflate(getLayoutInflater());

        b.familyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDictionaryActivity("family");
            }
        });

        b.foodCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDictionaryActivity("food");
            }
        });

        b.clothesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDictionaryActivity("clothes");
            }
        });

        b.transportCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDictionaryActivity("transport");
            }
        });

        return b.getRoot();
    }

    private void openDictionaryActivity(String category) {
        Intent intent = new Intent(getActivity(), DictionaryActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}