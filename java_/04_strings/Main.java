public class Main {

    public static void main(String[] args) {
        
        String country = "India";
        String addr = new String("Delhi");

        System.out.printf("%s %s \n", country, addr);


        String a = "car";
        String b = "car";
        String var1 = new String("car");
        String var2 = new String("car");

        System.out.println( a == b );               // true
        System.out.println( var1 == var2 );         // false

        /*
        a   --->  "car"  <--- b
        both a and b point to same string obj in a particular memory location

        var1  --->   "car"     addr: 0x12f
        var2  --->   "car"     addr: 0x24g

        var1 and var2 points to different memory locations and both locations have same string value object

        in memory,
        +-----------+
        |   "car"   |  <---  a,b
        +-----------+
        |   "car"   |  <---  var1
        +-----------+
        |   "car"   |  <---  var2
        +-----------+
        */
    }
}