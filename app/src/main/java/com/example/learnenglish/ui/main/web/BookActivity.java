package com.example.learnenglish.ui.main.web;

import android.net.Uri;
import android.os.Bundle;

import com.example.learnenglish.adapters.BookAdapter;
import com.example.learnenglish.adapters.VideoAdapter;
import com.example.learnenglish.domain.model.Book;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learnenglish.databinding.ActivityBookBinding;

import com.example.learnenglish.R;

import java.util.ArrayList;
import java.util.List;

public class BookActivity extends AppCompatActivity {
    private ActivityBookBinding binding;
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityBookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Uri> bookUris = new ArrayList<>();
        //bookUris.add(Uri.parse("https://drive.google.com/file/d/15m5_ayPAuIIjekOBvNFI1nvqEK12RvBN/view?usp=drivesdk"));
        bookUris.add(Uri.parse("https://drive.google.com/file/d/15mUopj-KLpe4_O2D_6JlbIil_MVE6rs0/view?usp=drivesdk"));
        bookUris.add(Uri.parse("https://drive.google.com/file/d/15gkUzb-L79E9_TayqhP4HYUOXJ9b1skW/view?usp=drivesdk"));
        bookUris.add(Uri.parse("https://drive.google.com/file/d/15jkf-64YsIAaF5f6PE0ZBSHadhAMLE5l/view?usp=drivesdk"));
        bookUris.add(Uri.parse("https://drive.google.com/file/d/15lOtsHWnx_MkAV1VRoUT10NH3vjXIBP0/view?usp=drivesdk"));

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Adventures of Huckleberry Finn", R.drawable.hekfin, "https://drive.google.com/file/d/15mUopj-KLpe4_O2D_6JlbIil_MVE6rs0/view?usp=drivesdk"));
        bookList.add(new Book("Adventures of Pinokio", R.drawable.pinokio, "https://drive.google.com/file/d/15mUopj-KLpe4_O2D_6JlbIil_MVE6rs0/view?usp=drivesdk"));
        bookList.add(new Book("Laughing Last", R.drawable.laughing_last, "https://drive.google.com/file/d/15jkf-64YsIAaF5f6PE0ZBSHadhAMLE5l/view?usp=drivesdk"));
        bookList.add(new Book("Aesop's Fables", R.drawable.aesop, "https://drive.google.com/file/d/15lOtsHWnx_MkAV1VRoUT10NH3vjXIBP0/view?usp=drivesdk"));

        bookAdapter = new BookAdapter(this, bookList, bookUris);
        recyclerView = binding.bookRecycle;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(bookAdapter);


    }

}