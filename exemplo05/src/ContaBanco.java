public class ContaBanco {
    // Atributos
    public int numConta;
    protected  String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Saque realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    private boolean getStatus() {
        return status;
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado da conta de " + getDono() );
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta fechada");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if(this.getTipo().equals("CC")) {
            v = 12;
        } else if(this.getTipo().equals("CP")) {
            v = 20;
        }

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Conta fechada");

        }

    }
    // method construtor
    public ContaBanco() {
        this.saldo=0;
        this.status=false;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public boolean isStatus() {
        return status;
    }
}
