import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
try {
Service1 service = new Service1();
Service1 metoda = new Service1();
System.out.println("Wybierz co chcesz zrobic\n1.Dopisac studenta\n2.Wyswietlic studentow\n3.Wyjdz");
Scanner scanner = new Scanner(System.in);
int opcja = scanner.nextInt();
String imie = scanner.nextLine();
int wiek;
switch(opcja)
{
case 1:
System.out.println("Wpisz imie");
imie = scanner.nextLine();
System.out.println("Wpisz wiek");
wiek = scanner.nextInt();
System.out.println("Dodano studenta");
metoda.addStudent(new Student(imie, wiek));
break;
case 2:
var students = service.getStudents();
for(Student current : students) {
System.out.println(current.ToString());
}
break;
case 3:
break;
}
}
catch (IOException e) {
}
}
}