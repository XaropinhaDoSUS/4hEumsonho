class No {
    int dado;
    No proximo;

    No(int d) {
        dado = d;
        proximo = null;
    }

    class Yagotab{}
}

class ListaEncadeada {
    No cabeca;

    public void inserirNoInicio(int d) {
        No novo = new No(d);
        novo.proximo = cabeca;
        cabeca = novo;
    }

    public void inserirNoFim(int d) {
        No novo = new No(d);
        if (cabeca == null) {
            cabeca = novo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public boolean buscar(int d) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.dado == d) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void imprimir() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void remover(int d) {
        if (cabeca == null) {
            return;
        }
        if (cabeca.dado == d) {
            cabeca = cabeca.proximo;
            return;
        }
        No atual = cabeca;
        while (atual.proximo != null && atual.proximo.dado != d) {
            atual = atual.proximo;
        }
        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }
}

class trabai {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirNoInicio(50);
        lista.inserirNoFim(100);
        lista.inserirNoFim(150);

        System.out.println("Lista:");
        lista.imprimir();

        lista.remover(100);
        System.out.println("Depois de remover 100:");
        lista.imprimir();

        System.out.println("Procurar 150: " + lista.buscar(150));
        System.out.println("Procurar 100: " + lista.buscar(100));
    }
}
