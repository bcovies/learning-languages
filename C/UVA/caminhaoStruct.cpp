 //Fila Com Alocação Dinamica
#include <stdlib.h>
#include <conio.h>
#include <stdio.h>
#include <locale.h>

struct driver{
	int cpf,placa;
	char nome[30],uf[2];
};

struct no *inicio1 = NULL;
struct no *fim_fila1 = NULL;
struct no *inicio2 = NULL;
struct no *fim_fila2 = NULL;

int tamanho1=0;
int tamanho2=0;


struct no{
	struct driver dado1;
	struct no *prox1;
	struct driver dado2;
	struct no *prox2;
};

void insere(driver valor) {
	struct no *aux;
	aux = new(struct no);
	aux->dado1 = valor;

	if(tamanho1==0) { 
		inicio1 = aux;
		fim_fila1 = aux;
	}

	fim_fila1->prox1 = aux; 
	fim_fila1 = aux; 
	aux->prox1 = NULL; 

	tamanho1++;
	printf("\n\n\nCaminhoneiro inserido com sucesso:: CPF: %d",aux->dado1.cpf);
}

void exibir_fila() {
	struct no *aux;

	if(inicio1==NULL) {
		printf("\tERRO: Fila vazia");
		return;
	}

	aux=inicio1;

	while(aux!=NULL) {
		printf(" %s |", aux->dado1.nome);
		aux = aux->prox1;
	}
}

void exibirEntregas_fila() {
	struct no *aux2;

	if(inicio2==NULL) {
		printf("\tERRO: Fila vazia");
		return;
	}

	aux2=inicio2;

	while(aux2!=NULL) {
		printf(" %s |", aux2->dado2.nome);
		aux2 = aux2->prox2;
	}
}

void remover() {
	struct no *aux1;
	
	if(inicio1==NULL) {
		printf("\tERRO: Fila vazia");
		return;
	}
	aux1 = inicio1;	
	inicio1 = inicio1->prox1;
	
	
	
	struct no *aux2;
	aux2 = new(struct no);
	
	aux2->dado2= aux1->dado1;
	if(tamanho2==0) { 
		inicio2 = aux2;
		fim_fila2 = aux2;
	}
	fim_fila2->prox2 = aux2; 
	fim_fila2 = aux2; 
	aux2->prox2 = NULL; 

	tamanho2++;
	printf("\n\n\nCaminhoneiro inserido com sucesso:: CPF: %d",aux2->dado2.cpf);

	delete(aux1);
	tamanho1--;
	printf("\n\nElemento removido com sucesso\n");
}

void menu() {
	printf("\n##############################################");
	printf("\n               MENU		             ");
	printf("\n                       	    		 ");
	printf("\n	  Digite a opção desejada            ");
	printf("\n                                      ");
	printf("\n	 (1)Inserir elemento                 ");
	printf("\n	 (2)Realizar entrega                 ");
	printf("\n	 (3)Exibir fila                      ");
	printf("\n	 (4)Mostrar primeiro elemento        ");
	printf("\n	 (4)Sair                             ");
	printf("\n                                      ");
	printf("\n##############################################");
	printf("\n\n");
}

void mostrar_primeiro() {
	if(inicio1==NULL) {
		printf("\tERRO: Fila vazia");
		return;
	}
	printf("\nO primeiro caminhoneiro é : %d", inicio1->dado1.cpf);
}

driver entrada_dados(){
	driver c;
	printf("\nEntre com CPF:");
		scanf("%d",&c.cpf);
	printf("\nEntre com Placa do caminhão:");
		scanf("%d",&c.placa);
	printf("\nEntre com UF:");
		scanf(" %s", c.uf);
	printf("\nEntre com Nome:");
		scanf(" %s", c.nome);
	return c;
}

main() {
	setlocale(LC_ALL,"");
	int opcao;
	driver d;
	bool i=true;

	menu();

	do {
		opcao = getche()-'0';

		switch(opcao) {
			case 1:
				system ("cls");
				menu();
				printf("\nDigite o valor a ser inserido ");
				d = entrada_dados();
				insere(d);
				printf("\n\n\n\nEscolha outra opção para continuar...\n\n");
				break;
			case 2:
				system ("cls");
				menu();
				remover();	
				printf("\n\n\n\nEscolha outra opção para continuar...\n\n");
				break;
			case 3:
				system ("cls");
				menu();
				printf("\nLISTANDO----Entregas PARA SEREM realizadas::");
				exibir_fila();
				printf("\n");
				printf("\nLISTANDO----Entregas já realizadas::");
				exibirEntregas_fila();
				printf("\n\n\n\nEscolha outra opção para continuar...\n\n");
				break;
			case 4:
				system ("cls");
				menu();
				mostrar_primeiro();
				printf("\n\n\n\nEscolha outra opção para continuar...\n\n");
				break;
			case 5:
				system ("cls");
				printf("\n\n\t\tObrigado por usar!!!\n\n\n\n\n\n\n\n\n\n");
				i=false;
				break;
		}
	}
	while(i==true);

	system ("pause");
}
