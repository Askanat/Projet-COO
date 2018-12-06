package application;

public interface Sujet {
    void abonne(Observateur observateur);
    void notifie();
}
