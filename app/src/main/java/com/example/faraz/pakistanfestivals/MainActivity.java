package com.example.faraz.pakistanfestivals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {
    ListView Countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= (TextView) findViewById(R.id.tv1);

        Countries=(ListView)findViewById(R.id.list);
        String[]Count=new String[]{"Religious Festivals","Cultural Festivals","National Events","Army Festivals"
        };
        ListAdapter CountryAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Count);
        ListView countryList=(ListView) findViewById(R.id.list);
        countryList.setAdapter(CountryAdapter);
        Countries.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String cnt=String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,cnt,Toast.LENGTH_LONG).show();
                if(position==0)
                {
                    Intent newint=new Intent(view.getContext(),Religious.class);
                    startActivityForResult(newint,0);
                }

                if(position==1)
                {
                    Intent newint=new Intent(view.getContext(),Cultural.class);
                    startActivityForResult(newint,1);
                }
                if(position==2)
                {
                    Intent newint=new Intent(view.getContext(),National.class);
                    startActivityForResult(newint,2);
                }
                if(position==3)
                {
                    Intent newint=new Intent(view.getContext(),Army.class);
                    startActivityForResult(newint,2);
                }
            }
        });

    }

    }





