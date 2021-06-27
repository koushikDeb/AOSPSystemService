
//SystemServiceRegistry.java
registerService(Context.KOUSHIK_SERVICE, KoushikServiceManager.class,
                new CachedServiceFetcher<KoushikServiceManager>() {
            @Override
            public KoushikServiceManager createService(ContextImpl ctx) throws ServiceNotFoundException {
                  IBinder binder;
                if (true){//ctx.getApplicationInfo().targetSdkVersion >= Build.VERSION_CODES.O) {
                    binder = ServiceManager.getServiceOrThrow(Context.KOUSHIK_SERVICE);
                } else {
                    binder = ServiceManager.getService(Context.KOUSHIK_SERVICE);
                }
                return new KoushikServiceManager(ctx,IKoushikServiceManagerAidlInterface.Stub.asInterface(binder));
            }});
