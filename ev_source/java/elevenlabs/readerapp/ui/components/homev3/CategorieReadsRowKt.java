package io.elevenlabs.readerapp.ui.components.homev3;

import a2.i;
import a2.k3;
import a2.p;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import fm.b;
import fm.c;
import h4.e;
import h4.f;
import h4.g;
import h4.h;
import ho.l;
import i3.a;
import i3.t;
import io.elevenlabs.domain.model.BasicReadMeta;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ReadItemCoverKt;
import io.elevenlabs.ui.components.SectionHeaderKt;
import io.elevenlabs.ui.components.SectionHeaderStyle;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import r1.d;
import r1.i1;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p2;
import r1.s;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001ag\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToDeeplink", "title", "deeplink", "", "Lio/elevenlabs/domain/model/BasicReadMeta;", "reads", "Lio/elevenlabs/ui/components/SectionHeaderStyle;", "deeplinkHeaderStyle", "onNavigateToRead", "Li3/t;", "modifier", "CategorieReadsRowV3", "(Lho/l;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/elevenlabs/ui/components/SectionHeaderStyle;Lho/l;Li3/t;Lu2/m;II)V", "read", "RegularReadItem", "(Lio/elevenlabs/domain/model/BasicReadMeta;Lho/l;Lu2/m;I)V", "SeeMoreItem", "(Lio/elevenlabs/domain/model/BasicReadMeta;Ljava/lang/String;Lho/l;Lu2/m;I)V", "Preview_CategorieReadsRowV3", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CategorieReadsRowKt {
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CategorieReadsRowV3(l lVar, String str, String str2, List<BasicReadMeta> list, SectionHeaderStyle sectionHeaderStyle, l lVar2, t tVar, m mVar, int i10, int i11) {
        int i12;
        String str3;
        t tVar2;
        int i13;
        int i14;
        boolean z6;
        t tVar3;
        r1 r10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        l lVar3 = lVar2;
        lVar.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        sectionHeaderStyle.getClass();
        lVar3.getClass();
        q qVar = (q) mVar;
        qVar.Z(802473522);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            str3 = str;
            if (qVar.f(str3)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        } else {
            str3 = str;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(list)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.d(sectionHeaderStyle.ordinal())) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(lVar3)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        int i21 = i11 & 64;
        if (i21 != 0) {
            i12 |= 1572864;
        } else if ((1572864 & i10) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
            i14 = i12;
            if ((599187 & i14) == 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i14 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i21 != 0) {
                    tVar2 = qVar2;
                }
                t e10 = p2.e(tVar2, 1.0f);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i22 = ElevenLabsTheme.$stable;
                t G = d.G(e10, u.P, elevenLabsTheme.getSpacings(qVar, i22).m2353getX2D9Ej5fM(), 1);
                x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = a.c(G, qVar);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                e eVar = g.f11907f;
                r.J(eVar, a10, qVar);
                e eVar2 = g.f11906e;
                r.J(eVar2, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                e eVar3 = g.f11908g;
                r.y(qVar, valueOf, eVar3);
                h4.d dVar = g.f11909h;
                r.F(dVar, qVar);
                e eVar4 = g.f11905d;
                r.J(eVar4, c5, qVar);
                t tVar4 = tVar2;
                int i23 = i14 >> 3;
                SectionHeaderKt.SectionHeader(lVar, str3, str2, sectionHeaderStyle, qVar, (i23 & 7168) | (i14 & 1022));
                t G2 = d.G(n.t(qVar2, n.x(qVar), 14), elevenLabsTheme.getSpacings(qVar, i22).m2357getX5D9Ej5fM(), u.P, 2);
                k2 a11 = i2.a(j.g(elevenLabsTheme.getSpacings(qVar, i22).m2355getX3D9Ej5fM()), i3.d.f13004y0, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c10 = a.c(G2, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar, a11, qVar);
                r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                r.J(eVar4, c10, qVar);
                if (list.size() >= 10) {
                    qVar.X(1839826534);
                    qVar.X(1167728887);
                    Iterator it = tn.o.r0(list).iterator();
                    while (it.hasNext()) {
                        RegularReadItem((BasicReadMeta) it.next(), lVar2, qVar, (i14 >> 12) & 112);
                    }
                    lVar3 = lVar2;
                    qVar.p(false);
                    SeeMoreItem((BasicReadMeta) tn.o.G0(list), str2, lVar, qVar, (i23 & 112) | ((i14 << 6) & 896));
                    qVar.p(false);
                } else {
                    lVar3 = lVar2;
                    qVar.X(1840086469);
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        RegularReadItem((BasicReadMeta) it2.next(), lVar3, qVar, (i14 >> 12) & 112);
                    }
                    qVar.p(false);
                }
                qVar.p(true);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new c(lVar, str, str2, list, sectionHeaderStyle, lVar3, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i12;
        if ((599187 & i14) == 599186) {
        }
        if (!qVar.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z CategorieReadsRowV3$lambda$1(l lVar, String str, String str2, List list, SectionHeaderStyle sectionHeaderStyle, l lVar2, t tVar, int i10, int i11, m mVar, int i12) {
        CategorieReadsRowV3(lVar, str, str2, list, sectionHeaderStyle, lVar2, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_CategorieReadsRowV3(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(229715885);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t y10 = n.y(p2.e(i3.q.f13017a, 1.0f), n.x(qVar), true, true);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(y10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
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
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new p(25);
                qVar.h0(L);
            }
            l lVar = (l) L;
            List b12 = tn.o.b1(ReadsFactoryKt.stubBasicReadMetaList$default(0, 1, null), 1);
            SectionHeaderStyle sectionHeaderStyle = SectionHeaderStyle.Large;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new p(26);
                qVar.h0(L2);
            }
            CategorieReadsRowV3(lVar, "Normal title", "elevenlabs://stub", b12, sectionHeaderStyle, (l) L2, null, qVar, 221622, 64);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new p(27);
                qVar.h0(L3);
            }
            l lVar2 = (l) L3;
            List b13 = tn.o.b1(ReadsFactoryKt.stubBasicReadMetaList(2), 2);
            SectionHeaderStyle sectionHeaderStyle2 = SectionHeaderStyle.Small;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new p(28);
                qVar.h0(L4);
            }
            CategorieReadsRowV3(lVar2, "Normal title", "elevenlabs://stub", b13, sectionHeaderStyle2, (l) L4, null, qVar, 221622, 64);
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new p(29);
                qVar.h0(L5);
            }
            l lVar3 = (l) L5;
            List<BasicReadMeta> stubBasicReadMetaList = ReadsFactoryKt.stubBasicReadMetaList(10);
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new fm.d(0);
                qVar.h0(L6);
            }
            CategorieReadsRowV3(lVar3, "Very long title that will definitely take some space, a line or two but honestly who need that long title", "elevenlabs://stub", stubBasicReadMetaList, sectionHeaderStyle, (l) L6, null, qVar, 221622, 64);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 0);
        }
    }

    public static final z Preview_CategorieReadsRowV3$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_CategorieReadsRowV3$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_CategorieReadsRowV3$lambda$0$2$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_CategorieReadsRowV3$lambda$0$3$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_CategorieReadsRowV3$lambda$0$4$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_CategorieReadsRowV3$lambda$0$5$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_CategorieReadsRowV3$lambda$1(int i10, m mVar, int i11) {
        Preview_CategorieReadsRowV3(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void RegularReadItem(BasicReadMeta basicReadMeta, l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        q qVar = (q) mVar;
        qVar.Z(1655045014);
        if ((i10 & 6) == 0) {
            if (qVar.h(basicReadMeta)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z10 = false;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            int i14 = i11;
            String title = basicReadMeta.getTitle();
            if ((i14 & 112) == 32) {
                z10 = true;
            }
            boolean h10 = qVar.h(basicReadMeta) | z10;
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new a2.q(lVar, basicReadMeta, 8);
                qVar.h0(L);
            }
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, (ho.a) L, i3.q.f13017a, 0L, false, 0, null, false, null, k.d(1990719098, true, new b(basicReadMeta, 0), qVar), qVar, 805306752, 504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i(basicReadMeta, lVar, i10, 2);
        }
    }

    public static final z RegularReadItem$lambda$0$0(l lVar, BasicReadMeta basicReadMeta) {
        lVar.invoke(basicReadMeta.getReadId());
        return z.f31622a;
    }

    public static final z RegularReadItem$lambda$1(BasicReadMeta basicReadMeta, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i1 i1Var = i1.f29224a;
            i3.q qVar2 = i3.q.f13017a;
            t M = d.M(qVar2, i1Var);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(M, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
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
            String title = basicReadMeta.getTitle();
            String imageUrl = basicReadMeta.getImageUrl();
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            ReadItemCoverKt.ReadItemCover(title, imageUrl, d.j(p2.f(BoxShadowKt.boxShadow(qVar2, elevenLabsTheme.getShadows(qVar, i11).getLg(), elevenLabsTheme.getShapes(qVar, i11).getSm(), true, qVar, 3078, 0), 136), 0.6691176f, false), qVar, 0);
            d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM()), qVar);
            j7.d(basicReadMeta.getTitle(), p2.e(qVar2, 1.0f), defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, new e5.k(3), 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyTiny500(), qVar, 48, 24960, 109560);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z RegularReadItem$lambda$2(BasicReadMeta basicReadMeta, l lVar, int i10, m mVar, int i11) {
        RegularReadItem(basicReadMeta, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void SeeMoreItem(BasicReadMeta basicReadMeta, String str, l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        boolean z10;
        int i12;
        int i13;
        int i14;
        q qVar2 = (q) mVar;
        qVar2.Z(-2135699251);
        if ((i10 & 6) == 0) {
            if (qVar2.h(basicReadMeta)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z11 = false;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            String R = kj.c.R(qVar2, R.string.reads_row_see_more);
            if ((i11 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 112) == 32) {
                z11 = true;
            }
            boolean z12 = z10 | z11;
            Object L = qVar2.L();
            if (z12 || L == u2.l.f33918a) {
                L = new fm.a(0, lVar, str);
                qVar2.h0(L);
            }
            qVar = qVar2;
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(R, (ho.a) L, m3.h.c(i3.q.f13017a, ElevenLabsTheme.INSTANCE.getShapes(qVar2, ElevenLabsTheme.$stable).getSm()), 0L, false, 0, null, false, null, k.d(-752927895, true, new b(basicReadMeta, 1), qVar2), qVar, 805306368, 504);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 4, basicReadMeta, str, lVar);
        }
    }

    public static final z SeeMoreItem$lambda$0$0(l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z SeeMoreItem$lambda$1(BasicReadMeta basicReadMeta, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            float m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM();
            i3.q qVar2 = i3.q.f13017a;
            float f10 = 84;
            t s10 = p2.s(d.E(qVar2, m2353getX2D9Ej5fM), f10);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(s10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            e eVar = g.f11907f;
            r.J(eVar, a10, qVar);
            e eVar2 = g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            e eVar3 = g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            e eVar4 = g.f11905d;
            r.J(eVar4, c5, qVar);
            float f11 = 125;
            t h10 = n.h(m3.h.c(p2.f(p2.s(qVar2, f10), f11), elevenLabsTheme.getShapes(qVar, i11).getSm()), elevenLabsTheme.getColor(qVar, i11).getBackground().m2004getReadCover0d7_KjU(), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            float f12 = 24;
            ReadItemCoverKt.ReadItemCover(basicReadMeta.getTitle(), basicReadMeta.getImageUrl(), m3.h.c(p2.f(p2.s(d.A(m3.h.i(qVar2, -9.0f), f12, f12), f10), f11), elevenLabsTheme.getShapes(qVar, i11).getSm()), qVar, 0);
            qVar.p(true);
            d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.reads_row_see_more), p2.e(qVar2, 1.0f), defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, new e5.k(3), 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyTiny500(), qVar, 48, 24960, 109560);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SeeMoreItem$lambda$2(BasicReadMeta basicReadMeta, String str, l lVar, int i10, m mVar, int i11) {
        SeeMoreItem(basicReadMeta, str, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
