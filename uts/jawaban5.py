def hitung(harga):
    ppn = harga * 10 / 100
    total = harga + ppn
    print("Jumlah yang harus dibayarkan: " + str(total))

i = 0
while i == 0:
    nim = input("Masukkan NIM: ")
    nama = input("Masukkan nama: ")

    print("Pilihan")
    print("1. Capuccino")
    print("2. Teh")
    print("3. Exit")
    pilihan = int(input("Masukkan pilihan: "))

    if pilihan == 1:
        print("Anda memilih Capuccino")
        harga = int(input("Masukkan harga: "))
        hitung(harga)
        i = 0
    elif pilihan == 2:
        print("Anda memilih Teh")
        harga = int(input("Masukkan harga: "))
        hitung(harga)
        i = 0
    elif pilihan == 3:
        print("Anda memilih Exit")
        i = 1
    else:
        print("Pilihan tidak ada")
        i = 0
