package com.example.learnenglish.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.learnenglish.R;
import com.example.learnenglish.domain.model.Book;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    private Context mContext;
    private List<Book> mBookList;

    private List<Uri> mBookUrls;

    public BookAdapter(Context context, List<Book> bookList, List<Uri> bookUrls) {
        mContext = context;
        mBookList = bookList;
        mBookUrls = bookUrls;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.book_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String url = String.valueOf(mBookUrls.get(position));

        holder.titleBook.setText(mBookList.get(position).getTitle());

        holder.buttonOpen.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            mContext.startActivity(intent);
            Toast.makeText(mContext, "Opening book: " + url, Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return mBookList.size();
    }

    public Book getItem(int position) {
        return mBookList.get(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewCover;
        Button buttonOpen;
        TextView titleBook;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCover = itemView.findViewById(R.id.imageViewCover);
            buttonOpen = itemView.findViewById(R.id.button_open);
            titleBook = itemView.findViewById(R.id.titleBook);
        }
    }

    public interface OnDownloadClickListener {
        void onDownloadClick(int position);
    }
}
