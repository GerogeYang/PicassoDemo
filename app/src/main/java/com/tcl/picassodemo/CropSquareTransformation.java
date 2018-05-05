package com.tcl.picassodemo;

import android.content.Context;
import android.graphics.Bitmap;

import com.squareup.picasso.Transformation;

/**
 * 项目名：   PicassoDemo
 * 包名：     com.tcl.picassodemo
 * 文件名：   CropSquareTransformation
 * 创建者：   Mr Yang
 * 创建时间： 2018/5/5 21:29
 * 描述：     重写剪裁方法
 */

public class CropSquareTransformation implements Transformation {
    private static final String TAG = CropSquareTransformation.class.getName();

    @Override
    public Bitmap transform(Bitmap source) {
        int size = Math.min(source.getWidth(), source.getHeight());
        int x = (source.getWidth() - size) / 2;
        int y = (source.getHeight() - size) / 2;
        Bitmap result = Bitmap.createBitmap(source, x, y, size, size);
        if (result != source) {
            source.recycle();
        }
        return result;
    }

    @Override
    public String key() {
        return "square()";
    }
}
