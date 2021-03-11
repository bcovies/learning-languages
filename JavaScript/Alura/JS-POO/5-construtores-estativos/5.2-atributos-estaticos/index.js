import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente("Bruno", 123);
const cc1 = new ContaCorrente(cliente1, 1001);
const cliente2 = new Cliente("Jade", 321);
const cc2 = new ContaCorrente(cliente2, 1002);

cc1.usuario_depositar(10);

cc2.usuario_depositar(100);

console.log(cc1);
console.log(cc2);
