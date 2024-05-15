package com.lula.lab3inmobiliariaandroid;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.lula.lab3inmobiliariaandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel viewModel;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(MainActivityViewModel.class);
        binding.btIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = binding.etUsuario.getText().toString();
                String pass = binding.etContra.getText().toString();
                viewModel.Logueo(mail, pass);
            }
        });
    }
}