public class Validaciones {

    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println("Por favor, ingrese un número entero.");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public int ValidarRango(int n1, int n2, int num, Scanner sc){
        Validaciones v = new Validaciones();
        while (num < n1 || num > n2){
            System.out.println("Por favor, ingrese un numero entre " + n1 + " y " + n2 + ".");
            num = v.ValidarEntero(sc);
        }
        return num;
    }

    public String TextoNoVacio(String mensaje,Scanner sc){
        System.out.println(mensaje);
        String Dato = sc.nextLine();

        if (Dato.trim().isEmpty()){
            System.out.println("El campo no puede estar vacio.");
            return TextoNoVacio(mensaje, sc);
        }
        return Dato;
    }
}

