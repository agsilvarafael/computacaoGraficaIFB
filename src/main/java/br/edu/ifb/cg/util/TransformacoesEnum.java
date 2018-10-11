/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.util;

/**
 * Enum contenco as opções que estarão disponíveis no menu para realizar
 * alterações sobre uma figura
 * @author Jeronimo Hermano
 */
public enum TransformacoesEnum {
    
    
    /** Remove a figura e seus componentes da memória. */
    EXCLUIR,
    /** Movimentação da figura atravéz da alteração dos valores dos vértices. */
    MOVER,
    /** Aumento da escala da figura. */
    AMPLIAR,
    /** Redução da escala da figura. */
    REDUZIR,
    /** Gira a figura com ângulso na medida de graus entorno do próprio centro*/
    GIRAR,
    /**  */
    ROTACIONAR, //É mesmo preciso?
    /** Giro da figura no eixo Z. */
    ESPELHAR;
    
    
}
