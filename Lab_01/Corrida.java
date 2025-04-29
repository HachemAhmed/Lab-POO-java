public class Corrida
{
    private String modelo;
    private float motorização;
    private String fabricante;
    private String nome;
    private int quilometragemInicial;
    private int quilometragemFinal;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getMotorização() {
        return motorização;
    }
    public void setMotorização(float motorização) {
        this.motorização = motorização;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuilometragemInicial() {
        return quilometragemInicial;
    }
    public void setQuilometragemInicial(int quilometragemInicial) {
        this.quilometragemInicial = quilometragemInicial;
    }
    public int getQuilometragemFinal() {
        return quilometragemFinal;
    }
    public void setQuilometragemFinal(int quilometragemFinal) {
        this.quilometragemFinal = quilometragemFinal;
    }

    int calcularQuilometragemPercorrida() {
        return quilometragemFinal - quilometragemInicial;
    }

    public double valorFinal() {
        return 3.75 * calcularQuilometragemPercorrida();
    }

    public void imprimir() 
    {
        System.out.println("-------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Motorização: " + motorização);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Quilometragem inicial: " + quilometragemInicial + " km");
        System.out.println("Quilometragem final: " + quilometragemFinal + " km");
        System.out.println("Quilometragem percorrida: " + calcularQuilometragemPercorrida() + " km");
        System.out.println("Valor final: " + valorFinal() + " R$");
    }
}