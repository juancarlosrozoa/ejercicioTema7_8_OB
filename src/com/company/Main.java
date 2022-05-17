package com.company;

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        //Crear variable
        String texto= "Hola mundo";

        //Imprirmir el return de la funcion

        System.out.println("-----------------Mostrar el texto invertido-------------------------------------------");
        System.out.println(reverse(texto));

        // 1
        System.out.println("-----------------Array unidimensional-------------------------------------------");
        arrayUnidim();

        // 2
        System.out.println("-----------------Array Bidimensional-------------------------------------------");
        arrayBidi();

        //3
        System.out.println("-----------------Vector-------------------------------------------");
        vectorElementos();

        //4
        System.out.println("-----------------Capacidad del vector por defecto-------------------------------------------");
        vectorPrueba();

        //5
        System.out.println("-----------------ArrayList-------------------------------------------");
        ArrayList();

        //6
        System.out.println("-----------------rellenoArrayList-------------------------------------------");
        rellenoArrayList();

        //7
        System.out.println("-----------------Divide por cero-------------------------------------------");
        dividePorCero();

        //8
        System.out.println("-----------------Copia Fichero-------------------------------------------");
        copiaFichero();

        //9
        System.out.println("-----------------Sorpresa-------------------------------------------");
        sorpresa();
    }

    //---------------------- funcion para mostrar el texto invertido-------------------
    public static String reverse(String texto) {
        StringBuilder textoInvertido = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--)
            textoInvertido.append(texto.charAt(i));

        return textoInvertido.toString();
    }

    //-----------------Array unidimensional de Strings y recorrelo mostrando sus valores------------


    public static void arrayUnidim (){

        //Declarar un array
        String [] arrayUnidim = new String [10];

        //Asignar valores al array
        arrayUnidim[0]="H";
        arrayUnidim[1]="0";
        arrayUnidim[2]="L";
        arrayUnidim[3]="A";
        arrayUnidim[4]=" ";
        arrayUnidim[5]="M";
        arrayUnidim[6]="U";
        arrayUnidim[7]="N";
        arrayUnidim[8]="D";
        arrayUnidim[9]="O";

        for (String valor : arrayUnidim) {
            System.out.print(valor);
        }

        System.out.println("");
    }


    //-------------Array bidimensional de enteros y recórrelo, mostrando posición y valor--------------

    public static void arrayBidi(){

        //declara array bidimensional
        int [][] arrayBd = new int[2][5];

        //Asignarle valores al array
        arrayBd [0][0]= 1;
        arrayBd [0][1]= 2;
        arrayBd [0][2]= 3;
        arrayBd [0][3]= 4;
        arrayBd [0][4]= 5;

        arrayBd [1][0]= 6;
        arrayBd [1][1]= 7;
        arrayBd [1][2]= 8;
        arrayBd [1][3]= 9;
        arrayBd [1][4]= 10;

        //Recorrer el array
        System.out.println("");
        for (int i=0; i < arrayBd.length; i++){
            for(int j=0; j < arrayBd[i].length; j++){
                System.out.println("fila "+ i+ " Columna "+j+ " valor "+arrayBd[i][j]);
            }
        }
    }
    //----------"Vector" 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.------------

    public static void vectorElementos (){
        //crear vector
        Vector <Integer> vectorElementos = new Vector<>();

        //adicionarle datos al vector
        vectorElementos.add(1);
        vectorElementos.add(2);
        vectorElementos.add(3);
        vectorElementos.add(4);
        vectorElementos.add(5);

        vectorElementos.remove(1);
        vectorElementos.remove(1);

        System.out.println(vectorElementos);
    }


    //-------Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
    // si tuviésemos 1000 elementos para ser añadidos al mismo-----

    public static void vectorPrueba () {
        //crear vector
        Vector<Integer> vectorPrueba = new Vector<>();

        System.out.println("Tamaño del vector "+ vectorPrueba.size());
        System.out.println("Capacidad por defefcto de un vector " + vectorPrueba.capacity());
        System.out.println(
        "La capacidad por defecto de un vector es de 10 elementos, cuando se sobrepasan se crea " +
                "un nuevo vector con la capacidad inicial mas 10 espacios para elementos adicionales y " +
                "cuando este vector se sobrepace, creara otro vector igual al segundo vector de 20 elementos" +
                " mas 10 espacios para elementos. Esto quiere decir que un vector de 1000 elementos con " +
                "capacidad por defecto de 10 se desbordara 100 veces generando una copia del vector desbordado " +
                "en cada ocacion lo que consumiria recursos de forma excesiva.");

    }


    //--------ArrayList de tipo String, con 4 elementos.
    // Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.-----

    public static void ArrayList (){
        //crear un arrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        //adicionar elementos al arrayList
        arrayList.add("Juan");
        arrayList.add("Carlos");
        arrayList.add("Rozo");
        arrayList.add("Anaya");

        System.out.println("Elementos del arrayList "+arrayList);

        //Copiar el arrayList a una LinkedList
        LinkedList<String> copiaArrayList = new LinkedList<>(arrayList);

        for (String elementoArrayList : copiaArrayList) {

        }
        System.out.println("Elementos del LinkedList: " + copiaArrayList);
    }

    //----------------ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
    // Por último, vuelve a recorrerlo y muestra el ArrayList final.
    // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

    public static void rellenoArrayList(){
        ArrayList<Integer> rellenoArrayList = new ArrayList<Integer>();
        for (int i=1; i<=10; i++){
         rellenoArrayList.add(i);
        }
        System.out.println(rellenoArrayList);
        for (int i=0; i<rellenoArrayList.size(); i++){

            if(rellenoArrayList.get(i) != null){
                Integer pares =rellenoArrayList.get(i);
                if(pares % 2==0){
                    rellenoArrayList.remove(i);
                }
            }
        }
        System.out.println(rellenoArrayList);


    }

    //------------------------función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    // que será capturada por su llamante (desde "main", por ejemplo).
    // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    // Finalmente, mostraremos en cualquier caso: "Demo de código"---------------------------------

    public static void dividePorCero () throws ArithmeticException{
        int dividendo=5;
        int divisor=1;
        try {
            if (divisor == 0) {
                throw new IllegalArgumentException("Esto no puede hacerse");
            }else{
                System.out.println("Demo de código");
                System.out.println(dividendo / divisor);
            }

        }catch (IllegalArgumentException e) {
            System.err.println(e);
        };


    }

    // Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    // La tarea de la función será realizar la copia del fichero dado en el
    // parámetro "fileIn" al fichero dado en "fileOut"

    public static void copiaFichero (){
        System.out.println("Copiar fichero");

        File origen = new File("fileIn.txt");
        File destino = new File("fileOut.txt");

        try{
        InputStream in = new FileInputStream(origen);
        byte [] datos = in.readAllBytes();
        in.close();

        PrintStream out = new PrintStream(destino);
        out.write(datos);
        out.close();
            System.out.println("Archivo copiado");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
    // excepciones, un HashMap y un ArrayList, LinkedList o array

    public static void sorpresa() {
        File origen = new File("capitales.txt");
        File destino = new File("capitalesConsultadas.txt");

        Map capitales= new HashMap();

        try {
            FileReader capitalesLeer = new FileReader(origen);

            BufferedReader lecturaCapitales = new BufferedReader(capitalesLeer);
            String cadaLinea;

            while ((cadaLinea = lecturaCapitales.readLine()) != null) {
                String[] palabra = cadaLinea.split("->");
                capitales.put(palabra[0], palabra[1]);
            }
            capitalesLeer.close();
            System.out.println("Por favor ingrese el nombre de un pais, en idioma español iniciando con mayuscula");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        Scanner pais = new Scanner(System.in);
        String nombrePais = pais.nextLine();

        System.out.println("La capital de "+nombrePais + " es "+ capitales.get(nombrePais));

    }

}
