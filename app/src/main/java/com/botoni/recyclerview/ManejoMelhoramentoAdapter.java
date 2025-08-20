package com.botoni.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ManejoMelhoramentoAdapter extends RecyclerView.Adapter<ManejoMelhoramentoAdapter.ViewHolder> {
    private final Context context;
    private final List<XgpManejoMelhoramentoComponent> components;
    public ManejoMelhoramentoAdapter(Context context, List<XgpManejoMelhoramentoComponent> components) {
        this.context = context;
        this.components = components;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_xgp_manejo_melhoramento, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(components.get(position));
    }

    @Override
    public int getItemCount() {
        return components.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final TextView abbreviation;
        private final ViewStub input;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nome_caracteristica);
            abbreviation = itemView.findViewById(R.id.sigla_caracteristica);
            input = itemView.findViewById(R.id.campo);
            input.setLayoutResource(R.layout.view_xgp_mehoramento);
        }

        void bind(XgpManejoMelhoramentoComponent component) {
            name.setText(component.getCharacteristic());
            abbreviation.setText(component.getSigla());
            input.inflate();
        }
    }
}
