package com.experiment_classes;

public class Flower {
    private String family;
    private String kind;

    public Flower(String family, String kind) {
        this.family = family;
        this.kind = kind;
    }

    public Flower() {
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "family='" + family + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
