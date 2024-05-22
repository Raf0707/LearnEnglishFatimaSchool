package com.example.learnenglish;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.learnenglish.databinding.ActivityMainBinding;
import com.example.learnenglish.ui.main.grammar.GrammarFragment;
import com.example.learnenglish.ui.main.vocabulary.VocabularyFragment;
import com.example.learnenglish.ui.main.web.BooksFragment;
import com.example.learnenglish.ui.main.web.QuizFragment;
import com.example.learnenglish.ui.main.web.VideosFragment;
import com.example.learnenglish.ui.settings.SettingsFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    //private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setSupportActionBar(binding.toolbar);

        //toggle = new ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.open, R.string.close);
        //binding.drawerLayout.addDrawerListener(toggle);
        //toggle.syncState();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupWithNavController(binding.navView, navController);
        NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration);
        navController.navigate(R.id.vocabularyFragment);
        binding.toolbar.setTitle("Vocabulary");
        binding.toolbar.setTitleTextColor(Color.WHITE);
        binding.toolbar.getNavigationIcon().setTint(Color.WHITE);

        /*binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                // Handle navigation menu item clicks using switch statement
                switch (id) {
                    case R.id.menu_vocabulary:
                        // Replace the current fragment with VocabularyFragment
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragmentContainerView, new VocabularyFragment())
                                .commit();
                        return true;

                    case R.id.menu_grammar:
                        // Replace the current fragment with GrammarFragment
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragmentContainerView, new GrammarFragment())
                                .commit();
                        return true;

                    case R.id.menu_books:
                        // Replace the current fragment with BooksFragment
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragmentContainerView, new BooksFragment())
                                .commit();
                        return true;

                    case R.id.menu_videos:
                        // Replace the current fragment with VideosFragment
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragmentContainerView, new VideosFragment())
                                .commit();
                        return true;

                    case R.id.menu_quiz:
                        // Replace the current fragment with QuizFragment
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragmentContainerView, new QuizFragment())
                                .commit();
                        return true;

                    case R.id.menu_settings:
                        // Replace the current fragment with SettingsFragment
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragmentContainerView, new SettingsFragment())
                                .commit();
                        return true;

                    default:
                        return false;
                }
            }
        });*/
    }
}
