/**
 * Created with IntelliJ IDEA.
 * User: grin
 * Date: 03.11.13
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
class Art {
    Art() { System.out.println("Art constructor"); }  // Constructor of the art class, will be called 1
}

class Drawing extends Art {
    Drawing() { System.out.println("Drawing constructor"); } // Constructor of the Drawing class which extends the Art class, will be called 2
}

class Cartoon extends Drawing {
    public Cartoon() { System.out.println("Cartoon constructor"); } // Constructor of the cartoon class which extends the Drawing class, will be called 3
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
}
 class Monography extends Cartoon {
    public Cartoon() { System.out.println("Monography constructor"); } // Constructor of the monography class which extends the Cartoon class, will be called 4
    public static void main(String[] args) {
        Monography x = new Monography();
    }   
}

//wrong code
