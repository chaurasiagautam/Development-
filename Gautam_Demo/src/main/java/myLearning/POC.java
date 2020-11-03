package main.java.myLearning;


import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class POC {

    List<Person> personList;

    static class Person {
        LocalDate age;
        int id;
        String name;
        double salary;
        String gender;

        public Person(LocalDate age, int id, String name, double salary, String gender) {
            this.age = age;
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.gender = gender;
        }

        public LocalDate getAge() {
            return age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public String getGender() {
            return gender;
        }

        public static void print(Person person){
            System.out.println(person.toString());
        }

        public static boolean getAgeDiffYear(Person person){
            return Period.between(person.getAge(), LocalDate.now()).getYears() > 20;
        }

        @Override
        public String toString() {
            LocalDate curDate = LocalDate.now();
            String ageStr = "Number of Years "+Period.between(this.age, curDate).getYears() +" Number of Months  "
                    + Period.between(this.age, curDate).getMonths() +" Number of Days  "
                    + Period.between(this.age, curDate).getDays() ;
            return ageStr;
        }

    }

    public static void main(String[] args){
        POC poc = new POC();
        /*poc.personList = poc.fillList();
        poc.personList.forEach(Person::print);
        List<Person> list = poc.personList.stream().filter(x -> {
            return Person.getAgeDiffYear(x);
        }).collect(Collectors.toList());
        System.out.println(list.size());

        System.out.println("Average Salary is: "+list.parallelStream().mapToDouble((x) -> (double) x.getSalary()).average().getAsDouble());
        System.out.println(list.parallelStream().mapToDouble((x) -> (double) x.getSalary()).summaryStatistics());*/
        poc.dummy();

    }

    private List fillList(){
        List list = new ArrayList<Person>();
        list.add(new Person(LocalDate.parse("1992-11-04"),1,"Gautam",100.0,"Male"));
        list.add(new Person(LocalDate.parse("1993-11-04"),1,"Gauta",10.0,"Male"));
        list.add(new Person(LocalDate.parse("1994-12-04"),1,"Gautm",1300.0,"Male"));
        list.add(new Person(LocalDate.parse("2004-11-04"),1,"Gauam",1060.0,"Male"));
        list.add(new Person(LocalDate.parse("1996-08-04"),1,"Gatam",1.0,"Male"));
        list.add(new Person(LocalDate.parse("1997-11-04"),1,"Gutam",1800.0,"Male"));
        list.add(new Person(LocalDate.parse("2000-05-04"),1,"autam",1090.0,"Male"));
        list.add(new Person(LocalDate.parse("1999-11-04"),1,"tam",100.01,"Male"));
        return list;
    }

    private void dummy(){

       CharSequence separator;
       StringJoiner sb = new StringJoiner(",");
       for(int i=1;i<4;i++){
           sb.add("Hi");
       }
        System.out.println(sb.toString());
        String test = null;
        String one = Optional.ofNullable(test).orElse("");
        System.out.println(one );
        System.out.println(one.toLowerCase());

    }
}

