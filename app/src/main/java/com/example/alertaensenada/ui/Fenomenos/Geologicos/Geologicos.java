package com.example.alertaensenada.ui.Fenomenos.Geologicos;

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

public class Geologicos extends Fragment {

    private Button IDButtonGeoFalla;
    private Button IDButtonGeoSismo;
    private Button IDButtonGeoTsunami;
    private Button IDButtonGeoErupcion;
    private Button IDButtonGeoDerrumbe;
    private Button IDButtonGeoHundimiento;
    private Button IDButtonGeoErocion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_geologicos, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        IDButtonGeoFalla = view.findViewById(R.id.IDButtonGeoFalla);
        IDButtonGeoSismo = view.findViewById(R.id.IDButtonGeoSismo);
        IDButtonGeoTsunami = view.findViewById(R.id.IDButtonGeoTsunami);
        IDButtonGeoErupcion = view.findViewById(R.id.IDButtonGeoErupcion);
        IDButtonGeoDerrumbe = view.findViewById(R.id.IDButtonGeoDerrumbe);
        IDButtonGeoHundimiento = view.findViewById(R.id.IDButtonGeoHundimiento);
        IDButtonGeoErocion = view.findViewById(R.id.IDButtonGeoErocion);

        final NavController navController = Navigation.findNavController(view);

        IDButtonGeoFalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_fallos);
            }
        });
        IDButtonGeoSismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_sismos);
            }
        });
        IDButtonGeoTsunami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_tsunami);
            }
        });
        IDButtonGeoErupcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_erupcion);
            }
        });
        IDButtonGeoDerrumbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_derrumbes);
            }
        });
        IDButtonGeoHundimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_hundimientos);
            }
        });
        IDButtonGeoErocion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_erosion);
            }
        });
    }
}