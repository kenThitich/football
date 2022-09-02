

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUFGAMING
 */
public class RecieverResult implements FootballObserver{
    int no;
    public RecieverResult(int no){
        this.no=no;
    }
    
    public void setNo(int no){
        this.no=no;
    }
    
    public int getNo(){
        return no;
    }
    
    public void update(FootballResult result){
        System.out.println("live result: "+((SenderResult)result).getResult());
    }
}
