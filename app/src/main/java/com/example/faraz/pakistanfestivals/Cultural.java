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

public class Cultural extends AppCompatActivity {
    // String[] Rfest={"Celebrated at the end of the most sacred Islamic month Ramadan, Eid-ul-Fitr is a three-day long festival that is enthusiastically celebrated by all Muslims of the world","HI","BYE"};

    int[] Images = {R.drawable.basant, R.drawable.chiragh, R.drawable.cattle, R.drawable.sibi};
    String[] Text = {"The Basant Kite Festival of Punjab has been a historic spring time kite flying event during the Basant Panchami festival in the Punjab region in India and Pakistan. ... According to the Punjabi calendar it is held on the fifth day of lunar month of Magha (in late January or early February) marking the start of spring.",
            "Mela Chiraghan. Mela Chiraghan or Mela Shalimar (Punjabi: میلہ چراغاں; \"Festival of Lights\") is a three-day annual festival to mark the urs (death anniversary) of the Punjabi Sufi poet and saint Shah Hussain (1538-1599) who lived in Lahore in the 16th century.",
            "The show has been described as an eloquent expression of Pakistan's heritage and an authentic account of its agricultural and industrial achievement's. The fortress stadium, the venue of the show is thronged by active participants, foreign visitors and peoples who watch the festival with great enthusiasm, verve and aplomb",
            "Sibi, Balochistan at a distance of 160 km southeast of Quetta is the annual meeting place of Balochistan tribes since 15th century." +
                    "\n" +
                    "This annual meeting called Jirga is combined with a Festival (Mela) where thousands of Baloch Tribesmen gather."};
    Button nex;
    Button pre;
    ImageView imgv;
    int counter = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural);


        nex = (Button) findViewById(R.id.next);
        pre = (Button) findViewById(R.id.back);
        imgv = (ImageView) findViewById(R.id.iv);
        textView = (TextView) findViewById(R.id.tv);
        textView.setText(Text[counter]);

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter > 0) {
                    counter--;
                    imgv.setImageResource(Images[counter]);
                    textView.setText(Text[counter]);
                }
                if (counter == 0)
                    imgv.setImageResource(Images[0]);
                textView.setText(Text[counter]);

            }


        });

        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if (counter < Images.length) {
                    //counter++;
                    imgv.setImageResource(Images[counter]);
                    textView.setText(Text[counter]);
                    // counter++;
                }
                if (counter >= Images.length) {
                    counter = 0;
                    imgv.setImageResource(Images[counter]);
                    textView.setText(Text[counter]);
                }
            }


        });
    }
}

