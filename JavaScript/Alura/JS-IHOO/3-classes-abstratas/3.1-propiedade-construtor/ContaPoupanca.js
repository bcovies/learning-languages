import { Conta } from "./Conta.js";

export class ContaPoupanca extends Conta {
  constructor(saldoInicial, cliente, agencia) {
    super(saldoInicial, cliente, agencia);
  }
  testeOutput() {
    super.testeOutput();
    console.log("Passando pela classe filha, ContaPoupança.js");
  }
}
