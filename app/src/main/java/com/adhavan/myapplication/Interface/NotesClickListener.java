package com.adhavan.myapplication.Interface;

import androidx.cardview.widget.CardView;

import com.adhavan.myapplication.Model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongPress(Notes notes, CardView cardView);
}