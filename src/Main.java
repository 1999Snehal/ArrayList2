
import java. util.*;

class AL
{
    public static void main(String args[])
    {
        ArrayList<String> Aobj = new ArrayList<String>();

        Aobj.add("Cat");

        Aobj.add("Dog");
        Aobj.add("Cow");

        System.out.println("Element of ArrayList are : "+Aobj);

        Aobj.add(1,"goat");
        System.out.println("Element of ArrayList are : "+Aobj);

        Aobj.add(3,"sheep");
        System.out.println("Element of ArrayList are : "+Aobj);

        Aobj.remove(1);
        System.out.println("Element of ArrayList are :"+Aobj );

        Aobj.clear();
        System.out.println("Element of ArrayList are : "+Aobj);


    }

}