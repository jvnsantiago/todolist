import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Tarefas {
  String titulo;
  String descricaoTarefa;
  Boolean statusTarefa;
  Date dataInicioTarefa;
  Date prazoTarefa;
  int prioridadeTarefa;

  public Tarefas(String titulo, String descricaoTarefa, Boolean statusTarefa, Date dataInicioTarefa, Date prazoTarefa, int prioridadeTarefa) {
    this.titulo = titulo;
    this.descricaoTarefa = descricaoTarefa;
    this.statusTarefa = statusTarefa;
    this.dataInicioTarefa = dataInicioTarefa;
    this.prazoTarefa = prazoTarefa;
    this.prioridadeTarefa = prioridadeTarefa;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricaoTarefa() {
    return this.descricaoTarefa;
  }

  public void setDescricaoTarefa(String descricaoTarefa) {
    this.descricaoTarefa = descricaoTarefa;
  }

  public Boolean getStatusTarefa() {
    return this.statusTarefa;
  }

  public void setStatusTarefa(Boolean statusTarefa) {
    this.statusTarefa = statusTarefa;
  }

  public Date getDataInicioTarefa() {
    return this.dataInicioTarefa;
  }

  public void setDataInicioTarefa(Date dataInicioTarefa) {
    this.dataInicioTarefa = dataInicioTarefa;
  }

  public Date getPrazoTarefa() {
    return this.prazoTarefa;
  }

  public void setPrazoTarefa(Date prazoTarefa) {
    this.prazoTarefa = prazoTarefa;
  }

  public int getPrioridadeTarefa() {
    return this.prioridadeTarefa;
  }

  public void setPrioridadeTarefa(int prioridadeTarefa) {
    this.prioridadeTarefa = prioridadeTarefa;
  }
}