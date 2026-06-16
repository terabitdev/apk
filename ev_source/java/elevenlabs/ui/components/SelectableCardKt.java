package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aU\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "selected", "", ParameterNames.ICON, "", "title", "subtitle", "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "SelectableCard", "(ZILjava/lang/String;Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "Lkotlin/Function1;", "Lp3/x;", "(ZLho/q;Ljava/lang/String;Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "Preview_SelectableCard", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SelectableCardKt {
    public static final void Preview_SelectableCard(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(751615198);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
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
            int i11 = R.drawable.chain_link_4;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new u0(23);
                qVar.h0(L);
            }
            SelectableCard(false, i11, "My own imported content", "Import and listen to your own content from web pages, files, scanned documents or written text.", (ho.a) L, (i3.t) null, (u2.m) qVar, 28038, 32);
            int i12 = R.drawable.chain_link_4;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new u0(24);
                qVar.h0(L2);
            }
            SelectableCard(true, i12, "My own imported content", "Import and listen to your own content from web pages, files, scanned documents or written text.", (ho.a) L2, (i3.t) null, (u2.m) qVar, 28038, 32);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 9);
        }
    }

    public static final sn.z Preview_SelectableCard$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SelectableCard(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectableCard(boolean z6, ho.q qVar, String str, String str2, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.q qVar2;
        i3.t tVar2;
        int i13;
        int i14;
        boolean z10;
        u2.q qVar3;
        i3.t tVar3;
        u2.r1 r10;
        String str3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        qVar.getClass();
        str.getClass();
        aVar.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-1277336284);
        if ((i10 & 6) == 0) {
            if (qVar4.g(z6)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            qVar2 = qVar;
            if (qVar4.h(qVar2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        } else {
            qVar2 = qVar;
        }
        if ((i10 & 384) == 0) {
            if (qVar4.f(str)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar4.f(str2)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (qVar4.h(aVar)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        int i21 = i11 & 32;
        if (i21 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar4.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i12;
            if ((74899 & i14) == 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar4.O(i14 & 1, z10)) {
                if (i21 != 0) {
                    tVar2 = i3.q.f13017a;
                }
                i3.t c5 = m3.h.c(tVar2, ElevenLabsTheme.INSTANCE.getShapes(qVar4, 6).getMx());
                if (str2 != null && !wq.n.m0(str2)) {
                    str3 = " - ".concat(str2);
                } else {
                    str3 = "";
                }
                String concat = str.concat(str3);
                if (z6) {
                    i15 = R.string.accessibility_chip_selected;
                } else {
                    i15 = R.string.accessibility_chip_unselected;
                }
                qVar3 = qVar4;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(concat, aVar, c5, 0L, false, 1, kj.c.R(qVar4, i15), false, null, c3.k.d(1609897992, true, new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.u(z6, qVar2, str, str2, 3), qVar4), qVar3, ((i14 >> 9) & 112) | 805306368, 408);
                tVar3 = tVar2;
            } else {
                qVar3 = qVar4;
                qVar3.R();
                tVar3 = tVar2;
            }
            r10 = qVar3.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.ocr.o(z6, qVar, str, str2, aVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i12;
        if ((74899 & i14) == 74898) {
        }
        if (!qVar4.O(i14 & 1, z10)) {
        }
        r10 = qVar3.r();
        if (r10 == null) {
        }
    }

    public static final sn.z SelectableCard$lambda$0(boolean z6, int i10, String str, String str2, ho.a aVar, i3.t tVar, int i11, int i12, u2.m mVar, int i13) {
        SelectableCard(z6, i10, str, str2, aVar, tVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final sn.z SelectableCard$lambda$1(boolean z6, ho.q qVar, String str, String str2, r1.s sVar, u2.m mVar, int i10) {
        boolean z10;
        long m2157getInactiveBorder0d7_KjU;
        long m2156getInactiveBg0d7_KjU;
        long m2159getInactiveText0d7_KjU;
        boolean z11;
        long m2158getInactiveSecondaryText0d7_KjU;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z10)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t e10 = r1.p2.e(qVar3, 1.0f);
            float f10 = 1;
            if (z6) {
                qVar2.X(923750996);
                m2157getInactiveBorder0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar2, 6).getSelectableCard().m2153getActiveBorder0d7_KjU();
            } else {
                qVar2.X(923752758);
                m2157getInactiveBorder0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar2, 6).getSelectableCard().m2157getInactiveBorder0d7_KjU();
            }
            qVar2.p(false);
            long j4 = ((p3.x) i1.w2.a(m2157getInactiveBorder0d7_KjU, null, null, qVar2, 0, 14).getValue()).f26440a;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t j10 = l1.n.j(f10, j4, e10, elevenLabsTheme.getShapes(qVar2, 6).getMx());
            if (z6) {
                qVar2.X(923759888);
                m2156getInactiveBg0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getSelectableCard().m2152getActiveBg0d7_KjU();
            } else {
                qVar2.X(923761522);
                m2156getInactiveBg0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getSelectableCard().m2156getInactiveBg0d7_KjU();
            }
            qVar2.p(false);
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar2, 6, l1.n.h(j10, ((p3.x) i1.w2.a(m2156getInactiveBg0d7_KjU, null, null, qVar2, 0, 14).getValue()).f26440a, elevenLabsTheme.getShapes(qVar2, 6).getMx()));
            r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13005z0, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(x10, qVar2);
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
            if (z6) {
                qVar2.X(676666902);
                m2159getInactiveText0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getSelectableCard().m2155getActiveText0d7_KjU();
            } else {
                qVar2.X(676668600);
                m2159getInactiveText0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getSelectableCard().m2159getInactiveText0d7_KjU();
            }
            qVar2.p(false);
            long j11 = ((p3.x) i1.w2.a(m2159getInactiveText0d7_KjU, null, null, qVar2, 0, 14).getValue()).f26440a;
            i3.t o6 = r1.p2.o(qVar3, 24);
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
            qVar.invoke(new p3.x(j11), qVar2, 0);
            qVar2.p(true);
            r1.d.g(r1.p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), qVar2);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            r1.m1 m1Var = new r1.m1(1.0f, true);
            r1.x a11 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar2, 6).m2350getX1D9Ej5fM()), i3.d.B0, qVar2, 0);
            int hashCode3 = Long.hashCode(qVar2.T);
            c3.o l10 = qVar2.l();
            i3.t c11 = i3.a.c(m1Var, qVar2);
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
            j7.d(str, null, j11, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, 6).getSubtitleLarge700(), qVar2, 0, 0, 131066);
            u2.q qVar4 = qVar2;
            if (str2 != null && !wq.n.m0(str2)) {
                qVar4.X(-167512938);
                if (z6) {
                    qVar4.X(-836682699);
                    m2158getInactiveSecondaryText0d7_KjU = elevenLabsTheme.getColor(qVar4, 6).getSelectableCard().m2154getActiveSecondaryText0d7_KjU();
                    z11 = false;
                } else {
                    z11 = false;
                    qVar4.X(-836680713);
                    m2158getInactiveSecondaryText0d7_KjU = elevenLabsTheme.getColor(qVar4, 6).getSelectableCard().m2158getInactiveSecondaryText0d7_KjU();
                }
                qVar4.p(z11);
                j7.d(str2, null, ((p3.x) i1.w2.a(m2158getInactiveSecondaryText0d7_KjU, null, null, qVar4, 0, 14).getValue()).f26440a, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar4, 6).getBodySmall500(), qVar4, 0, 0, 131066);
                qVar4 = qVar4;
                qVar4.p(false);
            } else {
                qVar4.X(-167165056);
                qVar4.p(false);
            }
            qVar4.p(true);
            qVar4.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SelectableCard$lambda$2(boolean z6, ho.q qVar, String str, String str2, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        SelectableCard(z6, qVar, str, str2, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectableCard(boolean z6, final int i10, String str, String str2, ho.a aVar, i3.t tVar, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        i3.t tVar3;
        u2.r1 r10;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-882427679);
        if ((i11 & 6) == 0) {
            i13 = (qVar.g(z6) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= qVar.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= qVar.f(str) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= qVar.f(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i11 & 24576) == 0) {
            i13 |= qVar.h(aVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i14 = i12 & 32;
        if (i14 != 0) {
            i13 |= 196608;
        } else if ((196608 & i11) == 0) {
            tVar2 = tVar;
            i13 |= qVar.f(tVar2) ? 131072 : 65536;
            if (!qVar.O(i13 & 1, (74899 & i13) == 74898)) {
                i3.t tVar4 = i14 != 0 ? i3.q.f13017a : tVar2;
                SelectableCard(z6, c3.k.d(719522920, true, new ho.q() { // from class: io.elevenlabs.ui.components.SelectableCardKt$SelectableCard$1
                    @Override // ho.q
                    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        m1874invokeek8zF_U(((p3.x) obj).f26440a, (u2.m) obj2, ((Number) obj3).intValue());
                        return sn.z.f31622a;
                    }

                    /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                    public final void m1874invokeek8zF_U(long j4, u2.m mVar2, int i15) {
                        boolean z10;
                        int i16;
                        if ((i15 & 6) == 0) {
                            if (((u2.q) mVar2).e(j4)) {
                                i16 = 4;
                            } else {
                                i16 = 2;
                            }
                            i15 |= i16;
                        }
                        if ((i15 & 19) != 18) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u2.q qVar2 = (u2.q) mVar2;
                        if (qVar2.O(i15 & 1, z10)) {
                            q2.y2.a(kd.a.M(i10, qVar2, 0), null, r1.p2.d(i3.q.f13017a, 1.0f), j4, qVar2, u3.c.$stable | 432 | ((i15 << 9) & 7168), 0);
                        } else {
                            qVar2.R();
                        }
                    }
                }, qVar), str, str2, aVar, tVar4, qVar, (i13 & 14) | 48 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new j2(z6, i10, str, str2, aVar, tVar3, i11, i12);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if (!qVar.O(i13 & 1, (74899 & i13) == 74898)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }
}
