public class FabricaCarroLuxo implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroLuxo();
    }
}
