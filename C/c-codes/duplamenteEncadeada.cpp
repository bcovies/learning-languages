#include <stdio.h>
#include <stdlib.h>

typedef struct elemento elem_lista;

struct elemento{
	struct elemento *ant;
	int conteudo;
	struct elemento *prox;
};
int main(){
	elem_lista elemento;
	elem_lista *p, *q, *ini;
	int i;
	int opCase;
	int tam_lista;
	
	printf("\nEntre com o a opção desejada: ");
	printf("\n(1)Inicializar");
	printf("\n(2)Acrescentar");
	printf("\n(3)Listar");
	printf("\nOutra tecla para sair");

do{
	printf("\n:");
	scanf("%d",&opCase);
	switch(opCase){
		
	case 1: 
		p = (elem_lista*) malloc (sizeof (elem_lista));
		printf("\nInicializado!");
		ini=p;
		p->ant= NULL;
		break;
	case 2:
		printf("Entre com quantos elementos quer adicionar: ");
			scanf("%d",&tam_lista);
		for(i=0;i<tam_lista;i++){
			printf("Entre com o elemento[%d]: ",i);
				scanf("%d",&p->conteudo);
			q = (elem_lista*) malloc (sizeof (elem_lista));
			p -> prox = q;
			q -> ant = p;
			p=q;
		}
		printf("\nEntre com o ultimo elemento: ");
				scanf("%d",&p->conteudo);
	p->prox = NULL;
	p = ini;
	
		break;
	case 3:
	printf ("endereço primeiro elemento = %u\n", ini);
		do{
	printf ("p->ant = %u\n", p->ant);
	printf ("p = %u\n", p);
	printf ("conteudo = %d\n", p->conteudo);
    printf ("p->prox = %u\n", p->prox);
	p = p-> prox;
    printf (" --------------\n");
	}while ( p->prox !=NULL);  /* caminha na lista e exibe o conteúdo da lista */
        
	printf ("p->ant = %u\n", p->ant);
	printf ("p = %u\n", p);
	printf ("conteudo = %d\n", p->conteudo);
	printf ("p->prox = %u\n", p->prox);

		break;
	default :
		printf("\nSaindo...");
	
	};
	}while(opCase<=3);
	return 0;
}
