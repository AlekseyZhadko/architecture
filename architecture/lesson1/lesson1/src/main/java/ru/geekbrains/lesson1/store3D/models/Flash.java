package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Flash {

    //TODO: Доработать в рамках ДР
    private List<Point3D> locations;

    private List<Angle3D> angles;

    private List<Color> colors;

    private float power;

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public List<Angle3D> getAngles() {
        return angles;
    }

    public void setAngles(List<Angle3D> angles) {
        this.angles = angles;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public List<Point3D> getLocations() {
        return locations;
    }

    public void setLocations(List<Point3D> locations) {
        this.locations = locations;
    }

    void Rotate(Angle3D angle) {}

    void Move(Point3D point) {}
}
