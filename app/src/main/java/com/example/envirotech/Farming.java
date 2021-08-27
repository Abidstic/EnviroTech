package com.example.envirotech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Farming extends AppCompatActivity {
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
                Farming.super.onBackPressed();
            }
        });
        maintext.setText("REQUIRED INFORMATION FOR THE FARMERS\n" +

                "Farmers require information at every stage of the process, from crop selection to harvesting. Following that is the information that the farmers will need at each of these processes.\n" +

                "\n1 Selection of Crops\n" +
                "i.\tDifferent crops' prices are compared. The government publishes agricultural prices at the time of sowing for certain crops.\n" +
                "ii.\tThe crop's market demand and possibility for sale.\n" +
                "iii.\tBudget necessary for each crop's cultivation.\n" +
                "iv.\tCrop feasibility, taking into account the climate and land quality.\n" +
                "v.\tCrop productivity in comparison to other options.\n" +

                "\n2 Preparing the Land \n" +
                "i.\tAny disease left over from the previous cultivation, as well as the procedures needed to mitigate it.\n" +
                "ii.\tFertilizers were required to restore the land's fertility, which was influenced by the previous crops and fertilizer utilized.\n" +
                "iii.\tField layout and design in relation to crop for efficient irrigation.\n" +
                "iv.\tThe most up-to-date procedures for leveling fields, as well as their costs\n" +

                "\n3 Choosing Seeds\n" +
                "i.\tNeeded price and quantity per acre\n" +
                "ii.\tYield and sprout-to-sown ratio are averages.\n" +
                "iii.\tSuitability for a specific location and environment.\n" +
                "iv.\tRequired. Water.\n" +
                "v.\tDisease resistance is an important factor.\n" +
                "vi.\tSeed distribution offices are located in this area.\n" +

                "\n4 Sowing Seeds\n" +
                "i.\tSuitable time to sow the seed\n" +
                "ii.\tWeather conditions that are ideal for sowing.\n" +
                "iii.\tThe most effective way for sowing seeds.\n" +
                "iv.\tDepth of seed planting\n" +

                "\n5 Irrigation \n" +
                "i.\tAppropriate time for irrigation\n" +
                "ii.\tThe amount of water that should be provided to the plants.\n" +
                "iii.\tIrrigation frequency.\n" +

                "\n6 Crop Growth\n" +
                "i.\tThe number of plants per square meter. In some cases, an overabundance of seed sprouts are sown in a specific region. For good plant growth, farmers must reduce density.\n" +
                "ii.\tIn normal conditions, the crop's average growth rate.\n" +
                "iii.\tCrop growth rate, leaf size, crop color, and other characteristics are compared to projected growth for given conditions and input.\n" +
                "iv.\tInterventions are required to keep growth on track.\n" +
                "v.\tFertilization frequency, quantity, and manner\n" +
                "vi.\tPlowing should be done at the appropriate time, frequency, and method.\n" +
                "vii.\tWeeding at the right time, frequency, and approach.\n" +
                "viii.\tExpected pest and virus attacks, symptoms of such attacks, preventative measures that can be taken ahead of time to avoid these attacks, immediate actions such as pesticide to be used to kill pests and viruses, quantity of pesticide to be used per acre, most effective method for pesticide spray, avoid health issues associated with pesticide spray\n" +
                "\n" +

                "7 Harvesting\n" +
                "i.\tHarvesting at the right time and with the right manner.\n" +
                "ii.\tMarket rates are compared.\n" +
                "iii.\tCrop storage that is done correctly.\n" +
                "iv.\tTransportation costs\n" +
                "Some other factors that need to be considered while cultivating are as follows: \n" +
                "•\tPaddy seed purification\n" +
                "If the selected seeds are spotted and mature, they will not be repaired in general Even if you do, it is better to sow the seeds before sowing. Temperature of 52-55 degrees Celsius (tolerable in hand) for shading Soaking the seeds in hot water for 15 minutes disinfects them.\n" +
                "•\tSelection of Paddy Seeds\n" +
                "It is necessary to ensure good and healthy seeds for sowing. Because good seeds. I mean strong cars. Urea is mixed in different ways (by hand or by hand) In water) two h can be selected.\n" +
                "•\tPaddy Seedbed Preparation \n" +
                "Before making paddy seedbed, it is necessary to know when to sow rice seeds in a jar in the seedbed.  There are four ways to make a seedbed.  They are being dry, muddy, floating and well-divided\n" +
                "•\tThe right time to plant rice seedlings in Aaush, Aman and Boro seasons\n" +
                "In Aaush season 15-30 Chaitra (29 March-13 April) seeds should be sown and 20–25-day old seedlings should be planted.  In the aman season, the highest yield is obtained by sowing seeds on 15-30 Ashar (July 1-15) and transplanting seedlings between 15-30 (August 1-14) Shravan.  Paddy planting in Boro should be completed within 15 Magh.\n" +
                "•\tSeedbed care \n" +
                "To get healthy and vigorous seedlings, it is necessary to take special care of the seedbed after sowing the seeds.  The seeds are on the bed so the birds can see them.  So, you have to chase the birds for 4/5 days from the time of sowing.\n" +
                "•\tConsideration in crop variety selection \n" +
                "It is important to select the right variety suitable for area-based cultivation for higher yield and profit.  Proper management of farmers' land and crops throughout the season depends on proper variety selection.\n" +
                "•\tGermination Test of Paddy Seeds \n" +
                "Germination test is done to check the quality of seeds i.e. to know whether the seedlings germinate and healthy seedlings come out.  In case of rice seed germination capacity is not less than 60% or more, it is not considered as seed.\n");



    }
}