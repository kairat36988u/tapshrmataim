public class Dancer extends Person {
    private String whatyoucando;

    public Dancer(String name, int age, String profession,String whatyoucando) {
        super(name, age, profession);
        this.whatyoucando=whatyoucando;
    }

    public String getWhatyoucando() {
        return whatyoucando;
    }

    public void setWhatyoucando(String whatyoucando) {
        this.whatyoucando = whatyoucando;
    }

    @Override
    public String toString() {
        return "Programmer{"+
                "Name'=" + getName()+'\''+
                ",Age '" +getAge()+'\''
                +",Profession'" +getProfession()+
                ",whatyoucando='" + whatyoucando + '\'' +
                '}';
    }
}
