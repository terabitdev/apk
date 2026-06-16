package io.elevenlabs.data.services;

import a7.t;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.NotificationsApi;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.NotificationNewDeviceModel;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.DeviceUuidService;
import io.elevenlabs.domain.services.NotificationService;
import ir.m0;
import ir.r;
import ir.w;
import jr.s;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001$B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010!\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006%"}, d2 = {"Lio/elevenlabs/data/services/NotificationServiceImpl;", "Lio/elevenlabs/domain/services/NotificationService;", "Landroid/content/SharedPreferences;", "userPreferences", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/data/api/NotificationsApi;", "notificationsApi", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/DeviceUuidService;", "deviceUuidService", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/SharedPreferences;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/data/api/NotificationsApi;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/DeviceUuidService;Landroid/content/Context;)V", "Lsn/z;", "sync", "(Lwn/c;)Ljava/lang/Object;", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "submitToken", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "saveToken", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Lio/elevenlabs/domain/services/AuthService;", "Lio/elevenlabs/data/api/NotificationsApi;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/DeviceUuidService;", "Landroid/content/Context;", "prefNotificationTokenToSync", "Ljava/lang/String;", ParameterNames.TAG, "NotificationTokenSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NotificationServiceImpl implements NotificationService {
    private final Context appContext;
    private final AuthService authService;
    private final DeviceUuidService deviceUuidService;
    private final Logger logger;
    private final NotificationsApi notificationsApi;
    private final String prefNotificationTokenToSync;
    private final String tag;
    private final SharedPreferences userPreferences;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/NotificationServiceImpl$NotificationTokenSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class NotificationTokenSyncException extends Exception {
    }

    public NotificationServiceImpl(@UserSharedPreferences SharedPreferences sharedPreferences, AuthService authService, NotificationsApi notificationsApi, Logger logger, DeviceUuidService deviceUuidService, Context context) {
        sharedPreferences.getClass();
        authService.getClass();
        notificationsApi.getClass();
        logger.getClass();
        deviceUuidService.getClass();
        context.getClass();
        this.userPreferences = sharedPreferences;
        this.authService = authService;
        this.notificationsApi = notificationsApi;
        this.logger = logger;
        this.deviceUuidService = deviceUuidService;
        this.appContext = context;
        this.prefNotificationTokenToSync = "notificationTokenToSync";
        this.tag = "NotificationService";
    }

    public static final String submitToken$lambda$0(String str) {
        return defpackage.f.i("Notification token: ", str);
    }

    @Override // io.elevenlabs.domain.services.NotificationService
    public String getToken() {
        return this.userPreferences.getString(this.prefNotificationTokenToSync, null);
    }

    @Override // io.elevenlabs.domain.services.NotificationService
    public void saveToken(String r42) {
        r42.getClass();
        this.logger.log(this.tag, "saveToken");
        this.userPreferences.edit().putString(this.prefNotificationTokenToSync, r42).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.NotificationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitToken(String str, wn.c<? super z> cVar) {
        NotificationServiceImpl$submitToken$1 notificationServiceImpl$submitToken$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof NotificationServiceImpl$submitToken$1) {
            notificationServiceImpl$submitToken$1 = (NotificationServiceImpl$submitToken$1) cVar;
            int i11 = notificationServiceImpl$submitToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                notificationServiceImpl$submitToken$1.label = i11 - Integer.MIN_VALUE;
                Object obj = notificationServiceImpl$submitToken$1.result;
                i10 = notificationServiceImpl$submitToken$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.verbose(this.tag, new f(str, 2));
                    this.logger.log(this.tag, "submitToken");
                    NotificationsApi notificationsApi = this.notificationsApi;
                    NotificationNewDeviceModel notificationNewDeviceModel = new NotificationNewDeviceModel(str, this.deviceUuidService.getUuid());
                    notificationServiceImpl$submitToken$1.L$0 = null;
                    notificationServiceImpl$submitToken$1.label = 1;
                    obj = notificationsApi.register(notificationNewDeviceModel, notificationServiceImpl$submitToken$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    this.logger.log(this.tag, "Token synced successfully");
                    return z.f31622a;
                }
                if (!(apiResult instanceof ApiResult.Error)) {
                    c6.p();
                    return null;
                }
                Logger.logWarning$default(this.logger, this.tag, "Failed to sync notification token: " + apiResult, null, 4, null);
                throw new NotificationTokenSyncException();
            }
        }
        notificationServiceImpl$submitToken$1 = new NotificationServiceImpl$submitToken$1(this, cVar);
        Object obj2 = notificationServiceImpl$submitToken$1.result;
        i10 = notificationServiceImpl$submitToken$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // io.elevenlabs.domain.services.NotificationService
    public Object sync(wn.c<? super z> cVar) {
        final w wVar = new w(this.authService.isSignedIn(), new NotificationServiceImpl$sync$2(this, null), 5);
        Object collect = r.G(new ir.i() { // from class: io.elevenlabs.data.services.NotificationServiceImpl$sync$$inlined$filter$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.NotificationServiceImpl$sync$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.NotificationServiceImpl$sync$$inlined$filter$1$2", f = "NotificationServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.NotificationServiceImpl$sync$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(obj, anonymousClass1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect2 = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect2 == xn.a.f37986a) {
                    return collect2;
                }
                return z.f31622a;
            }
        }, new NotificationServiceImpl$sync$$inlined$flatMapLatest$1(null, this)).collect(new t(new m0(s.f19851a, new NotificationServiceImpl$sync$5(this, null)), 1), cVar);
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (collect != aVar) {
            collect = zVar;
        }
        if (collect != aVar) {
            collect = zVar;
        }
        if (collect != aVar) {
            collect = zVar;
        }
        if (collect == aVar) {
            return collect;
        }
        return zVar;
    }
}
