import { ContaPoupanca } from "./ContaPoupanca.js";
import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";
import { Conta } from "./Conta.js";

const c1 = new Cliente("Bruno", 123);
const cp1 = new ContaPoupanca(0, c1, 1001);
const cc1 = new ContaCorrente(c1, 1001);
const conta1 = new Conta(0, c1, 1001);

console.log(conta1);
