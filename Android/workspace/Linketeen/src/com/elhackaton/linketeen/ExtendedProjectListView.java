package com.elhackaton.linketeen;

import android.content.Context;

public class ExtendedProjectListView extends ProjectListView{

	public ExtendedProjectListView(Context context, int idTeen) {
		super(context, idTeen);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(){
		adapter = new ExtendedProjectAdapter(getContext(), R.layout.fragment_project);
		this.setAdapter(adapter);
		
//		setOnItemClickListener(new ListSelection());
	}
}
