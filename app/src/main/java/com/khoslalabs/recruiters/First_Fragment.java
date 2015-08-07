package com.khoslalabs.recruiters;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.khoslalabs.recruiters.models.Naukri;
import com.khoslalabs.recruiters.network.RecruiterApi;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by ankitsrivastava on 07/08/15.
 */
public class First_Fragment extends android.support.v4.app.Fragment {
    private ListView listView;
    private RecruiterAdapter recruiterAdapter;
    Naukri n;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_first);
        //listView.setAdapter(recruiterAdapter);
            Log.d("dsrfd", "createview called");

        RecruiterApi.getApi().getRecruiterList(new retrofit.Callback<Naukri>() {
            @Override
            public void success(Naukri naukri, Response response) {

                recruiterAdapter = new RecruiterAdapter(getActivity(), naukri.getResults().getCollection1());
                listView.setAdapter(recruiterAdapter);
                Log.d("jdtgv","Recruiterapi called" );
                n= naukri;
                //Toast.makeText(getActivity(), "Number Of Entries" + naukri.getResults(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void failure(RetrofitError error) {
                    Log.d("dfsd","api error");
            }
        });

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent= new Intent(getActivity(), MainActivity.class);
        /*String activejobs= n.getResults().getCollection1().get(position).getActiveJobs().getText();
        String location= n.getResults().getCollection1().get(position).getLocation();
        String activejobs= n.getResults().getCollection1().get(position).getActiveJobs().getText();
        intent.putExtra("Recruiters",) ;*/
        intent.putExtra("recruiterlist", n);
        intent.putExtra("pos",position);
        getActivity().startActivity(intent);
    }
});


        return view;
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}