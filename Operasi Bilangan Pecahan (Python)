class Pecahan:
    def __init__(self, bulat = 0, pembilang = 0, penyebut = 1):
        self.bulat = bulat
        self.pembilang = pembilang
        self.penyebut = penyebut

    def __add__(self, other):
        bulat_baru = self.bulat + other.bulat
        if (self.penyebut == other.penyebut):                           
            pembilang_baru = self.pembilang + other.pembilang
            if pembilang_baru % self.penyebut == 0:                      
                bulat_baru += pembilang_baru//self.penyebut
                return Pecahan(bulat_baru, 0, self.penyebut)
            return Pecahan(bulat_baru, pembilang_baru, self.penyebut)
        else:                                                   
            pembilang_baru = self.pembilang * other.penyebut + self.penyebut * other.pembilang
            penyebut_baru = self.penyebut * other.penyebut
            if (pembilang_baru % penyebut_baru == 0):                    
                bulat_baru += pembilang_baru//penyebut_baru
                return Pecahan(bulat_baru, 0, penyebut_baru)
            return Pecahan(bulat_baru, pembilang_baru, penyebut_baru)

    def __sub__(self, other):
        bulat_baru = self.bulat - other.bulat
        if (self.penyebut == other.penyebut):
            pembilang_baru = self.pembilang - other.pembilang
            if pembilang_baru % self.penyebut == 0:
                bulat_baru -= pembilang_baru // self.penyebut
                return Pecahan(bulat_baru, 0, self.penyebut)
            return Pecahan(bulat_baru, pembilang_baru, self.penyebut)
        else:
            pembilang_baru = self.pembilang * other.penyebut - self.penyebut * other.pembilang
            penyebut_baru = self.penyebut * other.penyebut
            if pembilang_baru % penyebut_baru == 0:
                bulat_baru -= pembilang_baru // penyebut_baru
                return Pecahan(bulat_baru, 0, penyebut_baru)
            return Pecahan(bulat_baru, pembilang_baru, penyebut_baru)

    def __repr__(self):
        return "Pecahan({}, {}, {})".format(self.bulat, self.pembilang, self.penyebut)


a = Pecahan(5, 2, 4)
b = Pecahan(3, 1, 4)

x = a + b
y = a - b

print(x)
print(y)
