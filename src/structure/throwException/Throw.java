package structure.throwException;

public class Throw {
    private static void demo(){
        try {
            throw new NullPointerException("demo中的空指针======");
        }catch(NullPointerException e){
            System.out.println("demo中被捕捉到的空指针");

        }
    }

    public static void main(String[] args) {
        try {
            demo();
        }catch (NullPointerException e ){
            System.out.println("主方法捕捉到的空指针"+e);
        }
    }
}
