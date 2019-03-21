package cn.edu.gdpt.xxgcx.a3dalbum171000hwh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends BaseAdapter {
    private List<AlbumBean> dataList = new ArrayList<>();//数据集合对象
    private Context context;
    public AlbumAdapter(Context context) {
        this.context = context;//上下文
    }
    public  void setData(List<AlbumBean> dataList){//赋值方法
        this.dataList=dataList;
    }
    @Override
    public int getCount() {//反馈回数量
        return dataList.size();
    }
    @Override
    public Object getItem(int position) {//反馈回对象
        return dataList.get(position);
    }
    @Override
    public long getItemId(int position) {//反馈回位置
        return position;
    }
    class ViewHolder{
        public ImageView iv_img;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view==null) {//获取布局文件
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_album, null);//布局界面.
            ViewHolder holder = new ViewHolder();
            holder.iv_img=view.findViewById(R.id.iv_img);//布局界面上的图片空间
            view.setTag(holder);
        }
        ViewHolder viewHolder = new ViewHolder();
        viewHolder.iv_img=view.findViewById(R.id.iv_img);//布局界面上的图片空间
        viewHolder.iv_img.setImageResource(dataList.get(position).imgRsId);//图片赋值
        return view;
    }
}
