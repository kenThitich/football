/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUFGAMING
 */
public interface FootballResult {

    /**
     * @param args the command line arguments
     */
    public void notifyResult();
    public void registerReciever(RecieverResult watcher);
    public void unRegister(int no);
    
}
