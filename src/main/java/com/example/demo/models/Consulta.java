package com.example.demo.models;

public class Consulta {

    private String medico;
    private String paciente;

    private double valorConsulta;

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Consulta(String medico, String paciente, double valorConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.valorConsulta = valorConsulta;
    }
}
