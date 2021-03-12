import { ContaPoupanca } from "./ContaPoupanca.js";
import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";
import { Conta } from "./Conta.js";
import { ContaSalario } from "./ContaSalario.js";

const c1 = new Cliente("Bruno", 123);
const cs1 = new ContaSalario(c1);

cs1.sacar(10);
console.log(cs1);
