class Cliente {
  nome;
  cpf;
}

class ContaCorrente {
  saldo;
  agencia;
  usuario_sacar(valor) {
    if (this.saldo > valor) {
      this.saldo -= valor;
      console.log("Usuário realizou saque com sucesso.");
      console.log("Saldo: " + this.saldo);
      console.log("Valor: " + valor);
    } else {
      console.log("Usuário não possui saldo suficiente!");
      console.log("Saldo: " + this.saldo);
      console.log("Valor: " + valor);
    }
  }
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

cc2.usuario_sacar(5);
