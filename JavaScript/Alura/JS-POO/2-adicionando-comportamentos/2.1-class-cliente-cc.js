class Cliente {
  nome;
  cpf;
}

class ContaCorrente {
  saldo;
  agencia;
}

const cliente1 = new Cliente();
const cc1 = new ContaCorrente();

cliente1.nome = "Jade";
cliente1.cpf = 123321;
cc1.saldo = 10;
cc1.agencia = 1001;

const cliente2 = new Cliente();
const cc2 = new ContaCorrente();

cliente2.nome = "Bruno";
cliente2.cpf = 321123;
cc2.agencia = 2002;
cc2.saldo = 20;

console.log(cliente1, cc1);
console.log(cliente2, cc2);
