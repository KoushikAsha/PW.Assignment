class person{
    private String Name;
    private int age;
    private String add;
    public void setName(String name){
        this.Name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setadd(String add){
        this.add=add;
    }
    public String getName(){
        return Name;
    }
    public int getage(){
        return age;
    }
    public String getadd(){
        return add;
    }
}
public class Main {
    public static void main(String[] args) {
        person p=new person();
        p.setName("Koushik Pramanick");
        p.setage(31);
        p.setadd("Halisahar Barendro Goli(Main Road) pin 743134");
        System.out.println("Name : " +p.getName());
        System.out.println("Age : " +p.getage());
        System.out.println("Add : " +p.getadd());
    }
}