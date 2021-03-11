#include <stdio.h>
#include <stdlib.h>

//cria struct elemento
struct elemento{
	float info;
	struct elemento *prox;	
};
typedef struct elemento Elemento;

//Criar o struct pilha
struct pilha{
  char *descricao;
  Elemento *prim;
};
typedef struct pilha Pilha;


//Inicializa pilha
Pilha* pilha_cria (void){
	Pilha *p = (Pilha*) malloc(sizeof(Pilha));
	p->prim = NULL;
  	return p;
}

int pilha_vazia (Pilha *p){
	if(p->prim == NULL)
		return 1;
	
	return 0;
}
 void pilha_push (Pilha* p, float v){
 	Elemento *novo;
 	novo = (Elemento*) malloc (sizeof(Elemento));
 	novo->info = v;
 	novo->prox = p->prim;
 	p->prim = novo;
 }

float pilha_pop(Pilha* p){
	elemento *t;
	float v;
	
	if(pilha_vazia(p))
		printf("\nPilha vazia!");

	t = p->prim;
	v=t->info;
	p->prim = t->prox;
	
	free(t);
	return v;
}

void pilha_libera(Pilha*p){
	Elemento *t, *q = p->prim;
	while (q=!NULL){
		t= q->prox;
		free(q);
		q=t;
	}
}


int main(){
int inteiro;
int numeroTrue;
int auX;



  return 0;
}
