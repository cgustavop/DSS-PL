package SubCarros;

public interface ISubCarro {

	public boolean categoriaValida(String aC);

	public boolean fiabilidadeValida(int aF);

	public void registarCarro(Carro aCarro);

	public boolean cilindradaValida(int aCilindrada, String aCategoria);

}