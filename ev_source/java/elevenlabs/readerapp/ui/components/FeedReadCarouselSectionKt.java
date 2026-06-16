package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.Rating;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.ui.formatter.RateFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.WordCountToLengthFormatterKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.components.SectionHeaderKt;
import io.elevenlabs.ui.components.SectionHeaderStyle;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aU\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001a²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, d2 = {"", "title", "deeplink", "", "Lio/elevenlabs/domain/model/ReadMeta;", "reads", "Lkotlin/Function1;", "Lsn/z;", "onNavigateToDeeplink", "onItemClick", "FeedReadCarouselSection", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lho/l;Lho/l;Lu2/m;I)V", "read", "Lkotlin/Function0;", "Li3/t;", "modifier", "FeedReadCarouselItem", "(Lio/elevenlabs/domain/model/ReadMeta;Lho/a;Li3/t;Lu2/m;II)V", "buildCaptionMeta", "(Lio/elevenlabs/domain/model/ReadMeta;Lu2/m;I)Ljava/lang/String;", "Preview_FeedReadCarouselSection", "(Lu2/m;I)V", "Lh5/l;", "carouselSize", "", "boxHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FeedReadCarouselSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FeedReadCarouselItem(ReadMeta readMeta, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        i3.t tVar2;
        int i13;
        boolean z6;
        ReadMeta readMeta2;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        ElevenLabsTheme elevenLabsTheme;
        int i14;
        float f10;
        long j4;
        int i15;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1848894115);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            aVar2 = aVar;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i17 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = new u2.e1(t2.u.P);
                    qVar.h0(L);
                }
                u2.w0 w0Var = (u2.w0) L;
                i3.t s10 = p2.s(tVar4, RpcError.MAX_MESSAGE_BYTES);
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                i3.t p10 = l1.n.p(m3.h.c(s10, elevenLabsTheme2.getShapes(qVar, i18).getLg()), false, null, null, null, aVar2, 15);
                boolean h10 = qVar.h(readMeta);
                Object L2 = qVar.L();
                if (h10 || L2 == eVar) {
                    L2 = new a2.b(readMeta, 25);
                    qVar.h0(L2);
                }
                i3.t c5 = p4.q.c(p10, true, (ho.l) L2);
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
                h4.e eVar2 = h4.g.f11907f;
                u2.r.J(eVar2, d10, qVar);
                h4.e eVar3 = h4.g.f11906e;
                u2.r.J(eVar3, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar4 = h4.g.f11908g;
                u2.r.y(qVar, valueOf, eVar4);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar);
                h4.e eVar5 = h4.g.f11905d;
                u2.r.J(eVar5, c10, qVar);
                ad.h hVar = new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
                hVar.f1788c = ReadMetaKt.coverImageUrl(readMeta, CoverImageSize.Medium);
                hVar.b();
                int i19 = i12;
                i3.t tVar5 = tVar4;
                qc.m.b(hVar.a(), null, p2.f(p2.e(qVar2, 1.0f), 200), null, f4.q.f8839b, null, qVar, 1573296, 4024);
                i3.t a10 = r1.t.f29349a.a();
                Object L3 = qVar.L();
                if (L3 == eVar) {
                    L3 = new s(w0Var, 0);
                    qVar.h0(L3);
                }
                r1.p.a(l1.n.g(f4.i0.p(a10, (ho.l) L3), p3.s.b(p3.t.Companion, ig.f.I(new p3.x(p3.x.f26437l), new p3.x(p3.x.f26427b)), t2.u.P, FeedReadCarouselItem$lambda$1(w0Var) * 0.5f, 8), null, 6), qVar, 0);
                float f11 = 16;
                i3.t H = r1.d.H(p2.e(qVar2, 1.0f), f11, 142, f11, f11);
                r1.x a11 = r1.w.a(r1.j.g(6), i3.d.B0, qVar, 6);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c11 = i3.a.c(H, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar2, a11, qVar);
                u2.r.J(eVar3, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                u2.r.J(eVar5, c11, qVar);
                String author = readMeta.getAuthor();
                if (author == null) {
                    qVar.X(-1294567397);
                    qVar.p(false);
                    f10 = 0.5f;
                    elevenLabsTheme = elevenLabsTheme2;
                    i14 = i18;
                } else {
                    qVar.X(-1294567396);
                    elevenLabsTheme = elevenLabsTheme2;
                    i14 = i18;
                    f10 = 0.5f;
                    j7.d(author, null, p3.x.b(0.6f, p3.x.f26431f), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar, i14).getBodySmall500(), qVar, 384, 24960, 110586);
                    qVar = qVar;
                    qVar.p(false);
                }
                String title = readMeta.getTitle();
                s4.y0 subtitleMedium700 = elevenLabsTheme.getTypo(qVar, i14).getSubtitleMedium700();
                long j10 = p3.x.f26431f;
                u2.q qVar3 = qVar;
                j7.d(title, null, j10, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, subtitleMedium700, qVar3, 384, 24960, 110586);
                u2.q qVar4 = qVar3;
                String description = readMeta.getDescription();
                if (description == null) {
                    qVar4.X(-1293990053);
                    qVar4.p(false);
                    j4 = j10;
                } else {
                    qVar4.X(-1293990052);
                    j4 = j10;
                    j7.d(description, null, p3.x.b(f10, j10), 0L, null, 0L, null, 0L, 2, false, 3, 0, null, elevenLabsTheme.getTypo(qVar4, i14).getBodyXSmall400(), qVar4, 384, 24960, 110586);
                    qVar4 = qVar4;
                    qVar4.p(false);
                }
                readMeta2 = readMeta;
                u2.q qVar5 = qVar4;
                j7.d(buildCaptionMeta(readMeta2, qVar4, i19 & 14), null, p3.x.b(f10, j4), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar4, i14).getBodyXSmall500(), qVar5, 384, 24960, 110586);
                qVar = qVar5;
                qVar.p(true);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                readMeta2 = readMeta;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(readMeta2, aVar, tVar3, i10, i11, 10);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final float FeedReadCarouselItem$lambda$1(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    private static final void FeedReadCarouselItem$lambda$2(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    public static final sn.z FeedReadCarouselItem$lambda$3$0(ReadMeta readMeta, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(readMeta.getTitle(), b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z FeedReadCarouselItem$lambda$4$0$0(u2.w0 w0Var, f4.f0 f0Var) {
        f0Var.getClass();
        FeedReadCarouselItem$lambda$2(w0Var, (int) (f0Var.k() & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z FeedReadCarouselItem$lambda$5(ReadMeta readMeta, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        FeedReadCarouselItem(readMeta, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [i3.t] */
    public static final void FeedReadCarouselSection(String str, String str2, List<ReadMeta> list, ho.l lVar, ho.l lVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.l lVar3;
        u2.q qVar;
        boolean z10;
        h5.c cVar;
        i3.q qVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        str.getClass();
        str2.getClass();
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(1876434761);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.f(str2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(list)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(lVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.h(lVar2)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i11 & 1, z6)) {
            Object L = qVar3.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = u2.r.A(null);
                qVar3.h0(L);
            }
            u2.z0 z0Var = (u2.z0) L;
            h5.c cVar2 = (h5.c) qVar3.j(i4.j1.f13129h);
            i3.q qVar4 = i3.q.f13017a;
            float f10 = 16;
            i3.t G = r1.d.G(p2.e(qVar4, 1.0f), t2.u.P, f10, 1);
            r1.x a10 = r1.w.a(r1.j.g(f10), i3.d.B0, qVar3, 6);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c5 = i3.a.c(G, qVar3);
            h4.h.f11920i.getClass();
            int i17 = i11;
            h4.f fVar = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar3);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar3, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar3);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c5, qVar3);
            qVar = qVar3;
            int i18 = i17 << 3;
            h5.c cVar3 = cVar2;
            SectionHeaderKt.SectionHeader(lVar, str, str2, SectionHeaderStyle.Large, qVar, (i18 & 896) | ((i17 >> 9) & 14) | 3072 | (i18 & 112));
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a2.y(z0Var, 9);
                qVar.h0(L2);
            }
            i3.t q = f4.i0.q(qVar4, (ho.l) L2);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(q, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, d10, qVar);
            u2.r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c10, qVar);
            r1.h g10 = r1.j.g(8);
            i3.t G2 = r1.d.G(l1.n.t(qVar4, l1.n.x(qVar), 14), 20, t2.u.P, 2);
            k2 a11 = i2.a(g10, i3.d.f13004y0, qVar, 6);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(G2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a11, qVar);
            u2.r.J(eVar3, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
            Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c11, eVar5, 2073337045, list);
            while (s10.hasNext()) {
                ReadMeta readMeta = (ReadMeta) s10.next();
                h5.l FeedReadCarouselSection$lambda$1 = FeedReadCarouselSection$lambda$1(z0Var);
                if ((i17 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean h10 = qVar.h(readMeta) | z10;
                Object L3 = qVar.L();
                if (h10 || L3 == eVar) {
                    L3 = new t(lVar2, readMeta, 0);
                    qVar.h0(L3);
                }
                ho.a aVar = (ho.a) L3;
                if (FeedReadCarouselSection$lambda$1 != null) {
                    cVar = cVar3;
                    qVar2 = p2.f(qVar4, cVar.S((int) (FeedReadCarouselSection$lambda$1.f12092a & 4294967295L)));
                } else {
                    cVar = cVar3;
                    qVar2 = qVar4;
                }
                u2.q qVar5 = qVar;
                FeedReadCarouselItem(readMeta, aVar, qVar2, qVar5, 0, 0);
                cVar3 = cVar;
                qVar = qVar5;
            }
            lVar3 = lVar2;
            qVar.p(false);
            qVar.p(true);
            qVar.p(true);
            qVar.p(true);
        } else {
            lVar3 = lVar2;
            qVar = qVar3;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.f(str, str2, list, lVar, lVar3, i10, 1);
        }
    }

    private static final h5.l FeedReadCarouselSection$lambda$1(u2.z0 z0Var) {
        return (h5.l) z0Var.getValue();
    }

    public static final sn.z FeedReadCarouselSection$lambda$3$0$0(u2.z0 z0Var, h5.l lVar) {
        z0Var.setValue(lVar);
        return sn.z.f31622a;
    }

    public static final sn.z FeedReadCarouselSection$lambda$3$1$0$0$0$0(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(readMeta);
        return sn.z.f31622a;
    }

    public static final sn.z FeedReadCarouselSection$lambda$4(String str, String str2, List list, ho.l lVar, ho.l lVar2, int i10, u2.m mVar, int i11) {
        FeedReadCarouselSection(str, str2, list, lVar, lVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_FeedReadCarouselSection(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        ReadMeta copy2;
        ReadMeta copy3;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1191029034);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r7.copy((r84 & 1) != 0 ? r7.articleImageUrl : null, (r84 & 2) != 0 ? r7.author : "John Doe", (r84 & 4) != 0 ? r7.chapters : null, (r84 & 8) != 0 ? r7.charCount : 0L, (r84 & 16) != 0 ? r7.createdAt : null, (r84 & 32) != 0 ? r7.updatedAt : null, (r84 & 64) != 0 ? r7.addedAt : null, (r84 & 128) != 0 ? r7.description : "This is a sample description for the first article that spans multiple lines to show how it handles longer text.", (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r7.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r7.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r7.source : null, (r84 & 2048) != 0 ? r7.title : "First Article", (r84 & 4096) != 0 ? r7.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r7.url : null, (r84 & 16384) != 0 ? r7.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r7.originalFileType : null, (r84 & 65536) != 0 ? r7.hasOriginalAudio : false, (r84 & 131072) != 0 ? r7.matureContent : false, (r84 & 262144) != 0 ? r7.origin : null, (r84 & 524288) != 0 ? r7.contentType : null, (r84 & 1048576) != 0 ? r7.genre : null, (r84 & 2097152) != 0 ? r7.isBookType : false, (r84 & 4194304) != 0 ? r7.fromUserImport : false, (r84 & 8388608) != 0 ? r7.rating : new Rating(4.5f, 123L), (r84 & 16777216) != 0 ? r7.userRating : null, (r84 & 33554432) != 0 ? r7.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r7.creationStatus : null, (r84 & 134217728) != 0 ? r7.creationProgress : null, (r84 & 268435456) != 0 ? r7.isArchived : false, (r84 & 536870912) != 0 ? r7.markedAsUnread : false, (r84 & 1073741824) != 0 ? r7.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r7.publicationDate : null, (r85 & 1) != 0 ? r7.language : null, (r85 & 2) != 0 ? r7.publisherProfileId : null, (r85 & 4) != 0 ? r7.canDelete : false, (r85 & 8) != 0 ? r7.androidProductId : null, (r85 & 16) != 0 ? r7.isPaid : false, (r85 & 32) != 0 ? r7.offlineReadData : null, (r85 & 64) != 0 ? r7.previewAudio : null, (r85 & 128) != 0 ? r7.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r7.voiceSelectionConfig : null, (r85 & 512) != 0 ? r7.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r7.displayMode : null, (r85 & 2048) != 0 ? r7.inUserLibrary : false, (r85 & 4096) != 0 ? r7.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r7.audioType : null, (r85 & 16384) != 0 ? r7.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r7.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r7.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r7.audioDurationSeconds : null, (r85 & 262144) != 0 ? r7.audioTypes : null, (r85 & 524288) != 0 ? r7.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r7.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r7.coverImageUrls : null, (r85 & 4194304) != 0 ? r7.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            copy2 = r7.copy((r84 & 1) != 0 ? r7.articleImageUrl : null, (r84 & 2) != 0 ? r7.author : "Jane Smith", (r84 & 4) != 0 ? r7.chapters : null, (r84 & 8) != 0 ? r7.charCount : 0L, (r84 & 16) != 0 ? r7.createdAt : null, (r84 & 32) != 0 ? r7.updatedAt : null, (r84 & 64) != 0 ? r7.addedAt : null, (r84 & 128) != 0 ? r7.description : "Another sample description for testing purposes.", (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r7.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r7.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r7.source : null, (r84 & 2048) != 0 ? r7.title : "Second Article with a Very Long Title That Should Truncate", (r84 & 4096) != 0 ? r7.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r7.url : null, (r84 & 16384) != 0 ? r7.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r7.originalFileType : null, (r84 & 65536) != 0 ? r7.hasOriginalAudio : false, (r84 & 131072) != 0 ? r7.matureContent : false, (r84 & 262144) != 0 ? r7.origin : null, (r84 & 524288) != 0 ? r7.contentType : null, (r84 & 1048576) != 0 ? r7.genre : null, (r84 & 2097152) != 0 ? r7.isBookType : false, (r84 & 4194304) != 0 ? r7.fromUserImport : false, (r84 & 8388608) != 0 ? r7.rating : new Rating(3.8f, 45L), (r84 & 16777216) != 0 ? r7.userRating : null, (r84 & 33554432) != 0 ? r7.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r7.creationStatus : null, (r84 & 134217728) != 0 ? r7.creationProgress : null, (r84 & 268435456) != 0 ? r7.isArchived : false, (r84 & 536870912) != 0 ? r7.markedAsUnread : false, (r84 & 1073741824) != 0 ? r7.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r7.publicationDate : null, (r85 & 1) != 0 ? r7.language : null, (r85 & 2) != 0 ? r7.publisherProfileId : null, (r85 & 4) != 0 ? r7.canDelete : false, (r85 & 8) != 0 ? r7.androidProductId : null, (r85 & 16) != 0 ? r7.isPaid : false, (r85 & 32) != 0 ? r7.offlineReadData : null, (r85 & 64) != 0 ? r7.previewAudio : null, (r85 & 128) != 0 ? r7.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r7.voiceSelectionConfig : null, (r85 & 512) != 0 ? r7.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r7.displayMode : null, (r85 & 2048) != 0 ? r7.inUserLibrary : false, (r85 & 4096) != 0 ? r7.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r7.audioType : null, (r85 & 16384) != 0 ? r7.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r7.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r7.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r7.audioDurationSeconds : null, (r85 & 262144) != 0 ? r7.audioTypes : null, (r85 & 524288) != 0 ? r7.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r7.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r7.coverImageUrls : null, (r85 & 4194304) != 0 ? r7.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            copy3 = r7.copy((r84 & 1) != 0 ? r7.articleImageUrl : null, (r84 & 2) != 0 ? r7.author : null, (r84 & 4) != 0 ? r7.chapters : null, (r84 & 8) != 0 ? r7.charCount : 0L, (r84 & 16) != 0 ? r7.createdAt : null, (r84 & 32) != 0 ? r7.updatedAt : null, (r84 & 64) != 0 ? r7.addedAt : null, (r84 & 128) != 0 ? r7.description : "Short description", (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r7.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r7.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r7.source : null, (r84 & 2048) != 0 ? r7.title : "Third Article", (r84 & 4096) != 0 ? r7.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r7.url : null, (r84 & 16384) != 0 ? r7.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r7.originalFileType : null, (r84 & 65536) != 0 ? r7.hasOriginalAudio : false, (r84 & 131072) != 0 ? r7.matureContent : false, (r84 & 262144) != 0 ? r7.origin : null, (r84 & 524288) != 0 ? r7.contentType : null, (r84 & 1048576) != 0 ? r7.genre : null, (r84 & 2097152) != 0 ? r7.isBookType : false, (r84 & 4194304) != 0 ? r7.fromUserImport : false, (r84 & 8388608) != 0 ? r7.rating : null, (r84 & 16777216) != 0 ? r7.userRating : null, (r84 & 33554432) != 0 ? r7.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r7.creationStatus : null, (r84 & 134217728) != 0 ? r7.creationProgress : null, (r84 & 268435456) != 0 ? r7.isArchived : false, (r84 & 536870912) != 0 ? r7.markedAsUnread : false, (r84 & 1073741824) != 0 ? r7.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r7.publicationDate : null, (r85 & 1) != 0 ? r7.language : null, (r85 & 2) != 0 ? r7.publisherProfileId : null, (r85 & 4) != 0 ? r7.canDelete : false, (r85 & 8) != 0 ? r7.androidProductId : null, (r85 & 16) != 0 ? r7.isPaid : false, (r85 & 32) != 0 ? r7.offlineReadData : null, (r85 & 64) != 0 ? r7.previewAudio : null, (r85 & 128) != 0 ? r7.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r7.voiceSelectionConfig : null, (r85 & 512) != 0 ? r7.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r7.displayMode : null, (r85 & 2048) != 0 ? r7.inUserLibrary : false, (r85 & 4096) != 0 ? r7.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r7.audioType : null, (r85 & 16384) != 0 ? r7.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r7.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r7.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r7.audioDurationSeconds : null, (r85 & 262144) != 0 ? r7.audioTypes : null, (r85 & 524288) != 0 ? r7.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r7.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r7.coverImageUrls : null, (r85 & 4194304) != 0 ? r7.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            List I = ig.f.I(copy, copy2, copy3);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.highlighter.z(27);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.highlighter.z(28);
                qVar.h0(L2);
            }
            FeedReadCarouselSection("Featured Articles", "elevenlabs://collection/some-collection", I, lVar, (ho.l) L2, qVar, 27702);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 3);
        }
    }

    public static final sn.z Preview_FeedReadCarouselSection$lambda$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_FeedReadCarouselSection$lambda$1$0(ReadMeta readMeta) {
        readMeta.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_FeedReadCarouselSection$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_FeedReadCarouselSection(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final String buildCaptionMeta(ReadMeta readMeta, u2.m mVar, int i10) {
        String format = new SimpleDateFormat("MMM dd", Locale.getDefault()).format(readMeta.getAddedAt());
        ArrayList arrayList = new ArrayList();
        format.getClass();
        arrayList.add(format);
        arrayList.add(WordCountToLengthFormatterKt.charCountToTextDuration(readMeta.getCharCount(), mVar, 0));
        Rating rating = readMeta.getRating();
        u2.q qVar = (u2.q) mVar;
        if (rating == null) {
            qVar.X(-706369592);
            qVar.p(false);
        } else {
            qVar.X(-706369591);
            arrayList.add(RateFormatterKt.formatRating(rating, qVar, 0));
            qVar.p(false);
        }
        return tn.o.E0(arrayList, " • ", null, null, null, 62);
    }
}
