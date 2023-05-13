public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
     void print(){
        System.out.println("Adi: " + name);
        System.out.println("No \t: " + mpno);
        System.out.println("Branşi \t: " + branch);
     }
}