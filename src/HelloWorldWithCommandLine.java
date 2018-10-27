public class HellWorldWithCommandLine {
    public static void main(String[] args) {
        if(args.length > 0 ){
            System.out.println("ARGS : " + args[0]);
        }else{
            System.out.println("Standart: Hello World!!!");
        }
    }
}