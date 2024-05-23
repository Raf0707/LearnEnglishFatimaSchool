package com.example.learnenglish.ui.about_app;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.learnenglish.MainActivity;
import com.example.learnenglish.R;
import com.example.learnenglish.databinding.FragmentAppAboutBinding;
import com.example.learnenglish.ui.settings.SettingsFragment;
import com.example.learnenglish.utils.CustomTabUtil;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;


public class AppAboutFragment extends Fragment {

    private FragmentAppAboutBinding binding;
    private int iconId;
    public static String selectTheme = "system";

    private SharedPreferences sPref;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            selectTheme = savedInstanceState.getString("theme");
            //iconId = savedInstanceState.getInt("iconTheme");
            loadTheme(selectTheme);
            //binding.themesBtn.setIcon(getResources().getDrawable(iconId));
            Log.d("onCreate", "load " + selectTheme);
        }
    }

    @SuppressLint("IntentReset")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAppAboutBinding
                .inflate(getLayoutInflater());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.appVersionBtn.setText(new StringBuilder()
                .append(getString(R.string.version))
                .toString());

        binding.appVersionBtn.setOnLongClickListener(v -> {
            addOnClick(v, getString(R.string.version_copied),
                    ClipData.newPlainText(
                            getString(R.string.getContext),
                            new StringBuilder()
                                    .append(getString(R.string.version))
                                    .toString()));
            return true;
        });

        binding.sourceCodeBtn.setOnLongClickListener(v -> {
            addOnClick(v, getString(R.string.link_to_source_copied),
                    ClipData.newPlainText(getString(R.string.getContext),
                            "https://github.com/Fatiprogramist/LearnEnglishFatimaSchool"));
            return true;
        });

        binding.fatimaBtn.setOnLongClickListener(v -> {
            addOnClick(v, getString(R.string.fatima_git_copylink),
                    ClipData.newPlainText(getString(R.string.getContext),
                            getString(R.string.fatima_url)));
            return true;
        });

        binding.mailFatimaBtn.setOnLongClickListener(v -> {
            addOnClick(v, getString(R.string.my_email_copylink),
                    ClipData.newPlainText(getString(R.string.getContext),
                            getString(R.string.fatima_email)));
            return true;
        });

        binding.vkGroupBtn.setOnLongClickListener(v -> {
            addOnClick(v, getString(R.string.vk_tabiin_coyplink),
                    ClipData.newPlainText(getString(R.string.getContext),
                            "https://vk.com/club226009764"));
            return true;
        });

        binding.tgGroupBtn.setOnLongClickListener(v -> {
            addOnClick(v, getString(R.string.tg_tabiin_coyplink),
                    ClipData.newPlainText(getString(R.string.getContext),
                            "https://t.me/+uEQMmjF_3cUzMmFi"));
            return true;
        });

        binding.sourceCodeBtn.setOnClickListener(v -> new CustomTabUtil()
                .openCustomTab(getActivity(),
                        "https://github.com/Fatiprogramist/LearnEnglishFatimaSchool",
                        R.color.purple_300));

        binding.fatimaBtn.setOnClickListener(v -> new CustomTabUtil()
                .openCustomTab(getActivity(),
                        getString(R.string.fatima_url),
                        R.color.purple_300));


        binding.mailFatimaBtn.setOnClickListener(v -> {
            final Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setData(Uri.parse(getString(R.string.mailto)))
                    .setType(getString(R.string.text_plain))
                    .putExtra(Intent.EXTRA_EMAIL,
                            new String[]{getString(R.string.fatima_email)})
                    .putExtra(Intent.EXTRA_SUBJECT, R.string.app_name)
                    .putExtra(Intent.EXTRA_TEXT,
                            new StringBuilder()
                                    .append(getString(R.string.app_name))
                                    .append(getString(R.string.semicolon))
                                    .append(getString(R.string.version))
                                    .toString());

            emailIntent.setType(getString(R.string.text_plain));
            // setType("message/rfc822")

            try {
                startActivity(Intent.createChooser(emailIntent,
                        getString(R.string.email_client)));

            } catch (ActivityNotFoundException ex) {
                Toast.makeText(getActivity(),
                        R.string.no_email_client, Toast.LENGTH_SHORT).show();
            }
        });

        binding.vkGroupBtn.setOnClickListener(v -> new CustomTabUtil()
                .openCustomTab(getActivity(),
                        "https://vk.com/club226009764",
                        R.color.purple_300));

        binding.settingsBtn.setOnClickListener(v -> {
            // Ваш фрагмент или активность
            NavController navController = Navigation.findNavController(requireView());
            NavigationUI.setupActionBarWithNavController((AppCompatActivity) requireActivity(), navController);

            navController.navigate(R.id.settingsFragment);
        });

        binding.tgGroupBtn.setOnClickListener(v -> new CustomTabUtil()
                .openCustomTab(getActivity(), "https://t.me/+uEQMmjF_3cUzMmFi",
                        R.color.md_theme_light_onSecondary));

        binding.tgGroupBtn.setOnLongClickListener(v -> {
            addOnClick(v, getString(R.string.tg_tabiin_coyplink),
                    ClipData.newPlainText(getString(R.string.getContext),
                            "https://t.me/+uEQMmjF_3cUzMmFi"));
            return true;
        });

    }

    public void addOnClick(View view, String text, ClipData clipData) {
        ClipboardManager clipboardManager = (ClipboardManager)
                requireContext().getSystemService(Context.CLIPBOARD_SERVICE);

        clipboardManager.setPrimaryClip(clipData);
        Snackbar.make(requireView(), text, Snackbar.LENGTH_LONG).show();
    }
    public void saveTheme(String selectTheme) {
        Bundle tranBundle = new Bundle();
        FragmentManager fragmentManager  = getFragmentManager();
        AppAboutFragment appAboutFragment = new AppAboutFragment();
        tranBundle.putString("thm", selectTheme);
        appAboutFragment.setArguments(tranBundle);
    }
    public void loadTheme(String selectTheme) {
        Bundle bundle = getArguments();
        if (bundle != null) {
            String selectThm = bundle.getString("thm");
            selectTheme = selectThm;
            if (selectTheme.equals("system")) {
                AppCompatDelegate.setDefaultNightMode(
                        AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
            }

            //saveTheme(selectTheme);
            requireActivity().recreate();

        } else if (selectTheme.equals("dark")) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            requireActivity().recreate();

        } else if (selectTheme.equals("light")) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            requireActivity().recreate();

        }
    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("theme", selectTheme);
        Log.d("onSaveInstanceState", "save " + selectTheme);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.d("onViewStateRestored", "restore " + selectTheme);
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        saveTheme(selectTheme);
        Log.d("onDestroy", "save " + selectTheme);
        super.onDestroy();
    }


}