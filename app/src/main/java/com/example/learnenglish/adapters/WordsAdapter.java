package com.example.learnenglish.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learnenglish.R;
import com.example.learnenglish.databinding.WordCardItemBinding;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.HashMap;

public class WordsAdapter extends RecyclerView.Adapter<WordsAdapter.WordsViewHolder> {
    public ArrayList<String> englishWordsList;
    public ArrayList<String> translateWordsList;

    public WordsAdapter(ArrayList<String> englishWordsList, ArrayList<String> translateWordsList) {
        this.englishWordsList = englishWordsList;
        this.translateWordsList = translateWordsList;
    }
    @NonNull
    @Override
    public WordsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.word_card_item, parent, false);
        return new WordsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordsViewHolder holder, int position) {
        holder.englishWord.setText(englishWordsList.get(position));
        holder.translateWord.setText(translateWordsList.get(position));
    }

    @Override
    public int getItemCount() {
        return englishWordsList.size();
    }

    public class WordsViewHolder extends RecyclerView.ViewHolder {
        WordCardItemBinding binding;
        MaterialCardView wordCard;
        TextView englishWord;
        TextView translateWord;
        public WordsViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = WordCardItemBinding.bind(itemView);
            wordCard = binding.wordCard;
            englishWord = binding.englishWord;
            translateWord = binding.translateWord;
        }
    }
}


