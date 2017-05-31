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

public class Army extends AppCompatActivity  {
    // String[] Rfest={"Celebrated at the end of the most sacred Islamic month Ramadan, Eid-ul-Fitr is a three-day long festival that is enthusiastically celebrated by all Muslims of the world","HI","BYE"};

    int[]Images={R.drawable.pakarmy,R.drawable.air,R.drawable.exhib};
    String[]Text={"PakArmy is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries","Air Force day is celebrated on 7th of September marking the official beginning of the Indo-Pak war of 1965. That day Air shows and other programs mark the PAF's role in defending the nation. This day is celebrated by display of latest aircrafts of Pakistan Airforce and air shows at Rawalpindi, Sargodha, Lahore, Peshawar and Quetta.","The International Defence Exhibition and Seminar, more commonly referred to as IDEAS, is a defence sector event, held biennially, in Pakistan. Since its inception by President Pervez Musharraf in 2000, it has grown to include more than 30,000 delegates and 250 exhibitors from around the world."};
    Button nex;
    Button pre;
    ImageView imgv;
    int counter=0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_army);


        nex=(Button) findViewById(R.id.next);
        pre=(Button) findViewById(R.id.back);
        imgv=(ImageView) findViewById(R.id.iv);
        textView=(TextView)findViewById(R.id.tv);
        textView.setText(Text[counter]);
        pre.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(counter>0) {
                    counter--;
                    imgv.setImageResource(Images[counter]);
                    textView.setText(Text[counter]);
                }
                if(counter==0) {
                    imgv.setImageResource(Images[0]);
                    textView.setText(Text[counter]);
                }

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

