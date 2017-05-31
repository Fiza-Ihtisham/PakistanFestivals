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

public class Religious extends AppCompatActivity  {
   // String[] Rfest={"Celebrated at the end of the most sacred Islamic month Ramadan, Eid-ul-Fitr is a three-day long festival that is enthusiastically celebrated by all Muslims of the world","HI","BYE"};

    int[]Images={R.drawable.fitr,R.drawable.adha,R.drawable.muharam,R.drawable.rabi,R.drawable.meraj};
    String [] Text={"Eid al-Fitr was originated by the Islamic prophet Muhammad. It is observed on the first of the month of Shawwal at the end of the month of Ramadan, during which Muslims undergo a period of fasting.Eid al-Fitr was originated by the Islamic prophet Muhammad. It is observed on the first of the month of Shawwal at the end of the month.","When asked about the origin of Eid al-Adha, The Prophet of Islam, Muhammad, is reported to have said, “It is a tradition that has come down to us from Abraham.” The Feast of Sacrifice dates from the historic event when Prophet Abraham was commanded by God, in a form of a dream vision, to sacrifice his son, Ishmail.",
        "Ashura, which literally means the TENTH in Arabic, refers to the tenth day of Muharram. It is well-known because of historical significance and mourning for the murder of Hussein ibn Ali, the grandson of Muhammad","Rabi' al-awwal (ربيع الأوّل) is the third month in the Islamic calendar. During this month, the majority of Muslims celebrate Mawlid - the birthday of the Islamic prophet, Muhammad.During this month, the majority of Muslims celebrate Mawlid - the birthday of the Islamic prophet","Shab e-Meraj in Pakistan. Isra and Mi'raj, also known as Al Isra' wal Miraj, is observed on the 27th day of the month of Rajab, the seventh month in the Islamic calendar. This event marks the night that Allah (God) took Mohammad (also known as Mohamed or Muhammed) on a journey from Mecca to Jerusalem and then to heaven ."};
    Button nex;
    Button pre;
    ImageView imgv;
    TextView textView;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);


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

