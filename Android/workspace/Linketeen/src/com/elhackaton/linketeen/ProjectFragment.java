package com.elhackaton.linketeen;

import com.elhackaton.api.ApiServer;
import com.elhackaton.models.Project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProjectFragment extends Fragment{
	private static final String ARG_ID = "arg_id";
	
    public static ProjectFragment newInstance(int sectionNumber) {
    	ProjectFragment fragment = new ProjectFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_ID, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
	
	public ProjectFragment(){}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_project, container, false);
        
        int id = this.getArguments().getInt(ARG_ID);
        Project proyect = ApiServer.getProyectData(id);
        
        TextView title = (TextView)rootView.findViewById(R.id.titleProyect);
        title.setText(proyect.getTitle());
        
        TextView description = (TextView)rootView.findViewById(R.id.descriptionProyect);
        description.setText(proyect.getDescription());
        
        return rootView;
    }
}
