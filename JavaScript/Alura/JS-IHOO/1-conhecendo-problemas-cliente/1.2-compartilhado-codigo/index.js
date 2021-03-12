import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente("Bruno", 123);
const cliente2 = new Cliente("Jade", 321);

const cc1 = new ContaCorrente(0, cliente1);
cc1.depositar(10);
cc1.sacar(3);

const cc2 = new ContaCorrente(11111, cliente2);

let valor = 31;
cc1.tranferir(valor, cc2);

console.log(cc1);
