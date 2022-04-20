package Campeonato;

public class Goleiro extends Jogador{
    protected String posicao;

	public Goleiro(int numeroJogador, Time time, String posicao) {
		super(numeroJogador, time);
        this.posicao = "Goleiro   ";
	}

	@Override
	protected void setPosicao(String posicao) {
        this.posicao = posicao;
	}

    public void mostrarJogador() {
        System.out.println("Num do jogador = " + numeroJogador + "\tTime: " + time.nomeTime + 
                            "\tPosição:" + posicao + "\tGols do Campeonato: " + getNumGolsCampeonato());
    }
}