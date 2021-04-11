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

        Model ob3 = new Model();
        ob3.setTitle("Alienware");
        ob3.setDesc("Alienware is an American computer hardware subsidiary of Dell. Their product range is dedicated to gaming computers which can be identified by their alien-themed designs.[5] Alienware was founded in 1996 by Nelson Gonzalez and Alex Aguila. The development of the company is also associated with Frank Azor, Arthur Lewis, Joe Balerdi, and Michael S. Dell. The company's corporate headquarters is located in The Hammocks, Miami, Florida.");
        ob3.setLogo(R.drawable.logo_alienware);
        ob3.setShare(R.drawable.ic_share);
        holder.add(ob3);

        Model ob4 = new Model();
        ob4.setTitle("Rexus");
        ob4.setDesc("Rexus adalah bagian dari salah satu nama merk produk aksesoris computer yang dimiliki oleh Perusahaan kami, selain dari nama Vinnec dan RBT. Perusahaan kami pada mulanya adalah sebuah perusahaan yang bergerak di bidang stationery untuk memenuhi keperluan operasional perusahaan dan office supply seperti kertas rim, printer supplies, dan aksesoris computer. Perusahaan kami berdiri pada tanggal 06 maret 2002 dan telah memiliki status berbadan hukum tetap.\n" +
                "\n" +
                "Seiring dengan perkembangan teknologi yang demikian pesat dan semakin tingginya minat konsumen terhadap produk-produk aksesoris terutama para pengguna komputer, maka kami memberanikan diri untuk menjual produk – produk tersebut. Tingginya pangsa pasar / market share para pengguna komputer khususnya dikalangan gamers membuat kami momfokuskan diri untuk mengembangkan lini produk kami yaitu Rexus untuk masuk di segmen ini sehingga dapat diterima oleh konsumen.\n" +
                "\n" +
                "Rexus memiliki berbagai keunggulan dibandingkan para kompetitor sejenis yang menawarkan produk yang sama. Selain dari harga yang terjangkau, Rexus memiliki desain yang menarik, elegan, dan stylish. Sebagai suatu merk yang bisa dikatakan pemain baru dalam segmen ini, Rexus telah memiliki positioning tersendiri dikalangan para pelanggan di tanah air sehingga banyak diantara mereka yang menantikan kehadiran produk-produk terbaru yang ditawarkan Rexus.");
        ob4.setLogo(R.drawable.logo_rexus);
        ob4.setShare(R.drawable.ic_share);
        holder.add(ob4);

        Model ob5 = new Model();
        ob5.setTitle("Razer");
        ob5.setDesc("Razer began as a San Diego, California based subsidiary of kärna LLC in 1998, created to develop and market a high-end computer gaming mouse, the Boomslang, targeted to computer gamers. Kärna ceased operations in 2000 due to financial issues. The current iteration of Razer was founded in 2005 by Min-Liang Tan, a Singaporean NUS graduate,[3] and Robert Krakoff after they procured the rights to the Razer brand following a large investment from Hong Kong tycoon Li Ka-shing and Singaporean holding company Temasek Holdings.[4][5]\n" +
                "\n" +
                "Razer bought the software assets of the Android-based microconsole Ouya from its parent company Ouya Inc. on 27 July 2015, while the hardware was discontinued.[6][7] Ouya's technical team joined Razer's team in developing their own microconsole, which was called the Forge TV. This was also discontinued, less than a year later.[8][9][10][11] On 21 May 2019, Razer released a statement that announced that online accounts and services would be discontinued on 25 June 2019. According to Razer, most apps will become unusable on the platform, many relying on the user accounts to work. Razer suggests that users may be able to transfer purchases to other storefront platforms like Google Play, if developers and publishers agree to such.[12]\n" +
                "\n" +
                "In October 2016, Razer purchased THX from Creative Technology according to THX CEO Ty Ahmad-Taylor.[13]\n" +
                "\n" +
                "In January 2017, Razer bought manufacturer Nextbit, the startup behind the Robin smartphone.[14] Shortly after in November that, Razer unveiled the Razer Phone, its first smartphone whose design is based on that of the Robin.[15] They announced the Razer Phone 2 in October 2018.[16]\n" +
                "\n" +
                "In July 2017, Razer filed to go public through an IPO in Hong Kong.[17] In October of the same year, it was confirmed that Razer plans to offer 1,063,600,000 shares at a range of $0.38-$0.51.[18] On 14 November, Razer was officially listed on Hong Kong stock exchange under the stock code 1337, a reference to leet speak commonly used by gamers.[19] Razer's IPO closed 18% up on the first day of trading and was the 2nd most successful IPO of 2017 in Hong Kong.[20]\n" +
                "\n" +
                "In April 2018, Razer announced that it was planning to fully acquire the e-payments platform MOL for about $61 million.[21]\n" +
                "\n" +
                "In July 2018, Razer made its debut in Malaysia by launching an e-wallet service called Razer Pay.[22]\n" +
                "\n" +
                "In February 2019, Razer announced it was closing its Razer Game Store as part of the company's realignment plans.[23]\n" +
                "\n" +
                "In October 2020, Razer announced it was launching a new virtual prepaid debit card starting with Singapore in January 2021.[24][25]\n" +
                "\n" +
                "In February 2021, CEO Tan Min-Liang announced that Razer's new Southeast Asian headquarters located in Singapore will open in the second quarter of 2021.[26] Razer plans to hire up to 1,000 positions for the new headquarters.[27]");
        ob5.setLogo(R.drawable.logo_razer);
        ob5.setShare(R.drawable.ic_share);
        holder.add(ob5);

        Model ob6 = new Model();
        ob6.setTitle("Corsair");
        ob6.setDesc("Corsair Gaming, Inc., commonly referred to as Corsair, is an American computer peripherals and hardware company headquartered in Fremont, California. The company, known previously as Corsair Components and Corsair Memory,[3] was incorporated in California in January 1994 as Corsair Microsystems and was reincorporated in Delaware in 2007.[3] Corsair designs and sells a range of products for computers, including high-speed DRAM modules, ATX power supplies (PSUs), USB flash drives (UFDs), CPU/GPU and case cooling, gaming peripherals (such as keyboards or computer mice), computer cases, solid-state drives (SSDs), and speakers.[4]\n" +
                "\n" +
                "In addition to its headquarters in Fremont, California,[5] Corsair maintains a production facility in Taoyuan City, Taiwan, for assembly, test, and packaging of select products, distribution centers in Asia, the United States, and Europe, and has sales and marketing offices throughout the United States as well as several European and Asian countries. The company trades under the ticker symbol CRSR, having been listed in the NASDAQ stock exchange[2] during the COVID-19 pandemic, which resulted in lockdown orders that led to a significant increase in Corsair's revenue.[6]");
        ob6.setLogo(R.drawable.logo_corsair);
        ob6.setShare(R.drawable.ic_share);
        holder.add(ob6);

        Model ob7 = new Model();
        ob7.setTitle("Bloody");
        ob7.setDesc("A4Tech Co., Ltd. is a Taiwanese computer hardware and electronics company headquartered in New Taipei, Taiwan. A4Tech Co., Ltd. was founded in 1987. Its products include computer peripherals such as keyboards, mice, PC cameras, hubs, headsets, speakers and gaming devices. In 2011, A4Tech launched its secondary PC gaming brand - Bloody Gaming. Initial products focused around integration of optical switches into gaming peripherals - specifically keyboards and gaming mice.\n" +
                "\n" +
                "At the CES 2018[3] expo in Las Vegas, Bloody introduced the third generation of Light Strike technology (dubbed LK Libra) and launched its full upgraded keyboard portfolio by February 2018.");
        ob7.setLogo(R.drawable.logo_bloody);
        ob7.setShare(R.drawable.ic_share);
        holder.add(ob7);

        Model ob8 = new Model();
        ob8.setTitle("HyperX");
        ob8.setDesc("Kingston Technology Corporation is an American multinational computer technology corporation that develops, manufactures, sells and supports flash memory products and other computer-related memory products, as well as the HyperX brand of headsets, solid-state drives, keyboards, mousepads and other gaming equipment. Headquartered in Fountain Valley, California, United States, Kingston Technology employs more than 3,000 employees worldwide as of Q1 2016. The company has manufacturing and logistics facilities in the United States, United Kingdom, Ireland, Taiwan, and China.\n" +
                "\n" +
                "It is the largest independent producer of DRAM memory modules, owning approximately 68% of the third-party worldwide DRAM module market share in 2017, according to DRAMeXchange.[2] In 2018 the company generated $7.5 billion in revenue and made #53 on the Forbes Lists of \"America's Largest Private Companies 2019.\"[3] Kingston serves an international network of distributors, resellers, retailers and OEM customers on six continents. The company also provides contract manufacturing and supply chain management services for semiconductor manufacturers and system OEMs.");
        ob8.setLogo(R.drawable.logo_hyperx);
        ob8.setShare(R.drawable.ic_share);
        holder.add(ob8);

        Model ob9 = new Model();
        ob9.setTitle("Fantech");
        ob9.setDesc("Fantech is more than just a company of gaming gears, we are also your partner of gaming innovation. The owner of Fantech , Mr. Fandy Pinardy said:” we are not designing, manufacturing and marketing our products only by ourselves. We are build a long-term relationships with our gamers as well, we think on affordability while maintaining high-qualities and we also marked breakthroughs in the science of gaming products.”");
        ob9.setLogo(R.drawable.logo_fantech);
        ob9.setShare(R.drawable.ic_share);
        holder.add(ob9);

        Model ob10 = new Model();
        ob10.setTitle("Madcatz");
        ob10.setDesc("Mad Catz Global Limited (formerly Mad Catz Interactive, Inc.) is an American company that provides interactive entertainment products marketed under Mad Catz, GameShark (gaming products) and TRITTON (audio products). Mad Catz developed flight simulation software through its internal ThunderHawk Studios, developed chess hardware and flight simulation under its Saitek brand, published games under its Mad Catz brand, and distributed games and video game products for third-party partners. The company was incorporated in Canada and headquartered in San Diego, California.[2] Mad Catz had offices in North America, Europe and Asia.[2]");
        ob10.setLogo(R.drawable.logo_madcatz);
        ob10.setShare(R.drawable.ic_share);
        holder.add(ob10);

        return holder;
    }
}