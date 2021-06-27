
//SystemServer.java

private static final String KOUSHIK_SERVICE = "com.android.server.KoushikService";
...
//added in the startBootstrapServices() function 
if(true){
            KoushikService androidservice = null;
            try{
                traceBeginAndSlog("KoushikService");
                androidservice = new KoushikService(mSystemContext);
                ServiceManager.addService(KOUSHIK_SERVICE,androidservice);
            }catch(Throwable e){
                Slog.e(TAG, "Starting KoushikService failed!!! ", e);
            }
            traceEnd();
        }

        