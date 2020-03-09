package com.example.gogagaexample.models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gogagaexample.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SettingsItemHolder extends RecyclerView.ViewHolder {

    private SettingsItem settingsItem;
    public ImageView imageView;
    public TextView textView;

    public SettingsItemHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.sIImageView);
        textView = itemView.findViewById(R.id.sITextView);
    }
    public void bindData(SettingsItem item) {
        settingsItem = item;
        imageView.setImageResource(settingsItem.getImageId());
        textView.setText(settingsItem.getText());
    }
}
