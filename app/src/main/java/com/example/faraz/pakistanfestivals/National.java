package com.example.faraz.pakistanfestivals;

import android.media.Image;
import android.provider.ContactsContract;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class National extends AppCompatActivity  {
    // String[] Rfest={"Celebrated at the end of the most sacred Islamic month Ramadan, Eid-ul-Fitr is a three-day long festival that is enthusiastically celebrated by all Muslims of the world","HI","BYE"};

    int[]Images={R.drawable.august,R.drawable.reso,R.drawable.defence};
    String[] Text={"\"August 15 is the birthday of the independent and sovereign state of Pakistan. ... The first commemorative postage stamps of the country, released in July 1948, also gave 15 August 1947 as the independence day, however in subsequent years 14 August was adopted as the independence day.",
    "Yaum-e-Pakistan) or Pakistan Resolution Day, also Republic Day, is a national holiday in Pakistan commemorating the Lahore Resolution passed on 23 March 1940 and the adoption of the first constitution of Pakistan during the transition of the Dominion of Pakistan to the Islamic Republic of Pakistan on 23 March 1956 .","The 6th of September is a golden chapter in the history of Pakistan, when Pakistan, its military and people stood united in 1965 in defense of Pakistan and resolve to halt and beat back Indian multi-dimensional attacks against Pakistan. This historic day is commemorated through parades and exhibitions of military equipment at Rawalpindi, Lahore.",
    };
    Button nex;
    Button pre;
    ImageView imgv;
    TextView textView;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national);


        nex=(Button) findViewById(R.id.next);
        pre=(Button) findViewById(R.id.back);
        imgv=(ImageView) findViewById(R.id.iv);
        textView=(TextView) findViewById(R.id.tv);
        textView.setText(Text[counter]);
        pre.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(counter>0) {
                    counter--;
                    imgv.setImageResource(Images[counter]);
                    textView.setText(Text[counter]);
                }
                if(counter==0)
                    imgv.setImageResource(Images[0]);
                textView.setText(Text[counter]);

            }


        });

        nex.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter++;
                if(counter<Images.length) {
                    //counter++;
                    imgv.setImageResource(Images[counter]);
                    textView.setText(Text[counter]);
                    // counter++;
                }
                if (counter>=Images.length)
                {
                    counter=0;
                    imgv.setImageResource(Images[counter]);
                    textView.setText(Text[counter]);
                }
            }


        });
    }


}

