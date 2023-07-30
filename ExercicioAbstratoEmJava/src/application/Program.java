package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>(); // LISTA DE FIGURAS USANDO O TIPO GENERICO (SUPERCLASSE) PARA USAR POLIMORFISMO

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);      // PERGUNTA E LE A RESPOSTA DO USUARIO SE É RETANGULO OU CIRCULO

            System.out.print("Color (BLACK/BLUE/RED): "); // PERGUNTA AO USUARIO A COR...
            Color color = Color.valueOf(sc.next());       //..E LE O ENUM(INSTANCIA

            if (ch == 'r') {    // SE O CARACTER DIGITADO FOR 'r'
                System.out.print("Width: ");    // PEDIR PARA DIGITAR A LARGURA
                double width = sc.nextDouble(); // E LER ESSA LARGURA...
                System.out.print("Height: ");
                double height = sc.nextDouble();

                // QUANDO TERMINA DE LER OS DADOS DO RETANGULO , INSTANCIANDO O RETANGULO E ARMAZENANDO EM UMA LISTA
                list.add(new Rectangle(color, width, height));
            }
            else {  // SE NAO FOR UM RETANGULO...
                System.out.print("Radius:  ");      // VAI PDIR PARA DIGITAR O RAIO
                double radius = sc.nextDouble();    // VAI LER O RAIO
                list.add(new Circle(color, radius));    // ADICIONANDO A LISTA UM NOVO CIRCULO
            } // FOR QUE LE TODAS AS FIGURAS DIGITADAS PELO USUARIO , QUANDO O FOR ACABAR, TEREMOS UMA LISTA COM TODAS FIGURAS DENTRO DELA
        }

        System.out.println(); // QUEBRA DE LINHA
        System.out.println("SHAPE AREAS: ");    // AREAS DA FIGURA
        for (Shape shape : list) {  // FOR NA LISTA PARA CADA SHAPE SHAPE NA MINHA LIST LISTA
            System.out.println(String.format("%.2f", shape.area()));    // VOU MANDAR IMPRIMIR NA TELA O SHAPE.AREA FORMATANDO COM DUAS CASAS DECIMAIS
        }
        sc.close();
    }
}

/* PODEMOS CRIAR VARIAVEIS OU COLEÇÕS DO TIPO ABSTRATO DESDE QUE EU INSTANCIO
OBJETOS DO TIPO CONCRETO, VAI SER FEITO O UPCASTING, NO CASO RETANGULO E CIRCULO
VAI SER FEITO O UPCASTING PARA SHAPE E A LISTA VAI FUNCIONAR NORMALMENTE,
INCLUSIVE FAZENDO O POLIMORFISMO COMO ACONTECEU COM AREA()
 */