public class Main {
    public static void main(String[] args) {
        // Criando fábricas
        CarroFactory fabricaLuxo = new FabricaCarroLuxo();
        CarroFactory fabricaPopular = new FabricaCarroPopular();

        // Criando carros
        Carro carroLuxo = fabricaLuxo.criarCarro();
        Carro carroPopular = fabricaPopular.criarCarro();

        // Exibindo informações
        carroLuxo.exibirInfo();
        carroPopular.exibirInfo();
    }
}
