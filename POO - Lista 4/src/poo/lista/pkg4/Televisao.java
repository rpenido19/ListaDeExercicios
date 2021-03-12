package poo.lista.pkg4;

public class Televisao {

    // Atributos
    private int tvVolume;
    private int tvCanal;

    // Getters and Setters
    public int getTvVolume() {
        return tvVolume;
    }

    public void setTvVolume(int tvVolume) {
        this.tvVolume = tvVolume;
    }

    public int getTvCanal() {
        return tvCanal;
    }

    public void setTvCanal(int tvCanal) {
        this.tvCanal = tvCanal;
    }

    // Construtor
    public Televisao(int tvVolume, int tvCanal) {
        this.tvVolume = tvVolume;
        this.tvCanal = tvCanal;
    }

    // Métodos
    // Consulta o volume e canal atual
    public void ConsultaTv() {
        System.out.println("A televisão está no canal " + this.getTvCanal() + ".");
        System.out.println("O volume atual é " + this.getTvVolume() + ".");
    }

    // CH ++
    public void CanalSeguinte() {
        // O canal seguinte do 150 é o 1
        if (this.getTvCanal() + 1 > 150) {
            this.setTvCanal(1);
        } else {
            this.setTvCanal(this.getTvCanal() + 1);
        }
    }

    // CH --
    public void CanalAnterior() {
        // O canal anterior ao 1 é o 150
        if (this.getTvCanal() - 1 < 1) {
            this.setTvCanal(150);
        } else {
            this.setTvCanal(this.getTvCanal() - 1);
        }
    }

    // Digita o canal desejado
    public void MudaCanal(int canal) {
        if (canal < 1 || canal > 150) {
            System.err.println("Erro - Os canais variam de 1 a 150. ");
        } else {
            this.setTvCanal(canal);
        }
    }

    // VOL ++
    public void VolumeMais() {
        // Volume pode variar de 0 a 100
        if (this.getTvVolume() == 100) {
            System.err.println("Erro - Volume máximo. ");
        } else {
            this.setTvVolume(this.getTvVolume() + 1);
        }

    }

    // VOL --
    public void VolumeMenos() {
        // Volume pode variar de 0 a 100
        if (this.getTvVolume() == 0) {
            System.err.println("Erro - Volume mínimo. ");
        } else {
            this.setTvVolume(this.getTvVolume() - 1);
        }
    }

}
