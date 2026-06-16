package io.elevenlabs.readerapp;

import a2.w0;
import android.app.ActionBar;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.m1;
import androidx.lifecycle.q1;
import androidx.lifecycle.r1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import fr.g0;
import i.m;
import i3.t;
import i4.j1;
import i4.q2;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.ConfigurationKt;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.SingularService;
import io.elevenlabs.domain.services.StoreCountryCodeRecordingService;
import io.elevenlabs.readerapp.core.ConfigState;
import io.elevenlabs.readerapp.core.ConfigViewModel;
import io.elevenlabs.readerapp.core.ToastViewModelKt;
import io.elevenlabs.readerapp.core.extensions.BundleExtensionsKt;
import io.elevenlabs.readerapp.core.router.RouterKt;
import io.elevenlabs.readerapp.core.router.RouterViewModel;
import io.elevenlabs.readerapp.services.NavigationDispatcherProvider;
import io.elevenlabs.readerapp.services.NotificationRetrievalServiceKt;
import io.elevenlabs.readerapp.ui.components.OfflineBannerDisplayingSurfaceKt;
import io.elevenlabs.readerapp.usecase.RateAppUseCase;
import io.elevenlabs.ui.components.CoilKt;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.VideoPlayerKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.elevenlabs.ui.theme.ReaderColors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.h2;
import k6.k2;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import livekit.LivekitInternal$NodeStats;
import na.c0;
import na.j0;
import p3.h0;
import p4.a0;
import p4.b0;
import p4.x;
import r1.p2;
import r1.s;
import rd.c1;
import sn.z;
import tn.o;
import tn.p;
import u2.q;
import u2.r;
import wq.n;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003R\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lio/elevenlabs/readerapp/MainActivity;", "Landroidx/fragment/app/c0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lsn/z;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "openGooglePlay", "(Ljava/lang/String;)V", "", "handleIntent", "(Landroid/content/Intent;)Z", "handleSendIntent", "handleProcessTextIntent", "assertGooglePlayServices", ParameterNames.TAG, "Ljava/lang/String;", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lio/elevenlabs/domain/Configuration;", "getConfiguration", "()Lio/elevenlabs/domain/Configuration;", "setConfiguration", "(Lio/elevenlabs/domain/Configuration;)V", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "setAnalytics", "(Lio/elevenlabs/domain/Analytics;)V", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Logger;", "getLogger", "()Lio/elevenlabs/domain/Logger;", "setLogger", "(Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/readerapp/usecase/RateAppUseCase;", "rateAppUseCase", "Lio/elevenlabs/readerapp/usecase/RateAppUseCase;", "getRateAppUseCase", "()Lio/elevenlabs/readerapp/usecase/RateAppUseCase;", "setRateAppUseCase", "(Lio/elevenlabs/readerapp/usecase/RateAppUseCase;)V", "Lio/elevenlabs/domain/services/SingularService;", "singularService", "Lio/elevenlabs/domain/services/SingularService;", "getSingularService", "()Lio/elevenlabs/domain/services/SingularService;", "setSingularService", "(Lio/elevenlabs/domain/services/SingularService;)V", "Lio/elevenlabs/domain/services/StoreCountryCodeRecordingService;", "storeCountryCodeRecordingService", "Lio/elevenlabs/domain/services/StoreCountryCodeRecordingService;", "getStoreCountryCodeRecordingService", "()Lio/elevenlabs/domain/services/StoreCountryCodeRecordingService;", "setStoreCountryCodeRecordingService", "(Lio/elevenlabs/domain/services/StoreCountryCodeRecordingService;)V", "Lio/elevenlabs/readerapp/services/NavigationDispatcherProvider;", "navigationDispatcherProvider", "Lio/elevenlabs/readerapp/services/NavigationDispatcherProvider;", "getNavigationDispatcherProvider", "()Lio/elevenlabs/readerapp/services/NavigationDispatcherProvider;", "setNavigationDispatcherProvider", "(Lio/elevenlabs/readerapp/services/NavigationDispatcherProvider;)V", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/domain/services/ConnectivityService;", "getConnectivityService", "()Lio/elevenlabs/domain/services/ConnectivityService;", "setConnectivityService", "(Lio/elevenlabs/domain/services/ConnectivityService;)V", "Lio/elevenlabs/readerapp/core/router/RouterViewModel;", "routerViewModel$delegate", "Lsn/h;", "getRouterViewModel", "()Lio/elevenlabs/readerapp/core/router/RouterViewModel;", "routerViewModel", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MainActivity extends Hilt_MainActivity {
    public static final int $stable = 8;
    public Analytics analytics;
    public Configuration configuration;
    public ConnectivityService connectivityService;
    public Logger logger;
    public NavigationDispatcherProvider navigationDispatcherProvider;
    public RateAppUseCase rateAppUseCase;

    /* renamed from: routerViewModel$delegate, reason: from kotlin metadata */
    private final sn.h routerViewModel;
    public SingularService singularService;
    public StoreCountryCodeRecordingService storeCountryCodeRecordingService;
    private final String tag = "MainActivity";

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.k1, sn.h, java.lang.Object] */
    public MainActivity() {
        ho.a aVar = new ho.a() { // from class: io.elevenlabs.readerapp.MainActivity$special$$inlined$viewModels$default$1
            @Override // ho.a
            public final m1 invoke() {
                return m.this.getDefaultViewModelProviderFactory();
            }
        };
        oo.d b10 = e0.f20562a.b(RouterViewModel.class);
        ho.a aVar2 = new ho.a() { // from class: io.elevenlabs.readerapp.MainActivity$special$$inlined$viewModels$default$2
            @Override // ho.a
            public final q1 invoke() {
                return m.this.getViewModelStore();
            }
        };
        final ho.a aVar3 = null;
        ho.a aVar4 = new ho.a() { // from class: io.elevenlabs.readerapp.MainActivity$special$$inlined$viewModels$default$3
            @Override // ho.a
            public final q7.c invoke() {
                q7.c cVar;
                ho.a aVar5 = ho.a.this;
                if (aVar5 != null && (cVar = (q7.c) aVar5.invoke()) != null) {
                    return cVar;
                }
                return this.getDefaultViewModelCreationExtras();
            }
        };
        b10.getClass();
        ?? obj = new Object();
        obj.f2859a = b10;
        obj.f2860b = aVar2;
        obj.f2861c = aVar;
        obj.f2862d = aVar4;
        this.routerViewModel = obj;
    }

    private final void assertGooglePlayServices() {
        vf.e eVar = vf.e.f35545f;
        int d10 = eVar.d(this, vf.f.f35547a);
        if (d10 != 0) {
            AtomicBoolean atomicBoolean = vf.i.f35549a;
            if (d10 != 1 && d10 != 2 && d10 != 3 && d10 != 9) {
                eVar.e(this).getClass();
            } else {
                eVar.f(this, d10, 1234, null);
            }
        }
    }

    public final RouterViewModel getRouterViewModel() {
        return (RouterViewModel) this.routerViewModel.getValue();
    }

    private final boolean handleIntent(Intent intent) {
        ArrayList parcelableArrayList;
        String str;
        String string;
        getLogger().log(this.tag, "handleIntent");
        if (intent == null) {
            Logger.logWarning$default(getLogger(), this.tag, "Null intent received", null, 4, null);
            return false;
        }
        String str2 = null;
        if (kotlin.jvm.internal.m.c(intent.getAction(), "android.intent.action.MAIN")) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                str = extras.getString("link");
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            if (u.W(str, "elevenlabs://", false)) {
                Analytics analytics = getAnalytics();
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString(NotificationRetrievalServiceKt.ANALYTICS_LABEL)) != null) {
                    str3 = string;
                }
                analytics.log(new Analytics.Event.NotificationClicked(str3));
                RouterViewModel routerViewModel = getRouterViewModel();
                Bundle extras3 = intent.getExtras();
                if (extras3 != null) {
                    str2 = extras3.getString("link");
                }
                str2.getClass();
                routerViewModel.onDeepLink(str2);
                return true;
            }
        }
        if (kotlin.jvm.internal.m.c(intent.getAction(), "android.intent.action.VIEW")) {
            Uri data = intent.getData();
            if (data != null) {
                str2 = data.getScheme();
            }
            if (kotlin.jvm.internal.m.c(str2, "elevenlabs")) {
                getRouterViewModel().onDeepLink(String.valueOf(intent.getData()));
                return true;
            }
        }
        if (kotlin.jvm.internal.m.c(intent.getAction(), "android.intent.action.SEND")) {
            handleSendIntent(intent);
            return true;
        }
        if (kotlin.jvm.internal.m.c(intent.getAction(), "android.intent.action.SEND_MULTIPLE")) {
            if (o.m0(ConfigurationKt.getSupportedImageMimeTypes(), intent.getType())) {
                getLogger().log(this.tag, "Share multiple files intent received");
                ClipData clipData = intent.getClipData();
                ArrayList arrayList = new ArrayList();
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i10 = 0; i10 < itemCount; i10++) {
                        Uri uri = clipData.getItemAt(i10).getUri();
                        if (uri != null) {
                            String uri2 = uri.toString();
                            uri2.getClass();
                            arrayList.add(uri2);
                        }
                    }
                } else {
                    Bundle extras4 = intent.getExtras();
                    if (extras4 != null && (parcelableArrayList = extras4.getParcelableArrayList("android.intent.extra.STREAM")) != null) {
                        ArrayList arrayList2 = new ArrayList(p.a0(parcelableArrayList, 10));
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Uri) it.next()).toString());
                        }
                        arrayList.addAll(arrayList2);
                    }
                }
                intent.removeExtra("android.intent.extra.STREAM");
                if (!arrayList.isEmpty()) {
                    getRouterViewModel().onImageShare(arrayList);
                }
                return true;
            }
            Logger.logWarning$default(getLogger(), this.tag, defpackage.f.i("Unknown multiple intent received / ", intent.getType()), null, 4, null);
            return false;
        }
        if (!kotlin.jvm.internal.m.c(intent.getAction(), "android.intent.action.PROCESS_TEXT")) {
            return false;
        }
        handleProcessTextIntent(intent);
        return true;
    }

    private final void handleProcessTextIntent(Intent intent) {
        String str;
        getLogger().log(this.tag, "Process text intent received");
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.PROCESS_TEXT");
        if (charSequenceExtra != null) {
            str = charSequenceExtra.toString();
        } else {
            str = null;
        }
        intent.removeExtra("android.intent.extra.PROCESS_TEXT");
        if (str != null && !n.m0(str)) {
            getAnalytics().log(new Analytics.Event.ShareImportText(str.length()));
            getRouterViewModel().onTextShare(null, str);
        } else {
            Logger.logWarning$default(getLogger(), this.tag, "Process text intent received but no text found", null, 4, null);
        }
    }

    private final void handleSendIntent(Intent intent) {
        Uri uri;
        String str;
        String str2;
        Set<String> keySet;
        Bundle extras = intent.getExtras();
        String str3 = null;
        if (extras != null) {
            uri = BundleExtensionsKt.getParcelableUri(extras, "android.intent.extra.STREAM");
        } else {
            uri = null;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            str = extras2.getString("android.intent.extra.TEXT");
        } else {
            str = null;
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 != null) {
            str2 = extras3.getString("android.intent.extra.SUBJECT");
        } else {
            str2 = null;
        }
        intent.removeExtra("android.intent.extra.STREAM");
        intent.removeExtra("android.intent.extra.TEXT");
        intent.removeExtra("android.intent.extra.SUBJECT");
        if (uri != null && o.m0(ConfigurationKt.getSupportedImageMimeTypes(), intent.getType())) {
            getLogger().log(this.tag, "Share image intent received");
            getRouterViewModel().onImageShare(ig.f.H(uri.toString()));
            return;
        }
        if (uri != null && o.m0(ConfigurationKt.getSupportedMimeTypes(), intent.getType())) {
            getLogger().log(this.tag, "Share file intent received");
            RouterViewModel routerViewModel = getRouterViewModel();
            String uri2 = uri.toString();
            uri2.getClass();
            routerViewModel.onFileShare(uri2);
            return;
        }
        if (str != null && !n.m0(str)) {
            String type = intent.getType();
            if (type != null && u.W(type, "text/", false)) {
                getLogger().log(this.tag, "Share text intent received");
            } else {
                Logger.logWarning$default(getLogger(), this.tag, defpackage.f.i("Unknown mimetype with text: ", intent.getType()), null, 4, null);
            }
            getRouterViewModel().onTextShare(str2, str);
            return;
        }
        Logger logger = getLogger();
        String str4 = this.tag;
        String type2 = intent.getType();
        Bundle extras4 = intent.getExtras();
        if (extras4 != null && (keySet = extras4.keySet()) != null) {
            str3 = o.E0(keySet, Separators.COMMA, null, null, null, 62);
        }
        Logger.logWarning$default(logger, str4, defpackage.f.k("Unknown intent received / ", type2, " / extras: ", str3), null, 4, null);
    }

    public static final z onCreate$lambda$1(MainActivity mainActivity, u2.m mVar, int i10) {
        boolean z6;
        q7.c cVar;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, c3.k.d(1777071539, true, new f(l1.n.w(qVar), mainActivity, android.support.v4.media.session.b.D(new j0[0], qVar), 0), qVar), qVar, (EchoTheme.$stable << 6) | 48, 1);
            r1 a10 = r7.a.a(qVar);
            if (a10 != null) {
                pl.f o6 = tb.a.o(a10, qVar);
                if (a10 instanceof androidx.lifecycle.o) {
                    cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                } else {
                    cVar = q7.a.f28123b;
                }
            } else {
                c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0(boolean z6, MainActivity mainActivity, c0 c0Var, u2.m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            ElevenLabsThemeKt.ElevenLabsTheme(z6, c3.k.d(-678844067, true, new f(z6, mainActivity, c0Var, 1), qVar), qVar, 48, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0(boolean z6, MainActivity mainActivity, c0 c0Var, u2.m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            View view = (View) qVar.j(AndroidCompositionLocals_androidKt.f2295f);
            boolean isInEditMode = view.isInEditMode();
            u2.e eVar = u2.l.f33918a;
            if (!isInEditMode) {
                qVar.X(1557513925);
                boolean h10 = qVar.h(view) | qVar.g(z6);
                Object L = qVar.L();
                if (h10 || L == eVar) {
                    L = new w0(view, z6, 2);
                    qVar.h0(L);
                }
                r.j((ho.a) L, qVar);
                qVar.p(false);
            } else {
                qVar.X(1558221221);
                qVar.p(false);
            }
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(3);
                qVar.h0(L2);
            }
            OfflineBannerDisplayingSurfaceKt.OfflineBannerDisplayingSurface(p4.q.c(i3.q.f13017a, false, (ho.l) L2), false, mainActivity.getConnectivityService(), c3.k.d(1795746390, true, new e(mainActivity, c0Var, 0), qVar), qVar, 3072, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$0$0(View view, boolean z6) {
        kj.c h2Var;
        Context context = view.getContext();
        context.getClass();
        Window window = ((Activity) context).getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            h2Var = new k2(window);
        } else if (i10 >= 30) {
            h2Var = new k2(window);
        } else if (i10 >= 26) {
            h2Var = new h2(window);
        } else {
            h2Var = new h2(window);
        }
        ReaderColors.Transparent transparent = ReaderColors.Transparent.INSTANCE;
        window.setStatusBarColor(h0.G(transparent.m2490getClear0d7_KjU()));
        window.setNavigationBarColor(h0.G(transparent.m2490getClear0d7_KjU()));
        boolean z10 = !z6;
        h2Var.M(z10);
        h2Var.L(z10);
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$1$0(b0 b0Var) {
        b0Var.getClass();
        oo.u[] uVarArr = p4.z.f26564a;
        a0 a0Var = x.f26561a;
        oo.u uVar = p4.z.f26564a[0];
        b0Var.b(a0Var, Boolean.TRUE);
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$2(MainActivity mainActivity, c0 c0Var, s sVar, h5.f fVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        q7.c cVar;
        q7.c cVar2;
        q7.c cVar3;
        int i12;
        sVar.getClass();
        if ((i10 & 48) == 0) {
            if (((q) mVar).c(fVar.f12083a)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            t I = r1.d.I(p2.d(i3.q.f13017a, 1.0f), t2.u.P, fVar.f12083a, t2.u.P, t2.u.P, 13);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            VideoPlayerKt.VideoPlayerCacheProvider(c3.k.d(922148812, true, new f2.i(mainActivity, c0Var, 5), qVar), qVar, 6);
            boolean h10 = qVar.h(mainActivity);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (h10 || L == eVar) {
                L = new a(mainActivity, 1);
                qVar.h0(L);
            }
            ToastViewModelKt.ToastOverlay((ho.l) L, null, qVar, 0, 2);
            r1 a10 = r7.a.a(qVar);
            if (a10 != null) {
                pl.f o6 = tb.a.o(a10, qVar);
                if (a10 instanceof androidx.lifecycle.o) {
                    cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                } else {
                    cVar = q7.a.f28123b;
                }
                q7.c cVar4 = cVar;
                f0 f0Var = e0.f20562a;
                if (((ConfigState) c1.m(((ConfigViewModel) gg.b.j0(f0Var.b(ConfigViewModel.class), a10, null, o6, cVar4, qVar)).getStateFlow(), qVar, 0).getValue()).getShowForceUpgradeDialog()) {
                    qVar.X(-1263480052);
                    Object L2 = qVar.L();
                    if (L2 == eVar) {
                        L2 = new Object();
                        qVar.h0(L2);
                    }
                    ho.a aVar = (ho.a) L2;
                    boolean h11 = qVar.h(mainActivity);
                    Object L3 = qVar.L();
                    if (h11 || L3 == eVar) {
                        L3 = new ho.a() { // from class: io.elevenlabs.readerapp.h
                            @Override // ho.a
                            public final Object invoke() {
                                z onCreate$lambda$1$0$0$2$0$3$0;
                                onCreate$lambda$1$0$0$2$0$3$0 = MainActivity.onCreate$lambda$1$0$0$2$0$3$0(MainActivity.this);
                                return onCreate$lambda$1$0$0$2$0$3$0;
                            }
                        };
                        qVar.h0(L3);
                    }
                    ConfirmationDialogKt.ConfirmationDialog(aVar, (ho.a) L3, kj.c.R(qVar, R.string.force_upgrade_title), kj.c.R(qVar, R.string.force_upgrade_text), null, kj.c.R(qVar, R.string.force_upgrade_update), false, qVar, 24582, 64);
                    qVar.p(false);
                } else {
                    qVar.X(-1262859246);
                    qVar.p(false);
                }
                r1 a11 = r7.a.a(qVar);
                if (a11 != null) {
                    pl.f o10 = tb.a.o(a11, qVar);
                    if (a11 instanceof androidx.lifecycle.o) {
                        cVar2 = ((androidx.lifecycle.o) a11).getDefaultViewModelCreationExtras();
                    } else {
                        cVar2 = q7.a.f28123b;
                    }
                    AppCompatibilityViewModel appCompatibilityViewModel = (AppCompatibilityViewModel) gg.b.j0(f0Var.b(AppCompatibilityViewModel.class), a11, null, o10, cVar2, qVar);
                    AppCompatibilityState appCompatibilityState = (AppCompatibilityState) c1.m(appCompatibilityViewModel.getStateFlow(), qVar, 0).getValue();
                    boolean h12 = qVar.h(appCompatibilityViewModel);
                    Object L4 = qVar.L();
                    if (h12 || L4 == eVar) {
                        L4 = new MainActivity$onCreate$3$1$1$3$1$dismissAppCompatibilityDialog$1$1(appCompatibilityViewModel);
                        qVar.h0(L4);
                    }
                    final oo.g gVar = (oo.g) L4;
                    String R = kj.c.R(qVar, R.string.common_dismiss);
                    if (appCompatibilityState.getShowInstallPlayServicesDialog()) {
                        qVar.X(-1262231899);
                        ho.a aVar2 = (ho.a) gVar;
                        boolean h13 = qVar.h(mainActivity) | qVar.f(gVar);
                        Object L5 = qVar.L();
                        if (h13 || L5 == eVar) {
                            final int i13 = 0;
                            L5 = new ho.a(mainActivity) { // from class: io.elevenlabs.readerapp.i

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ MainActivity f14502b;

                                {
                                    this.f14502b = mainActivity;
                                }

                                @Override // ho.a
                                public final Object invoke() {
                                    z onCreate$lambda$1$0$0$2$0$5$0;
                                    z onCreate$lambda$1$0$0$2$0$7$0;
                                    switch (i13) {
                                        case 0:
                                            onCreate$lambda$1$0$0$2$0$5$0 = MainActivity.onCreate$lambda$1$0$0$2$0$5$0(this.f14502b, gVar);
                                            return onCreate$lambda$1$0$0$2$0$5$0;
                                        default:
                                            onCreate$lambda$1$0$0$2$0$7$0 = MainActivity.onCreate$lambda$1$0$0$2$0$7$0(this.f14502b, gVar);
                                            return onCreate$lambda$1$0$0$2$0$7$0;
                                    }
                                }
                            };
                            qVar.h0(L5);
                        }
                        ConfirmationDialogKt.ConfirmationDialog(aVar2, (ho.a) L5, kj.c.R(qVar, R.string.app_compatibility_install_play_services_title), kj.c.R(qVar, R.string.app_compatibility_install_play_services_text), R, kj.c.R(qVar, R.string.app_compatibility_install_play_services_button), false, qVar, 0, 64);
                        qVar.p(false);
                    } else if (appCompatibilityState.getShowInstallGooglePlayDialog()) {
                        qVar.X(-1261238597);
                        q2 q2Var = (q2) qVar.j(j1.f13138r);
                        ho.a aVar3 = (ho.a) gVar;
                        boolean h14 = qVar.h(q2Var) | qVar.f(gVar);
                        Object L6 = qVar.L();
                        if (h14 || L6 == eVar) {
                            L6 = new a2.q(q2Var, gVar, 15);
                            qVar.h0(L6);
                        }
                        ConfirmationDialogKt.ConfirmationDialog(aVar3, (ho.a) L6, kj.c.R(qVar, R.string.app_compatibility_update_google_play_title), kj.c.R(qVar, R.string.app_compatibility_update_google_play_text), R, kj.c.R(qVar, R.string.app_compatibility_update_google_play_button), false, qVar, 0, 64);
                        qVar.p(false);
                    } else if (appCompatibilityState.getShowSignInToPlayStoreAccount()) {
                        qVar.X(-1260085831);
                        ho.a aVar4 = (ho.a) gVar;
                        boolean h15 = qVar.h(mainActivity) | qVar.f(gVar);
                        Object L7 = qVar.L();
                        if (h15 || L7 == eVar) {
                            final int i14 = 1;
                            L7 = new ho.a(mainActivity) { // from class: io.elevenlabs.readerapp.i

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ MainActivity f14502b;

                                {
                                    this.f14502b = mainActivity;
                                }

                                @Override // ho.a
                                public final Object invoke() {
                                    z onCreate$lambda$1$0$0$2$0$5$0;
                                    z onCreate$lambda$1$0$0$2$0$7$0;
                                    switch (i14) {
                                        case 0:
                                            onCreate$lambda$1$0$0$2$0$5$0 = MainActivity.onCreate$lambda$1$0$0$2$0$5$0(this.f14502b, gVar);
                                            return onCreate$lambda$1$0$0$2$0$5$0;
                                        default:
                                            onCreate$lambda$1$0$0$2$0$7$0 = MainActivity.onCreate$lambda$1$0$0$2$0$7$0(this.f14502b, gVar);
                                            return onCreate$lambda$1$0$0$2$0$7$0;
                                    }
                                }
                            };
                            qVar.h0(L7);
                        }
                        ConfirmationDialogKt.ConfirmationDialog(aVar4, (ho.a) L7, kj.c.R(qVar, R.string.app_compatibility_sign_in_to_google_play_title), kj.c.R(qVar, R.string.app_compatibility_sign_in_to_google_play_text), R, kj.c.R(qVar, R.string.app_compatibility_sign_in_to_google_play_button), false, qVar, 0, 64);
                        qVar.p(false);
                    } else {
                        qVar.X(-1259170990);
                        qVar.p(false);
                    }
                    r1 a12 = r7.a.a(qVar);
                    if (a12 != null) {
                        pl.f o11 = tb.a.o(a12, qVar);
                        if (a12 instanceof androidx.lifecycle.o) {
                            cVar3 = ((androidx.lifecycle.o) a12).getDefaultViewModelCreationExtras();
                        } else {
                            cVar3 = q7.a.f28123b;
                        }
                        LowDiskSpaceViewModel lowDiskSpaceViewModel = (LowDiskSpaceViewModel) gg.b.j0(f0Var.b(LowDiskSpaceViewModel.class), a12, null, o11, cVar3, qVar);
                        if (((LowDiskSpaceState) c1.m(lowDiskSpaceViewModel.getStateFlow(), qVar, 0).getValue()).getShowLowDiskSpaceDialog()) {
                            qVar.X(-1258829835);
                            boolean h16 = qVar.h(lowDiskSpaceViewModel);
                            Object L8 = qVar.L();
                            if (h16 || L8 == eVar) {
                                L8 = new MainActivity$onCreate$3$1$1$3$1$8$1(lowDiskSpaceViewModel);
                                qVar.h0(L8);
                            }
                            ho.a aVar5 = (ho.a) ((oo.g) L8);
                            boolean h17 = qVar.h(lowDiskSpaceViewModel);
                            Object L9 = qVar.L();
                            if (h17 || L9 == eVar) {
                                L9 = new MainActivity$onCreate$3$1$1$3$1$9$1(lowDiskSpaceViewModel);
                                qVar.h0(L9);
                            }
                            ConfirmationDialogKt.ConfirmationDialog(aVar5, (ho.a) ((oo.g) L9), kj.c.R(qVar, R.string.low_disk_space_title), kj.c.R(qVar, R.string.low_disk_space_message), null, kj.c.R(qVar, R.string.common_ok), false, qVar, 1597440, 0);
                            qVar.p(false);
                        } else {
                            qVar.X(-1258186926);
                            qVar.p(false);
                        }
                        qVar.p(true);
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
            } else {
                c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$2$0$0(MainActivity mainActivity, c0 c0Var, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            RouterViewModel routerViewModel = mainActivity.getRouterViewModel();
            boolean h10 = qVar.h(mainActivity);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new MainActivity$onCreate$3$1$1$3$1$1$1$1(mainActivity, null);
                qVar.h0(L);
            }
            r.f((ho.p) L, routerViewModel, qVar);
            RouterKt.Router(c0Var, mainActivity.getRouterViewModel(), qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$2$0$1$0(MainActivity mainActivity, String str) {
        str.getClass();
        mainActivity.getRouterViewModel().onDeepLink(str);
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$2$0$3$0(MainActivity mainActivity) {
        mainActivity.openGooglePlay(mainActivity.getPackageName());
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$2$0$5$0(MainActivity mainActivity, oo.g gVar) {
        mainActivity.openGooglePlay("com.google.android.gms");
        ((ho.a) gVar).invoke();
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$2$0$6$0(q2 q2Var, oo.g gVar) {
        q2Var.openUri("https://support.google.com/googleplay/community-guide/265192364/how-can-i-update-app-and-play-store?hl=en");
        ((ho.a) gVar).invoke();
        return z.f31622a;
    }

    public static final z onCreate$lambda$1$0$0$2$0$7$0(MainActivity mainActivity, oo.g gVar) {
        mainActivity.openGooglePlay(null);
        ((ho.a) gVar).invoke();
        return z.f31622a;
    }

    private final void openGooglePlay(String r72) {
        String str;
        if (r72 != null && !n.m0(r72)) {
            str = defpackage.f.i("details?id=", r72);
        } else {
            str = "";
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://".concat(str))));
        } catch (ActivityNotFoundException e10) {
            getLogger().log(this.tag, "Can't launch Google Play store - " + e10.getMessage());
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/".concat(str))));
        }
    }

    public final Analytics getAnalytics() {
        Analytics analytics = this.analytics;
        if (analytics != null) {
            return analytics;
        }
        kotlin.jvm.internal.m.i("analytics");
        throw null;
    }

    public final Configuration getConfiguration() {
        Configuration configuration = this.configuration;
        if (configuration != null) {
            return configuration;
        }
        kotlin.jvm.internal.m.i("configuration");
        throw null;
    }

    public final ConnectivityService getConnectivityService() {
        ConnectivityService connectivityService = this.connectivityService;
        if (connectivityService != null) {
            return connectivityService;
        }
        kotlin.jvm.internal.m.i("connectivityService");
        throw null;
    }

    public final Logger getLogger() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        kotlin.jvm.internal.m.i("logger");
        throw null;
    }

    public final NavigationDispatcherProvider getNavigationDispatcherProvider() {
        NavigationDispatcherProvider navigationDispatcherProvider = this.navigationDispatcherProvider;
        if (navigationDispatcherProvider != null) {
            return navigationDispatcherProvider;
        }
        kotlin.jvm.internal.m.i("navigationDispatcherProvider");
        throw null;
    }

    public final RateAppUseCase getRateAppUseCase() {
        RateAppUseCase rateAppUseCase = this.rateAppUseCase;
        if (rateAppUseCase != null) {
            return rateAppUseCase;
        }
        kotlin.jvm.internal.m.i("rateAppUseCase");
        throw null;
    }

    public final SingularService getSingularService() {
        SingularService singularService = this.singularService;
        if (singularService != null) {
            return singularService;
        }
        kotlin.jvm.internal.m.i("singularService");
        throw null;
    }

    public final StoreCountryCodeRecordingService getStoreCountryCodeRecordingService() {
        StoreCountryCodeRecordingService storeCountryCodeRecordingService = this.storeCountryCodeRecordingService;
        if (storeCountryCodeRecordingService != null) {
            return storeCountryCodeRecordingService;
        }
        kotlin.jvm.internal.m.i("storeCountryCodeRecordingService");
        throw null;
    }

    @Override // io.elevenlabs.readerapp.Hilt_MainActivity, androidx.fragment.app.c0, i.m, y5.f, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        a0.p pVar;
        i.p.a(this, new i.e0(0, 0, 0, new fm.d(8)), new i.e0(0, 0, 1, new fm.d(9)));
        super.onCreate(savedInstanceState);
        getLogger().log(this.tag, "onCreate: " + this);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            pVar = new h6.c(this);
        } else {
            pVar = new a0.p(this, 23);
        }
        pVar.f();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        CoilKt.installImageLoader(applicationContext, false);
        g0.D(androidx.lifecycle.c1.f(this), null, null, new MainActivity$onCreate$1(this, null), 3);
        getSingularService().initialize(this);
        if (handleIntent(getIntent())) {
            Intent intent = getIntent();
            intent.setData(null);
            setIntent(intent);
        }
        getStoreCountryCodeRecordingService().fetchAndRecordCountryCode();
        j.d.a(this, new c3.j(new ho.p() { // from class: io.elevenlabs.readerapp.j
            @Override // ho.p
            public final Object invoke(Object obj, Object obj2) {
                z onCreate$lambda$1;
                int intValue = ((Integer) obj2).intValue();
                onCreate$lambda$1 = MainActivity.onCreate$lambda$1(MainActivity.this, (u2.m) obj, intValue);
                return onCreate$lambda$1;
            }
        }, true, 2008183897));
        assertGooglePlayServices();
        getRouterViewModel().logDevicePerformanceAnalytics();
    }

    @Override // i.m, android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        getLogger().log(this.tag, "onNewIntent");
        super.onNewIntent(intent);
        handleIntent(intent);
        getSingularService().reInitializeWithNewIntent(this, intent);
    }

    public final void setAnalytics(Analytics analytics) {
        analytics.getClass();
        this.analytics = analytics;
    }

    public final void setConfiguration(Configuration configuration) {
        configuration.getClass();
        this.configuration = configuration;
    }

    public final void setConnectivityService(ConnectivityService connectivityService) {
        connectivityService.getClass();
        this.connectivityService = connectivityService;
    }

    public final void setLogger(Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    public final void setNavigationDispatcherProvider(NavigationDispatcherProvider navigationDispatcherProvider) {
        navigationDispatcherProvider.getClass();
        this.navigationDispatcherProvider = navigationDispatcherProvider;
    }

    public final void setRateAppUseCase(RateAppUseCase rateAppUseCase) {
        rateAppUseCase.getClass();
        this.rateAppUseCase = rateAppUseCase;
    }

    public final void setSingularService(SingularService singularService) {
        singularService.getClass();
        this.singularService = singularService;
    }

    public final void setStoreCountryCodeRecordingService(StoreCountryCodeRecordingService storeCountryCodeRecordingService) {
        storeCountryCodeRecordingService.getClass();
        this.storeCountryCodeRecordingService = storeCountryCodeRecordingService;
    }
}
