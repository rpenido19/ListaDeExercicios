package poo.lista.pkg4;

public class Veiculo {

    // Atributos
    private String modelo;
    private int tipoCombustivel; // 0 - gasolina / 1 - alcool
    private int tanque;
    private double quantCombustivel;

    // Getters and Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public double getQuantCombustivel() {
        return quantCombustivel;
    }

    public void setQuantCombustivel(double quantCombustivel) {
        this.quantCombustivel = quantCombustivel;
    }

    // Construtor
    public Veiculo(String modelo, int tipoCombustivel, int tanque, double quantCombustivel) {
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.tanque = tanque;
        this.quantCombustivel = quantCombustivel;
    }

    // Métodos
    public void MoverVeiculo(int distancia) {

        // Calc Gasolina
        if (this.getTipoCombustivel() == 0) {

            // Quant de combustível necessária
            double quantCombusNeces = distancia / 10;

            // Verifica se tem combustível suficiente
            // Se o tanque estiver vazio;
            if (this.getQuantCombustivel() == 0) {

                System.out.println("O veículo não andou nada porque está de tanque vazio. ");

            } // Se não houver combustível suficiente
            else if (quantCombusNeces > this.getQuantCombustivel()) {

                System.out.println("O veiculo " + this.getModelo() + " andou " + (this.getQuantCombustivel() * 10) + "Km e consumiu seu combustível todo. ");
                this.setQuantCombustivel(0);

            } // Se houver combustível suficiente
            else {

                System.out.println("O veiculo " + this.getModelo() + " andou " + distancia + "Km e consumiu " + quantCombusNeces + "L de combustível. ");
                this.setQuantCombustivel(this.getQuantCombustivel() - quantCombusNeces);

            }

        } // Calc Alcool
        else {

            // Quant de combustível necessária
            double quantCombusNeces = distancia / 7;

            // Verifica se tem combustível suficiente
            // Se o tanque estiver vazio;
            if (this.getQuantCombustivel() == 0) {

                System.out.println("O veículo não andou nada porque está de tanque vazio. ");

            } // Se não houver combustível suficiente
            else if (quantCombusNeces > this.getQuantCombustivel()) {

                System.out.println("O veiculo " + this.getModelo() + " andou " + (this.getQuantCombustivel() * 7) + "Km e consumiu seu combustível todo. ");
                this.setQuantCombustivel(0);

            } // Se houver combustível suficiente
            else {

                System.out.println("O veiculo " + this.getModelo() + " andou " + distancia + "Km e consumiu " + quantCombusNeces + "L de combustível. ");
                this.setQuantCombustivel(this.getQuantCombustivel() - quantCombusNeces);

            }

        }

    }

    // Abastecer Veículo
    public void Abastecer(int quant) {

        if ((this.getQuantCombustivel() + quant) > this.getTanque()) {

            System.err.println("Erro - O tanque suporta até " + this.getTanque() + "L de combustível. ");
            System.out.println("Este veículo possui " + this.getQuantCombustivel() + "L no tanque. ");

        } else {

            this.setQuantCombustivel((this.getQuantCombustivel() + quant));
            System.out.println("Veículo abastecido com sucesso! ");
            System.out.println("Este veículo possui " + this.getQuantCombustivel() + "L no tanque. ");

        }

    }

}
