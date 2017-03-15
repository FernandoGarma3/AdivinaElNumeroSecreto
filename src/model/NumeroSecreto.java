/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author FernandoLuis
 */
//NUMEROSECRETO 
public class NumeroSecreto {
    //Declarar las Variables
    private int numero;
    private int limiteInferior;
    private int limiteSuperior;
    private Random generador;
    //Declarar las dos constantes
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;
    //Declare el metodo setRango
    public void setRango(int limiteInferior, int limiteSuperior) {
        if (limiteInferior > limiteSuperior) {
            this.limiteInferior = LIM_INF_PREDET;
            this.limiteSuperior = LIM_SUP_PREDET;
        }
        else{
            this.limiteInferior = limiteInferior;
            this.limiteSuperior = limiteSuperior;
        }
    }
    //Declare el método generar
   public final void generar() {
       this.numero = generador.nextInt(limiteSuperior) + 1;
   }
   //Declare un constructor
   public NumeroSecreto(int limiteInferior, int limiteSuperior) {
       this.setRango(limiteInferior, limiteSuperior);
       this.generador = new Random();
       this.generar();
   }
   //Declare un segundo constructor
   public NumeroSecreto() {
       this(LIM_INF_PREDET, LIM_SUP_PREDET);
   }
   //Declare un getters para las variables de instancia
   public int getNumeroSecreto() {
       return this.numero;
   }
   
   public int getLimiteInferior() {
       return this.limiteInferior;
   }
   
   public int getLimiteSuperior() {
       return this.limiteSuperior;
   }
   //Declare la clase esMayor
   public boolean esMayor(int numero) {
       boolean elNumeroSecretoEsMayor;
       if (this.numero > numero) {
           elNumeroSecretoEsMayor = true;
       }
       else {
           elNumeroSecretoEsMayor = false;
       }
       return elNumeroSecretoEsMayor;
   }
   //Declare la clase esMenor
   public boolean esMenor(int numero) {
       boolean elNumeroSecretoEsMenor = false;
       if (this.numero < numero) {
           elNumeroSecretoEsMenor = true;
       }
       return elNumeroSecretoEsMenor;
   }
   //Declare la clase esIgual
   public boolean esIgual(int numero) {
       return (this.numero == numero);
   }
   
   
}
