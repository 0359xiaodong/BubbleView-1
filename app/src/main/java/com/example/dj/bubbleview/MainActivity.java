package com.example.dj.bubbleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BubbleView mCircleView;
    private List<PeopleDistributionInfo> mInfoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCircleView = (BubbleView) findViewById(R.id.circle_view);
        mInfoList = new ArrayList<>();
        mInfoList.add(new PeopleDistributionInfo("area1", 9));
        mInfoList.add(new PeopleDistributionInfo("area2", 8));
        mInfoList.add(new PeopleDistributionInfo("area3", 7));
        mInfoList.add(new PeopleDistributionInfo("area4", 6));
        mInfoList.add(new PeopleDistributionInfo("area5", 5));
        mInfoList.add(new PeopleDistributionInfo("area6", 4));
        mInfoList.add(new PeopleDistributionInfo("area7", 3));
        mInfoList.add(new PeopleDistributionInfo("area8", 2));

        mCircleView.bindData(mInfoList);
    }
}
