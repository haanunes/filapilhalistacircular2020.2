package listacircular;

public class ListaCircularContato {

    private Contato cabeca;
    private int tamanho = 0;

    public void inserirCabeca(Contato novo) {
        if (tamanho == 0) {
            cabeca = novo;
            novo.anterior = novo;
            novo.proximo = novo;
        } else if (tamanho >= 1) {
            novo.proximo = cabeca;
            novo.anterior = cabeca.anterior;
            cabeca.anterior.proximo = novo;
            cabeca.anterior = novo;
            cabeca = novo;
            tamanho++;
        }

    }
    
    public void inserir(Contato novo, int indice){
        Contato aux = cabeca;
        for (int i =0; i<indice; i++){
            aux = aux.proximo;
        }
        // fazer a troca (swap)
        novo.anterior=aux;
        novo.proximo=aux.proximo;
        aux.proximo=novo;
        novo.proximo.anterior=novo;
        tamanho++;
    }
    
    public Contato removerCabeca(){
        if (tamanho==0){
            System.out.println("Lista está vazia");
            return null;
        }
        else if (tamanho==1){
            Contato aux = cabeca;
            cabeca=null;
            tamanho--;
            return aux;
        }
        //tamanho >1
        else {
            Contato aux = cabeca;
            aux.anterior.proximo=aux.proximo;
            aux.proximo.anterior=aux.anterior;
            aux.anterior = null;
            aux.proximo=null;
            tamanho--;
            return aux;
        }
    }
    
}
