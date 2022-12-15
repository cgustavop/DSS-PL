public interface ISubPiloto {

	public boolean nomePilotoDisponivel(String aNome);

	public boolean niveisPericiaValidos(float aCts, float aSva);

	public void registarPiloto(Piloto aPiloto);

	public int hashCode();

	public boolean equals(Object aObject);
}