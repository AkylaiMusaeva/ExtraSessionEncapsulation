/**Task 3
 Phone деген класс тузгуло
 Phone дун полелери
 phoneName
 model
 memory
 person
 Person го Phone phone деген поля кошкула
 Phone ду сактап жатканда бир person го байланып калыш керек
 Эгерде ошол person до уже phone бар болсо, жаны тузулуп аткан phone сакталбашы керек
 */
public class Phone {
    private String phoneName;
    private String model;
    private int memory;
    private Person person;

    public Phone(String phoneName,String model,int memory,Person person){
        this.phoneName = phoneName;
        this.model = model;
        this.memory = memory;
        this.person = person;
    }
    public Phone(){

    }
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", person=" + person +
                '}';
    }
}


