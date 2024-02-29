public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        int[] valores = {5, 3, 7, 2, 4, 6, 8, 5};

        for (int valor : valores) {
            arbol.insertar(valor);
        }
        System.out.println("Inorden: ");
        arbol.inorderprint();
        System.out.println("\nPreorden: ");
        arbol.preorderprint();
        System.out.println("\nPostorden: ");
        arbol.postorderprint();
    }
}

