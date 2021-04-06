package com.project.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    AdapterRecycler adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Tugas Pertemuan 3");

        rcv = (RecyclerView) findViewById(R.id.recview);
        adapter = new AdapterRecycler(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder = new ArrayList<>();

        Model ob1 = new Model();
        ob1.setTitle("Steelseries");
        ob1.setDesc("SteelSeries was founded in 2001 by Jacob Wolff-Petersen. The company's original name was Soft Trading, and it was changed to SteelSeries in 2007. Soft Trading made the Icemat and SteelPad mouse mats, the latter of which influenced the company's eventual name change. In 2008, SteelSeries acquired Ideazon, a North America-based developer and manufacturer of gaming peripherals.\n" +
                "\n" +
                "Michael von Essen-Mueller, the company's first CEO, helped the company establish its brand and grow to a global footprint. In 2007, SteelSeries hired Bruce Hawver as CEO. The company saw tremendous growth over the next five years as it expanded its portfolio and channels, developed the SteelSeries Engine platform, and added partnerships across the esports and the gaming ecosystem\n" +
                "\n" +
                "In 2012, SteelSeries received investments of undisclosed amounts from U.S.-based private equity firm Catterton Partners and China-based private equity firm ClearVue Partners.\n" +
                "\n" +
                "Their popular products include their Rival and Sensei series of mice, Arctis headsets, and Apex keyboards. They also have made 5XL mousepads (QcK line).\n" +
                "\n" +
                "In April 2020, SteelSeries acquired Nahimic audio software developer, A-Volute.");
        ob1.setLogo(R.drawable.logo_steelseries);
        ob1.setShare(R.drawable.ic_share);
        holder.add(ob1);

        Model ob2 = new Model();
        ob2.setTitle("Logitech");
        ob2.setDesc("Logitech International S.A. (/ˈlɒdʒɪtɛk/ LOJ-i-tek; often shortened to Logi) is a Swiss-American manufacturer of computer peripherals and software, with headquarters in Lausanne, Switzerland and Newark, California. The company has offices throughout Europe, Asia, Oceania, and the Americas, and is one of the world's leading manufacturers of input and interface devices for personal computers (PCs) and other digital products. The company develops and markets personal peripherals for PC navigation, video communication and collaboration, music and smart homes. This includes products like keyboards, mice, tablet accessories, webcams, Bluetooth speakers, universal remotes and more. Its name is derived from logiciel, the French word for software.");
        ob2.setLogo(R.drawable.logo_logitech);
        ob2.setShare(R.drawable.ic_share);
        holder.add(ob2);

        return holder;
    }
}