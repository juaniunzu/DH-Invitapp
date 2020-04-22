package com.example.invitapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class InvitadosFragment extends Fragment implements InvitadosAdapter.InvitadosListener {

    private RecyclerView recyclerView;

    public InvitadosFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //inflo el fragment a view - NECESARIO PARA PODER ENLAZAR EL RECYCLERVIEW
        View view = inflater.inflate(R.layout.fragment_invitados, container, false);

        //uso el fragment inflado para poder enlazar el recyclerView con el elemento xml
        recyclerView = view.findViewById(R.id.fragmentInvitadosRecyclerView);

        //creo lista de invitados
        List<Invitado> listaInvitados = obtenerInvitados();

        //creo el adapter
        InvitadosAdapter invitadosAdapter = new InvitadosAdapter(listaInvitados, InvitadosFragment.this);

        //creo el LinearLayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        //seteo el manager y el adapter en el recyclerview
        recyclerView.setAdapter(invitadosAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);











        // Inflate the layout for this fragment
        return view;
    }

    public List<Invitado> obtenerInvitados(){
        List<Invitado> listaInvitados = new ArrayList<>();

        listaInvitados.add(new Invitado("pepe"));
        listaInvitados.add(new Invitado("richar"));
        listaInvitados.add(new Invitado("jolio"));
        listaInvitados.add(new Invitado("marto"));
        listaInvitados.add(new Invitado("numo"));
        listaInvitados.add(new Invitado("zappo"));
        listaInvitados.add(new Invitado("fifi"));
        listaInvitados.add(new Invitado("manganga"));
        listaInvitados.add(new Invitado("adul"));
        listaInvitados.add(new Invitado("nene"));
        listaInvitados.add(new Invitado("pepe"));
        listaInvitados.add(new Invitado("richar"));
        listaInvitados.add(new Invitado("jolio"));
        listaInvitados.add(new Invitado("marto"));
        listaInvitados.add(new Invitado("numo"));
        listaInvitados.add(new Invitado("zappo"));
        listaInvitados.add(new Invitado("fifi"));
        listaInvitados.add(new Invitado("manganga"));
        listaInvitados.add(new Invitado("adul"));
        listaInvitados.add(new Invitado("nene"));
        listaInvitados.add(new Invitado("pepe"));
        listaInvitados.add(new Invitado("richar"));
        listaInvitados.add(new Invitado("jolio"));
        listaInvitados.add(new Invitado("marto"));
        listaInvitados.add(new Invitado("numo"));
        listaInvitados.add(new Invitado("zappo"));
        listaInvitados.add(new Invitado("fifi"));
        listaInvitados.add(new Invitado("manganga"));
        listaInvitados.add(new Invitado("adul"));
        listaInvitados.add(new Invitado("nene"));

        return listaInvitados;

    }

    @Override
    public void hicieronClick(Invitado unInvitado) {
        Intent fragmentADetail = new Intent(getContext(), DetailActivity.class);

        Bundle datosAlDetail = new Bundle();
        datosAlDetail.putString(DetailActivity.NOMBRE, unInvitado.getNombre());

        fragmentADetail.putExtras(datosAlDetail);

        startActivity(fragmentADetail);

    }
}
