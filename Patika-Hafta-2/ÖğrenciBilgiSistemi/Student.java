public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double average;
    final double sinav=0.8;
    final double sözlü=0.2;

    

    public Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        
    }

    public void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    public void addBulkQuizNote(int extra1, int extra2, int extra3) {
        if (extra1 >= 0 && extra1 <= 100) {
            this.c1.extra = extra1;
        }
        if (extra2 >= 0 && extra2 <= 100) {
            this.c2.extra = extra2;
        }
        if (extra3 >= 0 && extra3 <= 100) {
            this.c3.extra = extra3;
        }
    }

    public void NoteAverage(int note1, int note2, int note3, int extra1, int extra2, int extra3) {
        this.c1.finale = (note1 * sinav) + (extra1 * sözlü);
        this.c2.finale = (note2 * sinav) + (extra2 * sözlü);
        this.c3.finale = (note3 * sinav ) + (extra3 * sözlü);
    }

    public void isPass() {
        System.out.println("====================================");
        this.average = (c1.finale + c2.finale + c3.finale) / 3;
        if (this.average >= 55) {

            System.out.println("Sinifi Geçti");
            printNotes();
            
        } else {

            System.out.println("Sinifta Kaldi");
            printNotes();
            
        }
    }

    void printNotes () {
        System.out.println("Notlar");
        System.out.println(c1.name + " Notu\t\t: " + "Sinav : " + this.c1.note + " (" + ((c1.note * 80) / 100) + ")"
                + " - " + "Sözlü : " + this.c1.extra + " (" + ((c1.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.c1.finale);
        System.out.println(c2.name + " Notu\t\t: " + "Sinav : " + this.c2.note + " (" + ((c2.note * 80) / 100) + ")"
                + " - " + "Sözlü : " + this.c2.extra + " (" + ((c2.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.c2.finale);
        System.out.println(c3.name + " Notu\t: " + "Sinav : "   + this.c3.note + " (" + ((c3.note * 80) / 100) + ")"
                + " - " + "Sözlü : " + this.c3.extra + " (" + ((c3.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.c3.finale);
        System.out.println("Ortalama\t\t: " + this.average);
    }
}