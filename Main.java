import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
try {
Service1 service = new Service1();
Service1 metoda = new Service1();
int k=0;
  while(true)
  {
System.out.println("\nWybierz co chcesz zrobic\n1.Dopisac studenta\n2.Wyswietlic studentow\n3.Znajdz studenta\n4.Wyjdz\n");
Scanner scanner = new Scanner(System.in);
int opcja = scanner.nextInt();
String imie = scanner.nextLine();
int wiek;
String data;
switch(opcja)
{
case 1:
  System.out.println("Wpisz imie");
  imie = scanner.nextLine();
  System.out.println("Wpisz wiek");
  wiek = scanner.nextInt();
  System.out.println("Wpisz date");
  scanner.nextLine();
  data = scanner.nextLine();
  System.out.println("Dodano studenta");
  metoda.addStudent(new Student(imie, wiek, data));
break;
    
case 2:
  var students = service.getStudents();
  for(Student current : students) {
  System.out.println(current.ToString());
  }
break;

case 3:
System.out.println("Imie szukanego studenta");
String szukanie = scanner.nextLine();
service.findStudentByName(szukanie);
break;

case 4:
k=1;
break;
}
    if (k==1)break;
}
}
catch (IOException e) {
}
}
}