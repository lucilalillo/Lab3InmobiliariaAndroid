package com.lula.lab3inmobiliariaandroid.request;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lula.lab3inmobiliariaandroid.Modelo.Propietario;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public class ApiClient {
    private static final String url = "192.168.0.108:5216";
    private static MisEndPoints mep;
    private static SharedPreferences sharedPreferences;

    public static MisEndPoints getEndPoints()
    {
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        mep = retrofit.create(MisEndPoints.class);
        return mep;
    }
    public static SharedPreferences conectar(Context context){
        if (sharedPreferences==null){
            sharedPreferences = context.getSharedPreferences("token.dat",0);
        }
        return  sharedPreferences;
    }
    public interface MisEndPoints{
        @FormUrlEncoded
        @POST("Propietarios/login")
        Call<String> login(@Field("Usuario") String u, @Field("Clave") String c);

        @GET("Propietarios")
        Call<Propietario> miPerfil(@Header("Authorization") String token);

        @PUT("Propietarios")
        Call<Propietario> modificarUsuario(@Header("Authorization") String token, @Body Propietario propietario);
    }
    public static void guardarToken(String token, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("auth_prefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("token", token);
        editor.apply();
    }
    public static String leerToken(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("auth_prefs", Context.MODE_PRIVATE);
        return sharedPreferences.getString("token",null);
    }
}
