package com.example.envirotech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Fertilizers extends AppCompatActivity {
    TextView maintext,titletext;
    ImageView back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizers);
        maintext=findViewById(R.id.maintext);
        titletext=findViewById(R.id.title_text);
        back_button=findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fertilizers.super.onBackPressed();
            }
        });
        maintext.setText("For per bigha (33 decimal)\n" +
                "Apply to the ground\n" +
                "\n" +
                "Rice\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level:\n" +
                "Mono-zinc / hepta-zinc (1.5-2 KG)\n" +
                "Bumper organic fertilizer (50-60 KG)\n" +
                "Humistar (1-2 KG)\n" +
                "Ratna fertilizer (45-50 KG)\n" +
                "Gypser (5-7 KG)\n" +
                "Application method:\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 20-25 days)\n" +
                "Mag fertilizer (15 KG): Sprinkle it\n" +
                "MOP (12KG): Sprinkle it and mix it with soil\n" +
                "Urea (4-5 KG): Sprinkle it and mix it with soil\n" +
                "2ND TOP APPLICATION (At the time of 40-45 days)\n" +
                "Urea (15 KG): Scatter and apply to the soil\n" +
                "\n" +
                "\nWheat\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1.5-2 KG)\n" +
                "Bumper organic fertilizer (60-80 KG)\n" +
                "Humistar (1-2 KG)\n" +
                "Ratna fertilizer(35 KG)\n" +
                "Gypser (5 KG)\n" +
                "Bumper Boron (2 KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 17-21 days) \n" +
                "Mag fertilizer (5 KG)\n" +
                "MOP (10 KG)\n" +
                "Neb mixed urea (15 KG. 4 ml neb with urea per KG)\n" +
                "-After irrigating the land, while the soil is still wet, sprinkle it and mix it with soil\n" +
                "\n" +
                "\n" +
                "\n" +
                "Corn\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1.5-2 KG)\n" +
                "Bumper organic fertilizer (60-80 KG)\n" +
                "Humistar (2-3 KG)\n" +
                "Ratna fertilizer (75-80 KG)\n" +
                "Gypser (5-7 KG)\n" +
                "Bumper Boron (2 KG)\n" +
                "Meg Fertilizer (10-12 KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 30-35 days) \n" +
                "TSP (5 KG)\n" +
                "Neb mixed urea (12 KG. 5 ml neb with urea per KG)\n" +
                "- Sprinkle it and mix it with soil.\n" +
                "2ND TOP APPLICATION (At the time of 50-60 days)\n" +
                "Neb mixed urea (12 KG. 5 ml neb with urea per KG)\n" +
                "-Scatter and apply to the soil\n" +
                "\nPotato\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1.5-2 KG)\n" +
                "Bumper organic fertilizer (60-65 KG)\n" +
                "Humistar (2-3 KG)\n" +
                "Ratna fertilizer (75-80 KG)\n" +
                "Gypser (5-7 KG)\n" +
                "Bumper Boron (2 KG)\n" +
                "Meg Fertilizer (5-7 KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 30-35 days)\n" +
                "TSP (7-8 KG)- Sprinkle it\n" +
                "MOP (12KG)\n" +
                "Neb mixed urea (15 KG. 4 ml neb with urea per KG)\n" +
                "- Sprinkle it and mix it with soil\n" +
                "\n" +
                "\n" +
                "Aubergine\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1 KG)\n" +
                "Bumper organic fertilizer (60-80 KG)\n" +
                "Humistar (1-2 KG)\n" +
                "Ratna fertilizer (75-80 KG)\n" +
                "Gypser (5-7 KG)\n" +
                "Bumper Boron (1 KG)\n" +
                "Meg Fertilizer (2-3KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 20 days) \n" +
                "TSP or Neb mixed DEP (5 KG)\n" +
                "Neb mixed urea (5 KG)\n" +
                "-Sprinkle it and mix it with soil.\n" +
                "2ND TOP APPLICATION (At the time of 40 days) \n" +
                "Neb mixed Urea or DEP (5 KG)\n" +
                "MOP (5 KG)\n" +
                "- Sprinkle it.\n" +
                "3RD TOP APPLICATION (At the time of 60 days)\n" +
                "Neb mixed urea or DEP (5 KG)- Scatter and apply to the soil\n" +
                "\nTomato\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1-1.5 KG)\n" +
                "Bumper organic fertilizer (1-2 KG)\n" +
                "Humistar (1-2 KG)\n" +
                "Ratna fertilizer (30-35 KG)\n" +
                "Gypser (5KG)\n" +
                "Bumper Boron (1 KG)\n" +
                "Meg Fertilizer (2-3KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 15 days) \n" +
                "TSP or Neb mixed DEP (20 KG)\n" +
                "Neb mixed urea (5 KG)\n" +
                "-Sprinkle it and mix it with soil.\n" +
                "2ND TOP APPLICATION (At the time of 35 days) \n" +
                "Neb mixed Urea or DEP (5 KG)\n" +
                "MOP (5 KG)\n" +
                "- Sprinkle it.\n" +
                "\nCauliflower\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1.5-2 KG)\n" +
                "Bumper organic fertilizer (60-80 KG)\n" +
                "Humistar (1-2 KG)\n" +
                "Ratna fertilizer (45-50 KG)\n" +
                "Gypser (5-7 KG)\n" +
                "Bumper Boron (1.5-2 KG)\n" +
                "Meg Fertilizer (4-5 KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 10-15 days) \n" +
                "TSP or Neb mixed DEP (20 KG)\n" +
                "Neb mixed urea (5 KG)\n" +
                "- Sprinkle it and mix it with soil.\n" +
                "2ND TOP APPLICATION (At the time of 30 days) \n" +
                "Neb mixed Urea or DEP (5 KG)\n" +
                "MOP (5 KG)\n" +
                "- Sprinkle it.\n" +
                "3RD TOP APPLICATION (At the time of 50 days)\n" +
                "Neb mixed urea or DEP (5 KG)\n" +
                "-Scatter and apply to the soil\n" +
                "\nChili Pepper\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1-1.5 KG)\n" +
                "Bumper organic fertilizer (60-80 KG)\n" +
                "Humistar (1-2 KG)\n" +
                "Ratna fertilizer (40 KG)\n" +
                "Gypser (5 KG)\n" +
                "Bumper Boron (1-1.5 KG)\n" +
                "Meg Fertilizer (2-3 KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 25 days) \n" +
                "TSP or Neb mixed DEP (10 KG)\n" +
                "Neb mixed urea (5 KG)\n" +
                "- Sprinkle it and mix it with soil.\n" +
                "2ND TOP APPLICATION (At the time of 50 days) \n" +
                "Neb mixed Urea or DEP (5 KG)\n" +
                "MOP (5 KG)\n" +
                "- Sprinkle it.\n" +
                "3RD TOP APPLICATION (At the time of 75 days)\n" +
                "Neb mixed urea or DEP (5 KG)\n" +
                "-Scatter and apply to the soil\n" +
                "\nOnion\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1.5-2 KG)\n" +
                "Bumper organic fertilizer (60-80 KG)\n" +
                "Humistar (2-3 KG)\n" +
                "Ratna fertilizer (50 KG)\n" +
                "Gypser (5-7 KG)\n" +
                "Bumper Boron (2 KG)\n" +
                "Meg Fertilizer (5-7 KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 25 days) \n" +
                "TSP / DEP (10 KG)\n" +
                "Neb mixed urea (5 KG. 4 ml neb with urea per KG)\n" +
                "-Sprinkle it and mix it with soil.\n" +
                "2ND TOP APPLICATION (At the time of 50 days) \n" +
                "Neb mixed urea (5 KG. 4 ml neb with urea per KG)\n" +
                "MOP (5 KG)\n" +
                "-Sprinkle it and mix it with soil.\n" +
                "\nGarlic\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1.5-2 KG)\n" +
                "Bumper organic fertilizer (60-80 KG)\n" +
                "Humistar (2-3 KG)\n" +
                "Ratna fertilizer (50 KG)\n" +
                "Gypser (5-7 KG)\n" +
                "Bumper Boron (2 KG)\n" +
                "Meg Fertilizer (5-7 KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 25 days) \n" +
                "TSP / DEP (10 KG)\n" +
                "Neb mixed urea (5 KG. 4 ml neb with urea per KG)\n" +
                "-Sprinkle it and mix it with soil.\n" +
                "2ND TOP APPLICATION (At the time of 50 days) \n" +
                "Neb mixed urea (5 KG. 4 ml neb with urea per KG)\n" +
                "MOP (5 KG)\n" +
                "- Sprinkle it and mix it with soil.\n" +
                "Mustard Plant\n" +
                "(IN LAND PREPARATION / FINAL CULTIVATION)\n" +
                "Fertilizer name and application level\n" +
                "Mono-zinc / hepta-zinc (1-1.5 KG)\n" +
                "\n" +
                "Bumper organic fertilizer (60-80 KG)\n" +
                "Humistar (1-2 KG)\n" +
                "Ratna fertilizer (50 KG)\n" +
                "Gypser (5 KG)\n" +
                "Bumper Boron (2 KG)\n" +
                "Meg Fertilizer (2-3 KG)\n" +
                "Application method\n" +
                "Sprinkle on the last tillage of the land and mix it with soil.\n" +
                "1ST TOP APPLICATION (At the time of 25 days) \n" +
                "TSP or Neb mixed urea (10 KG)\n" +
                "Neb mixed urea (5 KG)\n" +
                "- Sprinkle it and mix it with soil.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Apply to plants\n" +
                "\n" +
                "RICE, WHEAT, CORN, POTATO, ONION, GARLIC\n" +
                "POWER(1gm/30l) -  At the stage of kaichthor( 45-50 days) spray the mixture of 1 gm of power / 30 l of water. \n" +
                "BIOFARTY(3 ml) & VITAMIX(2-3 gm / l) -  Mix 2-3 gm / l of water and 3 ml of biofarty together and spray it 1st time after 35-40 days of seed plantation and on trees after 55-60 days for the proper growth and better productivity of plants.\n" +
                "QUICK POTASH( 5 gm / l) -  If deficiency of potash is observed then mix 5 gm of quick potash in every litre of water and spray it on plants.\n" +
                "FERMITICS/CHELAZINC( 1gm/ l) -  if deficiency of zinc along with other mineral nutrients are seen.\n" +
                "SOLUBORON( 1-2 gm / l) -  If deficiency of boron is seen thn mix 1-2 gm of soluboron with per litre of water and spray it on plants.\n" +
                "\n" +
                "AUBERGINE, TOMATO, CHILI PAPPER, MASTURD PLANT\n" +
                "BUMPER YIELD (3-5 ml/l) - When flowering starts (55-60 days aftere plantig) spray 3-5 ml bumper yield per liter of water for 2 consecutive weeks.\n" +
                "BIOFARTY(3 ml) & VITAMIX(2-3 gm / l) -  Mix 2-3 gm / l of water and 3 ml of biofarty together and spray it 1st time after 35-40 days of seed plantation and on trees after 55-60 days for the proper growth and better productivity of plants.\n" +
                "QUICK POTASH( 5 gm / l) -  If deficiency of potash is observed then mix 5 gm of quick potash in every litre of water and spray it on plants.\n" +
                "FERMITICS/CHELAZINC( 1gm/ l) -  if deficiency of zinc along with other mineral nutrients are seen.\n" +
                "SOLUBORON( 1-2 gm / l) -  If deficiency of boron is seen thn mix 1-2 gm of soluboron with per litre of water and spray it on plants.\n" +
                "CAULIFLOWER\n" +
                "BIOFARTY(3 ml) & VITAMIX(2-3 gm / l) -  Mix 2-3 gm / l of water and 3 ml of biofarty together and spray it 1st time after 35-40 days of seed plantation and on trees after 55-60 days for the proper growth and better productivity of plants.\n" +
                "QUICK POTASH( 5 gm / l) -  If deficiency of potash is observed then mix 5 gm of quick potash in every litre of water and spray it on plants.\n" +
                "FERMITICS/CHELAZINC( 1gm/ l) -  if deficiency of zinc along with other mineral nutrients are seen.\n" +
                "SOLUBORON( 1-2 gm / l) -  If deficiency of boron is seen thn mix 1-2 gm of soluboron with per litre of water and spray it on plants.\n" +
                "\n\nElements and Soil Factor Causing Deficiency\n" +
                "N & K    :Excessive leaching on coarse-textured low organic matter soils\n" +
                "P    :Acid low organic matter soils \n" +
                "S    :Excessive leaching on coarse-textured low organic matter soils in areas where minimal levels of SO2 in the air \n" +
                "Ca & Mg :Excessive leaching on coarse-textured low organic matter soils \n" +
                "Fe    :Poorly drained soils, Low organic matter soils, pH>7.0, Soils high in P\n" +
                "Zn    :Cold wet soils low in organic matter and highly leached, High pH soils (pH>7.0), Soils high in P, Exposed subsoils\n" +
                "Cu    :Peat and muck soils, High pH, sandy soils, Soils heavily fertilized with N\n" +
                "B    :Excessive leaching on coarse-textured low organic matter soils, Soils with pH>7.0\n" +
                "Mn    :Excessive leaching on coarse-textured low organic matter soils, Soil with pH>6.5\n" +
                "Mo    :Soils high in Fe oxides, high adsorption of molybdenum, Soil cropped for a long time\n" +
                "\n" +
                "Deficiency Symptoms – N\n" +
                "•    General chlorosis. \n" +
                "•    Chlorosis progresses from light green to yellow. \n" +
                "•    Entire plant becomes yellow under prolonged stress. \n" +
                "•    Growth is immediately restricted, and plants soon become spindly and drop older leaves. \n" +
                "Remedy: Apply 15 kg urea per bigha (33%).  In addition, mix 2-3 grams of Vitaminix per liter of water and spray.\n" +
                "Deficiency Symptoms – P\n" +
                "•    Leaves appear dull, dark green, blue green, or red-purple, especially on the underside, and especially at the midrib and vein.\n" +
                "•    Petioles may also exhibit purpling. Restriction in growth may be noticed.\n" +
                "Remedy: Sprinkle 5 kg DAP per bigha (33%).  In addition, mix 2-3 grams of Vitaminix per liter of water and spray.\n" +
                "Deficiency Symptoms – K\n" +
                "•    Leaf margins tanned, scorched, or have necrotic spots (may be small black spots which later coalesce). \n" +
                "•    Margins become brown and cup downward.\n" +
                "•     Growth is restricted and die back may occur.\n" +
                "•     Mild symptoms appear first on recently matured leaves.\n" +
                "Remedy: If there is water in the field, take it out and mix 5 grams of quick potash per liter of water and spray.\n" +
                "\n" +
                "Deficiency Symptoms – Ca\n" +
                "•    Growing points usually damaged or dead (die back). \n" +
                "•    Margins of leaves developing from the growing point are first to turn brown. \n" +
                "Remedy: Sprinkle 5 kg per bigha of zip fertilizer and apply on top.\n" +
                "\n" +
                "Deficiency Symptoms – Mg\n" +
                "•    Marginal chlorosis or chlorotic blotches which later merge. \n" +
                "•    Leaves show yellow chlorotic interveinal tissue on some species, reddish purple progressing to necrosis on others. \n" +
                "•    Younger leaves affected with continued stress. \n" +
                "•    Chlorotic areas may become necrotic, brittle, and curl upward. \n" +
                "•    Symptoms usually occur late in the growing season.\n" +
                "Remedy: Mag fertilizer per bigha (33 percent)  Apply 2-3 kg top or spray maggold mixed in 13-15 g per liter of water.\n" +
                "Deficiency Symptoms – S\n" +
                "•    Leaves uniformly light green, followed by yellowing and poor spindly growth. \n" +
                "•    Uniform chlorosis does not occur \n" +
                "Remedy:  Mix 2-3 grams of Vitaminix per liter of water and spray.\n" +
                "Deficiency Symptoms – B\n" +
                "•    Young, expanding leaves may be necrotic or distorted followed by death of growing points.\n" +
                "•    Internodes may be short, especially at shoot terminals. \n" +
                "•    Stems may be rough, cracked, or split along the vascular bundles.\n" +
                "Remedy: Spray bumper salubaron by mixing 1-2 grams per liter.\n" +
                "Deficiency Symptoms – Cu\n" +
                "•    Leaves wilt, become chlorotic, then necrotic.\n" +
                "•    Wilting and necrosis are not dominant symptoms. \n" +
                "Remedy: Spray bumper fertimix mixed in 0.5-1.0 gm per liter of water.\n" +
                "Deficiency Symptoms – Fe\n" +
                "•    Distinct yellow or white areas appear between veins, and veins eventually become chlorotic. \n" +
                "•    Symptoms are rare on mature leaves. \n" +
                "Remedy: Spray bumper fertimix mixed in 0.5-1.0 gm per liter of water.\n" +
                "Deficiency Symptoms – Mn\n" +
                "•    Chlorosis is less marked near veins. \n" +
                "•    Some mottling occurs in interveinal areas.\n" +
                "•    Chlorotic areas eventually become brown, transparent, or necrotic.\n" +
                "•    Symptoms may appear later on older leaves.\n" +
                "Remedy: Spray bumper fertimix mixed in 0.5-1.0 gm per liter of water.\n" +
                "Deficiency Symptoms – Zn\n" +
                "•    Leaves may be abnormally small and necrotic. \n" +
                "•    Internodes are shortened.\n" +
                "Remedy: Mix 1 gram of Chelazinc per liter of water and spray.\n");

    }
}