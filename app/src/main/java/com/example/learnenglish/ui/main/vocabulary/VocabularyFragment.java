package com.example.learnenglish.ui.main.vocabulary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.learnenglish.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VocabularyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VocabularyFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public VocabularyFragment() {
        // Required empty public constructor
    }

    public static VocabularyFragment newInstance(String param1, String param2) {
        VocabularyFragment fragment = new VocabularyFragment();
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
        View view = inflater.inflate(R.layout.fragment_vocabulary, container, false);

        CardView familyCard = view.findViewById(R.id.family_card);
        CardView foodCard = view.findViewById(R.id.food_card);
        CardView transportCard = view.findViewById(R.id.transport_card);
        CardView clothesCard = view.findViewById(R.id.clothes_card);

        familyCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), FamilyActivity.class);
            startActivity(intent);
        });

        foodCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), FoodActivity.class);
            startActivity(intent);
        });

        transportCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TransportActivity.class);
            startActivity(intent);
        });

        clothesCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ClothesActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
