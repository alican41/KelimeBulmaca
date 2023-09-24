package com.alicandogru.kelimebirletirme;


import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class MainActivity<i> extends AppCompatActivity {
    ImageView[] imageViews = new ImageView[49];
    String kelime="",satir;
    private Rect rect1, rect2,rect3,rectz1,rectz2,rectz3,rectz4,rectz5,rectz6,rectz7,rectz8,
            newRect1,newRect2,newRect3,newRect4,newRect5,newRect6,newRect7,newRect8,newRect9,
            newRect10,newRect11,newRect12,newRect13,newRect14,newRect15,newRect16,newRect17,
            newRect18,newRect19,newRect20,newRect21,newRect22,newRect23,newRect24,newRect25,
            newRect26,newRect27,newRect28,newRect29,newRect30,newRect31,newRect32,newRect33,
            newRect34,newRect35,newRect36,newRect37,newRect38,newRect39,newRect40,newRect41,
            newRect42,newRect43,newRect44,newRect45,newRect46,newRect47,newRect48,newRect49,
            newRect50,newRect51,newRect52,newRect53,newRect54,newRect55,newRect56,newRect57,
            newRect58,newRect59,newRect60,newRect61,newRect62,newRect63,newRect64,newRect65,
            newRect66,newRect67,newRect68,newRect69,newRect70,newRect71,newRect72,newRect73,
            newRect74,newRect75,newRect76,newRect77,newRect78,newRect79,newRect80,newRect81,
            newRect82,newRect83,newRect84,newRect85,newRect86,newRect87,newRect88,newRect89,
            newRect90,newRect91,newRect92,newRect93,newRect94,newRect95,newRect96,newRect97,
            newRect98,newRect99,newRect100,newRect101,newRect102,newRect103;
    private ImageView imageView1, imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,
            imageView9,imageView10,imageView11,imageView12,imageView13,imageView14,imageView15,imageView16,
            imageView17,imageView18,imageView19,imageView20,imageView21,imageView22,imageView23,imageView24,
            zemin1,zemin2,zemin3,zemin4,zemin5,zemin6,zemin7,zemin8;
    private CountDownTimer timer,timer2,timer3,timer4,timer5,timer6,timer7,timer8,timer9,timer10,timer11,timer12,
            timer13,timer14,timer15,timer16,timer17,timer18,timer19,timer20,timer21,timer22,timer23,timer24,timer25,
            timer26,timer27,timer28,timer29,timer30,timer31,timer32,timer33,timer34,timer35,timer36,timer37,timer38,
            timer39,timer40,timer41,timer42,timer43,timer44,timer45,timer46,timer47,timer48,timer49,timer50,timer51,timer52;
    int sesliharfler[] = {R.drawable.letter_a,R.drawable.letter_e,R.drawable.letter_i,R.drawable.letter_ii,
            R.drawable.letter_o,R.drawable.letter_oo,R.drawable.letter_u,R.drawable.letter_uu};
    int sessizharfler[] = {R.drawable.letter_b,R.drawable.letter_c,R.drawable.letter_cc,R.drawable.letter_d,
            R.drawable.letter_f,R.drawable.letter_g,R.drawable.letter_gg,R.drawable.letter_h,
            R.drawable.letter_j,R.drawable.letter_k,R.drawable.letter_l,R.drawable.letter_m,
            R.drawable.letter_n,R.drawable.letter_p,R.drawable.letter_r,R.drawable.letter_s,
            R.drawable.letter_ss,R.drawable.letter_t,R.drawable.letter_v,R.drawable.letter_y,
            R.drawable.letter_z};
    int buzluharfler[] = {R.drawable.buza,R.drawable.buze};
    GridLayout gridLayout;
    int rastgeleSayi1,rastgeleSayi2,rastgeleSayi3,rastgeleSayi4,rastgeleSayi5,rastgeleSayi6,
        rastgeleSayi7,rastgeleSayi8,rastgeleSayi9,rastgeleSayi10,rastgeleSayi11,rastgeleSayi12,
        rastgeleSayi13,rastgeleSayi14,rastgeleSayi15,rastgeleSayi16,rastgeleSayi17,rastgeleSayi18,
        rastgeleSayi19,rastgeleSayi20,rastgeleSayi21,rastgeleSayi22,rastgeleSayi23,rastgeleSayi24,
        rastgeleSayi25,rastgeleSayi26,rastgeleSayi27,rastgeleSayi28,rastgeleSayi29,rastgeleSayi30,
        rastgeleSayi31,rastgeleSayi32,rastgeleSayi33,rastgeleSayi34,rastgeleSayi35,rastgeleSayi36,
        rastgeleSayi37,rastgeleSayi38,rastgeleSayi39,rastgeleSayi40,rastgeleSayi41,rastgeleSayi42,
        rastgeleSayi43,rastgeleSayi44,rastgeleSayi45,rastgeleSayi46,rastgeleSayi47,rastgeleSayi48,
        rastgeleSayi49,rastgeleSayi50,rastgeleSayi51,rastgeleSayi52,rastgeleSayi53,rastgeleSayi54,
        rastgeleSayi55,rastgeleSayi56,rastgeleSayi57,rastgeleSayi58,rastgeleSayi59,rastgeleSayi60,
        rastgeleSayi61,rastgeleSayi62,rastgeleSayi63,rastgeleSayi64,rastgeleSayi65,rastgeleSayi66,
        rastgeleSayi67,rastgeleSayi68,rastgeleSayi69,rastgeleSayi70,rastgeleSayi71,rastgeleSayi72,rastgeleSayi73;
    int resimID1,resimID2,resimID3,resimID4,resimID5,resimID6,resimID7,resimID8,resimID9,resimID10,
        resimID11,resimID12,resimID13,resimID14,resimID15,resimID16,resimID17,resimID18,resimID19,
        resimID20,resimID21,resimID22,resimID23,resimID24,resimID25,resimID26,resimID27,resimID28,
        resimID29,resimID30,resimID31,resimID32,resimID33,resimID34,resimID35,resimID36,resimID37,
        resimID38,resimID39,resimID40,resimID41,resimID42,resimID43,resimID44,resimID45,resimID46,
        resimID47,resimID48,resimID49,resimID50,resimID51,resimID52,resimID53,resimID54,resimID55,
        resimID56,resimID57,resimID58,resimID59,resimID60,resimID61,resimID62,resimID63,resimID64,
        resimID65,resimID66,resimID67,resimID68,resimID69,resimID70,resimID71,resimID72,resimID73;
    boolean dongu=false,dongu2=false,dongu3=false,dongu4=false,dongu5=false,dongu6=false,dongu7=false,
            dongu8=false,dongu9=false,dongu10=false,dongu11=false;
    int sayacA=0,sayacE=0;
    TextView metin,skor;
    Button silme,kontrol;
    String line;
    List<String> kelimeler = new ArrayList<>();
    int anlikPuan=0,toplamPuan=0;
    boolean resim1=false,resim2=false,resim3=false,resim4=false,resim5=false,resim6=false,resim7=false,
            resim8=false,resim9=false,resim10=false,resim11=false,resim12=false,resim13=false,resim14=false,
            resim15=false,resim16=false,resim17=false,resim18=false,resim19=false,resim20=false,resim21=false,
            resim22=false,resim23=false,resim24=false,resim25=false,resim26=false,resim27=false,resim28=false,
            resim29=false,resim30=false,resim31=false,resim32=false,resim33=false,resim34=false,resim35=false,
            resim36=false,resim37=false,resim38=false,resim39=false,resim40=false,resim41=false,resim42=false,
            resim43=false,resim44=false,resim45=false,resim46=false,resim47=false,resim48=false,resim49=false,
            resim50=false,resim51=false,resim52=false,resim53=false,resim54=false,resim55=false,resim56=false,
            resim57=false,resim58=false,resim59=false,resim60=false,resim61=false,resim62=false,resim63=false,
            resim64=false,resim65=false,resim66=false,resim67=false,resim68=false,resim69=false,resim70=false,
            resim71=false,resim72=false,resim73=false;
    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<Integer> scores2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent2= getIntent();
        scores2 = intent2.getIntegerArrayListExtra("top10");
        if(scores2 != null){
            scores.addAll(scores2);
        }

        scores.add(0);
        scores.add(0);
        scores.add(0);
        scores.add(0);
        scores.add(0);
        scores.add(0);
        scores.add(0);
        scores.add(0);
        scores.add(0);
        scores.add(0);

        InputStream inputStream = this.getResources().openRawResource(R.raw.kelime2);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            // okuma işlemi yap
            kelimeler.add(line);
        }


        gridLayout = findViewById(R.id.gridLayout);

        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);
        imageView24 = findViewById(R.id.imageView24);
        imageViews[0] = findViewById(R.id.imageView25);
        imageViews[1] = findViewById(R.id.imageView26);
        imageViews[2] = findViewById(R.id.imageView27);
        imageViews[3] = findViewById(R.id.imageView28);
        imageViews[4] = findViewById(R.id.imageView29);
        imageViews[5] = findViewById(R.id.imageView30);
        imageViews[6] = findViewById(R.id.imageView31);
        imageViews[7] = findViewById(R.id.imageView32);
        imageViews[8] = findViewById(R.id.imageView33);
        imageViews[9] = findViewById(R.id.imageView34);
        imageViews[10] = findViewById(R.id.imageView35);
        imageViews[11] = findViewById(R.id.imageView36);
        imageViews[12] = findViewById(R.id.imageView37);
        imageViews[13] = findViewById(R.id.imageView38);
        imageViews[14] = findViewById(R.id.imageView39);
        imageViews[15] = findViewById(R.id.imageView40);
        imageViews[16] = findViewById(R.id.imageView41);
        imageViews[17] = findViewById(R.id.imageView42);
        imageViews[18] = findViewById(R.id.imageView43);
        imageViews[19] = findViewById(R.id.imageView44);
        imageViews[20] = findViewById(R.id.imageView45);
        imageViews[21] = findViewById(R.id.imageView46);
        imageViews[22] = findViewById(R.id.imageView47);
        imageViews[23] = findViewById(R.id.imageView48);
        imageViews[24] = findViewById(R.id.imageView49);
        imageViews[25] = findViewById(R.id.imageView50);
        imageViews[26] = findViewById(R.id.imageView51);
        imageViews[27] = findViewById(R.id.imageView52);
        imageViews[28] = findViewById(R.id.imageView53);
        imageViews[29] = findViewById(R.id.imageView54);
        imageViews[30] = findViewById(R.id.imageView55);
        imageViews[31] = findViewById(R.id.imageView56);
        imageViews[32] = findViewById(R.id.imageView57);
        imageViews[33] = findViewById(R.id.imageView58);
        imageViews[34] = findViewById(R.id.imageView59);
        imageViews[35] = findViewById(R.id.imageView60);
        imageViews[36] = findViewById(R.id.imageView61);
        imageViews[37] = findViewById(R.id.imageView62);
        imageViews[38] = findViewById(R.id.imageView63);
        imageViews[39] = findViewById(R.id.imageView64);
        imageViews[40] = findViewById(R.id.imageView65);
        imageViews[41] = findViewById(R.id.imageView66);
        imageViews[42] = findViewById(R.id.imageView67);
        imageViews[43] = findViewById(R.id.imageView68);
        imageViews[44] = findViewById(R.id.imageView69);
        imageViews[45] = findViewById(R.id.imageView70);
        imageViews[46] = findViewById(R.id.imageView71);
        imageViews[47] = findViewById(R.id.imageView72);
        imageViews[48] = findViewById(R.id.imageView73);
        zemin1 = findViewById(R.id.zemin1);
        zemin2 = findViewById(R.id.zemin2);
        zemin3 = findViewById(R.id.zemin3);
        zemin4 = findViewById(R.id.zemin4);
        zemin5 = findViewById(R.id.zemin5);
        zemin6 = findViewById(R.id.zemin6);
        zemin7 = findViewById(R.id.zemin7);
        zemin8 = findViewById(R.id.zemin8);
        metin = findViewById(R.id.metin);
        skor = findViewById(R.id.skor);
        silme = findViewById(R.id.silmeButonu);
        kontrol = findViewById(R.id.kontrolButonu);

        skor.setText("      " + toplamPuan);
// Rastgele bir sayı üretin ve bu sayıyı kullanarak resimleri seçin
        Random rastgele = new Random();
        rastgeleSayi1 = rastgele.nextInt(sessizharfler.length);
        resimID1 = sessizharfler[rastgeleSayi1];
        rastgeleSayi2 = rastgele.nextInt(sesliharfler.length);
        resimID2 = sesliharfler[rastgeleSayi2];
        rastgeleSayi3 = rastgele.nextInt(sessizharfler.length);
        resimID3 = sessizharfler[rastgeleSayi3];
        rastgeleSayi4 = rastgele.nextInt(sesliharfler.length);
        resimID4 = sesliharfler[rastgeleSayi4];
        rastgeleSayi5 = rastgele.nextInt(sessizharfler.length);
        resimID5 = sessizharfler[rastgeleSayi5];
        rastgeleSayi6 = rastgele.nextInt(sesliharfler.length);
        resimID6 = sesliharfler[rastgeleSayi6];
        rastgeleSayi7 = rastgele.nextInt(sessizharfler.length);
        resimID7 = sessizharfler[rastgeleSayi7];
        rastgeleSayi8 = rastgele.nextInt(sesliharfler.length);
        resimID8 = sesliharfler[rastgeleSayi8];
        rastgeleSayi9 = rastgele.nextInt(sessizharfler.length);
        resimID9 = sessizharfler[rastgeleSayi9];
        rastgeleSayi10 = rastgele.nextInt(sesliharfler.length);
        resimID10 = sesliharfler[rastgeleSayi10];
        rastgeleSayi11 = rastgele.nextInt(sessizharfler.length);
        resimID11 = sessizharfler[rastgeleSayi11];
        rastgeleSayi12 = rastgele.nextInt(sesliharfler.length);
        resimID12 = sesliharfler[rastgeleSayi12];
        rastgeleSayi13 = rastgele.nextInt(sessizharfler.length);
        resimID13 = sessizharfler[rastgeleSayi13];
        rastgeleSayi14 = rastgele.nextInt(sesliharfler.length);
        resimID14 = sesliharfler[rastgeleSayi14];
        rastgeleSayi15 = rastgele.nextInt(sessizharfler.length);
        resimID15 = sessizharfler[rastgeleSayi15];
        rastgeleSayi16 = rastgele.nextInt(sesliharfler.length);
        resimID16 = sesliharfler[rastgeleSayi16];
        rastgeleSayi17 = rastgele.nextInt(sessizharfler.length);
        resimID17 = sessizharfler[rastgeleSayi17];
        rastgeleSayi18 = rastgele.nextInt(sesliharfler.length);
        resimID18 = sesliharfler[rastgeleSayi18];
        rastgeleSayi19 = rastgele.nextInt(sessizharfler.length);
        resimID19 = sessizharfler[rastgeleSayi19];
        rastgeleSayi20 = rastgele.nextInt(sesliharfler.length);
        resimID20 = sesliharfler[rastgeleSayi20];
        rastgeleSayi21 = rastgele.nextInt(sessizharfler.length);
        resimID21 = sessizharfler[rastgeleSayi21];
        rastgeleSayi22 = rastgele.nextInt(sesliharfler.length);
        resimID22 = sesliharfler[rastgeleSayi22];
        rastgeleSayi23 = rastgele.nextInt(sessizharfler.length);
        resimID23 = sessizharfler[rastgeleSayi23];
        rastgeleSayi24 = rastgele.nextInt(sesliharfler.length);
        resimID24 = sesliharfler[rastgeleSayi24];
        rastgeleSayi25 = rastgele.nextInt(sessizharfler.length);
        resimID25 = sessizharfler[rastgeleSayi25];
        rastgeleSayi26 = rastgele.nextInt(sesliharfler.length);
        resimID26 = sesliharfler[rastgeleSayi26];
        rastgeleSayi27 = rastgele.nextInt(sessizharfler.length);
        resimID27 = sessizharfler[rastgeleSayi27];
        rastgeleSayi28 = rastgele.nextInt(buzluharfler.length);
        resimID28 = buzluharfler[rastgeleSayi28];
        rastgeleSayi29 = rastgele.nextInt(sessizharfler.length);
        resimID29 = sessizharfler[rastgeleSayi29];
        rastgeleSayi30 = rastgele.nextInt(sesliharfler.length);
        resimID30 = sesliharfler[rastgeleSayi30];
        rastgeleSayi31 = rastgele.nextInt(sessizharfler.length);
        resimID31 = sessizharfler[rastgeleSayi31];
        rastgeleSayi32 = rastgele.nextInt(sesliharfler.length);
        resimID32 = sesliharfler[rastgeleSayi32];
        rastgeleSayi33 = rastgele.nextInt(sessizharfler.length);
        resimID33 = sessizharfler[rastgeleSayi33];
        rastgeleSayi34 = rastgele.nextInt(buzluharfler.length);
        resimID34 = buzluharfler[rastgeleSayi34];
        rastgeleSayi35 = rastgele.nextInt(sessizharfler.length);
        resimID35 = sessizharfler[rastgeleSayi35];
        rastgeleSayi36 = rastgele.nextInt(sesliharfler.length);
        resimID36 = sesliharfler[rastgeleSayi36];
        rastgeleSayi37 = rastgele.nextInt(sessizharfler.length);
        resimID37 = sessizharfler[rastgeleSayi37];
        rastgeleSayi38 = rastgele.nextInt(sesliharfler.length);
        resimID38 = sesliharfler[rastgeleSayi38];
        rastgeleSayi39 = rastgele.nextInt(sessizharfler.length);
        resimID39 = sessizharfler[rastgeleSayi39];
        rastgeleSayi40 = rastgele.nextInt(sesliharfler.length);
        resimID40 = sesliharfler[rastgeleSayi40];
        rastgeleSayi41 = rastgele.nextInt(sessizharfler.length);
        resimID41 = sessizharfler[rastgeleSayi41];
        rastgeleSayi42 = rastgele.nextInt(sesliharfler.length);
        resimID42 = sesliharfler[rastgeleSayi42];
        rastgeleSayi43 = rastgele.nextInt(sessizharfler.length);
        resimID43 = sessizharfler[rastgeleSayi43];
        rastgeleSayi44 = rastgele.nextInt(sesliharfler.length);
        resimID44 = sesliharfler[rastgeleSayi44];
        rastgeleSayi45 = rastgele.nextInt(sessizharfler.length);
        resimID45 = sessizharfler[rastgeleSayi45];
        rastgeleSayi46 = rastgele.nextInt(sesliharfler.length);
        resimID46 = sesliharfler[rastgeleSayi46];
        rastgeleSayi47 = rastgele.nextInt(sessizharfler.length);
        resimID47 = sessizharfler[rastgeleSayi47];
        rastgeleSayi48 = rastgele.nextInt(sesliharfler.length);
        resimID48 = sesliharfler[rastgeleSayi48];
        rastgeleSayi49 = rastgele.nextInt(sessizharfler.length);
        resimID49 = sessizharfler[rastgeleSayi49];
        rastgeleSayi50 = rastgele.nextInt(sesliharfler.length);
        resimID50 = sesliharfler[rastgeleSayi50];
        rastgeleSayi51 = rastgele.nextInt(sessizharfler.length);
        resimID51 = sessizharfler[rastgeleSayi51];
        rastgeleSayi52 = rastgele.nextInt(sesliharfler.length);
        resimID52 = sesliharfler[rastgeleSayi52];
        rastgeleSayi53 = rastgele.nextInt(sessizharfler.length);
        resimID53 = sessizharfler[rastgeleSayi53];
        rastgeleSayi54 = rastgele.nextInt(sesliharfler.length);
        resimID54 = sesliharfler[rastgeleSayi54];
        rastgeleSayi55 = rastgele.nextInt(sessizharfler.length);
        resimID55 = sessizharfler[rastgeleSayi55];
        rastgeleSayi56 = rastgele.nextInt(sesliharfler.length);
        resimID56 = sesliharfler[rastgeleSayi56];
        rastgeleSayi57 = rastgele.nextInt(sessizharfler.length);
        resimID57 = sessizharfler[rastgeleSayi57];
        rastgeleSayi58 = rastgele.nextInt(sesliharfler.length);
        resimID58 = sesliharfler[rastgeleSayi58];
        rastgeleSayi59 = rastgele.nextInt(sessizharfler.length);
        resimID59 = sessizharfler[rastgeleSayi59];
        rastgeleSayi60 = rastgele.nextInt(sesliharfler.length);
        resimID60 = sesliharfler[rastgeleSayi60];
        rastgeleSayi61 = rastgele.nextInt(sessizharfler.length);
        resimID61 = sessizharfler[rastgeleSayi61];
        rastgeleSayi62 = rastgele.nextInt(sesliharfler.length);
        resimID62 = sesliharfler[rastgeleSayi62];
        rastgeleSayi63 = rastgele.nextInt(sessizharfler.length);
        resimID63 = sessizharfler[rastgeleSayi63];
        rastgeleSayi64 = rastgele.nextInt(sesliharfler.length);
        resimID64 = sesliharfler[rastgeleSayi64];
        rastgeleSayi65 = rastgele.nextInt(sessizharfler.length);
        resimID65 = sessizharfler[rastgeleSayi65];
        rastgeleSayi66 = rastgele.nextInt(sesliharfler.length);
        resimID66 = sesliharfler[rastgeleSayi66];
        rastgeleSayi67 = rastgele.nextInt(sessizharfler.length);
        resimID67 = sessizharfler[rastgeleSayi67];
        rastgeleSayi68 = rastgele.nextInt(sesliharfler.length);
        resimID68 = sesliharfler[rastgeleSayi68];
        rastgeleSayi69 = rastgele.nextInt(sessizharfler.length);
        resimID69 = sessizharfler[rastgeleSayi69];
        rastgeleSayi70 = rastgele.nextInt(sesliharfler.length);
        resimID70 = sesliharfler[rastgeleSayi70];
        rastgeleSayi71 = rastgele.nextInt(sessizharfler.length);
        resimID71 = sessizharfler[rastgeleSayi71];
        rastgeleSayi72 = rastgele.nextInt(sesliharfler.length);
        resimID72 = sesliharfler[rastgeleSayi72];
        rastgeleSayi73 = rastgele.nextInt(sessizharfler.length);
        resimID73 = sessizharfler[rastgeleSayi73];

// Seçilen resmi ImageView öğesine yükleyin
        Drawable drawable1 = getResources().getDrawable(resimID1);
        imageView1.setImageDrawable(drawable1);
        Drawable drawable2 = getResources().getDrawable(resimID2);
        imageView2.setImageDrawable(drawable2);
        Drawable drawable3 = getResources().getDrawable(resimID3);
        imageView3.setImageDrawable(drawable3);
        Drawable drawable4 = getResources().getDrawable(resimID4);
        imageView4.setImageDrawable(drawable4);
        Drawable drawable5 = getResources().getDrawable(resimID5);
        imageView5.setImageDrawable(drawable5);
        Drawable drawable6 = getResources().getDrawable(resimID6);
        imageView6.setImageDrawable(drawable6);
        Drawable drawable7 = getResources().getDrawable(resimID7);
        imageView7.setImageDrawable(drawable7);
        Drawable drawable8 = getResources().getDrawable(resimID8);
        imageView8.setImageDrawable(drawable8);
        Drawable drawable9 = getResources().getDrawable(resimID9);
        imageView9.setImageDrawable(drawable9);
        Drawable drawable10 = getResources().getDrawable(resimID10);
        imageView10.setImageDrawable(drawable10);
        Drawable drawable11 = getResources().getDrawable(resimID11);
        imageView11.setImageDrawable(drawable11);
        Drawable drawable12 = getResources().getDrawable(resimID12);
        imageView12.setImageDrawable(drawable12);
        Drawable drawable13 = getResources().getDrawable(resimID13);
        imageView13.setImageDrawable(drawable13);
        Drawable drawable14 = getResources().getDrawable(resimID14);
        imageView14.setImageDrawable(drawable14);
        Drawable drawable15 = getResources().getDrawable(resimID15);
        imageView15.setImageDrawable(drawable15);
        Drawable drawable16 = getResources().getDrawable(resimID16);
        imageView16.setImageDrawable(drawable16);
        Drawable drawable17 = getResources().getDrawable(resimID17);
        imageView17.setImageDrawable(drawable17);
        Drawable drawable18 = getResources().getDrawable(resimID18);
        imageView18.setImageDrawable(drawable18);
        Drawable drawable19 = getResources().getDrawable(resimID19);
        imageView19.setImageDrawable(drawable19);
        Drawable drawable20 = getResources().getDrawable(resimID20);
        imageView20.setImageDrawable(drawable20);
        Drawable drawable21 = getResources().getDrawable(resimID21);
        imageView21.setImageDrawable(drawable21);
        Drawable drawable22 = getResources().getDrawable(resimID22);
        imageView22.setImageDrawable(drawable22);
        Drawable drawable23 = getResources().getDrawable(resimID23);
        imageView23.setImageDrawable(drawable23);
        Drawable drawable24 = getResources().getDrawable(resimID24);
        imageView24.setImageDrawable(drawable24);
        Drawable drawable25 = getResources().getDrawable(resimID25);
        imageViews[0].setImageDrawable(drawable25);
        Drawable drawable26 = getResources().getDrawable(resimID26);
        imageViews[1].setImageDrawable(drawable26);
        Drawable drawable27 = getResources().getDrawable(resimID27);
        imageViews[2].setImageDrawable(drawable27);
        Drawable drawable28 = getResources().getDrawable(resimID28);
        imageViews[3].setImageDrawable(drawable28);
        Drawable drawable29 = getResources().getDrawable(resimID29);
        imageViews[4].setImageDrawable(drawable29);
        Drawable drawable30 = getResources().getDrawable(resimID30);
        imageViews[5].setImageDrawable(drawable30);
        Drawable drawable31 = getResources().getDrawable(resimID31);
        imageViews[6].setImageDrawable(drawable31);
        Drawable drawable32 = getResources().getDrawable(resimID32);
        imageViews[7].setImageDrawable(drawable32);
        Drawable drawable33 = getResources().getDrawable(resimID33);
        imageViews[8].setImageDrawable(drawable33);
        Drawable drawable34 = getResources().getDrawable(resimID34);
        imageViews[9].setImageDrawable(drawable34);
        Drawable drawable35 = getResources().getDrawable(resimID35);
        imageViews[10].setImageDrawable(drawable35);
        Drawable drawable36 = getResources().getDrawable(resimID36);
        imageViews[11].setImageDrawable(drawable36);
        Drawable drawable37 = getResources().getDrawable(resimID37);
        imageViews[12].setImageDrawable(drawable37);
        Drawable drawable38 = getResources().getDrawable(resimID38);
        imageViews[13].setImageDrawable(drawable38);
        Drawable drawable39 = getResources().getDrawable(resimID39);
        imageViews[14].setImageDrawable(drawable39);
        Drawable drawable40 = getResources().getDrawable(resimID40);
        imageViews[15].setImageDrawable(drawable40);
        Drawable drawable41 = getResources().getDrawable(resimID41);
        imageViews[16].setImageDrawable(drawable41);
        Drawable drawable42 = getResources().getDrawable(resimID42);
        imageViews[17].setImageDrawable(drawable42);
        Drawable drawable43 = getResources().getDrawable(resimID43);
        imageViews[18].setImageDrawable(drawable43);
        Drawable drawable44 = getResources().getDrawable(resimID44);
        imageViews[19].setImageDrawable(drawable44);
        Drawable drawable45 = getResources().getDrawable(resimID45);
        imageViews[20].setImageDrawable(drawable45);
        Drawable drawable46 = getResources().getDrawable(resimID46);
        imageViews[21].setImageDrawable(drawable46);
        Drawable drawable47 = getResources().getDrawable(resimID47);
        imageViews[22].setImageDrawable(drawable47);
        Drawable drawable48 = getResources().getDrawable(resimID48);
        imageViews[23].setImageDrawable(drawable48);
        Drawable drawable49 = getResources().getDrawable(resimID49);
        imageViews[24].setImageDrawable(drawable49);
        Drawable drawable50 = getResources().getDrawable(resimID50);
        imageViews[25].setImageDrawable(drawable50);
        Drawable drawable51 = getResources().getDrawable(resimID51);
        imageViews[26].setImageDrawable(drawable51);
        Drawable drawable52 = getResources().getDrawable(resimID52);
        imageViews[27].setImageDrawable(drawable52);
        Drawable drawable53 = getResources().getDrawable(resimID53);
        imageViews[28].setImageDrawable(drawable53);
        Drawable drawable54 = getResources().getDrawable(resimID54);
        imageViews[29].setImageDrawable(drawable54);
        Drawable drawable55 = getResources().getDrawable(resimID55);
        imageViews[30].setImageDrawable(drawable55);
        Drawable drawable56 = getResources().getDrawable(resimID56);
        imageViews[31].setImageDrawable(drawable56);
        Drawable drawable57 = getResources().getDrawable(resimID57);
        imageViews[32].setImageDrawable(drawable57);
        Drawable drawable58 = getResources().getDrawable(resimID58);
        imageViews[33].setImageDrawable(drawable58);
        Drawable drawable59 = getResources().getDrawable(resimID59);
        imageViews[34].setImageDrawable(drawable59);
        Drawable drawable60 = getResources().getDrawable(resimID60);
        imageViews[35].setImageDrawable(drawable60);
        Drawable drawable61 = getResources().getDrawable(resimID61);
        imageViews[36].setImageDrawable(drawable61);
        Drawable drawable62 = getResources().getDrawable(resimID62);
        imageViews[37].setImageDrawable(drawable62);
        Drawable drawable63 = getResources().getDrawable(resimID63);
        imageViews[38].setImageDrawable(drawable63);
        Drawable drawable64 = getResources().getDrawable(resimID64);
        imageViews[39].setImageDrawable(drawable64);
        Drawable drawable65 = getResources().getDrawable(resimID65);
        imageViews[40].setImageDrawable(drawable65);
        Drawable drawable66 = getResources().getDrawable(resimID66);
        imageViews[41].setImageDrawable(drawable66);
        Drawable drawable67 = getResources().getDrawable(resimID67);
        imageViews[42].setImageDrawable(drawable67);
        Drawable drawable68 = getResources().getDrawable(resimID68);
        imageViews[43].setImageDrawable(drawable68);
        Drawable drawable69 = getResources().getDrawable(resimID69);
        imageViews[44].setImageDrawable(drawable69);
        Drawable drawable70 = getResources().getDrawable(resimID70);
        imageViews[45].setImageDrawable(drawable70);
        Drawable drawable71 = getResources().getDrawable(resimID71);
        imageViews[46].setImageDrawable(drawable71);
        Drawable drawable72 = getResources().getDrawable(resimID72);
        imageViews[47].setImageDrawable(drawable72);
        Drawable drawable73 = getResources().getDrawable(resimID73);
        imageViews[48].setImageDrawable(drawable73);
        imageView9.setVisibility(View.INVISIBLE);
        imageView10.setVisibility(View.INVISIBLE);
        imageView11.setVisibility(View.INVISIBLE);
        imageView12.setVisibility(View.INVISIBLE);
        imageView13.setVisibility(View.INVISIBLE);
        imageView14.setVisibility(View.INVISIBLE);
        imageView15.setVisibility(View.INVISIBLE);
        imageView16.setVisibility(View.INVISIBLE);
        imageView17.setVisibility(View.INVISIBLE);
        imageView18.setVisibility(View.INVISIBLE);
        imageView19.setVisibility(View.INVISIBLE);
        imageView20.setVisibility(View.INVISIBLE);
        imageView21.setVisibility(View.INVISIBLE);
        imageView22.setVisibility(View.INVISIBLE);
        imageView23.setVisibility(View.INVISIBLE);
        imageView24.setVisibility(View.INVISIBLE);
        imageViews[0].setVisibility(View.INVISIBLE);
        imageViews[1].setVisibility(View.INVISIBLE);
        imageViews[2].setVisibility(View.INVISIBLE);
        imageViews[3].setVisibility(View.INVISIBLE);
        imageViews[4].setVisibility(View.INVISIBLE);
        imageViews[5].setVisibility(View.INVISIBLE);
        imageViews[6].setVisibility(View.INVISIBLE);
        imageViews[7].setVisibility(View.INVISIBLE);
        imageViews[8].setVisibility(View.INVISIBLE);
        imageViews[9].setVisibility(View.INVISIBLE);
        imageViews[10].setVisibility(View.INVISIBLE);
        imageViews[11].setVisibility(View.INVISIBLE);
        imageViews[12].setVisibility(View.INVISIBLE);
        imageViews[13].setVisibility(View.INVISIBLE);
        imageViews[14].setVisibility(View.INVISIBLE);
        imageViews[15].setVisibility(View.INVISIBLE);
        imageViews[16].setVisibility(View.INVISIBLE);
        imageViews[17].setVisibility(View.INVISIBLE);
        imageViews[18].setVisibility(View.INVISIBLE);
        imageViews[19].setVisibility(View.INVISIBLE);
        imageViews[20].setVisibility(View.INVISIBLE);
        imageViews[21].setVisibility(View.INVISIBLE);
        imageViews[22].setVisibility(View.INVISIBLE);
        imageViews[23].setVisibility(View.INVISIBLE);
        imageViews[24].setVisibility(View.INVISIBLE);
        imageViews[25].setVisibility(View.INVISIBLE);
        imageViews[26].setVisibility(View.INVISIBLE);
        imageViews[27].setVisibility(View.INVISIBLE);
        imageViews[28].setVisibility(View.INVISIBLE);
        imageViews[29].setVisibility(View.INVISIBLE);
        imageViews[30].setVisibility(View.INVISIBLE);
        imageViews[31].setVisibility(View.INVISIBLE);
        imageViews[32].setVisibility(View.INVISIBLE);
        imageViews[33].setVisibility(View.INVISIBLE);
        imageViews[34].setVisibility(View.INVISIBLE);
        imageViews[35].setVisibility(View.INVISIBLE);
        imageViews[36].setVisibility(View.INVISIBLE);
        imageViews[37].setVisibility(View.INVISIBLE);
        imageViews[38].setVisibility(View.INVISIBLE);
        imageViews[39].setVisibility(View.INVISIBLE);
        imageViews[40].setVisibility(View.INVISIBLE);
        imageViews[41].setVisibility(View.INVISIBLE);
        imageViews[42].setVisibility(View.INVISIBLE);
        imageViews[43].setVisibility(View.INVISIBLE);
        imageViews[44].setVisibility(View.INVISIBLE);
        imageViews[45].setVisibility(View.INVISIBLE);
        imageViews[46].setVisibility(View.INVISIBLE);
        imageViews[47].setVisibility(View.INVISIBLE);
        imageViews[48].setVisibility(View.INVISIBLE);

        ilkDongu();
        sessizharf(imageView1,rastgeleSayi1);
        sesliharf(imageView2,rastgeleSayi2);
        sessizharf(imageView3,rastgeleSayi3);
        sesliharf(imageView4,rastgeleSayi4);
        sessizharf(imageView5,rastgeleSayi5);
        sesliharf(imageView6,rastgeleSayi6);
        sessizharf(imageView7,rastgeleSayi7);
        sesliharf(imageView8,rastgeleSayi8);
        sessizharf(imageView9,rastgeleSayi9);
        sesliharf(imageView10,rastgeleSayi10);
        sessizharf(imageView11,rastgeleSayi11);
        sesliharf(imageView12,rastgeleSayi12);
        sessizharf(imageView13,rastgeleSayi13);
        sesliharf(imageView14,rastgeleSayi14);
        sessizharf(imageView15,rastgeleSayi15);
        sesliharf(imageView16,rastgeleSayi16);
        sessizharf(imageView17,rastgeleSayi17);
        sesliharf(imageView18,rastgeleSayi18);
        sessizharf(imageView19,rastgeleSayi19);
        sesliharf(imageView20,rastgeleSayi20);
        sessizharf(imageView21,rastgeleSayi21);
        sesliharf(imageView22,rastgeleSayi22);
        sessizharf(imageView23,rastgeleSayi23);
        sesliharf(imageView24,rastgeleSayi24);
        sessizharf(imageViews[0],rastgeleSayi25);
        sesliharf(imageViews[1],rastgeleSayi26);
        sessizharf(imageViews[2],rastgeleSayi27);
        buzluharf(imageViews[3],rastgeleSayi28);
        sessizharf(imageViews[4],rastgeleSayi29);
        sesliharf(imageViews[5],rastgeleSayi30);
        sessizharf(imageViews[6],rastgeleSayi31);
        sesliharf(imageViews[7],rastgeleSayi32);
        sessizharf(imageViews[8],rastgeleSayi33);
        buzluharf(imageViews[9],rastgeleSayi34);
        sessizharf(imageViews[10],rastgeleSayi35);
        sesliharf(imageViews[11],rastgeleSayi36);
        sessizharf(imageViews[12],rastgeleSayi37);
        sesliharf(imageViews[13],rastgeleSayi38);
        sessizharf(imageViews[14],rastgeleSayi39);
        sesliharf(imageViews[15],rastgeleSayi40);
        sessizharf(imageViews[16],rastgeleSayi41);
        sesliharf(imageViews[17],rastgeleSayi42);
        sessizharf(imageViews[18],rastgeleSayi43);
        sesliharf(imageViews[19],rastgeleSayi44);
        sessizharf(imageViews[20],rastgeleSayi45);
        sesliharf(imageViews[21],rastgeleSayi46);
        sessizharf(imageViews[22],rastgeleSayi47);
        sesliharf(imageViews[23],rastgeleSayi48);
        sessizharf(imageViews[24],rastgeleSayi49);
        sesliharf(imageViews[25],rastgeleSayi50);
        sessizharf(imageViews[26],rastgeleSayi51);
        sesliharf(imageViews[27],rastgeleSayi52);
        sessizharf(imageViews[28],rastgeleSayi53);
        sesliharf(imageViews[29],rastgeleSayi54);
        sessizharf(imageViews[30],rastgeleSayi55);
        sesliharf(imageViews[31],rastgeleSayi56);
        sessizharf(imageViews[32],rastgeleSayi57);
        sesliharf(imageViews[33],rastgeleSayi58);
        sessizharf(imageViews[34],rastgeleSayi59);
        sesliharf(imageViews[35],rastgeleSayi60);
        sessizharf(imageViews[36],rastgeleSayi61);
        sesliharf(imageViews[37],rastgeleSayi62);
        sessizharf(imageViews[38],rastgeleSayi63);
        sesliharf(imageViews[39],rastgeleSayi64);
        sessizharf(imageViews[40],rastgeleSayi65);
        sesliharf(imageViews[41],rastgeleSayi66);
        sessizharf(imageViews[42],rastgeleSayi67);
        sesliharf(imageViews[43],rastgeleSayi68);
        sessizharf(imageViews[44],rastgeleSayi69);
        sesliharf(imageViews[45],rastgeleSayi70);
        sessizharf(imageViews[46],rastgeleSayi71);
        sesliharf(imageViews[47],rastgeleSayi72);
        sessizharf(imageViews[48],rastgeleSayi73);
        silmeButonu();
        kontrolButonu();

    }
public void silmeButonu(){
        silme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kelime = "";
                metin.setText(kelime);
                anlikPuan=0;
                resim1=false;resim2=false;resim3=false;resim4=false;resim5=false;
                resim6=false;resim7=false;resim8=false;resim9=false;resim10=false;
                resim11=false;resim12=false;resim13=false;resim14=false;resim15=false;
                resim16=false;resim17=false;resim18=false;resim19=false;resim20=false;
                resim21=false;resim22=false;resim23=false;resim24=false;resim25=false;
                resim26=false;resim27=false;resim28=false;resim29=false;resim30=false;
                resim31=false;resim32=false;resim33=false;resim34=false;resim35=false;
                resim36=false;resim37=false;resim38=false;resim39=false;resim40=false;
                resim41=false;resim42=false;resim43=false;resim44=false;resim45=false;
                resim46=false;resim47=false;resim48=false;resim49=false;resim50=false;
                resim51=false;resim52=false;resim53=false;resim54=false;resim55=false;
                resim56=false;resim57=false;resim58=false;resim59=false;resim60=false;
                resim61=false;resim62=false;resim63=false;resim64=false;resim65=false;
                resim66=false;resim67=false;resim68=false;resim69=false;resim70=false;
                resim71=false;resim72=false;resim73=false;
            }
        });


}
public void kontrolButonu(){
        kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kelimeler.contains(metin.getText())){
                    toplamPuan = toplamPuan + anlikPuan;
                    skor.setText("      "+toplamPuan);
                    anlikPuan =0;
                    kelime="";
                    metin.setText(kelime);
                    if(resim1){imageView1.setVisibility(View.INVISIBLE);}
                    if(resim2){imageView2.setVisibility(View.INVISIBLE);}
                    if(resim3){imageView3.setVisibility(View.INVISIBLE);}
                    if(resim4){imageView4.setVisibility(View.INVISIBLE);}
                    if(resim5){imageView5.setVisibility(View.INVISIBLE);}
                    if(resim6){imageView6.setVisibility(View.INVISIBLE);}
                    if(resim7){imageView7.setVisibility(View.INVISIBLE);}
                    if(resim8){imageView8.setVisibility(View.INVISIBLE);}
                    if(resim9){imageView9.setVisibility(View.INVISIBLE);}
                    if(resim10){imageView10.setVisibility(View.INVISIBLE);}
                    if(resim11){imageView11.setVisibility(View.INVISIBLE);}
                    if(resim12){imageView12.setVisibility(View.INVISIBLE);}
                    if(resim13){imageView13.setVisibility(View.INVISIBLE);}
                    if(resim14){imageView14.setVisibility(View.INVISIBLE);}
                    if(resim15){imageView15.setVisibility(View.INVISIBLE);}
                    if(resim16){imageView16.setVisibility(View.INVISIBLE);}
                    if(resim17){imageView17.setVisibility(View.INVISIBLE);}
                    if(resim18){imageView18.setVisibility(View.INVISIBLE);}
                    if(resim19){imageView19.setVisibility(View.INVISIBLE);}
                    if(resim20){imageView20.setVisibility(View.INVISIBLE);}
                    if(resim21){imageView21.setVisibility(View.INVISIBLE);}
                    if(resim22){imageView22.setVisibility(View.INVISIBLE);}
                    if(resim23){imageView23.setVisibility(View.INVISIBLE);}
                    if(resim24){imageView24.setVisibility(View.INVISIBLE);}
                    if(resim25){imageViews[0].setVisibility(View.INVISIBLE);}
                    if(resim26){imageViews[1].setVisibility(View.INVISIBLE);}
                    if(resim27){imageViews[2].setVisibility(View.INVISIBLE);}
                    if(resim28){
                        if(sayacA == 1){imageViews[3].setVisibility(View.INVISIBLE);}
                            sayacA=sayacA+1;
                            resim28=false;
                        }
                    if(resim29){imageViews[4].setVisibility(View.INVISIBLE);}
                    if(resim30){imageViews[5].setVisibility(View.INVISIBLE);}
                    if(resim31){imageViews[6].setVisibility(View.INVISIBLE);}
                    if(resim32){imageViews[7].setVisibility(View.INVISIBLE);}
                    if(resim33){imageViews[8].setVisibility(View.INVISIBLE);}
                    if(resim34){
                        if(sayacE == 1){imageViews[9].setVisibility(View.INVISIBLE);}
                            sayacE=sayacE+1;
                            resim34=false;
                        }
                    if(resim35){imageViews[10].setVisibility(View.INVISIBLE);}
                    if(resim36){imageViews[11].setVisibility(View.INVISIBLE);}
                    if(resim37){imageViews[12].setVisibility(View.INVISIBLE);}
                    if(resim38){imageViews[13].setVisibility(View.INVISIBLE);}
                    if(resim39){imageViews[14].setVisibility(View.INVISIBLE);}
                    if(resim40){imageViews[15].setVisibility(View.INVISIBLE);}
                    if(resim41){imageViews[16].setVisibility(View.INVISIBLE);}
                    if(resim42){imageViews[17].setVisibility(View.INVISIBLE);}
                    if(resim43){imageViews[18].setVisibility(View.INVISIBLE);}
                    if(resim44){imageViews[19].setVisibility(View.INVISIBLE);}
                    if(resim45){imageViews[20].setVisibility(View.INVISIBLE);}
                    if(resim46){imageViews[21].setVisibility(View.INVISIBLE);}
                    if(resim47){imageViews[22].setVisibility(View.INVISIBLE);}
                    if(resim48){imageViews[23].setVisibility(View.INVISIBLE);}
                    if(resim49){imageViews[24].setVisibility(View.INVISIBLE);}
                    if(resim50){imageViews[25].setVisibility(View.INVISIBLE);}
                    if(resim51){imageViews[26].setVisibility(View.INVISIBLE);}
                    if(resim52){imageViews[27].setVisibility(View.INVISIBLE);}
                    if(resim53){imageViews[28].setVisibility(View.INVISIBLE);}
                    if(resim54){imageViews[29].setVisibility(View.INVISIBLE);}
                    if(resim55){imageViews[30].setVisibility(View.INVISIBLE);}
                    if(resim56){imageViews[31].setVisibility(View.INVISIBLE);}
                    if(resim57){imageViews[32].setVisibility(View.INVISIBLE);}
                    if(resim58){imageViews[33].setVisibility(View.INVISIBLE);}
                    if(resim59){imageViews[34].setVisibility(View.INVISIBLE);}
                    if(resim60){imageViews[35].setVisibility(View.INVISIBLE);}
                    if(resim61){imageViews[36].setVisibility(View.INVISIBLE);}
                    if(resim62){imageViews[37].setVisibility(View.INVISIBLE);}
                    if(resim63){imageViews[38].setVisibility(View.INVISIBLE);}
                    if(resim64){imageViews[39].setVisibility(View.INVISIBLE);}
                    if(resim65){imageViews[40].setVisibility(View.INVISIBLE);}
                    if(resim66){imageViews[41].setVisibility(View.INVISIBLE);}
                    if(resim67){imageViews[42].setVisibility(View.INVISIBLE);}
                    if(resim68){imageViews[43].setVisibility(View.INVISIBLE);}
                    if(resim69){imageViews[44].setVisibility(View.INVISIBLE);}
                    if(resim70){imageViews[45].setVisibility(View.INVISIBLE);}
                    if(resim71){imageViews[46].setVisibility(View.INVISIBLE);}
                    if(resim72){imageViews[47].setVisibility(View.INVISIBLE);}
                    if(resim73){imageViews[48].setVisibility(View.INVISIBLE);}
                }
            }
        });
}
public void beklemeZamani(){
    if(toplamPuan<100){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }if(toplamPuan>=100 && toplamPuan<200){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }if(toplamPuan>=200 && toplamPuan<300){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }if(toplamPuan>=300 && toplamPuan<400){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }if(toplamPuan>=400){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public void ilkDongu(){

    timer = new CountDownTimer(Long.MAX_VALUE, 50) {
        @Override
        public void onTick(long millisUntilFinished) {
            // Resimleri aşağı doğru kaydır
            imageView1.offsetTopAndBottom(10);
            imageView2.offsetTopAndBottom(10);
            imageView3.offsetTopAndBottom(10);
            imageView4.offsetTopAndBottom(10);
            imageView5.offsetTopAndBottom(10);
            imageView6.offsetTopAndBottom(10);
            imageView7.offsetTopAndBottom(10);
            imageView8.offsetTopAndBottom(10);


            // Yeni dikdörtgenler oluştur
            newRect1 = new Rect(imageView1.getLeft(), imageView1.getTop(), imageView1.getRight(), imageView1.getBottom());
            rectz1 = new Rect(zemin1.getLeft(),zemin1.getTop(),zemin1.getRight(),zemin1.getBottom());
            rectz2 = new Rect(zemin2.getLeft(),zemin2.getTop(),zemin2.getRight(),zemin2.getBottom());
            rectz3 = new Rect(zemin3.getLeft(),zemin3.getTop(),zemin3.getRight(),zemin3.getBottom());
            rectz4 = new Rect(zemin4.getLeft(),zemin4.getTop(),zemin4.getRight(),zemin4.getBottom());
            rectz5 = new Rect(zemin5.getLeft(),zemin5.getTop(),zemin5.getRight(),zemin5.getBottom());
            rectz6 = new Rect(zemin6.getLeft(),zemin6.getTop(),zemin6.getRight(),zemin6.getBottom());
            rectz7 = new Rect(zemin7.getLeft(),zemin7.getTop(),zemin7.getRight(),zemin7.getBottom());
            rectz8 = new Rect(zemin8.getLeft(),zemin8.getTop(),zemin8.getRight(),zemin8.getBottom());

            // Çarpışma kontrolü yap
            if (newRect1.intersect(rectz1) ) {
                timer.cancel();
                ikinciDongu();
                dongu=true;
            }

            // Eski dikdörtgenleri güncelle


        }

        @Override
        public void onFinish() {}
    };
    if(!dongu){timer.start();}

}

public void ikinciDongu(){

    imageView9.setVisibility(View.VISIBLE);
    imageView10.setVisibility(View.VISIBLE);
    imageView11.setVisibility(View.VISIBLE);
    imageView12.setVisibility(View.VISIBLE);
    imageView13.setVisibility(View.VISIBLE);
    imageView14.setVisibility(View.VISIBLE);
    imageView15.setVisibility(View.VISIBLE);
    imageView16.setVisibility(View.VISIBLE);
    timer2 = new CountDownTimer(Long.MAX_VALUE, 50) {
        @Override
        public void onTick(long millisUntilFinished) {
            // Resimleri aşağı doğru kaydır
            imageView9.offsetTopAndBottom(10);
            imageView10.offsetTopAndBottom(10);
            imageView11.offsetTopAndBottom(10);
            imageView12.offsetTopAndBottom(10);
            imageView13.offsetTopAndBottom(10);
            imageView14.offsetTopAndBottom(10);
            imageView15.offsetTopAndBottom(10);
            imageView16.offsetTopAndBottom(10);

            newRect2 = new Rect(imageView9.getLeft(), imageView9.getTop(), imageView9.getRight(), imageView9.getBottom());
            newRect3 = new Rect(imageView1.getLeft(),imageView1.getTop(),imageView1.getRight(),imageView1.getBottom());

            if (newRect2.intersect(newRect3) ) {
                timer2.cancel();
                ucuncuDongu();
                dongu2=true;
            }

            // Eski dikdörtgenleri güncelle


        }

        @Override
        public void onFinish() {}
    };
    if(!dongu2){timer2.start();}


}
public void ucuncuDongu(){
    imageView17.setVisibility(View.VISIBLE);
    imageView18.setVisibility(View.VISIBLE);
    imageView19.setVisibility(View.VISIBLE);
    imageView20.setVisibility(View.VISIBLE);
    imageView21.setVisibility(View.VISIBLE);
    imageView22.setVisibility(View.VISIBLE);
    imageView23.setVisibility(View.VISIBLE);
    imageView24.setVisibility(View.VISIBLE);
    timer3 = new CountDownTimer(Long.MAX_VALUE, 50) {
        @Override
        public void onTick(long millisUntilFinished) {
            // Resimleri aşağı doğru kaydır
            imageView17.offsetTopAndBottom(10);
            imageView18.offsetTopAndBottom(10);
            imageView19.offsetTopAndBottom(10);
            imageView20.offsetTopAndBottom(10);
            imageView21.offsetTopAndBottom(10);
            imageView22.offsetTopAndBottom(10);
            imageView23.offsetTopAndBottom(10);
            imageView24.offsetTopAndBottom(10);

            // Yeni dikdörtgenler oluştur
            newRect4 = new Rect(imageView17.getLeft(), imageView17.getTop(), imageView17.getRight(), imageView17.getBottom());
            newRect5 = new Rect(imageView9.getLeft(),imageView9.getTop(),imageView9.getRight(),imageView9.getBottom());


            // Çarpışma kontrolü yap
            if (newRect4.intersect(newRect5) ) {

                timer3.onFinish();
            }
            // Eski dikdörtgenleri güncelle
        }
        @Override
        public void onFinish() {
            timer3.cancel();
            resimEkleme();
            dongu3=true;
        }
    };
    if(!dongu3){timer3.start();}

}
public void resimEkleme(){
    imageViews[0].setVisibility(View.VISIBLE);
    beklemeZamani();

    timer4 = new CountDownTimer(Long.MAX_VALUE, 50) {
        @Override
        public void onTick(long millisUntilFinished) {
            imageViews[0].offsetTopAndBottom(10);
            newRect6 = new Rect(imageViews[0].getLeft(), imageViews[0].getTop(), imageViews[0].getRight(), imageViews[0].getBottom());
            newRect7 = new Rect(imageView17.getLeft(),imageView17.getTop(),imageView17.getRight(),imageView17.getBottom());
            if (newRect6.intersect(newRect7)) {
                timer4.cancel();
                resimEkleme1();
                dongu4=true;
            }
        }
        @Override
        public void onFinish() {}
    };
    if(!dongu4){timer4.start();}

}
public void resimEkleme1(){
    imageViews[1].setVisibility(View.VISIBLE);
    beklemeZamani();
    timer5 = new CountDownTimer(Long.MAX_VALUE, 50) {
        @Override
        public void onTick(long millisUntilFinished) {
            imageViews[1].offsetTopAndBottom(10);
            newRect8 = new Rect(imageViews[1].getLeft(), imageViews[1].getTop(), imageViews[1].getRight(), imageViews[1].getBottom());
            newRect9 = new Rect(imageView18.getLeft(),imageView18.getTop(),imageView18.getRight(),imageView18.getBottom());
            if (newRect8.intersect(newRect9)) {
                timer5.cancel();
                resimEkleme2();
                dongu5=true;
            }
        }
        @Override
        public void onFinish() {}
    };
    if(!dongu5){timer5.start();}

}
    public void resimEkleme2(){
        imageViews[2].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer6 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[2].offsetTopAndBottom(10);
                newRect10 = new Rect(imageViews[2].getLeft(), imageViews[2].getTop(), imageViews[2].getRight(), imageViews[2].getBottom());
                newRect11 = new Rect(imageView19.getLeft(),imageView19.getTop(),imageView19.getRight(),imageView19.getBottom());
                if (newRect10.intersect(newRect11)) {
                    timer6.cancel();
                    resimEkleme3();
                    dongu6=true;
                }
            }
            @Override
            public void onFinish() {}
        };
        if(!dongu6){timer6.start();}
    }
    public void resimEkleme3(){
        imageViews[3].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer7 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[3].offsetTopAndBottom(10);
                newRect12 = new Rect(imageViews[3].getLeft(), imageViews[3].getTop(), imageViews[3].getRight(), imageViews[3].getBottom());
                newRect13 = new Rect(imageView20.getLeft(),imageView20.getTop(),imageView20.getRight(),imageView20.getBottom());
                if (newRect12.intersect(newRect13)) {
                    timer7.cancel();
                    resimEkleme4();
                    dongu7=true;
                }
            }
            @Override
            public void onFinish() {}
        };
        if(!dongu7){timer7.start();}
    }
    public void resimEkleme4(){
        imageViews[4].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer8 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[4].offsetTopAndBottom(10);
                newRect14 = new Rect(imageViews[4].getLeft(), imageViews[4].getTop(), imageViews[4].getRight(), imageViews[4].getBottom());
                newRect15 = new Rect(imageView21.getLeft(),imageView21.getTop(),imageView21.getRight(),imageView21.getBottom());
                if (newRect14.intersect(newRect15)) {
                    timer8.cancel();
                    resimEkleme5();
                    dongu8=true;
                }
            }
            @Override
            public void onFinish() {}
        };
        if(!dongu8){timer8.start();}
    }
    public void resimEkleme5(){
        imageViews[5].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer9 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[5].offsetTopAndBottom(10);
                newRect16 = new Rect(imageViews[5].getLeft(), imageViews[5].getTop(), imageViews[5].getRight(), imageViews[5].getBottom());
                newRect17 = new Rect(imageView22.getLeft(),imageView22.getTop(),imageView22.getRight(),imageView22.getBottom());
                if (newRect16.intersect(newRect17)) {
                    timer9.cancel();
                    resimEkleme6();
                    dongu9=true;
                }
            }
            @Override
            public void onFinish() {}
        };
        if(!dongu9){timer9.start();}
    }
    public void resimEkleme6(){
        imageViews[6].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer10 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[6].offsetTopAndBottom(10);
                newRect18 = new Rect(imageViews[6].getLeft(), imageViews[6].getTop(), imageViews[6].getRight(), imageViews[6].getBottom());
                newRect19 = new Rect(imageView23.getLeft(),imageView23.getTop(),imageView23.getRight(),imageView23.getBottom());
                if (newRect18.intersect(newRect19)) {
                    timer10.cancel();
                    resimEkleme7();
                    dongu10=true;
                }
            }
            @Override
            public void onFinish() {}
        };
        if(!dongu10){timer10.start();}
    }
    public void resimEkleme7(){
        imageViews[7].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer11 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[7].offsetTopAndBottom(10);
                newRect20 = new Rect(imageViews[7].getLeft(), imageViews[7].getTop(), imageViews[7].getRight(), imageViews[7].getBottom());
                newRect21 = new Rect(imageView24.getLeft(),imageView24.getTop(),imageView24.getRight(),imageView24.getBottom());
                if (newRect20.intersect(newRect21)) {
                    timer11.cancel();
                    resimEkleme8();
                    dongu11=true;
                }
            }
            @Override
            public void onFinish() {}
        };
        if(!dongu11){timer11.start();}
    }
    public void resimEkleme8(){
        imageViews[8].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer12 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[8].offsetTopAndBottom(10);
                newRect22 = new Rect(imageViews[8].getLeft(), imageViews[8].getTop(), imageViews[8].getRight(), imageViews[8].getBottom());
                newRect23 = new Rect(imageViews[0].getLeft(), imageViews[0].getTop(), imageViews[0].getRight(), imageViews[0].getBottom());
                if (newRect22.intersect(newRect23)) {
                    timer12.cancel();
                    resimEkleme9();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer12.start();
    }
    public void resimEkleme9(){
        imageViews[9].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer13 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[9].offsetTopAndBottom(10);
                newRect24 = new Rect(imageViews[9].getLeft(), imageViews[9].getTop(), imageViews[9].getRight(), imageViews[9].getBottom());
                newRect25 = new Rect(imageViews[1].getLeft(), imageViews[1].getTop(), imageViews[1].getRight(), imageViews[1].getBottom());
                if (newRect24.intersect(newRect25)) {
                    timer13.cancel();
                    resimEkleme10();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer13.start();
    }
    public void resimEkleme10(){
        imageViews[10].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer14 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[10].offsetTopAndBottom(10);
                newRect26 = new Rect(imageViews[10].getLeft(), imageViews[10].getTop(), imageViews[10].getRight(), imageViews[10].getBottom());
                newRect27 = new Rect(imageViews[2].getLeft(), imageViews[2].getTop(), imageViews[2].getRight(), imageViews[2].getBottom());
                if (newRect26.intersect(newRect27)) {
                    timer14.cancel();
                    resimEkleme11();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer14.start();
    }
    public void resimEkleme11(){
        imageViews[11].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer15 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[11].offsetTopAndBottom(10);
                newRect28 = new Rect(imageViews[11].getLeft(), imageViews[11].getTop(), imageViews[11].getRight(), imageViews[11].getBottom());
                newRect29 = new Rect(imageViews[3].getLeft(), imageViews[3].getTop(), imageViews[3].getRight(), imageViews[3].getBottom());
                if (newRect28.intersect(newRect29)) {
                    timer15.cancel();
                    resimEkleme12();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer15.start();
    }
    public void resimEkleme12(){
        imageViews[12].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer16 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[12].offsetTopAndBottom(10);
                newRect30 = new Rect(imageViews[12].getLeft(), imageViews[12].getTop(), imageViews[12].getRight(), imageViews[12].getBottom());
                newRect31 = new Rect(imageViews[4].getLeft(), imageViews[4].getTop(), imageViews[4].getRight(), imageViews[4].getBottom());
                if (newRect30.intersect(newRect31)) {
                    timer16.cancel();
                    resimEkleme13();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer16.start();
    }
    public void resimEkleme13(){
        imageViews[13].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer17 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[13].offsetTopAndBottom(10);
                newRect32 = new Rect(imageViews[13].getLeft(), imageViews[13].getTop(), imageViews[13].getRight(), imageViews[13].getBottom());
                newRect33 = new Rect(imageViews[5].getLeft(), imageViews[5].getTop(), imageViews[5].getRight(), imageViews[5].getBottom());
                if (newRect32.intersect(newRect33)) {
                    timer17.cancel();
                    resimEkleme14();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer17.start();
    }
    public void resimEkleme14(){
        imageViews[14].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer18 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[14].offsetTopAndBottom(10);
                newRect34 = new Rect(imageViews[14].getLeft(), imageViews[14].getTop(), imageViews[14].getRight(), imageViews[14].getBottom());
                newRect35 = new Rect(imageViews[6].getLeft(), imageViews[6].getTop(), imageViews[6].getRight(), imageViews[6].getBottom());
                if (newRect34.intersect(newRect35)) {
                    timer18.cancel();
                    resimEkleme15();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer18.start();
    }
    public void resimEkleme15(){
        imageViews[15].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer19 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[15].offsetTopAndBottom(10);
                newRect36 = new Rect(imageViews[15].getLeft(), imageViews[15].getTop(), imageViews[15].getRight(), imageViews[15].getBottom());
                newRect37 = new Rect(imageViews[7].getLeft(), imageViews[7].getTop(), imageViews[7].getRight(), imageViews[7].getBottom());
                if (newRect36.intersect(newRect37)) {
                    timer19.cancel();
                    resimEkleme16();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer19.start();
    }
    public void resimEkleme16(){
        imageViews[16].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer20 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[16].offsetTopAndBottom(10);
                newRect38 = new Rect(imageViews[16].getLeft(), imageViews[16].getTop(), imageViews[16].getRight(), imageViews[16].getBottom());
                newRect39 = new Rect(imageViews[8].getLeft(), imageViews[8].getTop(), imageViews[8].getRight(), imageViews[8].getBottom());
                if (newRect38.intersect(newRect39)) {
                    timer20.cancel();
                    resimEkleme17();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer20.start();
    }
    public void resimEkleme17(){
        imageViews[17].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer21 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[17].offsetTopAndBottom(10);
                newRect40 = new Rect(imageViews[17].getLeft(), imageViews[17].getTop(), imageViews[17].getRight(), imageViews[17].getBottom());
                newRect41 = new Rect(imageViews[9].getLeft(), imageViews[9].getTop(), imageViews[9].getRight(), imageViews[9].getBottom());
                if (newRect40.intersect(newRect41)) {
                    timer21.cancel();
                    resimEkleme18();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer21.start();
    }
    public void resimEkleme18(){
        imageViews[18].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer22 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[18].offsetTopAndBottom(10);
                newRect42 = new Rect(imageViews[18].getLeft(), imageViews[18].getTop(), imageViews[18].getRight(), imageViews[18].getBottom());
                newRect43 = new Rect(imageViews[10].getLeft(), imageViews[10].getTop(), imageViews[10].getRight(), imageViews[10].getBottom());
                if (newRect42.intersect(newRect43)) {
                    timer22.cancel();
                    resimEkleme19();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer22.start();
    }
    public void resimEkleme19(){
        imageViews[19].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer23 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[19].offsetTopAndBottom(10);
                newRect44 = new Rect(imageViews[19].getLeft(), imageViews[19].getTop(), imageViews[19].getRight(), imageViews[19].getBottom());
                newRect45 = new Rect(imageViews[11].getLeft(), imageViews[11].getTop(), imageViews[11].getRight(), imageViews[11].getBottom());
                if (newRect44.intersect(newRect45)) {
                    timer23.cancel();
                    resimEkleme20();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer23.start();
    }
    public void resimEkleme20(){
        imageViews[20].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer24 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[20].offsetTopAndBottom(10);
                newRect46 = new Rect(imageViews[20].getLeft(), imageViews[20].getTop(), imageViews[20].getRight(), imageViews[20].getBottom());
                newRect47 = new Rect(imageViews[12].getLeft(), imageViews[12].getTop(), imageViews[12].getRight(), imageViews[12].getBottom());
                if (newRect46.intersect(newRect47)) {
                    timer24.cancel();
                    resimEkleme21();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer24.start();
    }
    public void resimEkleme21(){
        imageViews[21].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer25 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[21].offsetTopAndBottom(10);
                newRect48 = new Rect(imageViews[21].getLeft(), imageViews[21].getTop(), imageViews[21].getRight(), imageViews[21].getBottom());
                newRect49 = new Rect(imageViews[13].getLeft(), imageViews[13].getTop(), imageViews[13].getRight(), imageViews[13].getBottom());
                if (newRect48.intersect(newRect49)) {
                    timer25.cancel();
                    resimEkleme22();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer25.start();
    }
    public void resimEkleme22(){
        imageViews[22].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer26 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[22].offsetTopAndBottom(10);
                newRect50 = new Rect(imageViews[22].getLeft(), imageViews[22].getTop(), imageViews[22].getRight(), imageViews[22].getBottom());
                newRect51 = new Rect(imageViews[14].getLeft(), imageViews[14].getTop(), imageViews[14].getRight(), imageViews[14].getBottom());
                if (newRect50.intersect(newRect51)) {
                    timer26.cancel();
                    resimEkleme23();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer26.start();
    }
    public void resimEkleme23(){
        imageViews[23].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer27 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[23].offsetTopAndBottom(10);
                newRect52 = new Rect(imageViews[23].getLeft(), imageViews[23].getTop(), imageViews[23].getRight(), imageViews[23].getBottom());
                newRect53 = new Rect(imageViews[15].getLeft(), imageViews[15].getTop(), imageViews[15].getRight(), imageViews[15].getBottom());
                if (newRect52.intersect(newRect53)) {
                    timer27.cancel();
                    resimEkleme24();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer27.start();
    }
    public void resimEkleme24(){
        imageViews[24].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer28 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[24].offsetTopAndBottom(10);
                newRect54 = new Rect(imageViews[24].getLeft(), imageViews[24].getTop(), imageViews[24].getRight(), imageViews[24].getBottom());
                newRect55 = new Rect(imageViews[16].getLeft(), imageViews[16].getTop(), imageViews[16].getRight(), imageViews[16].getBottom());
                if (newRect54.intersect(newRect55)) {
                    timer28.cancel();
                    resimEkleme25();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer28.start();
    }
    public void resimEkleme25(){
        imageViews[25].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer29 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[25].offsetTopAndBottom(10);
                newRect56 = new Rect(imageViews[25].getLeft(), imageViews[25].getTop(), imageViews[25].getRight(), imageViews[25].getBottom());
                newRect57 = new Rect(imageViews[17].getLeft(), imageViews[17].getTop(), imageViews[17].getRight(), imageViews[17].getBottom());
                if (newRect56.intersect(newRect57)) {
                    timer29.cancel();
                    resimEkleme26();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer29.start();
    }
    public void resimEkleme26(){
        imageViews[26].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer30 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[26].offsetTopAndBottom(10);
                newRect58 = new Rect(imageViews[26].getLeft(), imageViews[26].getTop(), imageViews[26].getRight(), imageViews[26].getBottom());
                newRect59 = new Rect(imageViews[18].getLeft(), imageViews[18].getTop(), imageViews[18].getRight(), imageViews[18].getBottom());
                if (newRect58.intersect(newRect59)) {
                    timer30.cancel();
                    resimEkleme27();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer30.start();
    }
    public void resimEkleme27(){
        imageViews[27].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer31 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[27].offsetTopAndBottom(10);
                newRect60 = new Rect(imageViews[27].getLeft(), imageViews[27].getTop(), imageViews[27].getRight(), imageViews[27].getBottom());
                newRect61 = new Rect(imageViews[19].getLeft(), imageViews[19].getTop(), imageViews[19].getRight(), imageViews[19].getBottom());
                if (newRect60.intersect(newRect61)) {
                    timer31.cancel();
                    resimEkleme28();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer31.start();
    }
    public void resimEkleme28(){
        imageViews[28].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer32 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[28].offsetTopAndBottom(10);
                newRect62 = new Rect(imageViews[28].getLeft(), imageViews[28].getTop(), imageViews[28].getRight(), imageViews[28].getBottom());
                newRect63 = new Rect(imageViews[20].getLeft(), imageViews[20].getTop(), imageViews[20].getRight(), imageViews[20].getBottom());
                if (newRect62.intersect(newRect63)) {
                    timer32.cancel();
                    resimEkleme29();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer32.start();
    }
    public void resimEkleme29(){
        imageViews[29].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer33 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[29].offsetTopAndBottom(10);
                newRect64 = new Rect(imageViews[29].getLeft(), imageViews[29].getTop(), imageViews[29].getRight(), imageViews[29].getBottom());
                newRect65 = new Rect(imageViews[21].getLeft(), imageViews[21].getTop(), imageViews[21].getRight(), imageViews[21].getBottom());
                if (newRect64.intersect(newRect65)) {
                    timer33.cancel();
                    resimEkleme30();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer33.start();
    }
    public void resimEkleme30(){
        imageViews[30].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer34 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[30].offsetTopAndBottom(10);
                newRect66 = new Rect(imageViews[30].getLeft(), imageViews[30].getTop(), imageViews[30].getRight(), imageViews[30].getBottom());
                newRect67 = new Rect(imageViews[22].getLeft(), imageViews[22].getTop(), imageViews[22].getRight(), imageViews[22].getBottom());
                if (newRect66.intersect(newRect67)) {
                    timer34.cancel();
                    resimEkleme31();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer34.start();
    }
    public void resimEkleme31(){
        imageViews[31].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer35 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[31].offsetTopAndBottom(10);
                newRect68 = new Rect(imageViews[31].getLeft(), imageViews[31].getTop(), imageViews[31].getRight(), imageViews[31].getBottom());
                newRect69 = new Rect(imageViews[23].getLeft(), imageViews[23].getTop(), imageViews[23].getRight(), imageViews[23].getBottom());
                if (newRect68.intersect(newRect69)) {
                    timer35.cancel();
                    resimEkleme32();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer35.start();
    }
    public void resimEkleme32(){
        imageViews[32].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer36 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[32].offsetTopAndBottom(10);
                newRect70 = new Rect(imageViews[32].getLeft(), imageViews[32].getTop(), imageViews[32].getRight(), imageViews[32].getBottom());
                newRect71 = new Rect(imageViews[24].getLeft(), imageViews[24].getTop(), imageViews[24].getRight(), imageViews[24].getBottom());
                if (newRect70.intersect(newRect71)) {
                    timer36.cancel();
                    resimEkleme33();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer36.start();
    }
    public void resimEkleme33(){
        imageViews[33].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer37 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[33].offsetTopAndBottom(10);
                newRect72 = new Rect(imageViews[33].getLeft(), imageViews[33].getTop(), imageViews[33].getRight(), imageViews[33].getBottom());
                newRect73 = new Rect(imageViews[25].getLeft(), imageViews[25].getTop(), imageViews[25].getRight(), imageViews[25].getBottom());
                if (newRect72.intersect(newRect73)) {
                    timer37.cancel();
                    resimEkleme34();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer37.start();
    }
    public void resimEkleme34(){
        imageViews[34].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer38 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[34].offsetTopAndBottom(10);
                newRect74 = new Rect(imageViews[34].getLeft(), imageViews[34].getTop(), imageViews[34].getRight(), imageViews[34].getBottom());
                newRect75 = new Rect(imageViews[26].getLeft(), imageViews[26].getTop(), imageViews[26].getRight(), imageViews[26].getBottom());
                if (newRect74.intersect(newRect75)) {
                    timer38.cancel();
                    resimEkleme35();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer38.start();
    }
    public void resimEkleme35(){
        imageViews[35].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer39 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[35].offsetTopAndBottom(10);
                newRect76 = new Rect(imageViews[35].getLeft(), imageViews[35].getTop(), imageViews[35].getRight(), imageViews[35].getBottom());
                newRect77 = new Rect(imageViews[27].getLeft(), imageViews[27].getTop(), imageViews[27].getRight(), imageViews[27].getBottom());
                if (newRect76.intersect(newRect77)) {
                    timer39.cancel();
                    resimEkleme36();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer39.start();
    }
    public void resimEkleme36(){
        imageViews[36].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer40 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[36].offsetTopAndBottom(10);
                newRect78 = new Rect(imageViews[36].getLeft(), imageViews[36].getTop(), imageViews[36].getRight(), imageViews[36].getBottom());
                newRect79 = new Rect(imageViews[28].getLeft(), imageViews[28].getTop(), imageViews[28].getRight(), imageViews[28].getBottom());
                if (newRect78.intersect(newRect79)) {
                    timer40.cancel();
                    resimEkleme37();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer40.start();
    }
    public void resimEkleme37(){
        imageViews[37].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer41 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[37].offsetTopAndBottom(10);
                newRect80 = new Rect(imageViews[37].getLeft(), imageViews[37].getTop(), imageViews[37].getRight(), imageViews[37].getBottom());
                newRect81 = new Rect(imageViews[29].getLeft(), imageViews[29].getTop(), imageViews[29].getRight(), imageViews[29].getBottom());
                if (newRect80.intersect(newRect81)) {
                    timer41.cancel();
                    resimEkleme38();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer41.start();
    }
    public void resimEkleme38(){
        imageViews[38].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer42 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[38].offsetTopAndBottom(10);
                newRect82 = new Rect(imageViews[38].getLeft(), imageViews[38].getTop(), imageViews[38].getRight(), imageViews[38].getBottom());
                newRect83 = new Rect(imageViews[30].getLeft(), imageViews[30].getTop(), imageViews[30].getRight(), imageViews[30].getBottom());
                if (newRect82.intersect(newRect83)) {
                    timer42.cancel();
                    resimEkleme39();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer42.start();
    }
    public void resimEkleme39(){
        imageViews[39].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer43 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[39].offsetTopAndBottom(10);
                newRect84 = new Rect(imageViews[39].getLeft(), imageViews[39].getTop(), imageViews[39].getRight(), imageViews[39].getBottom());
                newRect85 = new Rect(imageViews[31].getLeft(), imageViews[31].getTop(), imageViews[31].getRight(), imageViews[31].getBottom());
                if (newRect84.intersect(newRect85)) {
                    timer43.cancel();
                    resimEkleme40();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer43.start();
    }
    public void resimEkleme40(){
        imageViews[40].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer44 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[40].offsetTopAndBottom(10);
                newRect86 = new Rect(imageViews[40].getLeft(), imageViews[40].getTop(), imageViews[40].getRight(), imageViews[40].getBottom());
                newRect87 = new Rect(imageViews[32].getLeft(), imageViews[32].getTop(), imageViews[32].getRight(), imageViews[32].getBottom());
                if (newRect86.intersect(newRect87)) {
                    timer44.cancel();
                    resimEkleme41();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer44.start();
    }
    public void resimEkleme41(){
        imageViews[41].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer45 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[41].offsetTopAndBottom(10);
                newRect88 = new Rect(imageViews[41].getLeft(), imageViews[41].getTop(), imageViews[41].getRight(), imageViews[41].getBottom());
                newRect89 = new Rect(imageViews[33].getLeft(), imageViews[33].getTop(), imageViews[33].getRight(), imageViews[33].getBottom());
                if (newRect88.intersect(newRect89)) {
                    timer45.cancel();
                    resimEkleme42();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer45.start();
    }
    public void resimEkleme42(){
        imageViews[42].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer46 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[42].offsetTopAndBottom(10);
                newRect90 = new Rect(imageViews[42].getLeft(), imageViews[42].getTop(), imageViews[42].getRight(), imageViews[42].getBottom());
                newRect91 = new Rect(imageViews[34].getLeft(), imageViews[34].getTop(), imageViews[34].getRight(), imageViews[34].getBottom());
                if (newRect90.intersect(newRect91)) {
                    timer46.cancel();
                    resimEkleme43();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer46.start();
    }
    public void resimEkleme43(){
        imageViews[43].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer47 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[43].offsetTopAndBottom(10);
                newRect92 = new Rect(imageViews[43].getLeft(), imageViews[43].getTop(), imageViews[43].getRight(), imageViews[43].getBottom());
                newRect93 = new Rect(imageViews[35].getLeft(), imageViews[35].getTop(), imageViews[35].getRight(), imageViews[35].getBottom());
                if (newRect92.intersect(newRect93)) {
                    timer47.cancel();
                    resimEkleme44();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer47.start();
    }
    public void resimEkleme44(){
        imageViews[44].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer48 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[44].offsetTopAndBottom(10);
                newRect94 = new Rect(imageViews[44].getLeft(), imageViews[44].getTop(), imageViews[44].getRight(), imageViews[44].getBottom());
                newRect95 = new Rect(imageViews[36].getLeft(), imageViews[36].getTop(), imageViews[36].getRight(), imageViews[36].getBottom());
                if (newRect94.intersect(newRect95)) {
                    timer48.cancel();
                    resimEkleme45();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer48.start();
    }
    public void resimEkleme45(){
        imageViews[45].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer49 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[45].offsetTopAndBottom(10);
                newRect96 = new Rect(imageViews[45].getLeft(), imageViews[45].getTop(), imageViews[45].getRight(), imageViews[45].getBottom());
                newRect97 = new Rect(imageViews[37].getLeft(), imageViews[37].getTop(), imageViews[37].getRight(), imageViews[37].getBottom());
                if (newRect96.intersect(newRect97)) {
                    timer49.cancel();
                    resimEkleme46();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer49.start();
    }
    public void resimEkleme46(){
        imageViews[46].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer50 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[46].offsetTopAndBottom(10);
                newRect98 = new Rect(imageViews[46].getLeft(), imageViews[46].getTop(), imageViews[46].getRight(), imageViews[46].getBottom());
                newRect99 = new Rect(imageViews[38].getLeft(), imageViews[38].getTop(), imageViews[38].getRight(), imageViews[38].getBottom());
                if (newRect98.intersect(newRect99)) {
                    timer50.cancel();
                    resimEkleme47();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer50.start();
    }
    public void resimEkleme47(){
        imageViews[47].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer51 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[47].offsetTopAndBottom(10);
                newRect100 = new Rect(imageViews[47].getLeft(), imageViews[47].getTop(), imageViews[47].getRight(), imageViews[47].getBottom());
                newRect101 = new Rect(imageViews[39].getLeft(), imageViews[39].getTop(), imageViews[39].getRight(), imageViews[39].getBottom());
                if (newRect100.intersect(newRect101)) {
                    timer51.cancel();
                    resimEkleme48();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer51.start();
    }
    public void resimEkleme48(){
        imageViews[48].setVisibility(View.VISIBLE);
        beklemeZamani();
        timer52 = new CountDownTimer(Long.MAX_VALUE, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageViews[48].offsetTopAndBottom(10);
                newRect102 = new Rect(imageViews[48].getLeft(), imageViews[48].getTop(), imageViews[48].getRight(), imageViews[48].getBottom());
                newRect103 = new Rect(imageViews[40].getLeft(), imageViews[40].getTop(), imageViews[40].getRight(), imageViews[40].getBottom());
                if (newRect102.intersect(newRect103)) {
                    timer52.cancel();
                    scores.add(toplamPuan);
                    Collections.sort(scores, Collections.reverseOrder());

                    Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                    intent.putIntegerArrayListExtra("myArrayList", scores);
                    startActivity(intent);
                    finish();
                }
            }
            @Override
            public void onFinish() {}
        };
        timer52.start();
    }
public void buzluharf(ImageView y,int x){
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x == 0){kelime = kelime + "A";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 1){kelime = kelime + "E";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(y == imageViews[3]){resim28=true;}
                if(y == imageViews[9]){resim34=true;}
            }
        });
}
public void sesliharf(ImageView y,int x){

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x == 0){kelime = kelime + "A";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 1){kelime = kelime + "E";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 2){kelime = kelime + "İ";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 3){kelime = kelime + "I";metin.setText(kelime);anlikPuan=anlikPuan+2;}
                if(x == 4){kelime = kelime + "O";metin.setText(kelime);anlikPuan=anlikPuan+2;}
                if(x == 5){kelime = kelime + "Ö";metin.setText(kelime);anlikPuan=anlikPuan+7;}
                if(x == 6){kelime = kelime + "U";metin.setText(kelime);anlikPuan=anlikPuan+2;}
                if(x == 7){kelime = kelime + "Ü";metin.setText(kelime);anlikPuan=anlikPuan+3;}
                if(y == imageView1){resim1=true;}
                if(y == imageView2){resim2=true;}
                if(y == imageView3){resim3=true;}
                if(y == imageView4){resim4=true;}
                if(y == imageView5){resim5=true;}
                if(y == imageView6){resim6=true;}
                if(y == imageView7){resim7=true;}
                if(y == imageView8){resim8=true;}
                if(y == imageView9){resim9=true;}
                if(y == imageView10){resim10=true;}
                if(y == imageView11){resim11=true;}
                if(y == imageView12){resim12=true;}
                if(y == imageView13){resim13=true;}
                if(y == imageView14){resim14=true;}
                if(y == imageView15){resim15=true;}
                if(y == imageView16){resim16=true;}
                if(y == imageView17){resim17=true;}
                if(y == imageView18){resim18=true;}
                if(y == imageView19){resim19=true;}
                if(y == imageView20){resim20=true;}
                if(y == imageView21){resim21=true;}
                if(y == imageView22){resim22=true;}
                if(y == imageView23){resim23=true;}
                if(y == imageView24){resim24=true;}
                if(y == imageViews[0]){resim25=true;}
                if(y == imageViews[1]){resim26=true;}
                if(y == imageViews[2]){resim27=true;}
                if(y == imageViews[3]){resim28=true;}
                if(y == imageViews[4]){resim29=true;}
                if(y == imageViews[5]){resim30=true;}
                if(y == imageViews[6]){resim31=true;}
                if(y == imageViews[7]){resim32=true;}
                if(y == imageViews[8]){resim33=true;}
                if(y == imageViews[9]){resim34=true;}
                if(y == imageViews[10]){resim35=true;}
                if(y == imageViews[11]){resim36=true;}
                if(y == imageViews[12]){resim37=true;}
                if(y == imageViews[13]){resim38=true;}
                if(y == imageViews[14]){resim39=true;}
                if(y == imageViews[15]){resim40=true;}
                if(y == imageViews[16]){resim41=true;}
                if(y == imageViews[17]){resim42=true;}
                if(y == imageViews[18]){resim43=true;}
                if(y == imageViews[19]){resim44=true;}
                if(y == imageViews[20]){resim45=true;}
                if(y == imageViews[21]){resim46=true;}
                if(y == imageViews[22]){resim47=true;}
                if(y == imageViews[23]){resim48=true;}
                if(y == imageViews[24]){resim49=true;}
                if(y == imageViews[25]){resim50=true;}
                if(y == imageViews[26]){resim51=true;}
                if(y == imageViews[27]){resim52=true;}
                if(y == imageViews[28]){resim53=true;}
                if(y == imageViews[29]){resim54=true;}
                if(y == imageViews[30]){resim55=true;}
                if(y == imageViews[31]){resim56=true;}
                if(y == imageViews[32]){resim57=true;}
                if(y == imageViews[33]){resim58=true;}
                if(y == imageViews[34]){resim59=true;}
                if(y == imageViews[35]){resim60=true;}
                if(y == imageViews[36]){resim61=true;}
                if(y == imageViews[37]){resim62=true;}
                if(y == imageViews[38]){resim63=true;}
                if(y == imageViews[39]){resim64=true;}
                if(y == imageViews[40]){resim65=true;}
                if(y == imageViews[41]){resim66=true;}
                if(y == imageViews[42]){resim67=true;}
                if(y == imageViews[43]){resim68=true;}
                if(y == imageViews[44]){resim69=true;}
                if(y == imageViews[45]){resim70=true;}
                if(y == imageViews[46]){resim71=true;}
                if(y == imageViews[47]){resim72=true;}
            }
        });
}
    public void sessizharf(ImageView y,int x){

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x == 0){kelime = kelime + "B";metin.setText(kelime);anlikPuan=anlikPuan+3;}
                if(x == 1){kelime = kelime + "C";metin.setText(kelime);anlikPuan=anlikPuan+4;}
                if(x == 2){kelime = kelime + "Ç";metin.setText(kelime);anlikPuan=anlikPuan+4;}
                if(x == 3){kelime = kelime + "D";metin.setText(kelime);anlikPuan=anlikPuan+3;}
                if(x == 4){kelime = kelime + "F";metin.setText(kelime);anlikPuan=anlikPuan+7;}
                if(x == 5){kelime = kelime + "G";metin.setText(kelime);anlikPuan=anlikPuan+5;}
                if(x == 6){kelime = kelime + "Ğ";metin.setText(kelime);anlikPuan=anlikPuan+8;}
                if(x == 7){kelime = kelime + "H";metin.setText(kelime);anlikPuan=anlikPuan+5;}
                if(x == 8){kelime = kelime + "J";metin.setText(kelime);anlikPuan=anlikPuan+10;}
                if(x == 9){kelime = kelime + "K";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 10){kelime = kelime + "L";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 11){kelime = kelime + "M";metin.setText(kelime);anlikPuan=anlikPuan+2;}
                if(x == 12){kelime = kelime + "N";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 13){kelime = kelime + "P";metin.setText(kelime);anlikPuan=anlikPuan+5;}
                if(x == 14){kelime = kelime + "R";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 15){kelime = kelime + "S";metin.setText(kelime);anlikPuan=anlikPuan+2;}
                if(x == 16){kelime = kelime + "Ş";metin.setText(kelime);anlikPuan=anlikPuan+4;}
                if(x == 17){kelime = kelime + "T";metin.setText(kelime);anlikPuan=anlikPuan+1;}
                if(x == 18){kelime = kelime + "V";metin.setText(kelime);anlikPuan=anlikPuan+7;}
                if(x == 19){kelime = kelime + "Y";metin.setText(kelime);anlikPuan=anlikPuan+3;}
                if(x == 20){kelime = kelime + "Z";metin.setText(kelime);anlikPuan=anlikPuan+4;}
                if(y == imageView1){resim1=true;}
                if(y == imageView2){resim2=true;}
                if(y == imageView3){resim3=true;}
                if(y == imageView4){resim4=true;}
                if(y == imageView5){resim5=true;}
                if(y == imageView6){resim6=true;}
                if(y == imageView7){resim7=true;}
                if(y == imageView8){resim8=true;}
                if(y == imageView9){resim9=true;}
                if(y == imageView10){resim10=true;}
                if(y == imageView11){resim11=true;}
                if(y == imageView12){resim12=true;}
                if(y == imageView13){resim13=true;}
                if(y == imageView14){resim14=true;}
                if(y == imageView15){resim15=true;}
                if(y == imageView16){resim16=true;}
                if(y == imageView17){resim17=true;}
                if(y == imageView18){resim18=true;}
                if(y == imageView19){resim19=true;}
                if(y == imageView20){resim20=true;}
                if(y == imageView21){resim21=true;}
                if(y == imageView22){resim22=true;}
                if(y == imageView23){resim23=true;}
                if(y == imageView24){resim24=true;}
                if(y == imageViews[0]){resim25=true;}
                if(y == imageViews[1]){resim26=true;}
                if(y == imageViews[2]){resim27=true;}
                if(y == imageViews[3]){resim28=true;}
                if(y == imageViews[4]){resim29=true;}
                if(y == imageViews[5]){resim30=true;}
                if(y == imageViews[6]){resim31=true;}
                if(y == imageViews[7]){resim32=true;}
                if(y == imageViews[8]){resim33=true;}
                if(y == imageViews[9]){resim34=true;}
                if(y == imageViews[10]){resim35=true;}
                if(y == imageViews[11]){resim36=true;}
                if(y == imageViews[12]){resim37=true;}
                if(y == imageViews[13]){resim38=true;}
                if(y == imageViews[14]){resim39=true;}
                if(y == imageViews[15]){resim40=true;}
                if(y == imageViews[16]){resim41=true;}
                if(y == imageViews[17]){resim42=true;}
                if(y == imageViews[18]){resim43=true;}
                if(y == imageViews[19]){resim44=true;}
                if(y == imageViews[20]){resim45=true;}
                if(y == imageViews[21]){resim46=true;}
                if(y == imageViews[22]){resim47=true;}
                if(y == imageViews[23]){resim48=true;}
                if(y == imageViews[24]){resim49=true;}
                if(y == imageViews[25]){resim50=true;}
                if(y == imageViews[26]){resim51=true;}
                if(y == imageViews[27]){resim52=true;}
                if(y == imageViews[28]){resim53=true;}
                if(y == imageViews[29]){resim54=true;}
                if(y == imageViews[30]){resim55=true;}
                if(y == imageViews[31]){resim56=true;}
                if(y == imageViews[32]){resim57=true;}
                if(y == imageViews[33]){resim58=true;}
                if(y == imageViews[34]){resim59=true;}
                if(y == imageViews[35]){resim60=true;}
                if(y == imageViews[36]){resim61=true;}
                if(y == imageViews[37]){resim62=true;}
                if(y == imageViews[38]){resim63=true;}
                if(y == imageViews[39]){resim64=true;}
                if(y == imageViews[40]){resim65=true;}
                if(y == imageViews[41]){resim66=true;}
                if(y == imageViews[42]){resim67=true;}
                if(y == imageViews[43]){resim68=true;}
                if(y == imageViews[44]){resim69=true;}
                if(y == imageViews[45]){resim70=true;}
                if(y == imageViews[46]){resim71=true;}
                if(y == imageViews[47]){resim72=true;}
            }
        });
    }
}
