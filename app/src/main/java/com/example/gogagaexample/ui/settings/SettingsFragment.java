package com.example.gogagaexample.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.gogagaexample.R;
import com.example.gogagaexample.adapter.SettingsListAdapter;
import com.example.gogagaexample.models.SettingsItem;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SettingsFragment extends Fragment {

    private SettingsViewModel settingsViewModel;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private ArrayList<SettingsItem> items;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        settingsViewModel = ViewModelProviders.of(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        recyclerView = root.findViewById(R.id.settings_list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        items.add(new SettingsItem(R.drawable.ic_megaphone, getText(R.string.did_you_know).toString()));
        items.add(new SettingsItem(R.drawable.ic_myprofile, getText(R.string.my_profile).toString()));
        items.add(new SettingsItem(R.drawable.ic_preferences, getText(R.string.preferences).toString()));
        items.add(new SettingsItem(R.drawable.ic_support, getText(R.string.support).toString()));
        items.add(new SettingsItem(R.drawable.ic_call, getText(R.string.speak_to_ceo).toString()));
        items.add(new SettingsItem(R.drawable.ic_leaderboard, getText(R.string.leaderboard).toString()));

        adapter = new SettingsListAdapter(items);
        recyclerView.setAdapter(adapter);
        return root;

    }
}
