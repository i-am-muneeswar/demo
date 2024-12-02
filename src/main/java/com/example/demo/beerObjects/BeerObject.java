package com.example.demo.beerObjects;

public class BeerObject {
    private String price;
	private String name;
    private Rating rating;
    private String image;
    private int id;
    
    public static class Rating {
        private double average;
		private int reviews;
		
		public double getAverage() {
			return average;
		}
		public void setAverage(double average) {
			this.average = average;
		}
		public int getReviews() {
			return reviews;
		}
		public void setReviews(int reviews) {
			this.reviews = reviews;
		}
		
    }
    
    public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
}
