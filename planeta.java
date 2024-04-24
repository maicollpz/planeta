public class planeta{

String nombre;
int cantidadsatelites;
double masa;
double volumen;
double diametro;
double distanciasol;
boolean observable;


public planeta(String nombre, int cantidadsatelites, double masa, double volumen, double diametro, double distanciasol,
    boolean observable) {
    this.nombre = nombre;
    this.cantidadsatelites = cantidadsatelites;
    this.masa = masa;
    this.volumen = volumen;
    this.diametro = diametro;
    this.distanciasol = distanciasol;
    this.observable = observable;
}

public double calculardensidad() {
    return masa / volumen;
}

public void imprimirdatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Cantidad de satélites: " + cantidadsatelites);
    System.out.println("Masa: " + masa + " kg");
    System.out.println("Volumen: " + volumen + " m^3");
    System.out.println("Diámetro: " + diametro + " km");
    System.out.println("Distancia al Sol: " + distanciasol + " km");
    System.out.println("Es observable: " + observable);
    System.out.println("Densidad: " + calculardensidad() + " kg/m^3");
}


}




