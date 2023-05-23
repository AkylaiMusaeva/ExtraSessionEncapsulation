import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Class Person,Task1*/
        Person[] personsMassive = new Person[20];
        int arrayIndex = 0;
        long idGen = 1000000;


        Library library=new Library("2ая библиотека","Bokonbaev 186");
        long idGenBook=1000;

        Scanner scanner = new Scanner(System.in);
        String operation = " ";

        while (!operation.equals("x")) {
            System.out.println("\n-------------------");
            System.out.println("Operations: ");
            System.out.println("1. save person");
            System.out.println("2. get all persons");
            System.out.println("3. create phone");
            System.out.println("4. save book");

            System.out.println("---------------------");
            System.out.print("write operation: ");
            operation = scanner.nextLine();

            switch (operation) {
                case "1": {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter your name");
                    String name = scanner1.nextLine();

                    System.out.println("write your age");
                    int age = scanner1.nextInt();

                    Person person = savePerson(name, age, idGen);
                    personsMassive[arrayIndex] = person;


                    arrayIndex++;
                    idGen++;
                    System.out.println(person);
                    break;
                }
                case "2": {
                    getAllPersons(personsMassive);
                    break;
                }
                case "3":{
                    Scanner scanner2=new Scanner(System.in);
                    System.out.println("Write your phoneName ");
                    String phoneName=scanner2.nextLine();
                    System.out.println("Write phoneModel ");
                    String model=scanner2.nextLine();
                    System.out.println("Write phone memory");
                    int memory=scanner2.nextInt();
                    System.out.println("Write person id ");
                    long personId=scanner2.nextLong();

                    Person person=null;

                    for(Person p:personsMassive) {
                        if (p != null) {
                            if (p.getId() == personId) {
                                person = p;
                            }
                        }
                    }
                    Phone phone=savePhone(phoneName,model,memory,person);
                    System.out.println(phone);
                    break;
                }
                case "4":{
                    Scanner scanner3=new Scanner(System.in);
                    System.out.println("Write book name");
                    String bookName=scanner3.nextLine();
                    System.out.println("Write pages ");
                    int page=scanner3.nextInt();

                    Book book=saveBook(bookName,page,library,idGenBook);

                    //bookту китепкана беруу
                    library.addBookToLibrary(book);


                    idGenBook++;
                    System.out.println(library);
                    break;
                }
            }
        }
}

    static Person savePerson(String name, int age, long id) {
        return new Person(name, age, id);
    }
    static void getAllPersons (Person[]people) {
        // System.out.println(Arrays.toString(people));
        for (int i = 0; i < people.length - 1; i++) {
            if (people[i] != null) {
                System.out.println(people[i]);
            }
            }
        }
        static Phone savePhone (String phoneName,String model,int memory,Person person){
        return new Phone(phoneName,model,memory,person);
        }
        static Book saveBook(String bookName, int page, Library library, long bookId){
            return new Book(bookName,page,false,library,bookId);

        }
    }