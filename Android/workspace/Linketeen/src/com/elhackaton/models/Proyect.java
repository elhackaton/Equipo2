package com.elhackaton.models;

import java.util.List;

public class Proyect {
	private int id;
	private String title;
	private String description;
	private List<String> urlPhotos;
	
	public Proyect(int id, String title, String description, List<String> urlPhotos){
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
}
