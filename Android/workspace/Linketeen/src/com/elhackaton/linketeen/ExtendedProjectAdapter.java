package com.elhackaton.linketeen;

import com.elhackaton.models.Project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class ExtendedProjectAdapter extends ProjectAdapter{

	public ExtendedProjectAdapter(Context context, int resource) {
		super(context, resource);
		// TODO Auto-generated constructor stub
	}

	@Override
    public View getView(int position, View convertView, ViewGroup parent) {

		View row = convertView;
		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService( Context.LAYOUT_INFLATER_SERVICE );
		Project element = getItem(position);

		row = inflater.inflate(R.layout.fragment_project, parent, false);
		
		((TextView)row.findViewById(R.id.titleProyect)).setText(element.getTitle());
		((TextView)row.findViewById(R.id.descriptionProyect)).setText(element.getDescription());
		return row;
	}

}