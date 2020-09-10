package com.example.gadsleaderboard;

public class Learners {
    private String learner_name;
    private String learner_details;
    private int learner_img;

    public Learners(String learner_name, String learner_details, int learner_img) {
        this.learner_name = learner_name;
        this.learner_details = learner_details;
        this.learner_img = learner_img;
    }

    public String getLearner_name() {
        return learner_name;
    }

    public String getLearner_details() {
        return learner_details;
    }

    public int getLearner_img() {
        return learner_img;
    }

    public void setLearner_name(String learner_name) {
        this.learner_name = learner_name;
    }

    public void setLearner_details(String learner_details) {
        this.learner_details = learner_details;
    }

    public void setLearner_img(int learner_img) {
        this.learner_img = learner_img;
    }
}
