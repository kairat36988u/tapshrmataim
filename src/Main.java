import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(" Nuridinov","Kairat",18,new String[]{"Sofkils ","Englsh","java"});
        System.out.println("Surname : "+myClass.getSurname()+"\n"+"Name : " +myClass.getName()+"\n"+"Age : "+myClass.getAge()+"\n"+"Which classes will be attended : "+ Arrays.toString(myClass.getPeaksoft()));

        MyClass myClass1=new MyClass("Manty");
        System.out.println("Food : "+myClass1.getfood());
    }

}