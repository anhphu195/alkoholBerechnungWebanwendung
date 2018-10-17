package alkomat.domain;

public class BAKRechner {
    private Person person;
    private Getraenk getraenk;
    public BAKRechner(Person person,Getraenk getraenk){
        this.person = person;
        this.getraenk = getraenk;
    }
    public double berechneMassenAnteilAlkohol(){
        double momentMassen = 0.0;
        for (int i = 0; i < getraenk.getVolumenanteils().length; i++) {
            double volumenanteilNummer = getraenk.getVolumenanteils()[i];
            double literNummer = getraenk.getLiters()[i];
            momentMassen += volumenanteilNummer * 0.8 * literNummer;
        }
        return momentMassen;
    }
    public double getBAK(){
        return Math.round(10.0*(berechneMassenAnteilAlkohol()/(person.getMassenPerson()*person.getVerteilungsfaktor())))/10.0;
    }
}
