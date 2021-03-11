function sejaBemVindo() {
    console.log("Seja bem vindo ao JS");
}
console.log("Chamando a função...");
sejaBemVindo();

var objAluno = {
    nome: "bruno coviello souto",
    curso: "JavaScript",
    terAula: function(){
        console.log("Vai estudar vagabundo!");
    }
};

console.log("objeto aluno");
console.log(objAluno);
console.log("Acessando propriedades");
objAluno.curso;
objAluno.nome;
console.log("Chamando a função");
objAluno.terAula();

