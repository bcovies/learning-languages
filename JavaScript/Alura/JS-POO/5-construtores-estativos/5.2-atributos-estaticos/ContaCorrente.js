import { Cliente } from "./Cliente.js";

export class ContaCorrente {
  agencia;
  _saldo = 0;
  _cliente;

  constructor(cliente, agencia) {
    this.agencia = agencia;
    this.cliente = cliente;
  }
  get saldo() {
    return this._saldo;
  }

  set cliente(novoCliente) {
    if (novoCliente instanceof Cliente) {
      this._cliente = novoCliente;
    }
  }

  get cliente() {
    return this._cliente;
  }

  usuario_depositar(valor) {
    if (valor >= 0) {
      this._saldo += valor;
      console.log("Usuário realizou depósito com sucesso.");
      console.log("Saldo total: " + this._saldo);
    } else {
      console.log("Valor negativo, impossível realizar depósito.");
      return;
    }
  }
  usuario_sacar(valor) {
    if (this._saldo > valor) {
      this._saldo -= valor;
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
    conta.cidade = "São Paulo";
    const valorSacado = this.usuario_sacar(valor);
    console.log("Valor sacado: " + valorSacado);
    conta.usuario_depositar(valorSacado);
  }
}
