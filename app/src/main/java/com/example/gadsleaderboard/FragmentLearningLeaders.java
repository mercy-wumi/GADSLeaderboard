package com.example.gadsleaderboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentLearningLeaders extends Fragment {
    View view;
    public FragmentLearningLeaders() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.learning_leaders, container, false);

        final ArrayList<Learners> learners = new ArrayList<Learners>();

        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));
        learners.add(new Learners("Adams Mercy", "20 learning hours, Nigeria", R.drawable.top_learner));

        RecyclerView gadsRecycler= view.findViewById(R.id.recycler);
        RecyclerViewAdapter myadapter= new RecyclerViewAdapter(getContext(), learners);
        gadsRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        gadsRecycler.setAdapter(myadapter);
        return view;

    }
}
