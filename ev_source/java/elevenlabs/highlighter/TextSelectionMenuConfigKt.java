package io.elevenlabs.highlighter;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.c0;
import u2.q1;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/highlighter/TextSelectionMenuConfig;", "config", "Lkotlin/Function0;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "ProvideTextSelectionMenuConfig", "(Lio/elevenlabs/highlighter/TextSelectionMenuConfig;Lho/p;Lu2/m;I)V", "Lu2/q1;", "LocalTextSelectionMenuConfig", "Lu2/q1;", "getLocalTextSelectionMenuConfig", "()Lu2/q1;", "highlighter_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TextSelectionMenuConfigKt {
    private static final q1 LocalTextSelectionMenuConfig = new c0(new d(25));

    public static final TextSelectionMenuConfig LocalTextSelectionMenuConfig$lambda$0() {
        return new TextSelectionMenuConfig(tn.t.f33547a);
    }

    public static final void ProvideTextSelectionMenuConfig(TextSelectionMenuConfig textSelectionMenuConfig, ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        textSelectionMenuConfig.getClass();
        pVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1091868716);
        if ((i10 & 6) == 0) {
            if (qVar.h(textSelectionMenuConfig)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            r.a(LocalTextSelectionMenuConfig.a(textSelectionMenuConfig), pVar, qVar, (i11 & 112) | 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(textSelectionMenuConfig, pVar, i10, 6);
        }
    }

    public static final sn.z ProvideTextSelectionMenuConfig$lambda$0(TextSelectionMenuConfig textSelectionMenuConfig, ho.p pVar, int i10, u2.m mVar, int i11) {
        ProvideTextSelectionMenuConfig(textSelectionMenuConfig, pVar, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final q1 getLocalTextSelectionMenuConfig() {
        return LocalTextSelectionMenuConfig;
    }
}
