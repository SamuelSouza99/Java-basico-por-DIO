public class tiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, mundo!");

        //tipos:
        byte idade = 18; //Byte guarda até 3 digitos.
        short ano = 2024; //Short guarda até 4 digitos.
        int cep = 22222222; // Caso o numero comece com 0, esse 0 poderia n ser contabilizado pela maquina.
        long cpf = 12345678912L; //mesma coisa do int. Precisa terminar com L.
        float pi = 3.14F; //O f, seja maiusculo ou minusculo é obrigatório!
        double salario = 1200.99;

        final double VALOR_DE_PI = 3.14;

        String testeString = "Fim da aula de variáveis.";
        System.out.println(testeString);
    }
}
