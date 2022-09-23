package com.org.model;

import java.util.ArrayList;
import java.util.List;

public class TestModelClass {

    private int portNumber;
    private List<String> labels = new ArrayList<>();

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
