#include <stdio.h>
#include <stdlib.h>
#define TAM 60

struct pilha{
  int topo;
  int dado[TAM];
};

void inicializaPilha(int &a){
  a= -1;
  printf("\nTOPO inicializado! Valor: %d",a);
}
int tamanhoPilha(int &a){
  return printf("\nTAMANHO DA PILHA: %d",a+1);
}
int empilhar(int &a, int x, int &b){
  if(a<TAM){
    a++;
    b= x;
  }
  else{
    printf("PILHA CHEIA!!!");
  }
}
void desempilhar( int b[], int &a){
  if (a == -1){
    printf("\nPilha Vazia!!!");
  }
  else{
    printf("%d",b[a]);
    a --;
  }
}
int main(){
int inteiro;
int numeroTrue;
int auX;
pilha p;
inicializaPilha(p.topo);
tamanhoPilha(p.topo);

printf("\nEntre com um número inteiro: ");
  scanf("%d",&inteiro);
  numeroTrue = inteiro;
  do{
    auX = inteiro % 2;
    printf("\n%d",auX);
    empilhar(p.topo,auX,p.dado[p.topo+1]);
    inteiro = inteiro/2;
  }while(inteiro>0);

  printf("\n%d em binario eh: ",numeroTrue);
  while(p.topo!=-1){
    desempilhar(p.dado,p.topo);
  }

  return 0;
}
