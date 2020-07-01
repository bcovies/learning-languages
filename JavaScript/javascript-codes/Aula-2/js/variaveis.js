var nome = "Bruno";
var sobreNome = "Souto";

console.log("instrução no arquivo JS");

function exibirNomeConsole(){
    console.log("exibir nome: " + nome );
}

function exibirNomeCompleto(){
    console.log("Nome completo: " + nome + "" + sobreNome);
}

function eventoClick() {
    alert("Ronaldo!");
}
exibirNomeCompleto();
exibirNomeConsole();