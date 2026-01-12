public class Main {

    public static void main(String[] args) {

        // length
        String var1 = "lion";
        System.out.println(var1.length());


        // charAt()
        String var2 = "this is me";
        System.out.println(var2.charAt(6));


        // equals()
        String name1 = "neel";
        String name2 = "Neel";
        System.out.println(name1.equals(name2));


        // equalsIgnoreCase()
        System.out.println(name1.equalsIgnoreCase(name2));


        // substring()
        String var3 = "LionKing";
        System.out.println(var3.substring(4, var3.length()));


        // toUpperCase()
        String var4 = "lion";
        System.out.println(var4.toUpperCase());


        // toLowerCase()
        String var5 = "LEO";
        System.out.println(var5.toLowerCase());


        // trim()
        String var6 = "   Neel    ";
        System.out.println(var6.trim());


        // replace()
        String var7 = "mango";
        System.out.println(var7.replace("man", "tan"));

        // other methods

        // contains()
        // startsWith()
        // endsWith()
        // isEmpty()
        // isBlank()

        // String.format()
        String firstname = "neel";
        String lastname = "kumar";

        String str = String.format("name: %s %s", firstname, lastname);
        System.out.println(str);

    }
}