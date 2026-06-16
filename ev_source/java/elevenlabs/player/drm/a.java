package io.elevenlabs.player.drm;

import a2.b;
import java.util.function.Function;
import org.jsoup.nodes.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14333b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f14332a = i10;
        this.f14333b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f14332a) {
            case 0:
                return AxinomMediaDrmCallback.a((b) this.f14333b, obj);
            default:
                return ((Class) this.f14333b).cast((r) obj);
        }
    }
}
