const numerosPares = [2, 4, 6];
const numerosImpares = [1, 3, 5];

const numeros = [...numerosImpares, ...numerosPares];
console.log(numeros);

const [num1, num2, ...resto] = [1, 2, 3, 4, 5];

console.log(num1, num2, resto);

const [nome1 = "Bruno"] = [];

console.log(nome1);

const pessoa = {
  nome: "Bruno",
  idade: 24,
};

console.log(pessoa);

const pessoaTelefone = { ...pessoa, telefone: "921939123" };

console.log(pessoaTelefone);

const { idade } = pessoa;

console.log(idade);

function imprimeDados({ nome, idade }) {
  console.log(nome, idade);
}

imprimeDados(pessoa);
