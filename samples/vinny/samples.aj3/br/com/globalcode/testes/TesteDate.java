package br.com.globalcode.testes;
import java.util.Date;

public class TesteDate {
	public static void main(String[] args){
		//data atual
		Date agora = new Date();
		System.out.println("agora: " + agora);
	
		//data 01/01/1970 00hs00m00s + x milissegundos
		Date instanteX = new Date(1132023600000L);
		System.out.println("instanteX: " + instanteX);
		//Capturando a diferença (long) de milissegundos entre 
		//o objeto Date e 01/01/1970 00h00m00s
		System.out.println("x milissegundos: " + instanteX.getTime());
	
		//05/02/1998 00hs00m00s (construtor deprecated)
		//parametros do construtor: ano, mes, dia
		Date umaData = new Date (98, 1, 5);
		System.out.println("uma data: " + umaData);
	
		// 16/12/2009 14h37m19s (construtor deprecated)
		// parametros do construtor: ano, mes, dia, hora, min, seg
		Date outraData = new Date (109, 11, 16, 14, 37, 19);
		System.out.println("outra data: " + outraData);
	
		// captando informações parciais
		// (metodos deprecated)
		int ano = outraData.getYear();
		int mes = outraData.getMonth();
		int diaDoMes = outraData.getDate();
		int diaDaSemana = outraData.getDay();
		int horas = outraData.getHours();
		int minutos = outraData.getMinutes();
		int segundos = outraData.getSeconds();
	}
}
