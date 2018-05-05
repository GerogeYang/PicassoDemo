package com.tcl.picassodemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * 项目名：   PicassoDemo
 * 包名：     com.tcl.picassodemo
 * 文件名：   ImageAdapter
 * 创建者：   Mr Yang
 * 创建时间： 2018/5/3 18:00
 * 描述：     使用Picasso加载图片
 */


public class ImageAdapter extends BaseAdapter {
    private static final String TAG = ImageAdapter.class.getName();
    private Context mContext;
    private List<ImageInfos> imageInfosList;
    private LayoutInflater mInflater;

    public ImageAdapter(Context context, List<ImageInfos> list) {
        mContext = context;
        imageInfosList = list;
        mInflater = LayoutInflater.from(mContext);
    }


    @Override
    public int getCount() {
        return imageInfosList.size();
    }

    @Override
    public Object getItem(int position) {
        return imageInfosList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (null == convertView){
            holder = new ViewHolder();
            convertView=mInflater.inflate(R.layout.image_item, null);
            holder.image_title = convertView.findViewById(R.id.image_title);
            holder.image_author = convertView.findViewById(R.id.image_author);
            holder.image_view = convertView.findViewById(R.id.image_view);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String title = mContext.getString(R.string.iv_title) + imageInfosList.get(position).getTitle();
        holder.image_title.setText(title);
        String author = mContext.getString(R.string.iv_author) + imageInfosList.get(position).getAuthor();
        holder.image_author.setText(author);
        Picasso.get()
                .load(imageInfosList.get(position).getPicUrl())
                .transform(new CropSquareTransformation())
                .placeholder(R.drawable.user_placeholder)
                .error(R.drawable.user_placeholder_error)
                .into(holder.image_view);
        return convertView;
    }

    private static class ViewHolder{
        private TextView image_title;
        private TextView image_author;
        private ImageView image_view;
    }
}
