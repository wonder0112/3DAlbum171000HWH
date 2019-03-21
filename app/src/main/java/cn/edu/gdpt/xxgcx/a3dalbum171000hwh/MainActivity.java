package cn.edu.gdpt.xxgcx.a3dalbum171000hwh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.TextSwitcher;

import com.itheima.coverflow.ui.FeatureCoverFlow;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//变量声明
    private FeatureCoverFlow coverflow;
    private TextSwitcher title;
    private List<AlbumBean> dataList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//调用初始化函数
        initData();
        initCoverFlow();
    }
    private void initCoverFlow() {
        AlbumAdapter adapter = new AlbumAdapter(getApplicationContext());
        adapter.setData(dataList);
        coverflow.setAdapter(adapter);
    }
    private void initData() {
        dataList.add(new AlbumBean(R.drawable.img_1, "Gril"));
        dataList.add(new AlbumBean(R.drawable.img_2, "Gril2"));
        dataList.add(new AlbumBean(R.drawable.img_3, "Gril3"));
        dataList.add(new AlbumBean(R.drawable.img_4, "Gril4"));
        dataList.add(new AlbumBean(R.drawable.img_5, "Gril5"));
    }
    private void initView() {//初始化函数
        coverflow = (FeatureCoverFlow) findViewById(R.id.fcf_coverflow);
        title = (TextSwitcher) findViewById(R.id.ts_title);
        //FeatureCoverFlow属性设置
        coverflow.setCoverWidth(315);
        coverflow.setCoverHeight(488);
        coverflow.setMaxScaleFactor(2f);
        coverflow.setReflectionGap(0);
        coverflow.setRotationTreshold(0.5f);
        coverflow.setScalingThreshold(0.5f);
        coverflow.setSpacing(0.6f);

    }
}
