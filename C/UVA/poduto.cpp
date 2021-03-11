#include <stdio.h>

struct produto{
	int codigo,categoria;
	float valorCompra,valorVenda;
	};

struct produto entrada(void);
struct produto calculaLucro(void);
void saida(struct produto a);

int main(){
	struct produto abc;
	
	abc = entrada();
	abc = calculaLucro();
	saida(abc);
	return 0;
}
void saida(struct produto a){
	printf("\nCódigo: %d",a.codigo);
	printf("\nCategoria: %d ",a.categoria);
	printf("\nValor Compra: %f ",a.valorCompra);
	printf("\nValor Venda: %f",a.valorVenda);
}

struct produto entrada(void){	
produto a;
	printf("Entre com o código: ");
		scanf("%d",&a.codigo);
	printf("Entre com a categoria: ");
		scanf("%d",&a.categoria);
	printf("Entre com o valor de compra: ");
		scanf("%f",&a.valorCompra);
	return a; 
}

struct produto calculaLucro(void){
	produto a;
	if(a.categoria == 1){
		a.valorVenda = a.valorCompra * 0.15;
	}
	else if(a.categoria == 2){
		a.valorVenda = a.valorCompra * 0.20;
	}
	else if(a.categoria == 3){
		a.valorVenda = a.valorCompra * 0.30;
	}
	else{
		printf("Valor incorreto!");
	}
	return a;
}






