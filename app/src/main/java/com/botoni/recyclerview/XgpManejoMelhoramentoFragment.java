package com.botoni.recyclerview;

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
import java.util.Arrays;
import java.util.List;

public class XgpManejoMelhoramentoFragment extends Fragment {

    private RecyclerView recyclerView;
    private ManejoMelhoramentoAdapter adapter;
    private final List<XgpManejoMelhoramentoComponent> components = new ArrayList<>(Arrays.asList(
            new XgpManejoMelhoramentoComponent(null, "CONFORMAÇÃO", "C", "I", null, "1;2;3;4;5;5", 1, 5, "n"),
            new XgpManejoMelhoramentoComponent(null, "PRECOCIDADE", "P", "I", null, "1;2;3;4;5;5", 1, 5, "n"),
            new XgpManejoMelhoramentoComponent(null, "MUSCULATURA", "M", "I", null, "1;2;3;4;5;5", 1, 5, "n"),
            new XgpManejoMelhoramentoComponent(null, "UMBIGO", "U", "I", null, "1;2;3;4;5;5", 1, 5, "n"),
            new XgpManejoMelhoramentoComponent(null, "OBSERVAÇÃO", "COM", "T", null, null, null, null, "s")
    ));


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_xgp_manejo_melhoramento, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewXgpManejoMelhoramento);
        adapter = new ManejoMelhoramentoAdapter(getContext(), components);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
