package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Scene {

    //TODO: Доработать в рамках ДР
    private int id;

    private List<PoligonalModel> models;

    private List<Flash> flashes;

    public List<Flash> getFlashes() {
        return flashes;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public Scene(List<Flash> flashes) {
        this.flashes = flashes;
    }

    public Scene(List<Flash> flashes, List<PoligonalModel> models) {
        this.flashes = flashes;
        this.models = models;
    }
}
