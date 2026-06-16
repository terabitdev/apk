package io.elevenlabs.readerapp;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.os.Build;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.services.AppConfigService;
import ir.r;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/InstallIntegrityCheck;", "", "Landroid/content/Context;", "context", "Lio/elevenlabs/domain/services/AppConfigService;", "appConfigService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lfr/d0;", "scope", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Landroid/content/Context;Lio/elevenlabs/domain/services/AppConfigService;Lio/elevenlabs/domain/Analytics;Lfr/d0;Lio/elevenlabs/domain/DispatcherFactory;)V", "", "getInstallerPackage", "()Ljava/lang/String;", "Landroid/content/Context;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class InstallIntegrityCheck {
    private final Context context;
    public static final int $stable = 8;
    private static final Set<String> ALLOWED_INSTALLERS = n.f1(new String[]{"com.android.vending", "com.google.android.feedback"});

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.InstallIntegrityCheck$1", f = "InstallIntegrityCheck.kt", l = {35}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.InstallIntegrityCheck$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        final /* synthetic */ AppConfigService $appConfigService;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.InstallIntegrityCheck$1$1", f = "InstallIntegrityCheck.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/AppConfig;", "config", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/AppConfig;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.InstallIntegrityCheck$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00201 extends yn.i implements p {
            /* synthetic */ Object L$0;
            int label;

            public C00201(wn.c<? super C00201> cVar) {
                super(2, cVar);
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00201 c00201 = new C00201(cVar);
                c00201.L$0 = obj;
                return c00201;
            }

            @Override // ho.p
            public final Object invoke(AppConfig appConfig, wn.c<? super z> cVar) {
                return ((C00201) create(appConfig, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                AppConfig appConfig = (AppConfig) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    if (!appConfig.getAndroidRtlCanvasValidation()) {
                        return z.f31622a;
                    }
                    throw new CanvasHardwareBufferException();
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppConfigService appConfigService, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$appConfigService = appConfigService;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$appConfigService, cVar);
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
                ir.i config = this.$appConfigService.getConfig();
                C00201 c00201 = new C00201(null);
                this.label = 1;
                Object l4 = r.l(config, c00201, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    public InstallIntegrityCheck(Context context, AppConfigService appConfigService, Analytics analytics, @ApplicationCoroutineScope d0 d0Var, DispatcherFactory dispatcherFactory) {
        context.getClass();
        appConfigService.getClass();
        analytics.getClass();
        d0Var.getClass();
        dispatcherFactory.getClass();
        this.context = context;
        String installerPackage = getInstallerPackage();
        if (installerPackage != null && ALLOWED_INSTALLERS.contains(installerPackage)) {
            return;
        }
        analytics.log(new Analytics.Event.SideloadDetected(installerPackage));
        g0.D(d0Var, dispatcherFactory.getDefault(), null, new AnonymousClass1(appConfigService, null), 2);
    }

    private final String getInstallerPackage() {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i10 >= 30) {
            try {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(this.context.getPackageName());
                installingPackageName = installSourceInfo.getInstallingPackageName();
                return installingPackageName;
            } catch (Exception unused) {
                return null;
            }
        }
        return context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
    }
}
