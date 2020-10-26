public class Cubo {

    public static void main(String[] args) {
        Piezas cubo = new Piezas();
        cubo.iniciaPiezas();
        cubo.imprimePiezas();

        cubo.movHorizontal('D', 0);
        cubo.movHorizontal('U', 0);
        cubo.movVertical('R',0);
        cubo.movVertical('L',0);
        cubo.movFrontal('F', 0);
        cubo.movFrontal('B', 0);


        cubo.imprimePiezas();
    }
}
