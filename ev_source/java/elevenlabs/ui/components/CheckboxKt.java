package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "checked", "Lkotlin/Function0;", "Lsn/z;", "onCheckedChange", "", Constants.ScionAnalytics.PARAM_LABEL, "Li3/t;", "modifier", "Checkbox", "(ZLho/a;Ljava/lang/String;Li3/t;Lu2/m;II)V", "Li3/f;", "verticalAlignment", FirebaseAnalytics.Param.CONTENT, "(ZLho/a;Ljava/lang/String;Li3/t;Li3/f;Lho/p;Lu2/m;II)V", "Preview_Checkbox", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CheckboxKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(boolean z6, ho.a aVar, String str, i3.t tVar, i3.f fVar, ho.p pVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        i3.f fVar2;
        int i15;
        boolean z10;
        i3.t tVar2;
        i3.f fVar3;
        u2.r1 r10;
        i3.t tVar3;
        i3.f fVar4;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        aVar.getClass();
        str.getClass();
        pVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(736420546);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        int i20 = i11 & 8;
        if (i20 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (qVar.f(tVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                fVar2 = fVar;
                if (qVar.f(fVar2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((196608 & i10) == 0) {
                    if (qVar.h(pVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                boolean z13 = false;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (qVar.O(i12 & 1, z10)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i20 != 0) {
                        tVar3 = qVar2;
                    } else {
                        tVar3 = tVar;
                    }
                    if (i14 != 0) {
                        fVar4 = i3.d.f13005z0;
                    } else {
                        fVar4 = fVar2;
                    }
                    String R = kj.c.R(qVar, R.string.accessibility_chip_selected);
                    String R2 = kj.c.R(qVar, R.string.accessibility_chip_unselected);
                    if ((i12 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object L = qVar.L();
                    Object obj = u2.l.f33918a;
                    if (z11 || L == obj) {
                        L = new o(1, aVar);
                        qVar.h0(L);
                    }
                    i3.t then = l1.n.p(qVar2, false, null, null, null, (ho.a) L, 15).then(tVar3);
                    if ((i12 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i21 = i12 & 14;
                    if (i21 == 4) {
                        z13 = true;
                    }
                    boolean f10 = z12 | z13 | qVar.f(R) | qVar.f(R2);
                    Object L2 = qVar.L();
                    if (f10 || L2 == obj) {
                        L2 = new ec.w(str, R, R2, z6);
                        qVar.h0(L2);
                    }
                    i3.t c5 = p4.q.c(then, true, (ho.l) L2);
                    r1.k2 a10 = r1.i2.a(r1.j.f29228a, fVar4, qVar, (((i12 >> 6) & 896) >> 3) & 112);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c10 = i3.a.c(c5, qVar);
                    h4.h.f11920i.getClass();
                    ho.a aVar2 = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(aVar2);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(h4.g.f11907f, a10, qVar);
                    u2.r.J(h4.g.f11906e, l4, qVar);
                    u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar);
                    u2.r.J(h4.g.f11905d, c10, qVar);
                    i1.l.b(Boolean.valueOf(z6), null, null, null, "checked", null, ComposableSingletons$CheckboxKt.INSTANCE.m1797getLambda$1340629975$ui_release(), qVar, i21 | 1597440, 46);
                    r1.d.g(r1.p2.s(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, 6).m2353getX2D9Ej5fM()), qVar);
                    j0.c.q((i12 >> 15) & 14, pVar, qVar, true);
                    tVar2 = tVar3;
                    fVar3 = fVar4;
                } else {
                    qVar.R();
                    tVar2 = tVar;
                    fVar3 = fVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.ocr.o(z6, aVar, str, tVar2, fVar3, pVar, i10, i11);
                    return;
                }
                return;
            }
            fVar2 = fVar;
            if ((196608 & i10) == 0) {
            }
            boolean z132 = false;
            if ((74899 & i12) != 74898) {
            }
            if (qVar.O(i12 & 1, z10)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        fVar2 = fVar;
        if ((196608 & i10) == 0) {
        }
        boolean z1322 = false;
        if ((74899 & i12) != 74898) {
        }
        if (qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z Checkbox$lambda$0(String str, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            j7.d(str, r1.d.I(r1.d.G(i3.q.f13017a, t2.u.P, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), 1), t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), t2.u.P, 11), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyLarge500(), qVar, 0, 0, 131068);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Checkbox$lambda$1(boolean z6, ho.a aVar, String str, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        Checkbox(z6, aVar, str, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z Checkbox$lambda$2$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z Checkbox$lambda$3$0(String str, boolean z6, String str2, String str3, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 1);
        p4.y.d(str, b0Var);
        if (!z6) {
            str2 = str3;
        }
        p4.y.l(str2, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z Checkbox$lambda$5(boolean z6, ho.a aVar, String str, i3.t tVar, i3.f fVar, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        Checkbox(z6, aVar, str, tVar, fVar, pVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_Checkbox(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1630615204);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.n(ElevenLabsTheme.INSTANCE, qVar, 6), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
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
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new a(13);
                qVar.h0(L);
            }
            Checkbox(true, (ho.a) L, "Checkbox checked", null, qVar, 438, 8);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(14);
                qVar.h0(L2);
            }
            Checkbox(false, (ho.a) L2, "Checkbox unchecked", null, qVar, 438, 8);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(15);
                qVar.h0(L3);
            }
            Checkbox(false, (ho.a) L3, "Checkbox with long text that takes few lines. It should wrap to next lines and center content vertically.", null, qVar, 438, 8);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 1);
        }
    }

    public static final sn.z Preview_Checkbox$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Checkbox(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Checkbox(boolean z6, ho.a aVar, String str, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        aVar.getClass();
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1756736103);
        if ((i10 & 6) == 0) {
            i12 = (qVar.g(z6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= qVar.h(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= qVar.f(str) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= qVar.f(tVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (qVar.O(i12 & 1, (i12 & 1171) != 1170)) {
            i3.t tVar3 = i13 != 0 ? i3.q.f13017a : tVar;
            Checkbox(z6, aVar, str, tVar3, i3.d.f13005z0, c3.k.d(-836955918, true, new w(str, 1), qVar), qVar, (i12 & 14) | 221184 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            tVar2 = tVar3;
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(z6, aVar, str, tVar2, i10, i11, 0);
        }
    }
}
