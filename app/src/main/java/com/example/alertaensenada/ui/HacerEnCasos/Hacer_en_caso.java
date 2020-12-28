package com.example.alertaensenada.ui.HacerEnCasos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alertaensenada.R;

public class Hacer_en_caso extends Fragment {

    private Button IDButtonConsentracion;
    private Button IDButtonIncendioFore;
    private Button IDButtonIncendioUrba;
    private Button IDButtonInundacion;
    private Button IDButtonLLuviasFuertes;
    private Button IDButtonSismos;
    private Button IDButtonTormentaElectrica;
    private Button IDButtonTsunami;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hacer_en_caso, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        IDButtonConsentracion = view.findViewById(R.id.IDButtonConsentracion);
        IDButtonIncendioFore = view.findViewById(R.id.IDButtonIncendioFore);
        IDButtonIncendioUrba = view.findViewById(R.id.IDButtonIncendioUrba);
        IDButtonInundacion = view.findViewById(R.id.IDButtonInundacion);
        IDButtonLLuviasFuertes = view.findViewById(R.id.IDButtonLLuviasFuertes);
        IDButtonSismos = view.findViewById(R.id.IDButtonSismos);
        IDButtonTormentaElectrica = view.findViewById(R.id.IDButtonTormentaElectrica);
        IDButtonTsunami = view.findViewById(R.id.IDButtonTsunami);

        final NavController navController = Navigation.findNavController(view);

        IDButtonConsentracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_concentracion);
            }
        });
        IDButtonIncendioFore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_forestales);
            }
        });
        IDButtonIncendioUrba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_urbano);
            }
        });
        IDButtonInundacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_inunda);
            }
        });
        IDButtonLLuviasFuertes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_lluvias);
            }
        });
        IDButtonSismos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_terremoto);
            }
        });
        IDButtonTormentaElectrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_electricas);
            }
        });
        IDButtonTsunami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_tsuna);
            }
        });
    }
}