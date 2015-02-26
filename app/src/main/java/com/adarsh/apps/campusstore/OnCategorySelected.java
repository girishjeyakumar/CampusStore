package com.adarsh.apps.campusstore;

/**
 * Created by Adarsh on 26-02-2015.
 */


        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.AdapterView.OnItemSelectedListener;
        import android.widget.Toast;

public class OnCategorySelected implements OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
        Toast.makeText(parent.getContext(),
                "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}