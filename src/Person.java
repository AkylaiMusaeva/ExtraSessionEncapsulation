/**# Task 1

 1. Person деген класс тузгуло
 2. Person дун полелери
 - personName
 - age
 - id
 1. Main класста person сактай турчу массив тузгуло
 2. Person ду сактай турчу Person createPerson(values) деген метод тузгуло
 3. Person дун id полясы уникальный болуш керек

 Task 2
 ToString ти колдонуп main класста баардык person дорду чыгарып берчу метод тузгуло void getAllPerson (array of person)
 */
public class Person {
    private String personName;
    private int age;
    private long id;
    public Person(String personName, int age, long id) {
        this.personName = personName;
        this.age = age;
        this.id = id;
    }
    public Person(){

    }
    public void setPersonName(String personName){
        this.personName=personName;
    }
    public String getPersonName(){
        return personName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setId(int id){
        this.id=id;
    }
    public long getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

}
