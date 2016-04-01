package info.androidhive.slidingmenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by user on 31.03.16.
 */
public class GridAdapter extends BaseAdapter{
    public Context context1;

    public GridAdapter(Context context) {
        context1 = context;
    }

    private int[] icons = {
            // Temporary
            R.drawable.ic_communities,
            R.drawable.ic_drawer,
            R.drawable.ic_launcher,
            R.drawable.ic_pages,
            R.drawable.ic_people,
            R.drawable.ic_photos,
            R.drawable.ic_whats_hot


    };


    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context1);
            imageView.setLayoutParams(new GridView.LayoutParams(100, 100));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(10, 10, 10, 10);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(icons[position]);
        return imageView;
    }
}
