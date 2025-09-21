import utility.CapitalString;

class Person{
    private String name;
    private String city;

    public Person(){ }

    public Person(String name,String city){
        this.name = name;
        this.city = city;
    }
    public void display(String []x){
        System.out.print("Name : ");
        for(String t : x){
            System.out.print(t+" ");
        }
        System.out.println("\nCity : " + city);
    
    }
}