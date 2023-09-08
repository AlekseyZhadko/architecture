package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Camera {

    //TODO: Доработать в рамках ДР
    private List<Point3D> locations;

    private List<Angle3D> angles;

    public List<Angle3D> getAngles() {
        return angles;
    }

    public void setAngles(List<Angle3D> angles) {
        this.angles = angles;
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
