#include <stdlib.h>
#include <stdio.h>
#include <malloc.h>
#include <conio.h>
#include <locale.h>

struct no{
	int dado;
	struct no *proximo;
};
typedef struct no TIPONO;

struct pilha{
	TIPONO *topo;
	int tamanho;
};
typedef struct pilha TIPOPILHA;


void iniciar(TIPOPILHA *pilha){
	pilha->topo=NULL;
	pilha->tamanho =0;
}


void empilhar(TIPOPILHA *pilha, int numero){
	TIPONO *aux;
	aux = (TIPONO*) malloc(sizeof(TIPONO));
	aux->dado = numero;
	aux->proximo = pilha->topo;
	pilha->topo = aux;
	pilha->tamanho++;	
}
void desempilhar(TIPOPILHA *pilha){
	TIPONO *q;
	int v;
	if(pilha->tamanho == 0){
		printf("\n\nERRO: PILHA VAZIA!!!");
	}
	q = pilha->topo;
	pilha->topo = q->proximo;
	v = q->dado;
	free(q);
	pilha->tamanho--;
	printf("%d",v);
}

void menu() {
	printf("\n##############################################");
	printf("\n#                  MENU                      #");
	printf("\n#                                            #");
	printf("\n#      Digite a opção desejada               #");
	printf("\n#      (1)Entre com o número em decimal      #");
	printf("\n#      (2)Iniciar a pilha                    #");
	printf("\n#      (3)Inserir na pilha                   #");
	printf("\n#      (4)Desempilhar                        #");
	printf("\n#      (5)Sair                               #");
	printf("\n#                                            #");
	printf("\n##############################################");
	printf("\n\n");
}


main(){
	setlocale(LC_ALL,"");
	int aux,opcao,inteiro,desempilhadeira;
	TIPOPILHA *p;
	bool i= true;
		menu();
		do{
			opcao = getche()-'0';
			switch (opcao){
				case 1:
					system("cls");
					menu();
					printf("\nEntre com o número em decimal: ");
					scanf("%d",&inteiro);
					desempilhadeira = inteiro;
					system("cls");
					menu();
					break;
				case 2:
					system("cls");
					menu();
					p = (TIPOPILHA *) malloc (sizeof(TIPOPILHA));
					iniciar(p);
					break;
				case 3:
					system("cls");
					menu();
					printf("\nAdicionando Binários: ");
					do{
						aux = inteiro%2;
						printf("%d",aux);
						empilhar(p,aux);
						inteiro = inteiro/2;
					}while(inteiro>0);
					break;
				case 4:
					system("cls");
					menu();
					printf("\nDesempilhando o número %d em binário:\t",desempilhadeira);
					do{
					desempilhar(p);
					desempilhadeira = desempilhadeira/2;
					}while(desempilhadeira>0);
					break;
				case 5:
					system("cls");
					i= false;
					printf("\n##############################################");
					printf("\n#            OBRIGADO POR USAR               #");
					printf("\n##############################################");
					printf("\n\n");
					break;
			}
		}while (i == true);
	
	
	return 0;
}
