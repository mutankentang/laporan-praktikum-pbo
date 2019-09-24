package pbojsempat;
public class MainPertanyaan1841720125Falah {
     public static void main(String[] args){
    Pegawai1841720125Falah masinis = new Pegawai1841720125Falah("1234","Spongebob");
        Pegawai1841720125Falah asisten = new Pegawai1841720125Falah("1567","Patrick");
        KeretaApi1841720125Falah keretaApi = new KeretaApi1841720125Falah("Gaya Baru", "Bisnis",masinis, asisten);
        System.out.println(keretaApi.info());
}
}