package polymorphisam1;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.age = 20;
        a.name = "John";
        System.out.println("Name: " + a.name + " Age: " + a.age);

        System.out.println("DEBUG");

        A a1 = new B();
        a1.age = 22;
        a1.name = "John";
        System.out.println("Name: " + a1.name + " Age: " + a1.age);
//
//      a1.Univname = "Stanford";
        ((B)a1).Univname = "Stanford";
//       a1.dept = "Computer Science";
        ((B)a1).dept = "Computer Science";


        System.out.println("DEBUG");

        B b = new B();
        b.age = 25;
        b.name = "Smith";
        b.Univname = "Stanford";
        b.dept = "Computer Science";
        b.course = "Machine Learning";
        System.out.println("Name: " + b.name + " Age: " + b.age + " University: " + b.Univname + " Department: " + b.dept + " Course: " + b.course);

        System.out.println("DEBUG");


        C c = new C();
        c.age = 30;
        c.name = "David";
        c.Univname = "MIT";
        c.dept = "Electrical Engineering";
        c.course = "VLSI";
        c.companyNmae = "Intel";
        c.location = "Santa Clara";
        System.out.println("Name: " + c.name + " Age: " + c.age + " University: " + c.Univname + " Department: " + c.dept + " Course: " + c.course + " Company: " + c.companyNmae + " Location: " + c.location);

        System.out.println("DEBUG");

    }

}
