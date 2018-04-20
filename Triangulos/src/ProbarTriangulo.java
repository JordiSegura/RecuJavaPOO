import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ProbarTriangulo {
    ArrayList<Triangulo> trianguloArrayList = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    static int select = -1;
    static int num1 = 0, num2 = 0;

    public static void main(String[] args) {
        //ACTIVITAT 2

        ArrayList<Triangulo> trianguloArrayList = new ArrayList<>();

        Triangulo tri1 = new Triangulo();
        Triangulo tri2 = new Triangulo();
        tri1.setLado1(2);
        tri1.setLado2(3);
        tri1.setLado3(2);
        System.out.println("El perimetro del triangulo1 es de: " + tri1.Perimetro(tri1.getLado1(), tri1.getLado2(), tri1.getLado3()) + " centímetros");
        tri2.setLado1(2);
        tri2.setLado2(2);
        tri2.setLado3(2);
        System.out.println("El perimetro del triangulo2 es de: " + tri2.Perimetro(tri2.getLado1(), tri2.getLado2(), tri2.getLado3()) + " centímetros");
        trianguloArrayList.add(tri1);
        trianguloArrayList.add(tri2);
        System.out.println("Triangulo1 " + tri1);
        System.out.println("Triangulo2 " + tri2);

        //ACTIVITAT 3

        Triangulo tri3 = new Triangulo();
        tri3.miConstruct(20, 31, 5.3);
        System.out.println("El perímetro del triangulo 3 es de: " + tri3.Perimetro(tri3.getLado1(), tri3.getLado2(), tri3.getLado3()) + " centimetros");

        //ACTIVITAT 4

        /*En POO es importante declarar variables con la etiqueta private para poder mantener un mejor control sobre la clase a la que pertenecen ya es en vano llamar a estas
        variables desde una instanciación de la clase.
        En resumen, si queremos hacer que desde otras clases podamos acceder a ciertas variables las debemos declarar como public, si por otro lado queremos que no se pueda
        acceder desde otra clase a una variable la declaramos como private*/


        //Mientras la opción elegida sea 0, preguntamos al usuario
        while (select != 0) {
            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println("Elige opción:\n1.- Crear triangulo isosceles" +
                        "\n2.- Crear triangulo equilatero\n" +
                        "3.- Crear triangulo escaleno\n" +
                        "4.- Todos los triangulos existentes\n" +
                        "0.- Salir");
                //Recoger una variable por consola
                select = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (select) {
                    case 1:
                        isosceles(trianguloArrayList);

                        break;
                    case 2:
                        equilateros(trianguloArrayList);

                        break;
                    case 3:
                        escaleno(trianguloArrayList);
                        break;
                    case 4:
                        System.out.println(trianguloArrayList.toString());

                        break;
                   
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }

                System.out.println("\n"); //Mostrar un salto de línea en Java

            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }
        }


    }

    public static void escaleno(ArrayList<Triangulo> trianguloArrayList) {
        //ACTIVITAT 5-Parte isosceles
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Escaleno-->lado1 ");
        Double li1 = reader.nextDouble();
        System.out.println("Escaleno-->lado2 ");
        Double li2 = reader.nextDouble();
        System.out.println("Escaleno-->lado3 ");
        Double li3 = reader.nextDouble();


        Double iso1 = li1;
        Double iso2 = li2;
        Double iso3 = li3;


        if (!iso1.equals(iso2) && !iso1.equals(iso3)) {
            Escaleno triEsca1 = new Escaleno();
            triEsca1.setLado1(li1);
            triEsca1.setLado2(li2);
            triEsca1.setLado3(li3);
            trianguloArrayList.add(triEsca1);

        } else {
            System.out.println("Si quieres crear un triangulo escaleno todos los lados deben ser diferentes");
        }
        if (trianguloArrayList.size() == 0) {
            System.out.println("El array de triangulos escalenos está vacío");
        } else {
            System.out.println("Todos los triangulos escalenos existentes--> " + trianguloArrayList.toString());
        }


    }

    public static void isosceles(ArrayList<Triangulo> trianguloArrayList) {

        //ACTIVITAT 5-Parte isosceles
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Isosceles-->lado1 ");
        Double li1 = reader.nextDouble();
        System.out.println("Isosceles-->lado2 ");
        Double li2 = reader.nextDouble();
        System.out.println("Isosceles-->lado3 ");
        Double li3 = reader.nextDouble();


        Double iso1 = li1;
        Double iso2 = li2;
        Double iso3 = li3;


        if (iso1.equals(iso2) || iso1.equals(iso3)) {
            Isosceles triIsos1 = new Isosceles();
            triIsos1.setLado1(li1);
            triIsos1.setLado2(li2);
            triIsos1.setLado3(li3);
            trianguloArrayList.add(triIsos1);

        } else {
            System.out.println("Si quieres crear un triangulo isosceles solamente dos lados deben ser iguales");
        }
        if (trianguloArrayList.size() == 0) {
            System.out.println("El array de triangulos isosceles está vacío");
        } else {
            System.out.println("Todos los triangulos isosceles existentes--> " + trianguloArrayList.toString());
        }
    }

    public static void equilateros(ArrayList<Triangulo> trianguloArrayList) {

        //ACTIVITAT 5-Parte equilateros
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Equilatero-->lado1 ");
        Double l1 = reader.nextDouble();
        System.out.println("Equilatero-->lado2 ");
        Double l2 = reader.nextDouble();
        System.out.println("Equilatero-->lado3 ");
        Double l3 = reader.nextDouble();


        Double equi1 = l1;
        Double equi2 = l2;
        Double equi3 = l3;

        if (equi1.equals(equi2) && equi1.equals(equi3) && equi2.equals(equi1) && equi2.equals(equi3) && equi3.equals(equi1) && equi3.equals(equi2)) {
            Equilatero triEqui1 = new Equilatero();
            triEqui1.setLado1(l1);
            triEqui1.setLado2(l2);
            triEqui1.setLado3(l3);
            triEqui1.getTipo();
            trianguloArrayList.add(triEqui1);
        } else {
            System.out.println("Si quieres crear un triangulo equilatero todos los lados deben ser iguales");
        }
        if (trianguloArrayList.size() == 0) {
            System.out.println("El array de triangulos equilateros está vacío");
        } else {
            System.out.println("Todos los triangulos equilateros existentes--> " + trianguloArrayList.toString());
        }
    }
}
