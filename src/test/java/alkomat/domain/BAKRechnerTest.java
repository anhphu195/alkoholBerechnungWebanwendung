package alkomat.domain;

import org.junit.Assert;
import org.junit.Test;


public class BAKRechnerTest {
    private double verteilungsfaktorVonMann = 0.7;
    private double verteilungsfaktorVonFrau = 0.6;

    @Test
    public void ersteSituationMitMaennlichenPersonUndeinemGetraenk() {
        double volumenanteil = 0.05;
        double getrunkend = 500;
        double massenPerson = 70;
        double massenAlkohol = volumenanteil * 0.8 * getrunkend;
        Person person = new Person(massenPerson,verteilungsfaktorVonMann);
        Getraenk getraenk = new Getraenk();
        getraenk.setLiters(new double[]{getrunkend});
        getraenk.setVolumenanteils(new double[]{volumenanteil});
        BAKRechner bakRechner = new BAKRechner(person,getraenk);
        double bak = Math.round(10.0*(massenAlkohol/(massenPerson*verteilungsfaktorVonMann)))/10.0;
        Assert.assertEquals(bak,bakRechner.getBAK(),0);
    }
    @Test
    public void zweiteSituationMitWeiblichenPersonUndeinemGetraenk() {
        double volumenanteil = 0.025;
        double getrunkend = 250;
        double massenPerson = 50;
        double massenAlkohol = volumenanteil * 0.8 * getrunkend;
        Person person = new Person(massenPerson,verteilungsfaktorVonFrau);
        Getraenk getraenk = new Getraenk();
        getraenk.setLiters(new double[]{getrunkend});
        getraenk.setVolumenanteils(new double[]{volumenanteil});
        BAKRechner bakRechner = new BAKRechner(person,getraenk);
        double bak = Math.round(10.0*(massenAlkohol/(massenPerson*verteilungsfaktorVonFrau)))/10.0;
        Assert.assertEquals(bak,bakRechner.getBAK(),0);
    }
    @Test
    public void dritteSituationMitMaennlichenPersonUndMehrEinemGetraenk() {
        double volumenanteil1 = 0.025;
        double getrunkend1 = 250;
        double volumenanteil2 = 0.06;
        double getrunkend2 = 500;
        double massenPerson = 80;
        double massenAlkohol = volumenanteil1 * 0.8 * getrunkend1 + volumenanteil2 * 0.8 * getrunkend2;
        Person person = new Person(massenPerson,verteilungsfaktorVonMann);
        Getraenk getraenk = new Getraenk();
        getraenk.setLiters(new double[]{getrunkend1,getrunkend2});
        getraenk.setVolumenanteils(new double[]{volumenanteil1,volumenanteil2});
        BAKRechner bakRechner = new BAKRechner(person,getraenk);
        double bak = Math.round(10.0*(massenAlkohol/(massenPerson*verteilungsfaktorVonMann)))/10.0;
        Assert.assertEquals(bak,bakRechner.getBAK(),0);
    }
    @Test
    public void vierteSituationMitWeiblichenPersonUndMehrEinemGetraenk() {
        double volumenanteil1 = 0.025;
        double getrunkend1 = 250;
        double volumenanteil2 = 0.05;
        double getrunkend2 = 250;
        double massenPerson = 40;
        double massenAlkohol = volumenanteil1 * 0.8 * getrunkend1 + volumenanteil2 * 0.8 * getrunkend2;
        Person person = new Person(massenPerson,verteilungsfaktorVonFrau);
        Getraenk getraenk = new Getraenk();
        getraenk.setLiters(new double[]{getrunkend1,getrunkend2});
        getraenk.setVolumenanteils(new double[]{volumenanteil1,volumenanteil2});
        BAKRechner bakRechner = new BAKRechner(person,getraenk);
        double bak = Math.round(10.0*(massenAlkohol/(massenPerson*verteilungsfaktorVonFrau)))/10.0;
        Assert.assertEquals(bak,bakRechner.getBAK(),0);
    }
}