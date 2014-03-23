package com.elhackaton.models;

import java.util.List;

import com.elhackaton.linketeen.ProjectActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;

public class Project {
	private int id;
	private String title;
	private String description;
	private List<String> urlPhotos;
	
	public Project(int id, String title, String description, List<String> urlPhotos){
		setId(id);
		setTitle(title);
		setDescription(description);
		setUrlPhotos(urlPhotos);
	}
	
	public int getId(){
		return id;
	}
	
	private void setId(int id){
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public List<String> getUrlPhotos() {
		return urlPhotos;
	}

	private void setUrlPhotos(List<String> urlPhotos) {
		this.urlPhotos = urlPhotos;
	}
	
	
	public static class Publication{
		private int id;
		private String title;
		private String description;
		
		public Publication(int id, String title, String description){
			setId(id);
			setTitle(title);
			setDescription(description);
		}

		public String getTitle() {
			return title;
		}

		private void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		private void setDescription(String description) {
			this.description = description;
		}

		public int getId() {
			return id;
		}

		private void setId(int id) {
			this.id = id;
		}
	}

/**/
	public void onCLick(View view) {
		// TODO Auto-generated method stub
//		Toast.makeText(view.getContext(), this.title , Toast.LENGTH_SHORT);
		Log.d("Test",title);
		
		Intent intent = new Intent(view.getContext(), ProjectActivity.class);
		intent.putExtra(ProjectActivity.ARG_ID, id);
		view.getContext().startActivity(intent);
	}
/**/
}
