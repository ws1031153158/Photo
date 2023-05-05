package com.life.photo.utils

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.life.photo.Photo
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import java.io.IOException
import java.net.URL


class NetWorkUtils {
    interface GitHubApi {
        @GET("repos/{owner}/{repo}/contributors")
        fun contributorsByGetCall(@Path("owner") owner: String, @Path("repo") repo: String): Call<ResponseBody>
    }

    fun getRetrofit(url: URL): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(url)
            .build()
    }
}