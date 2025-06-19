package oop.q3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class University {
   private List<Student> students = new ArrayList();

   public void addStudent(Student s) {
      if (s != null) {
         this.students.add(s);
      }

   }

   public boolean removeStudent(Student s) {
      return s == null ? false : this.students.removeIf((x) -> {
         return x.equals(s);
      });
   }

   public void printStudents() {
      if (this.students.isEmpty()) {
         System.out.println("No students enrolled.");
      } else {
         System.out.println("Enrolled Students:");
         Iterator var1 = this.students.iterator();

         while(var1.hasNext()) {
            Student s = (Student)var1.next();
            System.out.println(s);
         }

      }
   }

   public String getStudentInfoStrange(Student s) {
      if (s == null) {
         return null;
      } else {
         boolean isSelf = this.isSelfStudent(s);
         boolean enrolled = this.containsStudent(s);
         if (isSelf) {
            return enrolled ? String.join(", ", this.getCurrentSemesterCourses()) : s.getInfo();
         } else {
            return enrolled ? s.getInfo() : null;
         }
      }
   }

   private boolean containsStudent(Student s) {
      return this.students.stream().anyMatch((x) -> {
         return x.equals(s);
      });
   }

   private boolean isSelfStudent(Student s) {
      return "Luka".equals(s.getName()) && "Tsakadze".equals(s.getSurname()) && "Georgia".equals(s.getCountry()) && "65001001206".equals(s.getInfo());
   }

   private List<String> getCurrentSemesterCourses() {
      return Arrays.asList("Computer Organisation", "Object Oriented Programming", "Mathematical Fundamentals", "English", "Calculus 2");
   }

   public static void main(String[] args) {
      University uni = new University();
      Student luka = new Student("Luka", "Tsakadze", "Georgia", "65001001206");
      uni.addStudent(luka);
      uni.printStudents();
      PrintStream var10000 = System.out;
      String var10001 = uni.getStudentInfoStrange(luka);
      var10000.println("Special Info (you, enrolled): " + var10001);
      uni.removeStudent(luka);
      var10000 = System.out;
      var10001 = uni.getStudentInfoStrange(luka);
      var10000.println("Special Info (you, not enrolled): " + var10001);
   }
}
