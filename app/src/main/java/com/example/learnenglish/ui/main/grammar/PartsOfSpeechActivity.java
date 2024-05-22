package com.example.learnenglish.ui.main.grammar;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnenglish.R;

import java.util.HashMap;
import java.util.Map;

public class PartsOfSpeechActivity extends AppCompatActivity {

    private Map<String, String> translationDictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_of_speech);

        initializeTranslationDictionary();
        setGridLayoutListeners();
    }

    private void initializeTranslationDictionary() {
        translationDictionary = new HashMap<>();
        translationDictionary.put("The quick fox jumps over the dog.", "Быстрая лиса перепрыгивает через собаку.");
        translationDictionary.put("She runs quickly to catch the bus.", "Она быстро бежит, чтобы успеть на автобус.");
        translationDictionary.put("The big cat sleeps peacefully.", "Большая кошка мирно спит.");
        translationDictionary.put("The old man walks slowly.", "Старик медленно идет.");
        translationDictionary.put("The bright sun shines brightly.", "Яркое солнце светит ярко.");
        translationDictionary.put("The tall tree sways gently.", "Высокое дерево нежно качается.");
        translationDictionary.put("The children are playing in the park.", "Дети играют в парке.");


    }

    private void setGridLayoutListeners() {
        int[] gridLayoutIds = {
                R.id.gridLayoutSentence1,
                R.id.gridLayoutSentence2,
                R.id.gridLayoutSentence3,
                R.id.gridLayoutSentence4,
                R.id.gridLayoutSentence5,
                R.id.gridLayoutSentence6,
                R.id.gridLayoutSentence7,

        };

        String[] sentences = {
                "The quick fox jumps over the dog.",
                "She runs quickly to catch the bus.",
                "The big cat sleeps peacefully.",
                "The old man walks slowly.",
                "The bright sun shines brightly.",
                "The tall tree sways gently.",
                "The children are playing in the park.",

        };

        for (int i = 0; i < gridLayoutIds.length; i++) {
            GridLayout gridLayout = findViewById(gridLayoutIds[i]);
            String sentence = sentences[i];
            gridLayout.setOnClickListener(view -> showTranslation(sentence));
        }
    }

    private void showTranslation(String sentence) {
        String translation = translationDictionary.get(sentence);
        if (translation != null) {
            Toast.makeText(this, translation, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Translation not found.", Toast.LENGTH_SHORT).show();
        }
    }
}
