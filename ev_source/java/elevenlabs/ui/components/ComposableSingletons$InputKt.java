package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$InputKt {
    public static final ComposableSingletons$InputKt INSTANCE = new ComposableSingletons$InputKt();
    private static ho.p lambda$2072510817 = new c3.j(new n0(0), false, 2072510817);

    /* renamed from: lambda$-1858989981 */
    private static ho.p f659lambda$1858989981 = new c3.j(new n0(1), false, -1858989981);

    /* renamed from: lambda$-1495523483 */
    private static ho.p f658lambda$1495523483 = new c3.j(new n0(2), false, -1495523483);

    public static final sn.z lambda_2072510817$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.clear;
            ButtonIconSize buttonIconSize = ButtonIconSize.Small;
            ButtonIconVariant buttonIconVariant = ButtonIconVariant.Tertiary;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(13);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, "Clear", (ho.a) L, null, buttonIconVariant, buttonIconSize, false, false, false, qVar, 221616, 456);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1495523483$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.clear;
            ButtonIconSize buttonIconSize = ButtonIconSize.Small;
            ButtonIconVariant buttonIconVariant = ButtonIconVariant.Tertiary;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(11);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, "Clear", (ho.a) L, null, buttonIconVariant, buttonIconSize, false, false, false, qVar, 221616, 456);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1858989981$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.clear;
            ButtonIconSize buttonIconSize = ButtonIconSize.Small;
            ButtonIconVariant buttonIconVariant = ButtonIconVariant.Tertiary;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(12);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, "Clear", (ho.a) L, null, buttonIconVariant, buttonIconSize, false, false, false, qVar, 221616, 456);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1495523483$ui_release */
    public final ho.p m1814getLambda$1495523483$ui_release() {
        return f658lambda$1495523483;
    }

    /* renamed from: getLambda$-1858989981$ui_release */
    public final ho.p m1815getLambda$1858989981$ui_release() {
        return f659lambda$1858989981;
    }

    public final ho.p getLambda$2072510817$ui_release() {
        return lambda$2072510817;
    }
}
