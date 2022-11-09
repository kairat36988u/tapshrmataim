

public class Programmer extends Person{
    private String whatyoucando;

    public Programmer(String name, int age, String profession , String whatyoucando) {
        super(name, age, profession);
        this.whatyoucando = whatyoucando;
    }


    public String getWhatyoucando() {
        return whatyoucando;
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
