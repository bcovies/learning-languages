import { Gerente } from "./Funcionario/Gerente.js";
import { Diretor } from "./Funcionario/Diretor.js";
import { SistemaAutenticacao } from "./SistemaAutenticacao.js";

const diretor = new Diretor("Jade", 1000, 123123);
diretor.cadastrarSenha("senha123");

const estaLogado = SistemaAutenticacao.login(diretor, "senha123");

console.log(estaLogado);
