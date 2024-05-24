package com.example.learnenglish.ui.main.grammar;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.learnenglish.R;
import com.example.learnenglish.databinding.ActivityTensesBinding;
import com.example.learnenglish.domain.model.Tense;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;


import java.util.ArrayList;
import java.util.List;

public class TensesActivity extends AppCompatActivity {

    ActivityTensesBinding binding;
    List<Tense> tenseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTensesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        tenseList = new ArrayList<>();
        tenseList.add(new Tense("Present Simple"));
        tenseList.add(new Tense("Present Continuous"));
        tenseList.add(new Tense("Present Perfect"));
        tenseList.add(new Tense("Present Perfect Continuous"));
        tenseList.add(new Tense("Past Simple"));
        tenseList.add(new Tense("Past Continuous"));
        tenseList.add(new Tense("Past Perfect"));
        tenseList.add(new Tense("Past Perfect Continuous"));
        tenseList.add(new Tense("Future Simple"));
        tenseList.add(new Tense("Future Continuous"));
        tenseList.add(new Tense("Future Perfect"));
        tenseList.add(new Tense("Future Perfect Continuous"));

        for (Tense tense : tenseList) {
            addTenseItem(tense.getTitle());
        }

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                findTense(newText);
                return true;
            }
        });

        setupClickListeners();

    }

    private void addTenseItem(String title) {
        // Создаем новый экземпляр MaterialCardView
        MaterialCardView cardView = new MaterialCardView(this);
        cardView.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        cardView.setStrokeWidth(3); // Устанавливаем ширину обводки
        cardView.setRadius(16); // Устанавливаем радиус скругления углов
        cardView.setCardElevation(5); // Устанавливаем величину поднятия

        // Устанавливаем отступы
        /*int margin = getResources().getDimensionPixelSize(R.dimen.card_margin);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) cardView.getLayoutParams();
        layoutParams.setMargins(margin, margin, margin, margin);
        cardView.setLayoutParams(layoutParams);*/

        // Создаем новый экземпляр TextView
        TextView textView = new TextView(this);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
        ));
        textView.setText(title); // Устанавливаем текст
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20); // Устанавливаем размер текста
        textView.setPadding(20, 20, 20, 20); // Устанавливаем отступы
        textView.setSingleLine(true); // Ограничиваем текст одной строкой
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE); // Обрезаем текст с маркировкой

        // Устанавливаем гравитацию текста в центр
        textView.setGravity(Gravity.CENTER);

        // Добавляем TextView в MaterialCardView
        cardView.addView(textView);

        // Добавляем MaterialCardView в контейнер
        binding.tensesContainer.addView(cardView);
    }

    private boolean findSubstringInBaseText(String query) {
        String baseText = "Present Simple Present Continuous Present Perfect Present Perfect Continuous " +
                "Past Simple Past Continuous Past Perfect Past Perfect Continuous " +
                "Future Simple Future Continuous Future Perfect Future Perfect Continuous";

        boolean found = baseText.toLowerCase().contains(query.toLowerCase());
        if (found) {
            Snackbar.make(binding.getRoot(), "Найдено: " + query, Snackbar.LENGTH_SHORT).show();
        } else {
            Snackbar.make(binding.getRoot(), "Ничего не найдено", Snackbar.LENGTH_SHORT).show();
        }
        return found;
    }

    private void findTense(String query) {
        boolean hasResults = findSubstringInBaseText(query);
        // Проверка наличия результатов поиска
        if (!hasResults) {
            Snackbar.make(binding.getRoot(), "Ничего не найдено", Snackbar.LENGTH_SHORT).show();
        }
    }

    private void setupClickListeners() {
        for (int i = 0; i < binding.tensesContainer.getChildCount(); i++) {
            View itemView = binding.tensesContainer.getChildAt(i);
            if (itemView instanceof MaterialCardView) {
                MaterialCardView cardView = (MaterialCardView) itemView;
                int position = i;
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tenseName = tenseList.get(position).getTitle();
                        navigateToInfoTensesActivity(tenseName);
                        //Snackbar.make(binding.getRoot(), position+"", Snackbar.LENGTH_SHORT).show();
                    }
                });
            }
        }


    }

    private void navigateToInfoTensesActivity(String tenseName) {
        Intent intent = new Intent(this, InfoTensesActivity.class);
        intent.putExtra("tense", tenseName);
        startActivity(intent);
    }

    private void navigateToInfoTensesActivity(int position) {
        Intent intent = new Intent(this, InfoTensesActivity.class);
        intent.putExtra("pos", position);
        startActivity(intent);
    }

}