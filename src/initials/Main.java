package initials;

public class Main{
    public static void main(String[] args) {
     Birds perry=new Birds("Perry",2,"Colourful",true,true);
        System.out.println(perry.getName());
        perry.food("Meat");
        perry.food(50);

        Dog grey=new Dog("Grey",4,"Brown",false,true);
        grey.food("Bread");
        grey.food(250);


        System.out.println("\n\n\n\n");




        Car BMW =new Car("B.M.W",'i',4,"Black",new Engine("Bxs-4",8000,7.205));
        System.out.println(BMW.getModel_no());
        System.out.println(BMW.getEngine().getName());
        System.out.println(BMW.getEngine().getRpm());
        System.out.println(BMW.getEngine().getWeight());
        System.out.println(BMW.getColor());
        BMW.setColor("Red")            ;
        System.out.println(BMW.getColor());
    }
}
