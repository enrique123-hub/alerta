package com.example.alertaensenada.ui.Fenomenos.Quimico;

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

public class Quimicos extends Fragment {

    private Button IdButtonConUrbano;
    private Button IDButtonConTrasporte;
    private Button IDButtonConFuga;
    private Button IDButtonConCrecimiento;
    private Button IDButtonConContaminacion;
    private Button IDButtonConDeforestacion;
    private Button IDButtonConDelincuencia;
    private Button IDButtonConHackes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quimicos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        IdButtonConUrbano = view.findViewById(R.id.IdButtonConUrbano);
        IDButtonConTrasporte = view.findViewById(R.id.IDButtonConTrasporte);
        IDButtonConFuga = view.findViewById(R.id.IDButtonConFuga);
        IDButtonConCrecimiento = view.findViewById(R.id.IDButtonConCrecimiento);
        IDButtonConContaminacion = view.findViewById(R.id.IDButtonConContaminacion);
        IDButtonConDeforestacion = view.findViewById(R.id.IDButtonConDeforestacion);
        IDButtonConDelincuencia = view.findViewById(R.id.IDButtonConDelincuencia);
        IDButtonConHackes = view.findViewById(R.id.IDButtonConHackes);

        final NavController navController = Navigation.findNavController(view);

        IdButtonConUrbano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_envejecimiento);
            }
        });
        IDButtonConTrasporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_transporte);
            }
        });
        IDButtonConFuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_fuga);
            }
        });
        IDButtonConCrecimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_crecimiento);
            }
        });
        IDButtonConContaminacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_contaminacion);
            }
        });
        IDButtonConDeforestacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_deforestacion);
            }
        });
        IDButtonConDelincuencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_delincuencia);
            }
        });
        IDButtonConHackes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_accidentes);
            }
        });
    }
}