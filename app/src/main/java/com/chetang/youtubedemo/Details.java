package com.chetang.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Details extends AppCompatActivity {
    RecyclerView detailsview;
    Adapters.DetailsAdapter detailsAdapter;
    RecyclerView.LayoutManager layoutManager;
    Adapters adapters;

    ArrayList<Demodetails> arrayList;
    int slno = 0, length = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        adapters = new Adapters();
        arrayList = new ArrayList<Demodetails>();

        Intent intent = getIntent();
        Bundle bnd = intent.getExtras();
        String pos = bnd.getString("POS");

        if (pos.equals("0")) {
            length = full_dot_net.length;
        } else if (pos.equals("1")) {
            length = csharp_freshers_demo_videos.length;
        } else if (pos.equals("2")) {
            length = csharp_exp_demo_videos.length;
        } else if (pos.equals("3")) {
            length = sql_server_freshers_demo_videos.length;
        } else if (pos.equals("4")) {
            length = sql_server_exp_demo_videos.length;
        }

        for (int i = 0; i < length; i++) {
            slno = i + 1;
            String details = "";
            if (pos.equals("0")) {
                details = full_dot_net[i];
            } else if (pos.equals("1")) {
                details = csharp_freshers_demo_videos[i];
            } else if (pos.equals("2")) {
                details = csharp_exp_demo_videos[i];
            } else if (pos.equals("3")) {
                details = sql_server_freshers_demo_videos[i];
            } else if (pos.equals("4")) {
                details = sql_server_exp_demo_videos[i];
            }
            Demodetails demo = new Demodetails(""+slno, details.substring(0, details.indexOf("/")),
                    details.substring(details.lastIndexOf("/")+1), details.substring(details.indexOf("/")+1, details.lastIndexOf("/")));
            arrayList.add(demo);
        }

        detailsview = (RecyclerView) findViewById(R.id.detailsview);
        layoutManager = new LinearLayoutManager(this);
        detailsAdapter = adapters.new DetailsAdapter(arrayList, this);

        detailsview.setHasFixedSize(true);
        detailsview.setLayoutManager(layoutManager);
        detailsview.setAdapter(detailsAdapter);
    }

    private String[] full_dot_net = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
            "C# class as virtual entity/HSdIq3k51bg/9:15",
            "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51",
            "for-loop/isSp9xjw0LQ/23:46",
            "C# Strings/MGCZ8AHhwDA/21:02",
            "Constructors/5h8Tu68VXsI/5:08",
            "Problems When Constructor is Not Used/Yij6AUta4yI/19:41",
            "Constructors Example/Gr6qsjTIifA/21:07",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03",
            "c# constants/9_fH7R6rPaU/8:57",
            "Constants Part 2/Wn20d0KBk1o/8:22",
            "Read only variables/YfYkswfGo_k/9:27",
            "Params Keyword/wZ_bBpsd10o/16:27",
            "Exceptions/wBxVpzaTXkc/17:16",
            "Exception Handling Part 2/mTF-ct2IkGU/9:25",
            "GC Terminology/eyytXkQqOV0/17:16",
            "Dead objects/YZyKaiM5kuc/8:29",
            "GC Working mechanisam/v-VTR9Xm6Vk/9:51",
            "C# Generics/-xfzPrvKFL0/10:09",
            "C# Generics and Reusability/7g9aPw1kI1o/15:32",
            "C# Delegates/k0evYKS62Tg/7:27",
            "C# Delegates example/Vjc9UHV6tTM/22:38"
    };

    private String[] csharp_freshers_demo_videos = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
            "C# class as virtual entity/HSdIq3k51bg/9:15",
            "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51",
            "for-loop/isSp9xjw0LQ/23:46",
            "C# Strings/MGCZ8AHhwDA/21:02",
            "Constructors/5h8Tu68VXsI/5:08",
            "Problems When Constructor is Not Used/Yij6AUta4yI/19:41",
            "Constructors Example/Gr6qsjTIifA/21:07",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52"
    };

    private String[] csharp_exp_demo_videos = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03",
            "c# constants/9_fH7R6rPaU/8:57",
            "Constants Part 2/Wn20d0KBk1o/8:22",
            "Read only variables/YfYkswfGo_k/9:27",
            "Params Keyword/wZ_bBpsd10o/16:27",
            "Exceptions/wBxVpzaTXkc/17:16",
            "Exception Handling Part 2/mTF-ct2IkGU/9:25",
            "GC Terminology/eyytXkQqOV0/17:16",
            "Dead objects/YZyKaiM5kuc/8:29",
            "GC Working mechanisam/v-VTR9Xm6Vk/9:51",
            "C# Generics/-xfzPrvKFL0/10:09",
            "C# Generics and Reusability/7g9aPw1kI1o/15:32",
            "C# Delegates/k0evYKS62Tg/7:27",
            "C# Delegates example/Vjc9UHV6tTM/22:38"
    };

    private String[] sql_server_freshers_demo_videos = {
            "SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:09"
    };

    private String[] sql_server_exp_demo_videos = {
            "SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:19"
    };
}
