package org.vaadin.patrik.shared;

import com.vaadin.shared.communication.ServerRpc;

/**
 * Client-to-server RPC methods 
 */
public interface FastNavigationServerRPC extends ServerRpc {
    
    void focusUpdated(int rowIndex, int colIndex);
    
    void rowUpdated(int rowIndex);

    void cellUpdated(int rowIndex, int colIndex, String newData);
    
    void editorOpened(int rowIndex, int colIndex, int lockId);
    
    void editorClosed(int rowIndex, int colIndex, boolean wasCancelled);
    
    void clickOut();
    
    void ping();
    
    void forceValidate(boolean move);

}
