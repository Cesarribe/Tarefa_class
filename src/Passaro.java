public class Passaro {
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    int velocidade;
    float peso;
    String fala = "piu";

    public float pace (){
        return (velocidade * peso) /2;
    }
    public String comunicar(){
        return fala;
    }
}
