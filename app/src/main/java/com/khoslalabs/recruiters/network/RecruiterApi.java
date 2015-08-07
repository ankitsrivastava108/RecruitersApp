package com.khoslalabs.recruiters.network;

import android.util.Log;

import com.khoslalabs.recruiters.RecruiterAdapter;
import com.khoslalabs.recruiters.models.Naukri;

import retrofit.RestAdapter;
import retrofit.http.GET;

/**
 * Created by ankitsrivastava on 07/08/15.
 */
public class RecruiterApi  {
    public  static  String URL= "https://www.kimonolabs.com/api";
    private static RecruiterInterface recruiterInterface;
    public  static  RecruiterInterface getApi(){
        if(recruiterInterface==null)
        {

            Log.d("fdv","getapi caled");
            RestAdapter restAdapter= new RestAdapter.Builder()
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setEndpoint(URL)
                    .build();
            recruiterInterface= restAdapter.create(RecruiterInterface.class);

        }

        return  recruiterInterface;
    }


    public  interface RecruiterInterface{

        @GET("/aotan414?apikey=cJgQ9GQhvg987UM2nVFJ0sZkpfimLaLL")
        Naukri getRecruiterList();

        @GET("/aotan414?apikey=cJgQ9GQhvg987UM2nVFJ0sZkpfimLaLL")
        void getRecruiterList(retrofit.Callback<Naukri> naukriCallback);

    }
}
