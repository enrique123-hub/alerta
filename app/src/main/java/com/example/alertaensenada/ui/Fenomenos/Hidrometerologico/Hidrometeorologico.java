package com.example.alertaensenada.ui.Fenomenos.Hidrometerologico;

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

public class Hidrometeorologico extends Fragment {

    private Button IDButtonHidroHuracan;
    private Button IDuttonHidroTropical;
    private Button IDuttonHidroDepresion;
    private Button IDuttonHidroOnda;
    private Button IDuttonHidroElectrica;
    private Button IDButtonHidroSequia;
    private Button IDButtonHidroCalor;
    private Button IDButtonHidroFrio;
    private Button IDButtonHidroVientos;
    private Button IDButtonHidroInundaciones;
    private Button IDButtonHidroHelada;
    private Button IDButtonHidroGranizo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hidrometeorologico, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        IDButtonHidroHuracan = view.findViewById(R.id.IDButtonHidroHuracan);
        IDuttonHidroTropical = view.findViewById(R.id.IDuttonHidroTropical);
        IDuttonHidroDepresion = view.findViewById(R.id.IDuttonHidroDepresion);
        IDuttonHidroOnda = view.findViewById(R.id.IDuttonHidroOnda);
        IDuttonHidroElectrica = view.findViewById(R.id.IDuttonHidroElectrica);
        IDButtonHidroSequia = view.findViewById(R.id.IDButtonHidroSequia);
        IDButtonHidroCalor = view.findViewById(R.id.IDButtonHidroCalor);
        IDButtonHidroFrio = view.findViewById(R.id.IDButtonHidroFrio);
        IDButtonHidroVientos = view.findViewById(R.id.IDButtonHidroVientos);
        IDButtonHidroInundaciones = view.findViewById(R.id.IDButtonHidroInundaciones);
        IDButtonHidroHelada = view.findViewById(R.id.IDButtonHidroHelada);
        IDButtonHidroGranizo = view.findViewById(R.id.IDButtonHidroGranizo);

        final NavController navController = Navigation.findNavController(view);

        IDButtonHidroHuracan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_huracan);
            }
        });
        IDuttonHidroTropical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_tropical);
            }
        });
        IDuttonHidroDepresion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_depresion);
            }
        });
        IDuttonHidroOnda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_onda);
            }
        });
        IDuttonHidroElectrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_electrica);
            }
        });
        IDButtonHidroSequia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_sequia);
            }
        });
        IDButtonHidroCalor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_calor);
            }
        });
        IDButtonHidroFrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_frio);
            }
        });
        IDButtonHidroVientos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_vientos);
            }
        });
        IDButtonHidroInundaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_inundaciones);
            }
        });
        IDButtonHidroHelada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_helada);
            }
        });
        IDButtonHidroGranizo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_granizo);
            }
        });
    }
}