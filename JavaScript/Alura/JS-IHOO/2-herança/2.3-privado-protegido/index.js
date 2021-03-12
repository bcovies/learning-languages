import { ContaPoupanca } from "./ContaPoupanca.js";
import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cc1 = new Cliente("Bruno", 123);
const cp1 = new ContaPoupanca(0, cc1, 1001);
console.log(cp1.testeOutput());
