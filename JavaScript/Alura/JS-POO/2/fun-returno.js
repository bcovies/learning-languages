class Cliente {
  nome;
  cpf;
}

class ContaCorrente {
  saldo;
  agencia;
  usuario_depositar(valor) {
    if (valor > 0) {
      this.saldo += valor;
      console.log("Usuário realizou depósito com sucesso.");
      console.log("Saldo total: " + this.saldo);
    } else {
      console.log("Valor negativo, impossível realizar depósito.");
      return;
    }
  }
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
