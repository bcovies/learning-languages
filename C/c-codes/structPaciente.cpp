#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <locale.h>
	struct ficha_paciente
	{
	char nomePaciente[99],classificacao[99];
	float altura, peso,imc;
	long long int telefone;
	};	
int main(){
	setlocale(LC_ALL,"Portuguese");
    ficha_paciente paciente;
	printf("\n---------------------Cadastro Paciente--------------\n\n\n");
	printf("Nome:");
		scanf("%s", &paciente.nomePaciente);
		//fflush(stdin);
	printf("Altura:");
		scanf("%f",&paciente.altura);
		//fflush(stdin);
	printf("Peso: ");
		scanf("%f",&paciente.peso);
		//fflush(stdin);
	printf("Telefone: ");
		scanf("%d",&paciente.telefone);
		//fflush(stdin);	
	printf("------------------------------------------");
	float imc = (paciente.peso)/(pow(paciente.altura,2));
		if (imc<=18.4)
		{
			strcpy(paciente.classificacao,"Abaixo do peso");
		}
		else if(imc>18.4 && imc<=24.9)
		{
		strcpy(paciente.classificacao,"Peso normal");
		}
		else  if(imc>24.9 && imc<=29.9)
		{
		strcpy(paciente.classificacao,"Sobrepeso");
		}
		else if(imc>29.9 && imc<=34.9)
		{
		strcpy(paciente.classificacao,"Obesidade Grau 1");
		}	
		else if(imc>34.9 && imc<=39.9)
		{
		strcpy(paciente.classificacao,"Obesidade Grau 2");
		}
		else if(imc>40.0)
		{
		strcpy(paciente.classificacao,"Obesidade Grau 3");
		}
		else{
		printf("Número inválido!");
		}
	printf("-------------------------------------");
	printf("\nNome: %s\nAltura: %fM\nPeso: %fKg\nTelefone: %d", paciente.nomePaciente,paciente.altura,paciente.peso,paciente.telefone);
	printf("\n\nIMC:%f\n\nClassificação:%s",imc,paciente.classificacao);
	printf("-------------------------------------");

}
/*
struct ficha2{
	char nomeAluno[],turma[],disciplina[];
	float av1,av2,av3,media;
	long long int telefone, matricula;
};
struct data{
	int dia,mes,ano;
	};
*/
