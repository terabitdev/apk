package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.readerapp.ui.formatter.TimeAgoFormatterKt;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.RowWithInvertedMeasurementKt;
import io.elevenlabs.ui.components.UnreadIndicatorKt;
import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/domain/model/CollectionMeta;", "meta", "Ljava/util/Date;", "now", "Lsn/z;", "CollectionMetaRow", "(Lio/elevenlabs/domain/model/CollectionMeta;Ljava/util/Date;Lu2/m;I)V", "Preview_CollectionMetaRow", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionMetaRowKt {
    public static final void CollectionMetaRow(CollectionMeta collectionMeta, Date date, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        final CollectionMeta collectionMeta2;
        final Date date2;
        u2.q qVar;
        int i12;
        u2.q qVar2;
        int i13;
        int i14;
        collectionMeta.getClass();
        date.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-824157176);
        if ((i10 & 6) == 0) {
            if (qVar3.h(collectionMeta)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i10 | i14;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(date)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i11 & 1, z6)) {
            i3.q qVar4 = i3.q.f13017a;
            i3.t t10 = r1.d.t(p2.e(qVar4, 1.0f), r1.i1.f29224a);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            i3.t F = r1.d.F(t10, elevenLabsTheme.getSpacings(qVar3, i15).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar3, i15).m2356getX4D9Ej5fM());
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13004y0, qVar3, 0);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c5 = i3.a.c(F, qVar3);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar3);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar3, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar3);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar3);
            i3.t c10 = m3.h.c(p2.o(qVar4, 100), elevenLabsTheme.getShapes(qVar3, i15).getMd());
            long m2004getReadCover0d7_KjU = elevenLabsTheme.getColor(qVar3, i15).getBackground().m2004getReadCover0d7_KjU();
            p3.w0 w0Var = p3.h0.f26395b;
            i3.t h10 = l1.n.h(c10, m2004getReadCover0d7_KjU, w0Var);
            i3.l lVar = i3.d.f13001e;
            f4.f1 d10 = r1.p.d(lVar, false);
            int hashCode2 = Long.hashCode(qVar3.T);
            c3.o l7 = qVar3.l();
            i3.t c11 = i3.a.c(h10, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar, d10, qVar3);
            u2.r.J(eVar2, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
            u2.r.J(eVar4, c11, qVar3);
            float f10 = (float) 3.84d;
            float f11 = (float) (-0.77d);
            float f12 = (float) 1.15d;
            float f13 = (float) 5.75d;
            float f14 = (float) 0.19d;
            float f15 = (float) 2.3d;
            long floatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
            float f16 = (float) (-1.92d);
            r1.d.g(p2.d(l1.n.h(m3.h.c(BoxShadowKt.boxShadow$default(r1.d.H(qVar4, elevenLabsTheme.getSpacings(qVar3, i15).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar3, i15).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar3, i15).m2353getX2D9Ej5fM(), elevenLabsTheme.getSpacings(qVar3, i15).m2353getX2D9Ej5fM()), new BoxShadow[]{new BoxShadow(p3.h0.c(201326592), (float) 5.37d, (float) (-3.07d), (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits((float) 8.25d) & 4294967295L), false, 16, null), new BoxShadow(p3.h0.c(1056964608), f10, t2.u.P, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), false, 20, null), new BoxShadow(p3.h0.c(855638016), f13, f16, floatToRawIntBits, false, 16, null)}, null, false, 6, null), elevenLabsTheme.getShapes(qVar3, i15).getSm()), elevenLabsTheme.getColor(qVar3, i15).getBackground().m2003getPrimary0d7_KjU(), w0Var), 1.0f), qVar3);
            i3.t d11 = p2.d(l1.n.h(m3.h.c(BoxShadowKt.boxShadow$default(r1.d.E(qVar4, elevenLabsTheme.getSpacings(qVar3, i15).m2355getX3D9Ej5fM()), new BoxShadow[]{new BoxShadow(p3.h0.c(1056964608), f10, t2.u.P, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), false, 20, null), new BoxShadow(p3.h0.c(855638016), f13, f16, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), false, 16, null)}, null, false, 6, null), elevenLabsTheme.getShapes(qVar3, i15).getSm()), elevenLabsTheme.getColor(qVar3, i15).getBackground().m2003getPrimary0d7_KjU(), w0Var), 1.0f);
            f4.f1 d12 = r1.p.d(lVar, false);
            int hashCode3 = Long.hashCode(qVar3.T);
            c3.o l10 = qVar3.l();
            i3.t c12 = i3.a.c(d11, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar, d12, qVar3);
            u2.r.J(eVar2, l10, qVar3);
            defpackage.f.u(hashCode3, qVar3, eVar3, qVar3, dVar);
            u2.r.J(eVar4, c12, qVar3);
            if (collectionMeta.getImageUrl() != null) {
                qVar3.X(1360927810);
                ad.h hVar = new ad.h((Context) qVar3.j(AndroidCompositionLocals_androidKt.f2291b));
                hVar.f1788c = collectionMeta.getImageUrl();
                hVar.b();
                i12 = i15;
                qc.m.b(hVar.a(), null, m3.h.c(r1.d.E(p2.d(qVar4, 1.0f), elevenLabsTheme.getSpacings(qVar3, i15).m2349getX05D9Ej5fM()), elevenLabsTheme.getShapes(qVar3, i15).getXs()), null, f4.q.f8839b, null, qVar3, 1572912, 4024);
                qVar2 = qVar3;
                qVar2.p(false);
            } else {
                i12 = i15;
                qVar2 = qVar3;
                qVar2.X(1361544865);
                y2.a(kd.a.M(RememberCollectionIconKt.rememberCollectionIcon(collectionMeta.getId(), collectionMeta.getIcon(), qVar2, 0), qVar2, 0), null, p2.o(qVar4, elevenLabsTheme.getSpacings(qVar2, i12).m2360getX8D9Ej5fM()), defpackage.f.b(elevenLabsTheme, qVar2, i12), qVar2, u3.c.$stable | 48, 0);
                qVar2.p(false);
            }
            qVar2.p(true);
            qVar2.p(true);
            r1.d.g(p2.s(qVar4, elevenLabsTheme.getSpacings(qVar2, i12).m2355getX3D9Ej5fM()), qVar2);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            collectionMeta2 = collectionMeta;
            date2 = date;
            u2.q qVar5 = qVar2;
            RowWithInvertedMeasurementKt.RowWithInvertedMeasurement(new m1(1.0f, true), null, i3.d.f13005z0, c3.k.d(-1628057563, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.components.h
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    sn.z CollectionMetaRow$lambda$0$1;
                    int intValue = ((Integer) obj3).intValue();
                    CollectionMetaRow$lambda$0$1 = CollectionMetaRowKt.CollectionMetaRow$lambda$0$1(CollectionMeta.this, date2, (l2) obj, (u2.m) obj2, intValue);
                    return CollectionMetaRow$lambda$0$1;
                }
            }, qVar2), qVar5, 3456, 2);
            qVar = qVar5;
            qVar.p(true);
        } else {
            collectionMeta2 = collectionMeta;
            date2 = date;
            qVar = qVar3;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(collectionMeta2, date2, i10, 8);
        }
    }

    public static final sn.z CollectionMetaRow$lambda$0$1(CollectionMeta collectionMeta, Date date, l2 l2Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        float f10;
        i3.q qVar;
        int i12;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            u3.c M = kd.a.M(R.drawable.chevron_right, qVar2, 0);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            long w6 = ib.i.w(elevenLabsTheme, qVar2, i13);
            i3.q qVar3 = i3.q.f13017a;
            y2.a(M, null, p2.o(qVar3, 15), w6, qVar2, u3.c.$stable | 432, 0);
            r1.d.g(p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, i13).m2353getX2D9Ej5fM()), qVar2);
            float f11 = 1.0f;
            i3.t c5 = p2.c(l2Var.b(qVar3, 1.0f, true), 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c10 = i3.a.c(c5, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c10, qVar2);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
            }
            r1.d.g(new m1(f10, true), qVar2);
            r1.d.g(p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, i13).m2350getX1D9Ej5fM()), qVar2);
            RowWithInvertedMeasurementKt.RowWithInvertedMeasurement(null, null, i3.d.f13005z0, c3.k.d(565482426, true, new g(collectionMeta, 1), qVar2), qVar2, 3456, 3);
            u2.q qVar4 = qVar2;
            boolean f12 = qVar4.f(collectionMeta.getCategory());
            Object L = qVar4.L();
            if (f12 || L == u2.l.f33918a) {
                String category = collectionMeta.getCategory();
                if (category != null) {
                    if (category.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf = String.valueOf(category.charAt(0));
                        valueOf.getClass();
                        String upperCase = valueOf.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        sb.append((Object) upperCase);
                        sb.append(category.substring(1));
                        category = sb.toString();
                    }
                } else {
                    category = null;
                }
                L = category;
                qVar4.h0(L);
            }
            String str = (String) L;
            if (str == null || wq.n.m0(str)) {
                qVar = qVar3;
                qVar4.X(1778517031);
                qVar4.p(false);
            } else {
                qVar4.X(1778210875);
                qVar = qVar3;
                j7.d(str, null, ib.i.w(elevenLabsTheme, qVar4, i13), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar4, i13).getBodySmall500(), qVar4, 0, 24960, 110586);
                qVar4 = qVar4;
                qVar4.p(false);
            }
            String subtitle = collectionMeta.getSubtitle();
            if (subtitle != null && !wq.n.m0(subtitle)) {
                qVar4.X(1778622431);
                r1.d.g(p2.f(qVar, elevenLabsTheme.getSpacings(qVar4, i13).m2350getX1D9Ej5fM()), qVar4);
                u2.q qVar5 = qVar4;
                j7.d(subtitle, null, ib.i.w(elevenLabsTheme, qVar4, i13), 0L, null, 0L, null, 0L, 2, false, 3, 0, null, elevenLabsTheme.getTypo(qVar4, i13).getBodySmall500(), qVar5, 0, 24960, 110586);
                qVar4 = qVar5;
                qVar4.p(false);
            } else {
                qVar4.X(1779029895);
                qVar4.p(false);
            }
            Date updatedAt = collectionMeta.getUpdatedAt();
            if (updatedAt != null) {
                qVar4.X(1779134055);
                r1.d.g(p2.f(qVar, elevenLabsTheme.getSpacings(qVar4, i13).m2350getX1D9Ej5fM()), qVar4);
                u2.q qVar6 = qVar4;
                j7.d(kj.c.Q(io.elevenlabs.readerapp.R.string.collection_last_updated_days_ago, new Object[]{TimeAgoFormatterKt.formatTimeAgoSince(updatedAt, date, qVar4, 0)}, qVar4), null, ib.i.w(elevenLabsTheme, qVar4, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar4, i13).getBodyXSmall500(), qVar6, 0, 0, 131066);
                qVar4 = qVar6;
                qVar4.p(false);
            } else {
                qVar4.X(1779626087);
                qVar4.p(false);
            }
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            }
            r1.d.g(new m1(f11, true), qVar4);
            qVar4.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionMetaRow$lambda$0$1$0$0(CollectionMeta collectionMeta, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (collectionMeta.getHasUnread()) {
                qVar.X(1425264091);
                UnreadIndicatorKt.UnreadIndicator(qVar, 0);
                r1.d.g(p2.s(i3.q.f13017a, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2350getX1D9Ej5fM()), qVar);
                qVar.p(false);
            } else {
                qVar.X(1425399592);
                qVar.p(false);
            }
            String title = collectionMeta.getTitle();
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            j7.d(title, null, defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium700(), qVar, 0, 24960, 110586);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionMetaRow$lambda$1(CollectionMeta collectionMeta, Date date, int i10, u2.m mVar, int i11) {
        CollectionMetaRow(collectionMeta, date, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionMetaRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-279885014);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.u0 u0Var = r1.j.f29228a;
            r1.h n2 = ib.i.n(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable);
            i3.t y10 = l1.n.y(i3.q.f13017a, l1.n.x(qVar), true, true);
            r1.x a10 = r1.w.a(n2, i3.d.B0, qVar, 0);
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
            CollectionMetaRow(CollectionFactoryKt.stubCollectionMeta(), new Date(1729581652L), qVar, 0);
            CollectionMetaRow(CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, "https://placehold.co/600x400", false, null, null, null, null, false, null, 4079, null), new Date(1729581652L), qVar, 0);
            CollectionMetaRow(CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, "Andreessen Horowitz (aka a16z) is a venture capital firm that backs bold entrepreneurs.", null, null, false, null, null, "Feed", null, false, null, 3835, null), new Date(1729581652L), qVar, 0);
            CollectionMetaRow(CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, "Andreessen Horowitz (aka a16z) is a venture capital firm that backs bold entrepreneurs.", null, null, true, null, null, "Feed", null, false, null, 3803, null), new Date(1729581652L), qVar, 0);
            CollectionMetaRow(CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, "Very long title that unfolds into two lines", "Andreessen Horowitz (aka a16z) is a venture capital firm that backs bold entrepreneurs.", null, null, true, null, null, "Feed", null, false, null, 3801, null), new Date(1729581652L), qVar, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 28);
        }
    }

    public static final sn.z Preview_CollectionMetaRow$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionMetaRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
