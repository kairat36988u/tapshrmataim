public class MyClass {
    private String surname;
    private String name;
    private int age;
    private String[] Peaksoft;
    private String food;

    public MyClass() {

    }

    public MyClass(String surname, String name, int age, String [] peaksoft ) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.Peaksoft=peaksoft;

    } public MyClass(String food) {
        this.food = food;

    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getPeaksoft() {
        return Peaksoft;
    }

    public void setPeaksoft(String[] peaksoft) {
        Peaksoft = peaksoft;
    }

    public String getfood() {
        return food;
    }

    public void setfood(String food) {
        this.food = food;
    }

    public MyClass(String[] peaksoft) {
        Peaksoft = peaksoft;
    }
}
