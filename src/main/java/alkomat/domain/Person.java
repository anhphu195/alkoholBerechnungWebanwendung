package alkomat.domain;

import lombok.Data;

public @Data
class Person {
    private double massenPerson;
    private double verteilungsfaktor;

    public Person(double massenPerson, double verteilungsfaktor) {
        this.massenPerson = massenPerson;
        this.verteilungsfaktor = verteilungsfaktor;
    }

    public double getMassenPerson() {
        return massenPerson;
    }

    public double getVerteilungsfaktor() {
        return verteilungsfaktor;
    }

}
