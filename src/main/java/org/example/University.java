package org.example;

public class University {
    public String name;
    private String size;
    private String number;
    private boolean distanceEdu;

    public University(String name, String size, String number, boolean distanceEdu) {
        this.name = name;
        this.size = size;
        this.number = number;
        this.distanceEdu = distanceEdu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isDistanceEdu() {
        return distanceEdu;
    }

    public void setDistanceEdu(boolean distanceEdu) {
        this.distanceEdu = distanceEdu;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", number='" + number + '\'' +
                ", distanceEdu=" + distanceEdu +
                '}';
    }
}
