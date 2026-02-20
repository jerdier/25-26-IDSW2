public class Cantante {
    public Cantante(String nombre) { }

    // Asociación: Mantiene referencia a un disco
    public void vincularDisco(Disco disco) { }

    // USO: Recibe la playlist para ejecutarla
    public void gestionarPlaylist(Playlist playlist) { 
        playlist.ejecutar();
    }
}