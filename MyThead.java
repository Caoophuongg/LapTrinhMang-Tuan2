package javaapplicaton2.tuan2;


public class MyThead  extends Thread{
    @Override
    public void run (){
        System.out.println("Luong bat dau chay");
    }
    public static void main(String[] args) {
        //Tao luong
        MyThead myThead=new MyThead();
        //Bat dau luong
        myThead.start(); 
    }
}