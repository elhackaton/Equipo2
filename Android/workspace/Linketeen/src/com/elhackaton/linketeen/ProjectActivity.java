package com.elhackaton.linketeen;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class ProjectActivity extends ActionBarActivity{
	public static String ARG_ID = "arg_id";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyect);

        ProjectFragment proyect = ProjectFragment.newInstance(this.getIntent().getExtras().getInt(ARG_ID));
        this.getSupportFragmentManager().beginTransaction().replace(R.id.proyectCont, proyect).commit();
        
        Typeface myTypeface = Typeface.createFromAsset(this.getAssets(),"HVB_CE.TTF");
        int titleId = getResources().getIdentifier("action_bar_title", "id", "android");
        TextView yourTextView = (TextView) findViewById(titleId);
        yourTextView.setTypeface(myTypeface);
    }
}
