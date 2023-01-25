package atividades;

import java.util.Scanner;

public class questao1 {
public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	double notas [] = new double [10];
	int alunosAcimaDaMedia=0, n=1;
	Double totalNotas=0.0, media, maiorNota=0.0;
	int posicaoMaiorNota[]= new int[n];
	
	for (int c=0;c<10;c++) {

		System.out.println("informe a nota do aluno");
		notas [c]= in.nextDouble();
		if (notas [c]>7) {
			alunosAcimaDaMedia++;
		}
		totalNotas = notas [c];
		if (maiorNota<notas [c]) {
			maiorNota=notas [c];
			posicaoMaiorNota[n]=c;
		} else if (maiorNota==notas [c]) {
			n++;
			posicaoMaiorNota[n]=c;
		} 
	}
	media=totalNotas/10;
	
	System.out.println("A média da turma é: "+media);
	System.out.println(alunosAcimaDaMedia+" alunos estão acima da média.");
	System.out.println("A maior nota digitada foi: "+maiorNota);
	System.out.println("A maior nota se encontra na posição(ões):");
	for (int c=0;c<n;c++) {
	System.out.println(posicaoMaiorNota[c]);
}
}
}
