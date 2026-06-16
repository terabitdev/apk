package io.elevenlabs.readerapp.core;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import androidx.lifecycle.c1;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.NotificationService;
import ir.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/core/NotificationViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/core/ConfigState;", "Landroid/content/Context;", "applicationContext", "Ljl/a;", "Lio/elevenlabs/domain/services/NotificationService;", "notificationService", "Lio/elevenlabs/domain/services/AppConfigService;", "appConfigService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Landroid/content/Context;Ljl/a;Lio/elevenlabs/domain/services/AppConfigService;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NotificationViewModel extends MviViewModel<ConfigState> {
    public static final int $stable = 8;
    private final Logger logger;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.NotificationViewModel$1", f = "NotificationViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.NotificationViewModel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        final /* synthetic */ jl.a $notificationService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jl.a aVar, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$notificationService = aVar;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$notificationService, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                NotificationService notificationService = (NotificationService) this.$notificationService.get();
                this.label = 1;
                Object sync = notificationService.sync(this);
                xn.a aVar = xn.a.f37986a;
                if (sync == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.NotificationViewModel$2", f = "NotificationViewModel.kt", l = {41}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.NotificationViewModel$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ jl.a $notificationService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(jl.a aVar, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$notificationService = aVar;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.$notificationService, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    Task<String> token = FirebaseMessaging.getInstance().getToken();
                    token.getClass();
                    this.label = 1;
                    obj = kj.c.j(token, this);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                String str = (String) obj;
                NotificationViewModel.this.logger.log(NotificationViewModel.this.tag, "Got notification token");
                NotificationService notificationService = (NotificationService) this.$notificationService.get();
                str.getClass();
                notificationService.saveToken(str);
            } catch (FirebaseException e10) {
                NotificationViewModel.this.logger.log(NotificationViewModel.this.tag, "Can't get notification token - " + e10.getMessage() + Separators.SP);
            } catch (IOException e11) {
                NotificationViewModel.this.logger.log(NotificationViewModel.this.tag, "Can't get notification token - " + e11.getMessage() + Separators.SP);
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.NotificationViewModel$3", f = "NotificationViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.NotificationViewModel$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        final /* synthetic */ AppConfigService $appConfigService;
        final /* synthetic */ Context $applicationContext;
        int label;
        final /* synthetic */ NotificationViewModel this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.NotificationViewModel$3$1", f = "NotificationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/AppConfig;", "config", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/AppConfig;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.NotificationViewModel$3$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends yn.i implements ho.p {
            final /* synthetic */ Context $applicationContext;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NotificationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NotificationViewModel notificationViewModel, Context context, wn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = notificationViewModel;
                this.$applicationContext = context;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$applicationContext, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // ho.p
            public final Object invoke(AppConfig appConfig, wn.c<? super z> cVar) {
                return ((AnonymousClass1) create(appConfig, cVar)).invokeSuspend(z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
            
                r2 = r11.getNotificationChannels();
             */
            @Override // yn.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                List notificationChannels;
                int importance;
                String id2;
                String id3;
                String id4;
                AppConfig appConfig = (AppConfig) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.this$0.logger.log(this.this$0.tag, "Syncing notification channels");
                        NotificationManager notificationManager = (NotificationManager) this.$applicationContext.getSystemService(NotificationManager.class);
                        List<AppConfig.NotificationChannelConfig> notificationChannels2 = appConfig.getNotificationChannels();
                        ArrayList arrayList = new ArrayList(tn.p.a0(notificationChannels2, 10));
                        Iterator<T> it = notificationChannels2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AppConfig.NotificationChannelConfig) it.next()).getId());
                        }
                        Set l12 = tn.o.l1(arrayList);
                        if (notificationManager != null && notificationChannels != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : notificationChannels) {
                                id4 = f2.p.d(obj2).getId();
                                if (!l12.contains(id4)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            NotificationViewModel notificationViewModel = this.this$0;
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                NotificationChannel d10 = f2.p.d(it2.next());
                                importance = d10.getImportance();
                                if (importance != 0) {
                                    try {
                                        id3 = d10.getId();
                                        notificationManager.deleteNotificationChannel(id3);
                                    } catch (SecurityException e10) {
                                        Logger logger = notificationViewModel.logger;
                                        String str = notificationViewModel.tag;
                                        id2 = d10.getId();
                                        logger.log(str, defpackage.f.k("Can't delete notification channel ", id2, " - ", e10.getMessage()));
                                        d10.setImportance(0);
                                        vf.d.w(notificationManager, d10);
                                    }
                                }
                            }
                        }
                        for (AppConfig.NotificationChannelConfig notificationChannelConfig : appConfig.getNotificationChannels()) {
                            f2.p.s();
                            NotificationChannel e11 = f2.p.e(notificationChannelConfig.getId(), notificationChannelConfig.getName());
                            if (notificationManager != null) {
                                vf.d.w(notificationManager, e11);
                            }
                        }
                        this.this$0.logger.log(this.this$0.tag, "Notification channels synced");
                    }
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AppConfigService appConfigService, NotificationViewModel notificationViewModel, Context context, wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$appConfigService = appConfigService;
            this.this$0 = notificationViewModel;
            this.$applicationContext = context;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(this.$appConfigService, this.this$0, this.$applicationContext, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                ir.i config = this.$appConfigService.getConfig();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$applicationContext, null);
                this.label = 1;
                Object l4 = r.l(config, anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationViewModel(Context context, jl.a aVar, AppConfigService appConfigService, DispatcherFactory dispatcherFactory, Logger logger) {
        super(new ConfigState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), dispatcherFactory, r3, 4, null);
        context.getClass();
        aVar.getClass();
        appConfigService.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        Logger logger2 = null;
        this.logger = logger;
        this.tag = "NotificationViewModel";
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(aVar, null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass2(aVar, null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass3(appConfigService, this, context, null), 2);
    }
}
