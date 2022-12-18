package EntregaFinal.src.SubPilotos;

public interface ISubPiloto {

	public boolean nomePilotoDisponivel(String aNome);

	public boolean niveisPericiaValidos(float aCts, float aSva);

	public void registarPiloto(Piloto aPiloto);

}