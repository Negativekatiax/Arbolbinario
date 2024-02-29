class ArbolBinario {
    Nodo raiz;

    ArbolBinario() {
        raiz = null;
    }

    void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    Nodo insertarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor)
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
        else if (valor > raiz.valor)
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        return raiz;
    }

    void preorder(Nodo nodito) {
        if (nodito != null) {
            System.out.print(nodito.valor + " ");
            preorder(nodito.izquierdo);
            preorder(nodito.derecho);
        }
    }

    void preorderprint() {
        preorder(raiz);
    }

    void inorder(Nodo nodito) {
        if (nodito != null) {
            inorder(nodito.izquierdo);
            System.out.print(nodito.valor + " ");
            inorder(nodito.derecho);
        }
    }

    void inorderDerecha(Nodo nodito) {
        if (nodito != null) {
            inorderDerecha(nodito.derecho);
            System.out.print(nodito.valor + " ");
            inorderDerecha(nodito.izquierdo);
        }
    }

    void inorderprint() {
        inorder(raiz);
        System.out.println("\n");
        inorderDerecha(raiz);
    }

    void postorder(Nodo nodito) {
        if (nodito != null) {
            postorder(nodito.izquierdo);
            postorder(nodito.derecho);
            System.out.print(nodito.valor + " ");
        }
    }

    void postorderprint() {
        postorder(raiz);
    }

}
