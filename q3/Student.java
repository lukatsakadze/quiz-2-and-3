package oop.q3;

public class Student {
   private String name;
   private String surname;
   private String country;
   private String info;

   public Student(String name, String surname, String country, String info) {
      this.name = name;
      this.surname = surname;
      this.country = country;
      this.info = info;
   }

   public String getName() {
      return this.name;
   }

   public String getSurname() {
      return this.surname;
   }

   public String getCountry() {
      return this.country;
   }

   public String getInfo() {
      return this.info;
   }

   public String toString() {
      return String.format("Student{name='%s', surname='%s', country='%s', info='%s'}", this.name, this.surname, this.country, this.info);
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof Student)) {
         return false;
      } else {
         Student s = (Student)o;
         return this.name.equals(s.name) && this.surname.equals(s.surname) && this.country.equals(s.country) && this.info.equals(s.info);
      }
   }

   public int hashCode() {
      return this.name.hashCode() ^ this.surname.hashCode() ^ this.country.hashCode() ^ this.info.hashCode();
   }
}
