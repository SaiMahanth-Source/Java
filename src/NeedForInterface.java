class Developer{
    public void develop(Comp comp){
        System.out.println("I am Developer");
        comp.application();
    }
}

//class Comp{
//    public void application(){
//        System.out.println("Need either laptop or desktop to start developing application");
//    }
//}
/*
Instead of this Super and subclass creation and overriding method we have concept of interface from where we can
declare methods and override as well
 */

interface Comp{
    void application();
}
class CompanyLaptop implements Comp{
    public void application(){
        System.out.println("Developing application though laptop.");
    }
}

class CompanyDesktop implements Comp{
    public void application(){
        System.out.println("Developing application though desktop.");
    }
}
public class NeedForInterface {
    public static void main(String[] args){

//        CompanyLaptop companyLaptop = new CompanyLaptop();
//        CompanyDesktop companyDesktop = new CompanyDesktop();
        Comp comp = new CompanyDesktop();
        Developer developer = new Developer();
        developer.develop(comp);
    }
}
