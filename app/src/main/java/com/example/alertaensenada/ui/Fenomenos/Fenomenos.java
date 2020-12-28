package com.example.alertaensenada.ui.Fenomenos;

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

public class Fenomenos extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fenomenos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button IDButtonGeologicos = view.findViewById(R.id.IDButtonGeologico);
        Button IDButtonHidrometeorologico = view.findViewById(R.id.IDButtonHidrometeorologico);
        Button IDButtonQuimico = view.findViewById(R.id.IDButtonQuimico);
        Button IDButtonSocial = view.findViewById(R.id.IDButtonSocial);
        Button IDButtonSanitario = view.findViewById(R.id.IDButtonSanitario);

        final NavController navController = Navigation.findNavController(view);

        IDButtonGeologicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_geologicos);
            }
        });
        IDButtonHidrometeorologico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_hidrometeorologico);
            }
        });
        IDButtonQuimico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_quimicos);
            }
        });
        IDButtonSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_social);
            }
        });
        IDButtonSanitario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_sanitario);
            }
        });
    }
}