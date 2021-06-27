/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.app;
// Declare any non-default types here with import statements

public interface IKoushikServiceManagerAidlInterface extends android.os.IInterface
{
  /** Default implementation for IKoushikServiceManagerAidlInterface. */
  public static class Default implements com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface
  {
    /**
         * Demonstrates some basic types that you can use as parameters
         * and return values in AIDL.
         *///define your custom function here with any parameter

    @Override public void blinkblink() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  //Stub is created
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface
  {
    private static final java.lang.String DESCRIPTOR = "com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface interface,
     * generating a proxy if needed.
     */
    public static com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface))) {
        return ((com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface)iin);
      }
      return new com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_blinkblink:
        {
          data.enforceInterface(descriptor);
          this.blinkblink();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
           * Demonstrates some basic types that you can use as parameters
           * and return values in AIDL.
           *///define your custom function here with any parameter

      @Override public void blinkblink() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_blinkblink, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().blinkblink();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface sDefaultImpl;
    }
    static final int TRANSACTION_blinkblink = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.example.aidlcreationdemo.IKoushikServiceManagerAidlInterface getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Demonstrates some basic types that you can use as parameters
       * and return values in AIDL.
       *///define your custom function here with any parameter

  public void blinkblink() throws android.os.RemoteException;
}
