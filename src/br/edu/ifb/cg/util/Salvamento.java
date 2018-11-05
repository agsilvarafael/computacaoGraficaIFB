/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.util;

import br.edu.ifb.cg.model.MatrizArestas;
import br.edu.ifb.cg.model.MatrizPoligonos;
import br.edu.ifb.cg.model.MatrizVertices;
import br.edu.ifb.cg.model.Vertice2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jeronimo
 */
public class Salvamento {
    
    public static Boolean salvarProjeto(){
        String url = escolheLocal();
        url += "/" +
            JOptionPane.showInputDialog(null, "Nome do arquivo de salvamento",
                    "Nome salvamento", JOptionPane.QUESTION_MESSAGE)
            + ".txt";
        
        try{
            FileOutputStream fos = new FileOutputStream(url);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(MatrizVertices.getInstance());
            oos.writeObject(MatrizArestas.getInstance());
            oos.writeObject(MatrizPoligonos.getInstance());
            
//            //Escreve a quantidade de polígonos
//            //MatrizPoligonos.getInstance().getKeys().size();
//            for(Integer i : MatrizPoligonos.getInstance().getKeys()){
//                //Escreve P
//                //Escreve a cor
//                //MatrizPoligonos.getInstance().getPoligono(i).getCorPreenchimento();
//                for(Vertice2D v : MatrizPoligonos.getInstance().getVerticesPoligono(i)){
//                    //Escreve os vertices como X Y
//                    //(v.getX() + " " + v.getX());
//                }
//            }
            

            oos.close();
            fos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    public static Boolean abrirProjeto(){
        String url = escolheArquivo();
        
        try{
            FileInputStream ios = new FileInputStream(url);
            ObjectInputStream ois = new ObjectInputStream(ios);
            
//            (MatrizVertice) ois.readObject();
//            (MatrizArestas) ois.readObject();
//            (MatrizPoligonos) ois.readObject();

            ios.close();
            ois.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();    
        }
        
        return false;
    }
    
    /**
     * Método privado usado para buscar o diretório onde será salvo o arquivo
     * do projeto.
     * @return String contendo a url onde será salvo.
     */
    private static String escolheLocal(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            return fileChooser.getSelectedFile().getPath();
        return "";
    }
    
    /**
     * Método privado usado para buscar o arquivo de projeto a ser aberto.
     * @return String contendo a url com o nome do arquivo.
     */
    private static String escolheArquivo(){
        return "";
    }
    
}
