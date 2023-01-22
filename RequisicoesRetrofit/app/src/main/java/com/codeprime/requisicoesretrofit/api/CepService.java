package com.codeprime.requisicoesretrofit.api;

import com.codeprime.requisicoesretrofit.model.CEP;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CepService {

    @GET("{cep}/json/")
    Call<CEP> recuperaCEP(@Path("cep") String cep);

    @GET("fotos")
    Call<CEP> recuperaFotos();
}
