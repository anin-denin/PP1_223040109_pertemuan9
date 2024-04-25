package Latihan9;

import Latihan8.MataKuliah;

public class QueueMain {
    public static void main(String[] args) {
        // Membuat instance dari StrukturQueue
        StrukturQueue queue = new StrukturQueue();

        // Sebelum melakukan enqueue 4x
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("  size : " + queue.size());
        System.out.println("  isEmpty : " + queue.isEmpty());
        queue.displayElements(); // Menampilkan elemen queue

        // Melakukan enqueue 4x
        MataKuliah matkul1 = new MataKuliah("MK1", "Matematika", 3);
        MataKuliah matkul2 = new MataKuliah("MK2", "Fisika", 3);
        MataKuliah matkul3 = new MataKuliah("MK3", "Kimia", 3);
        MataKuliah matkul4 = new MataKuliah("MK4", "Biologi", 3);

        queue.enqueue(matkul1);
        queue.enqueue(matkul2);
        queue.enqueue(matkul3);
        queue.enqueue(matkul4);

        // Setelah melakukan enqueue 4x
        System.out.println("### Enqueue 4x ###");
        System.out.println("  size : " + queue.size());
        System.out.println("  isEmpty : " + queue.isEmpty());
        queue.displayElements(); // Menampilkan elemen queue
        System.out.println("  Front : " + queue.front().getNama()); // Melihat elemen paling depan
    }
}
