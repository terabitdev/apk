package io.elevenlabs.ui.components;

import io.elevenlabs.ui.components.PlanBadgeStyles;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.livekit.android.rpc.RpcError;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\n¨\u0006\u0010²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"", "title", "", "isPaid", "Lio/elevenlabs/ui/components/PlanBadgeStyles;", "styles", "Lsn/z;", "PlanBadge", "(Ljava/lang/String;ZLio/elevenlabs/ui/components/PlanBadgeStyles;Lu2/m;II)V", "PlanBadgePreview", "(Lu2/m;I)V", "PaidPlanBadgePreview", "PaidPlanBadgePreview_Echo", "Lp3/x;", "backgroundColor", "textColor", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlanBadgeKt {
    public static final void PaidPlanBadgePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-982059379);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(i3.q.f13017a, 16);
            r1.x a10 = r1.w.a(r1.j.g(4), i3.d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            PlanBadge("Pro", true, null, qVar, 54, 4);
            PlanBadge("Ultra", true, null, qVar, 54, 4);
            PlanBadge("Advanced", true, null, qVar, 54, 4);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 29);
        }
    }

    public static final sn.z PaidPlanBadgePreview$lambda$1(int i10, u2.m mVar, int i11) {
        PaidPlanBadgePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void PaidPlanBadgePreview_Echo(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-58046303);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(i3.q.f13017a, 16);
            r1.x a10 = r1.w.a(r1.j.g(4), i3.d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            PlanBadgeStyles.Companion companion = PlanBadgeStyles.INSTANCE;
            PlanBadge("Free", false, companion.echo(qVar, 6), qVar, 54, 0);
            PlanBadge("Pro", true, companion.echo(qVar, 6), qVar, 54, 0);
            PlanBadge("Ultra", true, companion.echo(qVar, 6), qVar, 54, 0);
            PlanBadge("Advanced", true, companion.echo(qVar, 6), qVar, 54, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 28);
        }
    }

    public static final sn.z PaidPlanBadgePreview_Echo$lambda$1(int i10, u2.m mVar, int i11) {
        PaidPlanBadgePreview_Echo(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void PlanBadge(String str, boolean z6, PlanBadgeStyles planBadgeStyles, u2.m mVar, int i10, int i11) {
        int i12;
        PlanBadgeStyles planBadgeStyles2;
        boolean z10;
        long m1862getBackgroundFreeLight0d7_KjU;
        long m1866getTextFreeLight0d7_KjU;
        int i13;
        int i14;
        int i15;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1021557172);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                planBadgeStyles2 = planBadgeStyles;
                if (qVar.f(planBadgeStyles2)) {
                    i13 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i13;
                }
            } else {
                planBadgeStyles2 = planBadgeStyles;
            }
            i13 = 128;
            i12 |= i13;
        } else {
            planBadgeStyles2 = planBadgeStyles;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i12 & 1, z10)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                int i16 = i11 & 4;
            } else if ((i11 & 4) != 0) {
                planBadgeStyles2 = PlanBadgeStyles.INSTANCE.defaults(qVar, 6);
            }
            qVar.q();
            if (z6) {
                if (planBadgeStyles2.isDark()) {
                    m1862getBackgroundFreeLight0d7_KjU = planBadgeStyles2.m1863getBackgroundPaidDark0d7_KjU();
                } else {
                    m1862getBackgroundFreeLight0d7_KjU = planBadgeStyles2.m1864getBackgroundPaidLight0d7_KjU();
                }
            } else if (planBadgeStyles2.isDark()) {
                m1862getBackgroundFreeLight0d7_KjU = planBadgeStyles2.m1861getBackgroundFreeDark0d7_KjU();
            } else {
                m1862getBackgroundFreeLight0d7_KjU = planBadgeStyles2.m1862getBackgroundFreeLight0d7_KjU();
            }
            u2.s2 a10 = i1.w2.a(m1862getBackgroundFreeLight0d7_KjU, null, "backgroundColor", qVar, 384, 10);
            if (z6) {
                if (planBadgeStyles2.isDark()) {
                    m1866getTextFreeLight0d7_KjU = planBadgeStyles2.m1867getTextPaidDark0d7_KjU();
                } else {
                    m1866getTextFreeLight0d7_KjU = planBadgeStyles2.m1868getTextPaidLight0d7_KjU();
                }
            } else if (planBadgeStyles2.isDark()) {
                m1866getTextFreeLight0d7_KjU = planBadgeStyles2.m1865getTextFreeDark0d7_KjU();
            } else {
                m1866getTextFreeLight0d7_KjU = planBadgeStyles2.m1866getTextFreeLight0d7_KjU();
            }
            u2.s2 a11 = i1.w2.a(m1866getTextFreeLight0d7_KjU, null, "textColor", qVar, 384, 10);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            j7.d(upperCase, r1.d.F(l1.n.h(ComposeExtensionsKt.scaleWidth(i3.q.f13017a, 1.4f, i3.d.B0), PlanBadge$lambda$0(a10), planBadgeStyles2.getShape()), 3, 1), PlanBadge$lambda$1(a11), 0L, w4.g0.B0, 0L, new e5.k(5), 0L, 0, false, 0, 0, null, planBadgeStyles2.getTextStyle(), qVar, 1572864, 0, 129976);
            qVar = qVar;
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new id.c(str, z6, planBadgeStyles2, i10, i11, 3);
        }
    }

    private static final long PlanBadge$lambda$0(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long PlanBadge$lambda$1(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final sn.z PlanBadge$lambda$2(String str, boolean z6, PlanBadgeStyles planBadgeStyles, int i10, int i11, u2.m mVar, int i12) {
        PlanBadge(str, z6, planBadgeStyles, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void PlanBadgePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1506860383);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(i3.q.f13017a, 16);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            PlanBadge("Free", false, null, qVar, 54, 4);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 27);
        }
    }

    public static final sn.z PlanBadgePreview$lambda$1(int i10, u2.m mVar, int i11) {
        PlanBadgePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
