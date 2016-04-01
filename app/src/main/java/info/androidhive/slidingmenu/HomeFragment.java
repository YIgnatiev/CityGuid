package info.androidhive.slidingmenu;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HomeFragment extends Fragment implements AdapterView.OnItemClickListener, View.OnClickListener {



    Button button;
	public HomeFragment(){}

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(this);
        GridView gridview = (GridView) rootView.findViewById(R.id.gridView);
        if(gridview != null){
            gridview.setAdapter(new GridAdapter(getActivity()));
        }
        gridview.setOnItemClickListener(this);
        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

       displayView(i);

    }
    private void displayView(int position) {
        Intent intent = new Intent(getActivity(), CategoryActivity.class);

        switch (position) {
            case 0:
                intent.putExtra("id_category", position);
                startActivity(intent);
                break;
            case 1:
                intent.putExtra("id_category", position);
                startActivity(intent);
                break;
            case 2:
                intent.putExtra("id_category", position);
                startActivity(intent);
                break;
            case 3:
                intent.putExtra("id_category", position);
                startActivity(intent);
                break;
            case 4:
                intent.putExtra("id_category", position);
                startActivity(intent);
                break;
            case 5:
                intent.putExtra("id_category", position);
                startActivity(intent);
                break;

            default:
                break;
        }

    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
}

