package io.elevenlabs.analytics;

import android.content.Context;
import ck.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/analytics/PostHogInitializer;", "Lrb/b;", "Ldk/b;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Ldk/b;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PostHogInitializer implements rb.b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dk.b, ck.g] */
    @Override // rb.b
    public dk.b create(Context context) {
        context.getClass();
        ManifestUtils manifestUtils = ManifestUtils.INSTANCE;
        String metaData = manifestUtils.getMetaData(context, "com.posthog.api-key");
        if (metaData == null) {
            metaData = "";
        }
        String metaData2 = manifestUtils.getMetaData(context, "com.posthog.host");
        if (metaData2 == null) {
            metaData2 = "";
        }
        hj.b bVar = new hj.b(16);
        ?? gVar = new g(metaData, metaData2);
        gVar.G = true;
        gVar.H = true;
        gVar.I = true;
        gVar.J = bVar;
        synchronized (dk.a.f8015a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            dk.a.a(context, gVar);
            ck.b.P0.n(gVar);
        }
        return gVar;
    }

    @Override // rb.b
    public List<Class<? extends rb.b>> dependencies() {
        return new ArrayList();
    }
}
