package io.elevenlabs.ui.components;

import a2.k3;
import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.ui.components.CalloutType;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\r\u001a=\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/ui/components/CalloutType;", "type", "", "iconUrl", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "Callout", "(Lio/elevenlabs/ui/components/CalloutType;Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "", "imageRes", "(Lio/elevenlabs/ui/components/CalloutType;ILho/a;Li3/t;Lu2/m;II)V", ParameterNames.ICON, "(Lio/elevenlabs/ui/components/CalloutType;Lho/p;Lho/a;Li3/t;Lu2/m;II)V", "title", "subtitle", "LargeCallout", "(Ljava/lang/String;Ljava/lang/String;Lho/p;Lu2/m;I)V", ParameterNames.TEXT, "SmallCallout", "(Ljava/lang/String;Lho/p;Lu2/m;I)V", "Preview_Callout_Large", "(Lu2/m;I)V", "Preview_Callout_Small", "Preview_Callout_Long_Text", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CalloutKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Callout(CalloutType calloutType, ho.p pVar, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        String text;
        int i14;
        int i15;
        int i16;
        calloutType.getClass();
        pVar.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1416456189);
        if ((i10 & 6) == 0) {
            if (qVar.f(calloutType)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                boolean z10 = calloutType instanceof CalloutType.Large;
                if (z10) {
                    CalloutType.Large large = (CalloutType.Large) calloutType;
                    text = defpackage.f.j(large.getTitle(), " - ", large.getSubtitle());
                } else if (calloutType instanceof CalloutType.Small) {
                    text = ((CalloutType.Small) calloutType).getText();
                } else {
                    c6.p();
                    return;
                }
                String str = text;
                i3.t e10 = r1.p2.e(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                i3.t tVar5 = tVar4;
                i3.t p10 = l1.n.p(l1.n.j(1, echoTheme.getColors(qVar, 6).getBorder().getSenaryAlpha(qVar, 0), l1.n.h(m3.h.c(e10, echoTheme.getShapes(qVar, 6).getXl(qVar, 0)), echoTheme.getColors(qVar, 6).getFill().getDenaryAlpha(qVar, 0), p3.h0.f26395b), echoTheme.getShapes(qVar, 6).getXl(qVar, 0)), false, null, null, null, aVar, 15);
                boolean f10 = qVar.f(str);
                Object L = qVar.L();
                if (f10 || L == u2.l.f33918a) {
                    L = new g(str, 5);
                    qVar.h0(L);
                }
                i3.t c5 = p4.q.c(p10, true, (ho.l) L);
                f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c10 = i3.a.c(c5, qVar);
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
                u2.r.J(h4.g.f11905d, c10, qVar);
                if (z10) {
                    qVar.X(-987954312);
                    CalloutType.Large large2 = (CalloutType.Large) calloutType;
                    LargeCallout(large2.getTitle(), large2.getSubtitle(), c3.k.d(457634693, true, new v(pVar, 0), qVar), qVar, 384);
                    qVar.p(false);
                } else if (calloutType instanceof CalloutType.Small) {
                    qVar.X(-987947540);
                    SmallCallout(((CalloutType.Small) calloutType).getText(), c3.k.d(1757905121, true, new v(pVar, 1), qVar), qVar, 48);
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(-987955683, qVar, false);
                }
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f((Object) calloutType, (Object) pVar, aVar, tVar3, i10, i11, 4);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z Callout$lambda$0(String str, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t d10 = r1.p2.d(i3.q.f13017a, 1.0f);
            ad.h hVar = new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
            hVar.f1788c = str;
            hVar.b();
            qc.m.b(hVar.a(), null, d10, i3.d.f13001e, f4.q.f8840c, null, qVar, 1769904, 3992);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Callout$lambda$1(CalloutType calloutType, String str, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        Callout(calloutType, str, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z Callout$lambda$2(int i10, u2.m mVar, int i11) {
        boolean z6;
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            l1.n.c(kd.a.M(i10, qVar, 0), null, r1.p2.d(i3.q.f13017a, 1.0f), null, null, t2.u.P, null, qVar, u3.c.$stable | 432, 120);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Callout$lambda$3(CalloutType calloutType, int i10, ho.a aVar, i3.t tVar, int i11, int i12, u2.m mVar, int i13) {
        Callout(calloutType, i10, aVar, tVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final sn.z Callout$lambda$4$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z Callout$lambda$5$0(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            pVar.invoke(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Callout$lambda$5$1(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            pVar.invoke(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Callout$lambda$6(CalloutType calloutType, ho.p pVar, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        Callout(calloutType, pVar, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void LargeCallout(String str, String str2, ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1162148047);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(pVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13005z0, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.q qVar3 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar3, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar2);
            i3.t o6 = r1.p2.o(qVar3, 80);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(o6, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, d10, qVar2);
            u2.r.J(eVar2, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c10, qVar2);
            j0.c.q((i11 >> 6) & 14, pVar, qVar2, true);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = i11;
            i3.t H = r1.d.H(new r1.m1(1.0f, true), 0, echoTheme.getSpacings(qVar2, 6).getX3(), echoTheme.getSpacings(qVar2, 6).getX7(), echoTheme.getSpacings(qVar2, 6).getX3());
            r1.x a11 = r1.w.a(r1.j.g(echoTheme.getSpacings(qVar2, 6).getX1()), i3.d.B0, qVar2, 0);
            int hashCode3 = Long.hashCode(qVar2.T);
            c3.o l10 = qVar2.l();
            i3.t c11 = i3.a.c(H, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, a11, qVar2);
            u2.r.J(eVar2, l10, qVar2);
            defpackage.f.u(hashCode3, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c11, qVar2);
            j7.d(str, r1.p2.e(qVar3, 1.0f), ib.i.v(6, 0, echoTheme, qVar2, qVar2), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, 6).getSmRegular600(qVar2, 0), qVar2, (i15 & 14) | 48, 0, 131064);
            j7.d(str2, r1.p2.e(qVar3, 1.0f), ib.i.b(6, 0, echoTheme, qVar2, qVar2), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, 6).getSmRegular500(qVar2, 0), qVar2, ((i15 >> 3) & 14) | 48, 0, 131064);
            qVar = qVar2;
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 26, str, str2, pVar);
        }
    }

    public static final sn.z LargeCallout$lambda$1(String str, String str2, ho.p pVar, int i10, u2.m mVar, int i11) {
        LargeCallout(str, str2, pVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Callout_Large(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-671604650);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CalloutType.Large large = new CalloutType.Large("New Feature Available", "Try our new voice cloning technology");
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(12);
                qVar.h0(L);
            }
            Callout(large, "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fgenfm.png?alt=media&token=fef2e1b7-677f-4bb7-bddc-e87212559015", (ho.a) L, (i3.t) null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 0);
        }
    }

    public static final sn.z Preview_Callout_Large$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Callout_Large(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Callout_Long_Text(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(225037963);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CalloutType.Large large = new CalloutType.Large("New Feature Available with a very long title that might wrap to multiple lines", "Try our new voice cloning technology with advanced AI capabilities and natural sounding voices that can be used in various applications");
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(11);
                qVar.h0(L);
            }
            Callout(large, "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fadded-to-library.png?alt=media&token=16738384-4f47-4894-a36f-91afa120cc62", (ho.a) L, (i3.t) null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 27);
        }
    }

    public static final sn.z Preview_Callout_Long_Text$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Callout_Long_Text(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Callout_Small(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1869141726);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CalloutType.Small small = new CalloutType.Small("Tap to learn more about our new features");
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(10);
                qVar.h0(L);
            }
            Callout(small, "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fcollections.png?alt=media&token=b332c31c-2e96-4aab-8140-64e499e375c0", (ho.a) L, (i3.t) null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 28);
        }
    }

    public static final sn.z Preview_Callout_Small$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Callout_Small(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void SmallCallout(String str, ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        String str2 = str;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1439156662);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(pVar)) {
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
        if (qVar2.O(i11 & 1, z6)) {
            i3.k kVar = i3.d.f13005z0;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            float x22 = echoTheme.getSpacings(qVar2, 6).getX2();
            float x23 = echoTheme.getSpacings(qVar2, 6).getX2();
            float x24 = echoTheme.getSpacings(qVar2, 6).getX2();
            float x42 = echoTheme.getSpacings(qVar2, 6).getX4();
            i3.q qVar3 = i3.q.f13017a;
            i3.t H = r1.d.H(qVar3, x22, x23, x42, x24);
            r1.k2 a10 = r1.i2.a(r1.j.f29228a, kVar, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(H, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar2);
            i3.t o6 = r1.p2.o(qVar3, 40);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(o6, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, d10, qVar2);
            u2.r.J(eVar2, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c10, qVar2);
            j0.c.q((i11 >> 3) & 14, pVar, qVar2, true);
            r1.d.g(r1.p2.s(qVar3, echoTheme.getSpacings(qVar2, 6).getX2()), qVar2);
            str2 = str;
            j7.d(str2, r1.p2.e(qVar3, 1.0f), ib.i.b(6, 0, echoTheme, qVar2, qVar2), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, 6).getSmRegular500(qVar2, 0), qVar2, (i11 & 14) | 48, 0, 131064);
            qVar = qVar2;
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new s1(str2, pVar, i10);
        }
    }

    public static final sn.z SmallCallout$lambda$1(String str, ho.p pVar, int i10, u2.m mVar, int i11) {
        SmallCallout(str, pVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Callout(CalloutType calloutType, int i10, ho.a aVar, i3.t tVar, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        i3.t tVar3;
        u2.r1 r10;
        calloutType.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1286082343);
        if ((i11 & 6) == 0) {
            i13 = (qVar.f(calloutType) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= qVar.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= qVar.h(aVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            i13 |= qVar.f(tVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (!qVar.O(i13 & 1, (i13 & 1171) == 1170)) {
                i3.t tVar4 = i14 != 0 ? i3.q.f13017a : tVar2;
                Callout(calloutType, c3.k.d(-2022423605, true, new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 29), qVar), aVar, tVar4, qVar, (i13 & 14) | 48 | (i13 & 896) | (i13 & 7168), 0);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.f1(calloutType, i10, aVar, tVar3, i11, i12, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if (!qVar.O(i13 & 1, (i13 & 1171) == 1170)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Callout(CalloutType calloutType, String str, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        i3.t tVar3;
        u2.r1 r10;
        calloutType.getClass();
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(90446809);
        if ((i10 & 6) == 0) {
            i12 = (qVar.f(calloutType) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= qVar.f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= qVar.h(aVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            i12 |= qVar.f(tVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (!qVar.O(i12 & 1, (i12 & 1171) == 1170)) {
                i3.t tVar4 = i13 != 0 ? i3.q.f13017a : tVar2;
                Callout(calloutType, c3.k.d(1594225845, true, new w(str, 0), qVar), aVar, tVar4, qVar, (i12 & 14) | 48 | (i12 & 896) | (i12 & 7168), 0);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f((Object) calloutType, (Object) str, aVar, (Object) tVar3, i10, i11, 5);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if (!qVar.O(i12 & 1, (i12 & 1171) == 1170)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }
}
