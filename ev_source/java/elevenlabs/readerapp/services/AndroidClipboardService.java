package io.elevenlabs.readerapp.services;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ClipboardService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/readerapp/services/AndroidClipboardService;", "Lio/elevenlabs/domain/services/ClipboardService;", "Landroid/content/Context;", "context", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Landroid/content/Context;Lio/elevenlabs/domain/DispatcherFactory;)V", "", FirebaseAnalytics.Param.CONTENT, "Lsn/z;", "copyToClipboard", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/domain/DispatcherFactory;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AndroidClipboardService implements ClipboardService {
    public static final int $stable = 8;
    private final Context context;
    private final DispatcherFactory dispatcherFactory;

    public AndroidClipboardService(Context context, DispatcherFactory dispatcherFactory) {
        context.getClass();
        dispatcherFactory.getClass();
        this.context = context;
        this.dispatcherFactory = dispatcherFactory;
    }

    @Override // io.elevenlabs.domain.services.ClipboardService
    public Object copyToClipboard(String str, c<? super z> cVar) {
        Object Q = g0.Q(this.dispatcherFactory.getMain(), new AndroidClipboardService$copyToClipboard$2(this, str, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return z.f31622a;
    }
}
