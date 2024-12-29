public class Books extends LibrarySystem {

    public void read(int id, int cls) {
        if (cls < 5) {
            System.out.println("Read Comics");
        } else if (id > 5 && id <= 10) {
            System.out.println("Read about Social Science ");
        } else {
            System.out.println("Read for public examination");
        }
    }
    public void leaves(){
        System.out.println("student leaves");
    }
    public static void main(String[] args) {
        LibrarySystem bk = new Books();
    }
}

