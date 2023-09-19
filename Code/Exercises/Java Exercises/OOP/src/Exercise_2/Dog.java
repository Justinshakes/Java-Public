package Exercise_2;

public class Dog {
    String name;
    String attribute;
    Dog(String name,String attribute){
        this.name = name;
        this.attribute = attribute;
    }

    public String toString(){
        return "Name: " + this.name + "  Attribute: " + attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
