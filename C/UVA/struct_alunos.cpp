#include <stdlib.h>
#include <stdio.h>


	struct ficha_de_aluno
		{
		float av1,av2,mediaFinal;
		}aluno;
	
int main(){
	
	printf("\n----Cadastro do aluno----\n\n");
	int i=0;
	float notaMin=10,notaMax=0;
	struct ficha_de_aluno aluno[3];
	
	for(i=0;i<3;i++){
		
		printf("Entre com av1 do Aluno[%d]:",i);
			scanf("%f", &aluno[i].av1);
		printf("Entre com av2 do Aluno[%d]:",i);
			scanf("%f", &aluno[i].av2);
		
		aluno[i].mediaFinal = (aluno[i].av1+aluno[i].av2)/2;
		
		//Maximas e Minimas
		if(notaMin >= aluno[i].av1){
			notaMin = aluno[i].av1;
		}
		if(notaMax <= aluno[i].av1){
			notaMax = aluno[i].av1;
		}
		if(notaMin >= aluno[i].av2){
			notaMin = aluno[i].av2;
		}
		if(notaMax <= aluno[i].av2){
			notaMax = aluno[i].av2;
		}
		
	}
	
	printf("\nNota Min: %f",notaMin);
	printf("\nNota Max: %f",notaMax);
		for(i=0;i<3;i++){
			printf("\nMedia Final Aluno[%d]: %f",i,aluno[i].mediaFinal);
		}
	return 0;		
	}

