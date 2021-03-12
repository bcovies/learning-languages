import { Cliente } from "./Cliente.js";
import { SistemaAutenticacao } from "./SistemaAutenticacao.js";

const c1 = new Cliente("Zac", 123444, "111");
console.log(c1);

const taLogado = SistemaAutenticacao.login(c1, "111");

console.log(taLogado);
