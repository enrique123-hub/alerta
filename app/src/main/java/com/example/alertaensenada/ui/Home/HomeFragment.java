package com.example.alertaensenada.ui.Home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.alertaensenada.R;
import com.example.alertaensenada.ui.Avisos.Avisos;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private static final String GOOGLE_ATLAS = "http://www.atlasnacionalderiesgos.gob.mx/";
    private static final String GOOGLE_CNPD = "https://www.gob.mx/cenapred";
    private static final String GOOGLE_CNPC = "http://www.gobernacion.gob.mx/es_mx/SEGOB/Coordinacion_General_de_Proteccion_Civil";
    public Button Atlas;
    public Button CNPD;
    public Button CNPC;
    public Button IDButtonFeno;
    public Button IDButtonPronostico;
    public Button IDButtonAvisos;
    public Button IDButtonNume;
    public Button IDButtonQueHacer;
    public Button IDButtonMochila;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        Atlas   = root.findViewById(R.id.IDButtonAtlas);
        CNPD    = root.findViewById(R.id.IDButton_CNPD);
        CNPC    = root.findViewById(R.id.IDButton_CNPC);

        Atlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atlas = new Intent(Intent.ACTION_VIEW);
                atlas.setData(Uri.parse(GOOGLE_ATLAS));
                startActivity(atlas);
            }
        });
        CNPD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CNPD = new Intent(Intent.ACTION_VIEW);
                CNPD.setData(Uri.parse(GOOGLE_CNPD));
                startActivity(CNPD);
            }
        });
        CNPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CNPC = new Intent(Intent.ACTION_VIEW);
                CNPC.setData(Uri.parse(GOOGLE_CNPC));
                startActivity(CNPC);
            }
        });
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        IDButtonPronostico = view.findViewById(R.id.IDButtonPronostico);
        IDButtonAvisos = view.findViewById(R.id.IDButtonAvisos);
        IDButtonNume = view.findViewById(R.id.IDButtonNume);
        IDButtonQueHacer = view.findViewById(R.id.IDButtonQueHacer);
        IDButtonMochila = view.findViewById(R.id.IDButtonMochila);

        final NavController navController = Navigation.findNavController(view);

        IDButtonPronostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_pronosticoClima);
            }
        });
        IDButtonAvisos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_avisos);
            }
        });
        IDButtonNume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_numeroEmergencia);
            }
        });
        IDButtonQueHacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_hacer_en_caso);
            }
        });
        IDButtonMochila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_mochilaEmergenccia);
            }
        });
    }
}