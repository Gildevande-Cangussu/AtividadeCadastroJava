package com.etec.padrao;

/**
 *
 * @author Gildevande 
 */
import com.etec.util.DayTime;
import com.etec.util.IO;

public class Principal {
    
    public static void main(String[] args){
        IO io = new IO();
        
        Aluno aluno = new Aluno();
        
        DayTime Daytime = new DayTime();
        
        io.setTexto("Programa de Cadastro");
        
        io.exibirTexto();
        
        aluno.setnome(io.digitarTexto("Digite seu nome:"));
        
		aluno.setIdade(Integer.parseInt(io.digitarTexto("Digite sua idade:")));
      
        aluno.setFumante(Boolean.parseBoolean(io.digitarTexto("Digite true fumante e false para nao fumante:")));
        
        io.setTexto("Cadastro Realizado:\n\n"
        	  + "Nome:" + aluno.getnome()+ "\n"
        	            +"Idade:" + aluno.getIdade()+ "\n"
        	            +"Fumante: " + aluno.isFumante()+ "\n\n"
        	            +"Data: +DayTime.getData()" 
        	            +"Hora: +DayTime.getHora()"
        	            );
            
            io.exibirTexto();
    	}
    }
