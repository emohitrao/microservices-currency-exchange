package com.training.microservice.model;

public class Limit {

    private Integer maximum;

    private Integer minimum;

    protected Limit() {
    }

    public Limit(Integer maximum, Integer minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public Integer getMinimum() {
        return minimum;
    }
}
