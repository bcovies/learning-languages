import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente();
const cc1 = new ContaCorrente();

cliente1.nome = "Jade";
cliente1.cpf = 123321;
cc1.saldo = 10;
cc1.agencia = 1001;

cc1.cliente = cliente1;

console.log(cc1);
