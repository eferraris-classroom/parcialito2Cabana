package ar.edu.undef.fie;


public class Main {
    public static void main(String[] args) {
        int [] numeros = {10 , 55, 32, 1, 0};

        int valor = 15;

        boolean existe = encontrarValor( numeros, valor);

        System.out.println("El valor buscado ¿existe en la lista? :  " + existe);
        }

    private static boolean encontrarValor(int[] numeros, int valor) {
        boolean noExiste = false;
        int [] num = numeros;
        for (var aux: num) {
            if (valor == aux) {
                boolean existe = true;
                return existe;
            }
        }
        return noExiste;
    }
}