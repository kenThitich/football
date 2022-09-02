/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TUFGAMING
 */
public class mainFootball {
    public static void main(String[] args){
        SenderResult sender01 = new SenderResult();
        RecieverResult reciever01 = new RecieverResult(1);
        RecieverResult reciever02 = new RecieverResult(2);
        sender01.registerReciever(reciever01);
        sender01.registerReciever(reciever02);
        sender01.setResult();
    }
}
