package pecahan;

public class Pecahan {
    int bulat,pembilang,penyebut;
    
    Pecahan(){
        bulat=0; pembilang=0; penyebut=1;
    }
    Pecahan(int x){
        bulat=x; pembilang=0; penyebut=1;
    }
    
    Pecahan(int x, int y){
        bulat=0; pembilang=x; penyebut=y;
    }
    
    Pecahan(int x, int y, int z){
        bulat=x; pembilang=y; penyebut=z;
    }
    int gcd (int x, int y){
        if(y==0) return(x);
        else return (gcd(y,x%y));
    }
    
    void reduksi(){
        int temp=gcd(pembilang,penyebut);
        pembilang=pembilang/temp; penyebut=penyebut/temp;
        if(pembilang>=penyebut){
            bulat=pembilang/penyebut;
            pembilang=pembilang%penyebut;
        }
        else bulat=0;
    }
    
    Pecahan tambah(Pecahan X){
        Pecahan T = new Pecahan();
        T.bulat=0;
        T.pembilang=(bulat*penyebut+pembilang)*X.penyebut + penyebut*(X.bulat*X.penyebut+X.pembilang);
        T.penyebut=penyebut*X.penyebut;
        T.reduksi();
        return T;
    }
    
    Pecahan kurang(Pecahan X){
        Pecahan T = new Pecahan();
        T.bulat=0;
        T.pembilang=(bulat*penyebut+pembilang)*X.penyebut - penyebut*(X.bulat*X.penyebut+X.pembilang);
        T.penyebut=penyebut*X.penyebut;
        T.reduksi();
        return T;
    }
    
    Pecahan kali(Pecahan X){
        Pecahan T = new Pecahan();
        T.bulat=0;
        T.pembilang=(bulat*penyebut+pembilang)*(X.bulat*X.penyebut+X.pembilang);
        T.penyebut=penyebut*X.penyebut;
        T.reduksi();
        return T;
    }
    
    Pecahan bagi(Pecahan X){
        Pecahan T = new Pecahan();
        T.bulat=0;
        T.pembilang=(bulat*penyebut+pembilang)*X.penyebut;
        T.penyebut=penyebut*(X.bulat*X.penyebut+X.pembilang);
        T.reduksi();
        return T;
    }
    
    String toStr(){
        String T="";
        if(penyebut==1)
            if(pembilang==0)
                T=T+bulat;
            else{
                T=T+(bulat+pembilang);
                pembilang=0;
            }
        else if(bulat==0)
            T=T+pembilang+"/"+penyebut;
        else
            T=T+bulat+" "+pembilang+"/"+penyebut;
        return(T);
    }
    
    public static void main(String[] args) {
        Pecahan X=new Pecahan(12,1,4);
        Pecahan Y=new Pecahan(5,6);
        Pecahan Z=new Pecahan();
        
        System.out.println("X = "+X.toStr()+"\n"+"Y = "+Y.toStr()+"\n");
        Z=X.tambah(Y);
        System.out.println("X + Y = "+Z.toStr());
        Z=X.kurang(Y);
        System.out.println("X - Y = "+Z.toStr());
        Z=X.kali(Y);
        System.out.println("X * Y = "+Z.toStr());
        Z=X.bagi(Y);
        System.out.println("X / Y = "+Z.toStr());
    }
}