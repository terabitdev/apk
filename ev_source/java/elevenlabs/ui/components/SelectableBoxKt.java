package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClick", "", "isSelected", "", "contentDescription", "Li3/t;", "modifier", "Lp3/x;", "unselectedBorderColor", "Lp3/b1;", "shape", FirebaseAnalytics.Param.CONTENT, "SelectableBox-3f6hBDE", "(Lho/a;ZLjava/lang/String;Li3/t;JLp3/b1;Lho/p;Lu2/m;II)V", "SelectableBox", "Preview_SelectableBox", "(Lu2/m;I)V", "Lh5/f;", "borderSize", "borderColor", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SelectableBoxKt {
    public static final void Preview_SelectableBox(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1003416230);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
                L = new u0(21);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            ComposableSingletons$SelectableBoxKt composableSingletons$SelectableBoxKt = ComposableSingletons$SelectableBoxKt.INSTANCE;
            m1873SelectableBox3f6hBDE(aVar, false, "", null, 0L, null, composableSingletons$SelectableBoxKt.getLambda$740042356$ui_release(), qVar, 1573302, 56);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new u0(22);
                qVar.h0(L2);
            }
            m1873SelectableBox3f6hBDE((ho.a) L2, true, "", null, 0L, null, composableSingletons$SelectableBoxKt.m1821getLambda$654756821$ui_release(), qVar, 1573302, 56);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 8);
        }
    }

    public static final sn.z Preview_SelectableBox$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SelectableBox(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* renamed from: SelectableBox-3f6hBDE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1873SelectableBox3f6hBDE(final ho.a aVar, final boolean z6, final String str, i3.t tVar, long j4, p3.b1 b1Var, final ho.p pVar, u2.m mVar, final int i10, final int i11) {
        ho.a aVar2;
        int i12;
        int i13;
        long j10;
        p3.b1 b1Var2;
        boolean z10;
        final i3.t tVar2;
        final long j11;
        u2.r1 r10;
        i3.t tVar3;
        int i14;
        i3.t tVar4;
        p3.b1 md;
        float f10;
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        Object L;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        aVar.getClass();
        str.getClass();
        pVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1532899634);
        if ((i10 & 6) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (qVar.f(tVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i10 & 24576) != 0) {
                j10 = j4;
                if ((i11 & 16) == 0 && qVar.e(j10)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i17;
            } else {
                j10 = j4;
            }
            if ((196608 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    b1Var2 = b1Var;
                    if (qVar.f(b1Var2)) {
                        i16 = 131072;
                        i12 |= i16;
                    }
                } else {
                    b1Var2 = b1Var;
                }
                i16 = 65536;
                i12 |= i16;
            } else {
                b1Var2 = b1Var;
            }
            if ((i10 & 1572864) == 0) {
                if (qVar.h(pVar)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
            }
            if ((i12 & 599187) == 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                qVar.T();
                if ((i10 & 1) != 0 && !qVar.y()) {
                    qVar.R();
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    tVar4 = tVar;
                    i14 = i12;
                } else {
                    if (i21 != 0) {
                        tVar3 = i3.q.f13017a;
                    } else {
                        tVar3 = tVar;
                    }
                    if ((i11 & 16) != 0) {
                        j10 = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getDivider().m2059getLine0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        tVar4 = tVar3;
                        md = ElevenLabsTheme.INSTANCE.getShapes(qVar, 6).getMd();
                        i14 = i12 & (-458753);
                        j11 = j10;
                        qVar.q();
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        ColorScheme color = elevenLabsTheme.getColor(qVar, 6);
                        if (!z6) {
                            f10 = 2;
                        } else {
                            f10 = 1;
                        }
                        u2.s2 a10 = j1.f.a(f10, null, "borderSize", qVar, 384, 10);
                        if (!z6) {
                            j12 = color.getText().m2185getPrimary0d7_KjU();
                        } else {
                            j12 = j11;
                        }
                        u2.s2 a11 = i1.w2.a(j12, null, "borderColor", qVar, 384, 10);
                        qVar = qVar;
                        String R = kj.c.R(qVar, R.string.accessibility_selectable_selected);
                        b1Var2 = md;
                        i3.t h10 = l1.n.h(l1.n.j(SelectableBox_3f6hBDE$lambda$0(a10), SelectableBox_3f6hBDE$lambda$1(a11), l1.n.p(m3.h.c(m3.h.k(tVar4, 4, md, 0L, elevenLabsTheme.getColors(qVar, 6).getContainerShadow(), 12), b1Var2), false, null, null, null, aVar2, 15), b1Var2), color.getBackground().m2003getPrimary0d7_KjU(), p3.h0.f26395b);
                        if ((i14 & 112) != 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean f11 = z11 | qVar.f(R);
                        if ((i14 & 896) != 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = f11 | z12;
                        L = qVar.L();
                        if (!z13 || L == u2.l.f33918a) {
                            L = new io.elevenlabs.readerapp.ui.components.explore.l(1, R, str, z6);
                            qVar.h0(L);
                        }
                        i3.t c5 = p4.q.c(h10, true, (ho.l) L);
                        f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.t c10 = i3.a.c(c5, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (!qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(h4.g.f11907f, d10, qVar);
                        u2.r.J(h4.g.f11906e, l4, qVar);
                        u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar);
                        u2.r.J(h4.g.f11905d, c10, qVar);
                        j0.c.q((i14 >> 18) & 14, pVar, qVar, true);
                        tVar2 = tVar4;
                    } else {
                        i14 = i12;
                        tVar4 = tVar3;
                    }
                }
                md = b1Var2;
                j11 = j10;
                qVar.q();
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                ColorScheme color2 = elevenLabsTheme2.getColor(qVar, 6);
                if (!z6) {
                }
                u2.s2 a102 = j1.f.a(f10, null, "borderSize", qVar, 384, 10);
                if (!z6) {
                }
                u2.s2 a112 = i1.w2.a(j12, null, "borderColor", qVar, 384, 10);
                qVar = qVar;
                String R2 = kj.c.R(qVar, R.string.accessibility_selectable_selected);
                b1Var2 = md;
                i3.t h102 = l1.n.h(l1.n.j(SelectableBox_3f6hBDE$lambda$0(a102), SelectableBox_3f6hBDE$lambda$1(a112), l1.n.p(m3.h.c(m3.h.k(tVar4, 4, md, 0L, elevenLabsTheme2.getColors(qVar, 6).getContainerShadow(), 12), b1Var2), false, null, null, null, aVar2, 15), b1Var2), color2.getBackground().m2003getPrimary0d7_KjU(), p3.h0.f26395b);
                if ((i14 & 112) != 32) {
                }
                boolean f112 = z11 | qVar.f(R2);
                if ((i14 & 896) != 256) {
                }
                z13 = f112 | z12;
                L = qVar.L();
                if (!z13) {
                }
                L = new io.elevenlabs.readerapp.ui.components.explore.l(1, R2, str, z6);
                qVar.h0(L);
                i3.t c52 = p4.q.c(h102, true, (ho.l) L);
                f4.f1 d102 = r1.p.d(i3.d.f12997a, false);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l42 = qVar.l();
                i3.t c102 = i3.a.c(c52, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar.b0();
                if (!qVar.S) {
                }
                u2.r.J(h4.g.f11907f, d102, qVar);
                u2.r.J(h4.g.f11906e, l42, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c102, qVar);
                j0.c.q((i14 >> 18) & 14, pVar, qVar, true);
                tVar2 = tVar4;
            } else {
                qVar.R();
                tVar2 = tVar;
                j11 = j10;
            }
            final p3.b1 b1Var3 = b1Var2;
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.i2
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z SelectableBox_3f6hBDE$lambda$4;
                        int intValue = ((Integer) obj2).intValue();
                        SelectableBox_3f6hBDE$lambda$4 = SelectableBoxKt.SelectableBox_3f6hBDE$lambda$4(ho.a.this, z6, str, tVar2, j11, b1Var3, pVar, i10, i11, (u2.m) obj, intValue);
                        return SelectableBox_3f6hBDE$lambda$4;
                    }
                };
                return;
            }
            return;
        }
        if ((i10 & 24576) != 0) {
        }
        if ((196608 & i10) != 0) {
        }
        if ((i10 & 1572864) == 0) {
        }
        if ((i12 & 599187) == 599186) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        final p3.b1 b1Var32 = b1Var2;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final float SelectableBox_3f6hBDE$lambda$0(u2.s2 s2Var) {
        return ((h5.f) s2Var.getValue()).f12083a;
    }

    private static final long SelectableBox_3f6hBDE$lambda$1(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final sn.z SelectableBox_3f6hBDE$lambda$2$0(boolean z6, String str, String str2, p4.b0 b0Var) {
        String B;
        b0Var.getClass();
        if (!z6) {
            B = "";
        } else {
            B = defpackage.f.B(str, " - ");
        }
        p4.y.d(B + str2, b0Var);
        p4.y.i(b0Var, 0);
        return sn.z.f31622a;
    }

    public static final sn.z SelectableBox_3f6hBDE$lambda$4(ho.a aVar, boolean z6, String str, i3.t tVar, long j4, p3.b1 b1Var, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        m1873SelectableBox3f6hBDE(aVar, z6, str, tVar, j4, b1Var, pVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
