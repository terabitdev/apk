package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.SectionHeaderKt;
import io.elevenlabs.ui.components.SectionHeaderStyle;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a]\u0010\f\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToDeeplink", "title", "deeplink", "", "Lio/elevenlabs/domain/model/CollectionMeta;", "collections", "Lio/elevenlabs/ui/components/SectionHeaderStyle;", "deeplinkHeaderStyle", "onNavigateToCollection", "CategorieCollectionsRow", "(Lho/l;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/elevenlabs/ui/components/SectionHeaderStyle;Lho/l;Lu2/m;I)V", "Preview_CategorieCollectionsRow", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CategorieCollectionRowKt {
    public static final void CategorieCollectionsRow(ho.l lVar, String str, String str2, List<CollectionMeta> list, SectionHeaderStyle sectionHeaderStyle, ho.l lVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.l lVar3;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        lVar.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        sectionHeaderStyle.getClass();
        lVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1211559423);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(list)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.d(sectionHeaderStyle.ordinal())) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(lVar2)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i18 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(e10, t2.u.P, elevenLabsTheme.getSpacings(qVar, i18).m2353getX2D9Ej5fM(), 1);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            int i19 = i11;
            SectionHeaderKt.SectionHeader(lVar, str, str2, sectionHeaderStyle, qVar, ((i19 >> 3) & 7168) | (i11 & 1022));
            i3.t G2 = r1.d.G(l1.n.t(qVar2, l1.n.x(qVar), 14), elevenLabsTheme.getSpacings(qVar, i18).m2357getX5D9Ej5fM(), t2.u.P, 2);
            boolean z11 = false;
            k2 a11 = i2.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i18).m2355getX3D9Ej5fM()), i3.d.f13004y0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(G2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c10, eVar4, 670144192, list);
            while (s10.hasNext()) {
                CollectionMeta collectionMeta = (CollectionMeta) s10.next();
                String title = collectionMeta.getTitle();
                if ((i19 & 458752) == 131072) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                boolean h10 = z10 | qVar.h(collectionMeta);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new y0(lVar2, collectionMeta, 2);
                    qVar.h0(L);
                }
                u2.q qVar3 = qVar;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, (ho.a) L, m3.h.c(qVar2, ElevenLabsTheme.INSTANCE.getShapes(qVar, ElevenLabsTheme.$stable).getSm()), 0L, false, 0, null, false, null, c3.k.d(-505335177, true, new g(collectionMeta, 0), qVar), qVar3, 805306368, 504);
                z11 = z11;
                qVar = qVar3;
            }
            lVar3 = lVar2;
            p.n.t(qVar, z11, true, true);
        } else {
            lVar3 = lVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.e(lVar, str, str2, list, sectionHeaderStyle, lVar3, i10, 3);
        }
    }

    public static final sn.z CategorieCollectionsRow$lambda$0$0$0$0$0(ho.l lVar, CollectionMeta collectionMeta) {
        lVar.invoke(collectionMeta.getId());
        return sn.z.f31622a;
    }

    public static final sn.z CategorieCollectionsRow$lambda$0$0$0$1(CollectionMeta collectionMeta, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 100;
            i3.q qVar2 = i3.q.f13017a;
            i3.t s10 = p2.s(qVar2, f10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(s10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            p3.b1 sm = elevenLabsTheme.getShapes(qVar, i11).getSm();
            i3.t h10 = l1.n.h(m3.h.c(BoxShadowKt.boxShadow(p2.o(qVar2, f10), elevenLabsTheme.getShadows(qVar, i11).getLg(), sm, false, qVar, 6, 4), sm), ib.i.d(elevenLabsTheme, qVar, i11), p3.h0.f26395b);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            ad.h hVar = new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
            hVar.f1788c = collectionMeta.getImageUrl();
            hVar.b();
            qc.m.b(hVar.a(), null, p2.d(qVar2, 1.0f), null, f4.q.f8839b, null, qVar, 1573296, 4024);
            qVar.p(true);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM()), qVar);
            j7.d(collectionMeta.getTitle(), p2.e(qVar2, 1.0f), defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, new e5.k(3), 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyTiny500(), qVar, 48, 24960, 109560);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CategorieCollectionsRow$lambda$1(ho.l lVar, String str, String str2, List list, SectionHeaderStyle sectionHeaderStyle, ho.l lVar2, int i10, u2.m mVar, int i11) {
        CategorieCollectionsRow(lVar, str, str2, list, sectionHeaderStyle, lVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CategorieCollectionsRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1261898723);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t y10 = l1.n.y(p2.e(i3.q.f13017a, 1.0f), l1.n.x(qVar), true, true);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(y10, qVar);
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
                L = new io.elevenlabs.highlighter.z(17);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            List b12 = tn.o.b1(CollectionFactoryKt.stubCollectionsList(), 1);
            SectionHeaderStyle sectionHeaderStyle = SectionHeaderStyle.Large;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.highlighter.z(18);
                qVar.h0(L2);
            }
            CategorieCollectionsRow(lVar, "Normal title", "elevenlabs://stub", b12, sectionHeaderStyle, (ho.l) L2, qVar, 221622);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.highlighter.z(19);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            List b13 = tn.o.b1(CollectionFactoryKt.stubCollectionsList(), 2);
            SectionHeaderStyle sectionHeaderStyle2 = SectionHeaderStyle.Small;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new io.elevenlabs.highlighter.z(20);
                qVar.h0(L4);
            }
            CategorieCollectionsRow(lVar2, "Normal title", "elevenlabs://stub", b13, sectionHeaderStyle2, (ho.l) L4, qVar, 221622);
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new io.elevenlabs.highlighter.z(21);
                qVar.h0(L5);
            }
            ho.l lVar3 = (ho.l) L5;
            List<CollectionMeta> stubCollectionsList = CollectionFactoryKt.stubCollectionsList();
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new io.elevenlabs.highlighter.z(22);
                qVar.h0(L6);
            }
            CategorieCollectionsRow(lVar3, "Very long title that will definitely take some space, a line or two but honestly who need that long title", "elevenlabs://stub", stubCollectionsList, sectionHeaderStyle, (ho.l) L6, qVar, 221622);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 27);
        }
    }

    public static final sn.z Preview_CategorieCollectionsRow$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CategorieCollectionsRow$lambda$0$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CategorieCollectionsRow$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CategorieCollectionsRow$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CategorieCollectionsRow$lambda$0$4$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CategorieCollectionsRow$lambda$0$5$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CategorieCollectionsRow$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CategorieCollectionsRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
