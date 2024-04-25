package Latihan9;

import Latihan8.MataKuliah; // Impor kelas MataKuliah yang dibutuhkan

public class StrukturQueue {
    private Node front; // Atribut untuk node paling depan
    private Node rear;  // Atribut untuk node paling belakang

    // Konstruktor untuk inisialisasi Queue
    public StrukturQueue() {
        this.front = null;
        this.rear = null;
    }

    // Metode untuk memeriksa apakah queue kosong
    public boolean isEmpty() {
        return (front == null); // Jika front null, maka queue kosong
    }

    // Metode untuk menambahkan elemen ke dalam queue (enqueue)
    public void enqueue(MataKuliah mataKuliah) { // Parameter harus MataKuliah
        Node newNode = new Node(mataKuliah); // Membuat Node dengan MataKuliah
        if (isEmpty()) { // Jika queue kosong
            front = newNode; // FRONT dan REAR menunjuk ke node yang sama
            rear = newNode;
        } else {
            rear.setNext(newNode); // REAR menunjuk ke node baru
            rear = newNode; // REAR menjadi node baru
        }
    }

    // Metode untuk menghapus elemen dari depan queue (dequeue)
    public MataKuliah dequeue() { // Ubah tipe data kembalian
        if (isEmpty()) {
            throw new IllegalStateException("Queue kosong");
        }
        MataKuliah data = front.getData(); // Ambil data dari node paling depan
        front = front.getNext(); // Pindahkan FRONT ke node berikutnya
        if (front == null) { // Jika FRONT menjadi null, maka REAR juga harus null
            rear = null;
        }
        return data; // Kembalikan objek MataKuliah yang diambil
    }

    // Metode untuk menghitung jumlah elemen dalam queue
    public int size() {
        int size = 0;
        Node curNode = front; // Mulai dari node paling depan
        while (curNode != null) { // Iterasi sampai akhir queue
            size++; // Tambah jumlah elemen
            curNode = curNode.getNext(); // Pindah ke node berikutnya
        }
        return size; // Kembalikan ukuran queue
    }

    // Metode untuk melihat elemen paling depan tanpa menghapusnya
    public MataKuliah front() { // Ubah tipe data kembalian
        if (isEmpty()) {
            throw new IllegalStateException("Queue kosong");
        }
        return front.getData(); // Kembalikan objek MataKuliah
    }

    // Prosedur untuk menampilkan semua elemen dalam queue
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
        } else {
            System.out.print("Elemen Queue: ");
            Node curNode = front;
            while (curNode != null) { // Iterasi dari front ke rear
                System.out.print(curNode.getData() + " "); // Menampilkan data
                curNode = curNode.getNext(); // Pindah ke node berikutnya
            }
            System.out.println(); // Baris baru setelah iterasi selesai
        }
    }
}
