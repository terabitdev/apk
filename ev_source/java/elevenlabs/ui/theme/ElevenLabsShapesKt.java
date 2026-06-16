package io.elevenlabs.ui.theme;

import c3.o;
import f4.f1;
import h4.g;
import h4.h;
import i3.a;
import i3.d;
import i3.t;
import ib.i;
import ig.f;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.b1;
import p3.h0;
import q2.j7;
import r1.j;
import r1.p;
import r1.w;
import r1.x;
import sn.k;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsn/z;", "Preview_Shapes", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ElevenLabsShapesKt {
    public static final void Preview_Shapes(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(480871738);
        boolean z10 = false;
        boolean z11 = true;
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = 6;
            List<k> I = f.I(new k("none", elevenLabsTheme.getShapes(qVar, 6).getNone()), new k("xs", elevenLabsTheme.getShapes(qVar, 6).getXs()), new k("sm", elevenLabsTheme.getShapes(qVar, 6).getSm()), new k("md", elevenLabsTheme.getShapes(qVar, 6).getMd()), new k("lg", elevenLabsTheme.getShapes(qVar, 6).getLg()), new k("lg2", elevenLabsTheme.getShapes(qVar, 6).getLg2()), new k("xl", elevenLabsTheme.getShapes(qVar, 6).getXl()), new k("full", elevenLabsTheme.getShapes(qVar, 6).getFull()));
            x a10 = w.a(j.f29230c, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = a.c(qVar2, qVar);
            h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            qVar.X(-1043929643);
            for (k kVar : I) {
                String str = (String) kVar.f31600a;
                t c10 = m3.h.c(r1.d.E(qVar2, 10), (b1) kVar.f31601b);
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                t E = r1.d.E(n.h(c10, defpackage.f.b(elevenLabsTheme2, qVar, i11), h0.f26395b), 30);
                f1 d10 = p.d(d.f12997a, z10);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c11 = a.c(E, qVar);
                h.f11920i.getClass();
                h4.f fVar2 = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, d10, qVar);
                r.J(g.f11906e, l7, qVar);
                r.y(qVar, Integer.valueOf(hashCode2), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c11, qVar);
                String str2 = "shapes." + str;
                long d11 = i.d(elevenLabsTheme2, qVar, i11);
                q qVar3 = qVar;
                boolean z12 = z11;
                j7.d(str2, null, d11, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar3, 0, 0, 262138);
                qVar = qVar3;
                qVar.p(z12);
                z11 = z12;
                i11 = i11;
                qVar2 = qVar2;
                z10 = false;
            }
            qVar.p(z10);
            qVar.p(z11);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 11);
        }
    }

    public static final z Preview_Shapes$lambda$1(int i10, m mVar, int i11) {
        Preview_Shapes(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
