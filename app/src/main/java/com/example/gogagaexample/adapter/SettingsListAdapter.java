package com.example.gogagaexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gogagaexample.R;
import com.example.gogagaexample.models.SettingsItem;
import com.example.gogagaexample.models.SettingsItemHolder;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SettingsListAdapter extends RecyclerView.Adapter<SettingsItemHolder> {
    private ArrayList<SettingsItem> items;

    public SettingsListAdapter(ArrayList<SettingsItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public SettingsItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.settings_item, parent, false);
        return new SettingsItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsItemHolder holder, int position) {
        SettingsItem item = items.get(position);
        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
