public abstract interface IExemplar {

	public abstract int getCodigoItem();
	public abstract int getCodigoExemplar();
	

	public abstract boolean isDisponivel(IExemplar exemplar);

	public abstract void setDisponivel(boolean estado);

}
