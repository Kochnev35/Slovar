package com.example.slovar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.slovar.adapter.WordAdapter;
import com.example.slovar.entity.Word;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton addButton;
    private RecyclerView recyclerView;
    private WordAdapter wordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.add_button);
        recyclerView = findViewById(R.id.word_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        wordAdapter = new WordAdapter();
        RecyclerView.setAdapter(wordAdapter);

        get<Word> words = getWords();
        wordAdapter.setWords(words);
    }

    private List<Word> getWords() {
        return Arrays.asList(
            new Word( englishVersion "Mother", russianVersion:"Мама"),
            new Word( englishVersion "Father", russianVersion:"Папа"),
            new Word( englishVersion "Brother", russianVersion:"Брат")
        );
    }
}