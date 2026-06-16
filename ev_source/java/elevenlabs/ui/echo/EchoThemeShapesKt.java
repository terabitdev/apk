package io.elevenlabs.ui.echo;

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
import s4.y0;
import sn.k;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsn/z;", "Preview_EchoThemeShapes", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoThemeShapesKt {
    public static final void Preview_EchoThemeShapes(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1877692425);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            List<k> I = f.I(new k("none", echoTheme.getShapes(qVar, 6).getNone(qVar, 0)), new k("xs", echoTheme.getShapes(qVar, 6).getXs(qVar, 0)), new k("sm", echoTheme.getShapes(qVar, 6).getSm(qVar, 0)), new k("md", echoTheme.getShapes(qVar, 6).getMd(qVar, 0)), new k("lg", echoTheme.getShapes(qVar, 6).getLg(qVar, 0)), new k("xl", echoTheme.getShapes(qVar, 6).getXl(qVar, 0)), new k("twoXl", echoTheme.getShapes(qVar, 6).getTwoXl(qVar, 0)), new k("threeXl", echoTheme.getShapes(qVar, 6).getThreeXl(qVar, 0)), new k("fourXl", echoTheme.getShapes(qVar, 6).getFourXl(qVar, 0)), new k("full", echoTheme.getShapes(qVar, 6).getFull(qVar, 0)), new k("fiveXl", echoTheme.getShapes(qVar, 6).getFiveXl(qVar, 0)), new k("sixXl", echoTheme.getShapes(qVar, 6).getSixXl(qVar, 0)), new k("sevenXl", echoTheme.getShapes(qVar, 6).getSevenXl(qVar, 0)));
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
            qVar.X(-1371526729);
            for (k kVar : I) {
                String str = (String) kVar.f31600a;
                b1 b1Var = (b1) kVar.f31601b;
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                t E = r1.d.E(n.h(m3.h.c(r1.d.E(qVar2, echoTheme2.getSpacings(qVar, 6).getX3()), b1Var), i.D(6, 0, echoTheme2, qVar, qVar), h0.f26395b), echoTheme2.getSpacings(qVar, 6).getX3());
                f1 d10 = p.d(d.f12997a, false);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c10 = a.c(E, qVar);
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
                r.J(g.f11905d, c10, qVar);
                q qVar3 = qVar;
                j7.d("shapes." + str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(echoTheme2.getTypography(qVar, 6).getSmCompact400(qVar, 0), i.v(6, 0, echoTheme2, qVar, qVar), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar3, 0, 0, 131070);
                qVar = qVar3;
                qVar.p(true);
                qVar2 = qVar2;
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 0);
        }
    }

    public static final z Preview_EchoThemeShapes$lambda$1(int i10, m mVar, int i11) {
        Preview_EchoThemeShapes(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
