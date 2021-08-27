package com.example.envirotech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Crops extends AppCompatActivity {
    TextView titletext,maintext;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farming);
        titletext=findViewById(R.id.title_text);
        maintext=findViewById(R.id.maintext);
        backButton=findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Crops.super.onBackPressed();
            }
        });
        maintext.setText("Wheat:\n" +
                "Cultivation: grows well in clayey loam soils.\n" +
                "In Bangladesh it is a crop of Rabi season, requires dry weather and bright sunlight. \n" +
                "The common cultivated varieties are locally known as Sonalika, Kanchan, Balaka, Ananda, Akbar, Barkat, and Aghrani\n" +
                "\nRice:\n" +
                "Sources at Bangladesh Rice Research Institute (BRRI) say the number of developed and released rice varieties by the state-run rice research body currently stands at 81. Of them, 25 are varieties of Boro, 36 of Aman and 10 are Aush.\n" +
                "In Bangladesh the harvesting time of rice in different seasons are: Aus (July-August), broadcast Aman (November-December), transplanted Aman (November-January), local boro (April-May), and high yielding boro (May-June).\n" +
                "Clay and loamy, slightly acidic to slightly alkaline soils are suitable for rice cultivation.\n" +
                "\nMaize:\n" +
                "maize- Among the high yielding varieties grown in Bangladesh are Savar, JC, DMR, Barnali, Shuvra, Mohar, Khai Bhutta, and Swan-2.\n" +
                "Maize can be grown successfully in variety of soils ranging from loamy sand to clay loam.\n" +
                "production time of maize: In Bangladesh, optimum time of sowing in rabi season is from mid October to 1st week of December, in kharif I season from mid February to end of March.\n" +
                "\nPotato-\n" +
                "Medium high to high land with loamy to sandy loam soil is the best suitable for potato cultivation.\n" +
                "potato varieties Diamant, Cardinal, Multa, Asterix, Dheera, Espirit, Felsina, Granola, Heera, Patrones, Binella, Elvira, Ultra, Kufri Sinduri and BARI TPS-Alu.\n" +
                "Most varieties are harvested in this country during February-March\n" +
                "\ncauliflower-\n" +
                "the early varieties prefer sandy loam, whereas for the late varieties, loam or clay loam is preferred\n" +
                "Such varieties are marketed by the name of month they mature like Kartika (OctoberNovember), Agrahayani (November), Poushali (December) and Maghi (January).\n" +
                "For early planting, sowing of seeds should be done by 15th August, for medium planting by 15th September and for late planting by 15th of October\n" +
                "\nTomato-\n" +
                " tomato varieties namely BARI F1 Tomato-4, BARI F1 Tomato-5, BARI F1 Tomato-6, BARI F1 Tomato-7, BARI F1 Tomato-8, Lali, Abhilash, Nayak, Moon, Delta, Mintoo super, Mintoo\n" +
                "September- October is the optimum time for seed sowing of winter tomato\n" +
                "Tomato may be grown on a wide range of soil from sandy to clay\n" +
                "\nChilli pepper:\n" +
                " local varieties like Balijuri, Bona, Bain, Saita, Suryamukhi, Paba, Halda, Dhani, Shikarpuri and Patnai\n" +
                "Chilli crop grows on a wide range of soil but well drained sandy-loam soils with good fertility\n" +
                "In Bangladesh, September-October for the rabi (winter) seasonand the other February to March for the kharif (summer) season.\n" +
                "\nOnion:\n" +
                "BARI has so far developed five varieties of onion. Among of them, two varieties (viz. BARI Piaz-1 and BARI Piaz-4) are for rabi (winter) season and three (viz. BARI Piaz-2, BARI Piaz-3 and BARI Piaz-5) for kharif (summer) season.\n" +
                "it grows well in friable and well-drained sandy-loam to clay-loam soil\n" +
                "mustard plant:\n" +
                "Medium to medium high land is suitable for cultivation but loamy soil is the best for mustard cultivation. It can also be cultivated in clay loam and sandy loam soil.\n" +
                "Mid-October to mid-November is the optimum time for mustard crop sowing in the northern part of the country but where winter comes early, mustard seeds could be sown earlier than the other areas.\n" +
                "varieties: BARI Sarisha-9, BARI Sarisha-11, BARI Sarisha-13, BARI Sarisha-14, BARI Sarisha-15, BARI Sarisha-16.\n" +
                "\nGarlic:\n" +
                "Varieties: BARI Roshun-1, BARI Roshun-2\n" +
                "Garlic can be cultivated in various types of soils but well drained fertile loamy soil is suitable for this crop.\n" +
                "Last week of October to 1st week of November is the suitable time for planting of garlic.\n" +
                "\nAubergine:\n" +
                "Islampuri, Khat Khatia, Dohazari, Volanath and Singnath are some of the popular local varieties of aubergine\n" +
                "Mid August-September for winter and mid February-March for summer are the optimum times for seed sowing.\n" +
                "The brinjal can be grown in all types of soil varying from light sandy to heavy clay. Light soils are good for an early yield, while clay-loam and silt-loam are well suited for higher yield.\n");




    }
}