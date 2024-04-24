public class pruebaplaneta {
public static void main(String[] args) {

    // Creación de objetos Planeta
    planeta p1 = new planeta("Tierra", 1, 5.9736E24, 1.08321E12,12742, 150000000, true);
    System.out.println("Planeta 1:");
    p1.imprimirdatos();

    planeta p2 = new planeta("Jupiter", 1, 1.899E27, 1.4313E15,139820, 750000000, true);
    System.out.println("\nPlaneta 2:");
    p2.imprimirdatos();

  }
}

