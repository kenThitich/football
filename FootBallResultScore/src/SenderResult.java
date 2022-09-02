

import java.util.*;

public class SenderResult implements FootballResult{
    private ArrayList<RecieverResult> list=new ArrayList<RecieverResult>();
    static Scanner sc = new Scanner(System.in);
    private String result;
    
    public void setResult(){
        while(true){
            System.out.print("Enter Score ");
            String resultScore = sc.nextLine();
            if(resultScore.length()==0){
                System.out.println("END SEND SCORE");
                break;
            }
            else {
                this.result=resultScore;
                notifyResult();
            }
        }
    }
    
    public String getResult(){
        return result;
    }
    
    @Override
    public void notifyResult(){
        for(int i=0;i<list.size();i++){
            list.get(i).update(this);
        }
    }
    @Override
    public void registerReciever(RecieverResult watcher){
        list.add(watcher);
    }
    
    @Override
    public void unRegister(int no){
        int count = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getNo()==no){
                break;
            }
            count++;
        }
        list.remove(count);
    }
}