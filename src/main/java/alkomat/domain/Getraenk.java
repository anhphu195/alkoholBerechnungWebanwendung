package alkomat.domain;

import lombok.Data;

public @Data
class Getraenk {
    private double[] volumenanteils;
    private double[] liters;

    public double[] getVolumenanteils() {
        return volumenanteils;
    }

    public void setVolumenanteils(double[] volumenanteils) {
        this.volumenanteils = volumenanteils;
    }

    public double[] getLiters() {
        return liters;
    }

    public void setLiters(double[] liters) {
        this.liters = liters;
    }
}
