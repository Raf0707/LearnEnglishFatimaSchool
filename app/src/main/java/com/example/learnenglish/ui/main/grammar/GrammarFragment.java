package com.example.learnenglish.ui.main.grammar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.learnenglish.R;

public class GrammarFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public GrammarFragment() {
        // Required empty public constructor
    }

    public static GrammarFragment newInstance(String param1, String param2) {
        GrammarFragment fragment = new GrammarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grammar, container, false);

        CardView partsOfSpeechCard = view.findViewById(R.id.parts_of_speech_card);
        CardView tensesCard = view.findViewById(R.id.tenses_card);
        CardView irVerbCard = view.findViewById(R.id.ir_verb_card);

        partsOfSpeechCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PartsOfSpeechActivity.class);
            startActivity(intent);
        });

        tensesCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TensesActivity.class);
            startActivity(intent);
        });

        irVerbCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IrregularVerbsActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
