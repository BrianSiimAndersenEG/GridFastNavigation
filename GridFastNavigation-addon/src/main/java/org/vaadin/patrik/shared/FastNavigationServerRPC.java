package org.vaadin.patrik.shared;

import com.vaadin.shared.communication.ServerRpc;

/**
 * Client-to-server RPC methods 
 */
public interface FastNavigationServerRPC extends ServerRpc {
    
    void focusUpdated(int rowIndex, int colIndex);
    
    void rowUpdated(int rowIndex, boolean moved);

    void cellUpdated(int rowIndex, int colIndex, String newData, String oldData, boolean moved);
    
    void editorOpened(int rowIndex, int colIndex, int lockId);
    
    void editorClosed(int rowIndex, int colIndex, boolean wasCancelled);
    
    void clickOut();
    
    void ping();
    
    void forceValidate(boolean move);

}
