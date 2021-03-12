import { ContaPoupanca } from "./ContaPoupanca.js";
import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente("Bruno", 123);

const cc1 = new ContaCorrente(cliente1, 123);
const cp1 = new ContaPoupanca(120, cliente1, 312);
console.log(cc1);
console.log(cp1);
