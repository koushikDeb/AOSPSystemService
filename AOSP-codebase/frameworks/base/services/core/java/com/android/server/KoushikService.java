package com.android.server;
import android.app.IKoushikServiceManagerAidlInterface;
import android.content.Context;
import android.os.RemoteException;
import android.util.Slog;
import android.content.Context;
import com.android.server.SystemService;
public class KoushikService extends IKoushikServiceManagerAidlInterface.Stub {
    private final static String LOG_TAG = "KoushikService";
 
    private final Object mLock = new Object();
 
    private final Context mContext;
    
    KoushikService(Context context) {
        mContext = context;
    }   
    
    @Override
    public void blinkBulb() throws RemoteException {
        Slog.i(LOG_TAG,"blinkBulb blinkBulb");
    }   
}
