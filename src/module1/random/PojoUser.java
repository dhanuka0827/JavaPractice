package module1.random;

public class PojoUser {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();

        System.out.println(pojo.getName());
        pojo.setName("");

        if(pojo.getName()!=" "){
            System.out.println("Not Null name");
        }else {
            System.out.println("Else null name");
        }

        System.out.println("16 : "+pojo.getName().isEmpty());
    }
}
