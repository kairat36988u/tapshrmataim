public class Singer extends Person {
    private String whatyoucando;
    public Singer(String name, int age, String profession,String whatyoucando ) {
        super(name, age, profession);
        this.whatyoucando=whatyoucando;
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
