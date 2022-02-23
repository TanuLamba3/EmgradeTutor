package com.example.tutor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.tutor.Adapters.MainAdapter;
import com.example.tutor.Models.MainModel;
import com.example.tutor.databinding.ActivityFrontBinding;

import java.util.ArrayList;

public class FrontActivity extends AppCompatActivity {

    ActivityFrontBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFrontBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        stud_img = findViewById(R.id.stud_img);
        getSupportActionBar().hide();

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.round_btn, "Subject: Student Name" ));
        list.add(new MainModel(R.drawable.round_btn2, "Subject: Student Name" ));
        list.add(new MainModel(R.drawable.round_btn, "Subject: Student Name" ));
        list.add(new MainModel(R.drawable.round_btn2, "Subject: Student Name" ));
        list.add(new MainModel(R.drawable.round_btn, "Subject: Student Name" ));
        list.add(new MainModel(R.drawable.round_btn2, "Subject: Student Name" ));
        list.add(new MainModel(R.drawable.round_btn, "Subject: Student Name" ));
        list.add(new MainModel(R.drawable.round_btn2, "Subject: Student Name" ));
        list.add(new MainModel(R.drawable.round_btn, "Subject: Student Name" ));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}