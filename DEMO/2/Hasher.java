import java.io.*;

class Hasher {
   public static void main(String[] args) throws Exception {

      //explain the output of the following s.o.p and new lines
      Student student1 = new Student();
      Student student2 = new Student();

      System.out.println(student1);
      System.out.println(student2);

      student1 = new Student();

      System.out.println(student1);
      System.out.println(student2);

      //you are not required to explain the following code
      File f = new File("hash.txt");
      PrintWriter fr = new PrintWriter(f);
      fr.println(student1.toString());
      fr.println(student2.toString());
      fr.println(System.getProperties());
      fr.close();
   }
}
