package com.example.learnenglish.ui.main.vocabulary;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learnenglish.R;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learnenglish.R;
import com.example.learnenglish.adapters.CategoryAdapter;
import com.example.learnenglish.domain.model.DictionaryEntry;

import java.util.List;

public class DictionaryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DictionaryEntry> entries;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String category = getIntent().getStringExtra("category");
        if (category != null) {
            switch (category) {
                case "family":
                    entries = DictionaryData.getFamilyData();
                    break;
                case "food":
                    entries = DictionaryData.getFoodData();
                    break;
                case "clothes":
                    entries = DictionaryData.getClothesData();
                    break;
                case "transport":
                    entries = DictionaryData.getTransportData();
                    break;
            }
        }

        adapter = new CategoryAdapter( this,entries);
        recyclerView.setAdapter(adapter);
    }
}
