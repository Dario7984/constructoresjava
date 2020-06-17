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
        int n = 5;
        int factorial = 1;
        for( int i = 1; i <= n; i++ ) {
            factorial *= i;
        }
        System.out.println( "El factorial de " + n + " es: " + factorial );
    }
    
    public void sacarFactorial(int n){//
        System.out.println("Sacando factorial de n");
    }
    
    public void fibonaci(){
        int suma;
        int a = 0;
        int b = 1;
        int fin = 5;
        int inicio;
        System.out.println("El fibonaci de los "+ fin + " primeros termino es: ");
        for(inicio = 1; inicio <= fin; inicio = inicio +1){
            suma = a + b;
            a = b;
            b = suma;
            
            System.out.println(b + " ");
        }
    }
    public void masaCorporal(){
        int peso = 85;
        float est = 1.70f;
        float imc;
        imc = ((float)peso/(est*est));
        
        System.out.println("El indice de Masa Corporal es "+imc);
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
