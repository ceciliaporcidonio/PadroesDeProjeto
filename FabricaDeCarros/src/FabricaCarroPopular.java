public class FabricaCarroPopular implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroPopular();
    }
}
