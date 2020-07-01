#include <stdio.h>

struct funcionario {
  char nome[64];
  char funcao[64];
  char idFunc[64];
  float salario;
  int qntFilhos;
  int idadeFilhos;
  float salFamilia;
  float inss;
  float IR;
};
struct dataFunc{
  int dataAdmMes;
  int dataAdmAno;
  int dataPg;
};
//passando por valor
funcionario getEntrada(void);
void getSaida(funcionario std);
void getSaidaData(dataFunc std);
funcionario getFamilia(void);
funcionario getInss(void);
funcionario getIR(void);
//passando por referencia.
void empregado(dataFunc &std);

int main(void) {

	funcionario funcArr[5];
  dataFunc funcData[5];
	int i;
  char nomeEmpresa[30] = "Empresa1";
	char endEmpresa[15]="Av.G123";
	char cnpj[30] = "04290167000195";

	for (i = 0; i < 5; i++) {
    printf("\nEntre com o funcionario #%d\n", (i+1));
    funcArr[i] = getEntrada();
    empregado(funcData[i]);
	  funcArr[i] = getFamilia();
	  funcArr[i] = getInss();
    funcArr[i] = getIR();
	}
  	for (i = 0; i < 5; i++) {
    printf("\nFuncionario #%d:\n", (i+1));
    getSaida(funcArr[i]);
    getSaidaData(funcData[i]);
    printf("Nome empresa: %s\n", nomeEmpresa);
    printf("Endereco empresa: %s\n", endEmpresa);
    printf("Cnpj: %s\n", cnpj);
  }
  return 0;
}
funcionario getInss(void){
	struct funcionario a;
	if(a.salario<= 1751.81){
		a.inss = a.salario * 0.08;
	}
	else if(a.salario > 1751.81 && a.salario<=2919.72){
		a.inss = a.salario * 0.09;
	}
	else if ( a.salario > 2919.72 && a.salario <= 5839.45){
		a.inss = a.salario*0.11;
	}
	else{
		a.inss = 643.34;
	}
	return a;
}
funcionario getEntrada(void) {
  funcionario std;

  printf("Entre com o nome: ");
  scanf("%s", std.nome);

  printf("Entre com a funcao: ");
  scanf("%s", std.funcao);

  printf("Entre com o id do funcionario: ");
  scanf("%s", std.idFunc);

  printf("Entre com o salario: ");
  scanf("%f", &std.salario);

  printf("Entre com a quantidade de filhos:");
  scanf("%d", &std.qntFilhos);

  printf("Entre com a idade dos filhos:");
  scanf("%d", &std.idadeFilhos);

  return std;
}
void getSaida(funcionario std) {
  printf("Nome: %s\n", std.nome);
  printf("Funcao: %s\n", std.funcao);
  printf("ID do funcionario: %s\n", std.idFunc);
  printf("Salario: %f\n", std.salario);
  printf("Quantidade de filhos Menor que 14 Anos: %d\n", std.qntFilhos);
  printf("Salario Familia: %f\n", std.salFamilia);
  printf("Inss: %f\n", std.inss);
  printf("Imposto de Renda: %f\n", std.IR);
}
funcionario getFamilia(void){
	struct funcionario a;
	if(a.qntFilhos>0){
		if(a.salario<=806.80){
			a.salFamilia	= 41.37 * a.qntFilhos;
		}
		else if(a.salario>806.80 && a.salario<=1212.64){
			a.salFamilia = 29.16 * a.qntFilhos;
		}
			}
	else if(a.qntFilhos=0){
		if(a.salario > 1212.64)
		{
			a.salFamilia= 0;
		}
			}
	return a;
}
funcionario getIR(void){
	 struct funcionario a;

	if(a.salario <= 1903.98){
		printf("Nao paga!");
	}
	else if(a.salario > 1903.98 && a.salario <= 2826.65){
		a.IR = a.salario * 0.075;
	}
	else if(a.salario > 2826.66 && a.salario <= 3751.05){
		a.IR = a.salario * 0.15;
	}
	else if(a.salario > 3751.06 && a.salario <= 4664.68){
		a.IR = a.salario * 0.225;
	}
	else {
		a.IR = a.salario * 0.27;
	}
	return a;
}

void empregado(dataFunc &std){
  printf("\nEntre com a data de admissao Ano:");
  scanf("%d", &std.dataAdmMes);
  printf("\nEntre com a data de admissao Mes :");
  scanf("%d", &std.dataAdmAno);
}
void getSaidaData(dataFunc std){
  printf("\nData de admissao: %d/%d",std.dataAdmMes,std.dataAdmAno);
  printf("\nData de Pagamento: 10/%d/%d",std.dataAdmMes +1 ,std.dataAdmAno);

}
