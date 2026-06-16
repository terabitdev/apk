package io.elevenlabs.ui;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.n;
import vq.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/ui/BooleanPreviewParameterProvider;", "Lg5/a;", "", "<init>", "()V", "Lvq/h;", "values", "Lvq/h;", "getValues", "()Lvq/h;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BooleanPreviewParameterProvider implements g5.a {
    public static final int $stable = 8;
    private final h values = n.n0(new Boolean[]{Boolean.TRUE, Boolean.FALSE});

    @Override // g5.a
    public /* bridge */ int getCount() {
        return super.getCount();
    }

    public /* bridge */ String getDisplayName(int i10) {
        return null;
    }

    @Override // g5.a
    public h getValues() {
        return this.values;
    }
}
