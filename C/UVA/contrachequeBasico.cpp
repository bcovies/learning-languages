#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

float CalculaFamilia(int idadeFilhos,int qntFilhos,float salarioFunc){

	float salarioFamilia;

	if(idadeFilhos<14){
		if(salarioFunc<=806.80){
			salarioFamilia	= 41.37 * qntFilhos;
		}
		else if(salarioFunc>806.80 && salarioFunc<=1212.64){
			salarioFamilia = 29.16 * qntFilhos;
		}
	}
	else if(idadeFilhos>=14){
		if(salarioFunc > 1212.64){
			salarioFamilia= 0;
		}

	}
	return salarioFamilia;
}
float CalculaInss(float salarioFunc){

	float inss;
	if(salarioFunc<= 1751.81){
		inss = salarioFunc * 0.08;
	}
	else if(salarioFunc > 1751.81 && salarioFunc<=2919.72){
		inss = salarioFunc * 0.09;
	}
	else if ( salarioFunc > 2919.72 && salarioFunc <= 5839.45){
		inss = salarioFunc*0.11;
	}
	else{
		inss = 643.34;
	}
	return inss;
}
float calculoIR(float salarioFunc){
	float IR;
	if(salarioFunc <= 1903.98){
		printf("Nao paga!");
	}
	else if(salarioFunc > 1903.98 && salarioFunc <= 2826.65){
		IR = salarioFunc * 0.075;
	}
	else if(salarioFunc > 2826.66 && salarioFunc <= 3751.05){
		IR = salarioFunc * 0.15;
	}
	else if(salarioFunc > 3751.06 && salarioFunc <= 4664.68){
		IR = salarioFunc * 0.225;
	}
	else {
		IR = salarioFunc * 0.27;
	}
	return IR;
}

int main(){
	setlocale(LC_ALL, "Portuguese");
	// Atributos;
	char nomeEmpresa[30] = "Empresa1";
	char endEmpresa[15]="Av.G123";
	char cnpj[30] = "04290167000195";
	int qntFilhos,idadeFilhos,codFunc;
	char funcaoFunc[99],nomeFunc[99],dataAdm[20],dataPagamento[20];
	float salarioFunc,salarioFamilia,inss,ir;

	//Entrada de dados;
	printf("Entre com: ");
	printf("\nC�digo do funcion�rio: ");
	scanf("%d",&codFunc);
	printf("\nNome do funcion�rio: ");
	scanf("%s", nomeFunc);
	printf("\nFun��o do funcion�rio: ");
	scanf("%s", funcaoFunc);
	printf("\nData de admiss�o:  ");
	scanf("%s", dataAdm);
	printf("\nData do pagamento: ");
	scanf("%s", dataPagamento);
	printf("\nSal�rio do funcion�rio: ");
	scanf("%f",&salarioFunc);
	printf("\nIdade dos filhos: ");
	scanf("%d",&idadeFilhos);
	printf("\nQuantidade de filhos: ");
	scanf("%d",&qntFilhos);
	//Chamada das funC'C5es;
	inss = CalculaInss(salarioFunc);
	salarioFamilia = CalculaFamilia(idadeFilhos,qntFilhos,salarioFunc);
	ir = calculoIR(salarioFunc);
	printf("\n");
	printf("-------------------------------------------------------------");
	printf("\n");
	printf("%s", nomeEmpresa);
	printf("\tCNPJ:%s", cnpj);
	printf("\tEndere�o:%s",endEmpresa);
	printf("\n");
	printf("-------------------------------------------------------------");
	printf("\n");
	printf("Nome do funcion�rio: %s",nomeFunc);
	printf("\tFun��o: %s",funcaoFunc);
	printf("\tData Admiss�o: %s",dataAdm);
	printf("\tC�digo Funcion�rio: %d",codFunc);
	printf("\n");
	printf("-------------------------------------------------------------");
	printf("\n");
	printf("\nINSS: %f",inss);
	printf("\nSal�rio Fam�lia: %f",salarioFamilia);
	printf("\n");
	printf("-------------------------------------------------------------");
	return 0;
	}
