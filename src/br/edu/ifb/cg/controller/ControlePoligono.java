package br.edu.ifb.cg.controller;
import br.edu.ifb.cg.model.Aresta;
import br.edu.ifb.cg.model.MatrizArestas;
import br.edu.ifb.cg.model.MatrizPoligonos;
import br.edu.ifb.cg.model.MatrizVertices;
import br.edu.ifb.cg.model.Poligono;
import br.edu.ifb.cg.model.Vertice2D;
 /**
 *
 * @author jeronimo
 */
public class ControlePoligono {
    
    private MatrizPoligonos mp;
    private MatrizArestas ma;
    private MatrizVertices mv;
    
    public ControlePoligono() {
        mp = MatrizPoligonos.getInstance();
        ma = MatrizArestas.getInstance();
        mv = MatrizVertices.getInstance();
    }
    
    public Vertice2D addVertice(Integer x, Integer y){
        Vertice2D v = new Vertice2D(x,y);
        mv.addVertice(v);
        
        //TODO adicionar vertice na tela
        
        return v;
    }
    
    public Integer addAresta(Vertice2D origem, Vertice2D destino){
        Aresta a = new Aresta(origem, destino);
        ma.addAresta(a);
        //TODO adicionar aresta na tela
         //TODO adicionar aresta na tela
        return a.getIndice();
    }
    
    public void addPoligono(){
        /**
         *Recebe todas as cordenadas dos cliques na tela e cria o polígono
         */ 
        Poligono p;
        Integer  xAtual, yAtual, xAnterior, yAnterior, indiceArestaInicial, indiceArestaFinal;
        Vertice2D vAnterior, vAtual, vInicial;
        
        //TODO receber xAnterior e yAnterior no clique
        xAnterior = 0;
        yAnterior = 0;
        vInicial = addVertice(xAnterior, yAnterior);
        
        //TODO receber xAtual e yAtual no clique
        xAtual = 0;
        yAtual = 0;
        vAtual = addVertice(xAtual, yAtual);
        indiceArestaInicial = addAresta(vInicial, vAtual);
        indiceArestaFinal = indiceArestaInicial;
        
        while(!vInicial.equals(vAtual)){
            xAnterior = xAtual;
            yAnterior = yAtual;
            
            //TODO receber xAtual e yAtual no clique
            xAtual = 0;
            yAtual = 0;
            
            vAnterior = vAtual;
            vAtual = addVertice(xAtual, yAtual);
            indiceArestaFinal = addAresta(vAnterior, vAtual);            
        }
        p = new Poligono(indiceArestaInicial, indiceArestaFinal);
        mp.addPoligono(p);
    }
    
    public boolean isInPoligno(int x, int y){
        //TODO: verificar se as coordenadas estão dentro de um polígono
        //Envelopamento
        return false;
    }
    
    
}
