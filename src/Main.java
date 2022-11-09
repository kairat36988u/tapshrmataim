import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Programmer programmer= new Programmer("Kairat",18,"Programist","writes code");
        System.out.println(programmer+"\n");

        Dancer dance=new Dancer("Akylai",15," Dancer","dancing");
        System.out.println(dance+"\n");

        Singer singer =new Singer("Argen",18,"Singe","sings");
        System.out.println(singer);
    }
}