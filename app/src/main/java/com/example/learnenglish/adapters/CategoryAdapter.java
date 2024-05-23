package com.example.learnenglish.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.learnenglish.R;
import com.example.learnenglish.domain.model.DictionaryEntry;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private Context mContext;
    private List<DictionaryEntry> mEntries;

    public CategoryAdapter(Context context, List<DictionaryEntry> entries) {
        mContext = context;
        mEntries = entries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.word_card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DictionaryEntry entry = mEntries.get(position);
        holder.bind(entry);
    }

    @Override
    public int getItemCount() {
        return mEntries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView englishTextView;
        private TextView russianTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            englishTextView = itemView.findViewById(R.id.englishWord);
            russianTextView = itemView.findViewById(R.id.translateWord);
        }

        public void bind(DictionaryEntry entry) {
            englishTextView.setText(entry.getEnglish());
            russianTextView.setText(entry.getRussian());
        }
    }
}

