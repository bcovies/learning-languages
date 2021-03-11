export class ContaCorrente {
  agencia;
  saldo;
  usuario_depositar(valor) {
    if (valor >= 0) {
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
      return valor;
    } else {
      console.log("Usuário não possui saldo suficiente!");
      console.log("Saldo: " + this.saldo);
      console.log("Valor: " + valor);
    }
  }
  transferir(valor, conta) {
    const valorSacado = this.usuario_sacar(valor);
    console.log("Valor sacado: " + valorSacado);
    conta.usuario_depositar(valorSacado);
  }
}
