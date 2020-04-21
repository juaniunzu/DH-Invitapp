package com.example.invitapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class InvitadosAdapter extends RecyclerView.Adapter {

    private List<Invitado> listaDeInvitados;

    public InvitadosAdapter(List<Invitado> listaDeInvitados) {
        this.listaDeInvitados = listaDeInvitados;
    }

    //creo la celda del layout
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //creo inflador
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        //con el inflador, inflo el xml a view y lo guardo en una variable local
        View xmlInfladoAView = layoutInflater.inflate(R.layout.celda_invitado, parent, false);

        //paso esta view a viewholder usandola como parametro para instanciar viewholder, la guardo en variable local
        RecyclerView.ViewHolder xmlViewAViewHolder = new InvitadoViewHolder(xmlInfladoAView);

        //retorno el viewholder
        return xmlViewAViewHolder;
    }

    //le doy a la celda los valores correspondientes
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        //tomo el invitado mostrado en cada posicion determinada y lo guardo en variable local
        Invitado invitado = listaDeInvitados.get(position);

        //casteo el parametro holder para que sea de tipo InvitadoViewHolder,
        //de esta manera tendra disponible el metodo cargarInvitado()
        InvitadoViewHolder invitadoViewHolder = (InvitadoViewHolder) holder;

        //le asocio el invitado usando el metodo correspondiente, uso el invitado guardado localmente arriba
        invitadoViewHolder.cargarInvitado(invitado);


    }

    @Override
    public int getItemCount() {
        return this.listaDeInvitados.size();
    }

    //creo viewHolder (representacion java de la celda)

    private class InvitadoViewHolder extends RecyclerView.ViewHolder {

        private TextView celdaInvitadoTextViewNombre;

        public InvitadoViewHolder(@NonNull View itemView) {
            super(itemView);

            celdaInvitadoTextViewNombre = itemView.findViewById(R.id.celdaInvitadoTextViewNombre);

        }

        //metodo que se usa para enlazar invitado con celda
        public void cargarInvitado(Invitado unInvitado) {

            celdaInvitadoTextViewNombre.setText(unInvitado.getNombre());

        }
    }


}
