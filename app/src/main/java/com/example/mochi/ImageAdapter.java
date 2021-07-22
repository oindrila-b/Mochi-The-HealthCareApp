package com.example.mochi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]
            {R.drawable.aff1, R.drawable.aff2,
            R.drawable.aff3,R.drawable.aff4,
            R.drawable.aff5,R.drawable.aff6,
            R.drawable.aff7,R.drawable.aff8,
            R.drawable.aff9,R.drawable.aff10,
            R.drawable.aff11,R.drawable.aff12,
            R.drawable.aff13, R.drawable.aff14,
            R.drawable.aff15,R.drawable.aff16,
            R.drawable.aff17,R.drawable.aff18,
            R.drawable.aff19,R.drawable.aff20,
            R.drawable.aff21};

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      container.removeView((ImageView)object);
    }
}
