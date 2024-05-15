package com.lula.lab3inmobiliariaandroid;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.lula.lab3inmobiliariaandroid.request.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends AndroidViewModel {
    private SharedPreferences sp;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        sp = application.getSharedPreferences("auth_prefs", Context.MODE_PRIVATE);
    }
    public void Logueo(String usuario, String pass){
        ApiClient.MisEndPoints api = ApiClient.getEndPoints();
        Call<String> call = api.login(usuario, pass);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if(response.isSuccessful()){
                    String token = response.body();
                    guardarToken("Bearer " + token);
                    Log.d("salida", "Usuario logueado");
                    Intent intent = new Intent(getApplication(), MainActivityViewModel.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getApplication().startActivity(intent);
                } else {
                    Log.d("salida", "Incorrecto");
                }
            }
            @Override
            public void onFailure(Call<String> call, Throwable throwable) {
                Toast.makeText(getApplication(), "Fallo la conexion", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void guardarToken(String token) {
        ApiClient.guardarToken(token, getApplication());
    }

}
