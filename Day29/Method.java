package Day29;

public class Method {
//    static void name(int a,int b){  ///yaha int a or int b ko parameter kehte hai
//        System.out.println(a+b);
//    }
//
//
//    static void main() {
//        name(10,20); ///jb hm method ko call krte hai to yaha 10,20  actual value hai jinhe argument kete hai
//    }
    static void sayName(String name){
        System.out.println(name);

    }

    static void main() {
        sayName("Anand");
        sayName("Aman");
        sayName("Shubham");

    }
}
