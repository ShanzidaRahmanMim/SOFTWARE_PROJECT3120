package com.example.software_project_3_1;
public class ReviewData {
    private float rating;
    private String comment;

    public ReviewData(float rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public float getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
