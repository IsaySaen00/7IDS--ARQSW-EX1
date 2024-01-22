package presentacion;
import negocio.*;
import java.util.Scanner;

// public class Mensaje {
//     public static void main(String asdf[]){
//         Muestra obj = new Muestra();
//         obj.mostrar();
//     }
// }

public class Mensaje {

    public static void main(String asdf[]){
        Scanner leer = new Scanner(System.in);
        int dato;
        do{
            System.out.println("\n--Menú--\n1. Select\n2. Insert\n3. Update\n4. Delete\n5. Salir");
            dato = leer.nextInt();
            switch (dato) {
            case 1:
                    Select objS = new Select();
                    objS.mostrar();
                break;
                case 2:
                    Insert objI = new Insert();
                    objI.insertar();
                break;
                case 3:
                    Update objU = new Update();
                    objU.actualizar();
                break;
                case 4:
                    Delete objD = new Delete();
                    objD.eliminar();
                break;
                default:
                    System.out.println("Gracias por tu visita a la fiesta.");
            }
        }while (dato!=5); {
        }
    }
}
