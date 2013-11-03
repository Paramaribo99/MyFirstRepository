/**
 * Created with IntelliJ IDEA.
 * User: grin
 * Date: 03.11.13
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
class Art {
    Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
    Drawing() { System.out.println("Drawing constructor"); }
}

class Cartoon extends Drawing {
    public Cartoon() { System.out.println("Cartoon constructor"); }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
