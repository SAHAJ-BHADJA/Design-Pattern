// Name   : Jay Vekariya
// Roll No: 20BCP125

package singletonPattern;

class TestClass {

    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        object1.setI(10);
        object2.setI(10);                      //Both the objects are reference to a same instance, so final updated value will be considered
        System.out.println(object1.getI());    //object1 as well as object2 will give same output as their point to same address
        object2.i= object1.i+ object2.i;
        System.out.println(object2.getI());

        print("Object 1:", object1);
        print("Object 2:", object2);
        }

        static void print(String name, Singleton obj){
            System.out.printf("Object: %s, Hashcode:%d%n",name,obj.hashCode());
        }
}
