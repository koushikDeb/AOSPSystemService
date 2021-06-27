package android.app;
import android.os.RemoteException;
import android.annotation.SystemService;
import android.content.Context;
 
@SystemService(Context.KOUSHIK_SERVICE)
public final class KoushikServiceManager{
  private final IKoushikServiceManagerAidlInterface mService;
  private Context mContext;
  /** 
   * @hide to prevent subclassing from outside of the framework
   */
  KoushikServiceManager(Context context,IKoushikServiceManagerAidlInterface service){
        mContext = context;
        mService = service;
  }
  public void blinkBulb(){
    try{
        mService.blinkBulb();
    }catch (RemoteException ex){
    }   
  }  
}
