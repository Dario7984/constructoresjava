public class Constructor {
    private int numero, inicio, fin, peso;
    private double estatura;
    private String nombre, apellido;
    public Constructor(){
        System.out.println("Llamando al metodo sin parametros");  
    }
    public Constructor (int n){
        numero = n;  
    }
    public Constructor (int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
    }
    public Constructor (double est, int peso){
        estatura = est;
        this.peso = peso;
    }
    public Constructor (String nombx, String apelx){
        nombre = nombx;
        apellido = apelx;
    }
    public Constructor(Constructor obj){
        nombre = obj.nombre;
        apellido = obj.apellido;
    }
    public void sacarFactorial(){
        int numero = 5;
        System.out.println( "El factorial de " + numero + " es: " + factorial( numero ) );
    }
    public static int factorial( int numero ) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
            fact *= i;
        }
        return fact;
    }
    public void sacarFactorial(int n){//
        System.out.println("Sacando factorial de n");
    }
    public void fibonaci(){//
        System.out.println("Sacar el n hasta el n1 fibonaci");
    }
    public void masaCorporal(){//
        int peso = 84;
        int estatura = 150;
        
        System.out.println("Sacando masa corporal de una persona");
        
    }
    public void buscarLetra(){
        //System.out.println("Busca cuantas vocales tiene una cadena");
        int contvocales = 0;
        char [] nombreaux = new char[nombre.length()];
        nombreaux = nombre.toCharArray();
        for (int i = 0; i<nombre.length();i++){
            if (nombreaux[i]=='a'||nombreaux[i]=='e'||nombreaux[i]=='i'||nombreaux[i]=='o'||nombreaux[i]=='u'){
                contvocales++;
            }
        }
        System.out.println(nombre+" tiene "+contvocales+" vocales ");
    }
    public void mensaje(){
        System.out.println("Buenas noches estamos aprendiendo constructores");
    }
}
