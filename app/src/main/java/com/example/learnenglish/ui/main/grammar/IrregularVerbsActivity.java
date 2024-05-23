package com.example.learnenglish.ui.main.grammar;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnenglish.R;
import com.example.learnenglish.adapters.IrVerbAdapter;
import com.example.learnenglish.databinding.ActivityIrregularVerbsBinding;
import com.example.learnenglish.domain.model.IrVerb;

import java.util.ArrayList;
import java.util.List;

public class IrregularVerbsActivity extends AppCompatActivity {

    private ListView listViewIrregularVerbs;
    private IrVerbAdapter adapter;
    private List<IrVerb> originalList;
    private ActivityIrregularVerbsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIrregularVerbsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listViewIrregularVerbs = findViewById(R.id.listViewIrregularVerbs);
        SearchView searchView = findViewById(R.id.searchViewIrVerbs);

        originalList = createVerbItemList(); // Create your original list of irregular verbs

        // Create adapter
        adapter = new IrVerbAdapter(this, android.R.layout.simple_list_item_1, originalList);
        listViewIrregularVerbs.setAdapter(adapter);

        //Set query listener
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });
    }

    private void filter(String query) {
        List<IrVerb> filteredList = new ArrayList<>();
        for (IrVerb item : originalList) {
            if (item.getInfinitive().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(item);
            }
        }
        adapter.clear();
        adapter.addAll(filteredList);
        adapter.notifyDataSetChanged();
    }

    private List<IrVerb> createVerbItemList() {
        List<IrVerb> verbItemList = new ArrayList<>();
        verbItemList.add(new IrVerb("be", "am/is/are", "was/were", "been"));
        verbItemList.add(new IrVerb("begin", "begin(s)", "began", "begun"));
        verbItemList.add(new IrVerb("become", "become(s)", "became", "become"));
        verbItemList.add(new IrVerb("break", "break(s)", "broke", "broken"));
        verbItemList.add(new IrVerb("bring", "bring(s)", "brought", "brought"));
        verbItemList.add(new IrVerb("build", "build(s)", "built", "built"));
        verbItemList.add(new IrVerb("buy", "buy(s)", "bought", "bought"));
        verbItemList.add(new IrVerb("catch", "catch(es)", "caught", "caught"));
        verbItemList.add(new IrVerb("choose", "choose(s)", "chose", "chosen"));
        verbItemList.add(new IrVerb("come", "come(s)", "came", "come"));
        verbItemList.add(new IrVerb("do", "do/does", "did", "done"));
        verbItemList.add(new IrVerb("drink", "drink(s)", "drank", "drunk"));
        verbItemList.add(new IrVerb("drive", "drive(s)", "drove", "driven"));
        verbItemList.add(new IrVerb("eat", "eat(s)", "ate", "eaten"));
        verbItemList.add(new IrVerb("fall", "fall(s)", "fell", "fallen"));
        verbItemList.add(new IrVerb("fly", "fly/flies", "flew", "flown"));
        verbItemList.add(new IrVerb("forget", "forget(s)", "forgot", "forgotten"));
        verbItemList.add(new IrVerb("give", "give(s)", "gave", "given"));
        verbItemList.add(new IrVerb("go", "go(es)", "went", "gone"));
        verbItemList.add(new IrVerb("have", "have/has", "had", "had"));
        verbItemList.add(new IrVerb("know", "know(s)", "knew", "known"));
        verbItemList.add(new IrVerb("leave", "leave(s)", "left", "left"));
        verbItemList.add(new IrVerb("freeze", "freeze(s)", "froze", "frozen"));
        verbItemList.add(new IrVerb("hold", "hold(s)", "held", "held"));
        verbItemList.add(new IrVerb("throw", "throw(s)", "threw", "thrown"));
        verbItemList.add(new IrVerb("wear", "wear(s)", "wore", "worn"));
        verbItemList.add(new IrVerb("sell", "sell(s)", "sold", "sold"));
        verbItemList.add(new IrVerb("grow", "grow(s)", "grew", "grown"));
        verbItemList.add(new IrVerb("steal", "steal(s)", "stole", "stolen"));
        verbItemList.add(new IrVerb("break", "break(s)", "broke", "broken"));
        verbItemList.add(new IrVerb("feed", "feed(s)", "fed", "fed"));
        verbItemList.add(new IrVerb("hide", "hide(s)", "hid", "hidden"));

        return verbItemList;
    }

}