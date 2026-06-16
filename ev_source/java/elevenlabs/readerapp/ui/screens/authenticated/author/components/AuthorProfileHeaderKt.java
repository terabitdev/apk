package io.elevenlabs.readerapp.ui.screens.authenticated.author.components;

import a2.i;
import c3.k;
import c3.o;
import defpackage.b;
import h4.e;
import h4.f;
import h4.g;
import h4.h;
import i3.a;
import i3.t;
import i4.j1;
import i4.q2;
import io.elevenlabs.domain.model.AuthorProfileHeaderSection;
import io.elevenlabs.domain.model.AuthorProfileResourceTag;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.p;
import io.elevenlabs.readerapp.ui.components.AuthorPictureKt;
import io.elevenlabs.readerapp.ui.components.AuthorPictureSize;
import io.elevenlabs.readerapp.ui.components.ExpandableTextKt;
import io.elevenlabs.readerapp.ui.components.v;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.components.u1;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import java.util.Iterator;
import java.util.List;
import kj.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import r1.d;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.v0;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileSection$Header;", "header", "Li3/t;", "modifier", "Lsn/z;", "AuthorProfileHeader", "(Lio/elevenlabs/domain/model/AuthorProfileSection$Header;Li3/t;Lu2/m;II)V", "", "title", "value", "StatsColumn", "(Ljava/lang/String;Ljava/lang/String;Lu2/m;I)V", "", "Lio/elevenlabs/domain/model/AuthorProfileResourceTag;", "tags", "ResourceTagsRow", "(Ljava/util/List;Lu2/m;I)V", "Preview_AuthorProfileHeader", "(Lu2/m;I)V", "Preview_AuthorProfileHeader_MinimalInfo", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AuthorProfileHeaderKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0048  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthorProfileHeader(AuthorProfileSection.Header header, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        q qVar;
        r1 r10;
        t tVar4;
        ?? r22;
        boolean z10;
        i3.q qVar2;
        q qVar3;
        int i14;
        header.getClass();
        q qVar4 = (q) mVar;
        qVar4.Z(243026788);
        if ((i10 & 6) == 0) {
            if (qVar4.h(header)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar4.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar4.O(i12 & 1, z6)) {
                i3.q qVar5 = i3.q.f13017a;
                if (i15 != 0) {
                    tVar4 = qVar5;
                } else {
                    tVar4 = tVar2;
                }
                AuthorProfileHeaderSection data = header.getData();
                float f10 = 16;
                t G = d.G(d.G(p2.e(tVar4, 1.0f), 20, u.P, 2), u.P, f10, 1);
                x a10 = w.a(j.f29230c, i3.d.B0, qVar4, 0);
                int hashCode = Long.hashCode(qVar4.T);
                o l4 = qVar4.l();
                t c5 = a.c(G, qVar4);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                e eVar = g.f11907f;
                r.J(eVar, a10, qVar4);
                e eVar2 = g.f11906e;
                r.J(eVar2, l4, qVar4);
                Integer valueOf = Integer.valueOf(hashCode);
                e eVar3 = g.f11908g;
                r.y(qVar4, valueOf, eVar3);
                h4.d dVar = g.f11909h;
                r.F(dVar, qVar4);
                e eVar4 = g.f11905d;
                r.J(eVar4, c5, qVar4);
                t e10 = p2.e(qVar5, 1.0f);
                k2 a11 = i2.a(j.g(50), i3.d.f13005z0, qVar4, 54);
                int hashCode2 = Long.hashCode(qVar4.T);
                o l7 = qVar4.l();
                t c10 = a.c(e10, qVar4);
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                r.J(eVar, a11, qVar4);
                r.J(eVar2, l7, qVar4);
                defpackage.f.u(hashCode2, qVar4, eVar3, qVar4, dVar);
                r.J(eVar4, c10, qVar4);
                AuthorPictureKt.AuthorPicture(data.getAvatarUrl(), AuthorPictureSize.Large, null, qVar4, 48, 4);
                r1.h g10 = j.g(30);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                m1 m1Var = new m1(1.0f, true);
                k2 a12 = i2.a(g10, i3.d.f13004y0, qVar4, 6);
                int hashCode3 = Long.hashCode(qVar4.T);
                o l10 = qVar4.l();
                t c11 = a.c(m1Var, qVar4);
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                r.J(eVar, a12, qVar4);
                r.J(eVar2, l10, qVar4);
                defpackage.f.u(hashCode3, qVar4, eVar3, qVar4, dVar);
                r.J(eVar4, c11, qVar4);
                if (data.getFollowersCount() >= 100) {
                    qVar4.X(-1830360828);
                    r22 = 0;
                    StatsColumn(c.R(qVar4, R.string.author_profile_followers), String.valueOf(data.getFollowersCount()), qVar4, 0);
                    qVar4.p(false);
                } else {
                    r22 = 0;
                    qVar4.X(-1830149408);
                    qVar4.p(false);
                }
                StatsColumn(c.R(qVar4, R.string.collection_books), String.valueOf(data.getBookCount()), qVar4, r22);
                if (data.getSeriesCount() > 0) {
                    qVar4.X(-1829927510);
                    StatsColumn(c.R(qVar4, R.string.author_profile_series), String.valueOf(data.getSeriesCount()), qVar4, r22);
                    qVar4.p(r22);
                } else {
                    qVar4.X(-1829721856);
                    qVar4.p(r22);
                }
                qVar4.p(true);
                qVar4.p(true);
                d.g(p2.f(qVar5, f10), qVar4);
                String name = data.getName();
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i16 = ElevenLabsTheme.$stable;
                t tVar5 = tVar4;
                j7.d(name, p2.e(qVar5, 1.0f), defpackage.f.b(elevenLabsTheme, qVar4, i16), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar4, i16).getTitleMedium700(), qVar4, 48, 0, 131064);
                q qVar6 = qVar4;
                List<AuthorProfileResourceTag> resourceTags = data.getResourceTags();
                if (resourceTags == null) {
                    qVar6.X(1790760445);
                    z10 = false;
                    qVar6.p(false);
                    qVar2 = qVar5;
                } else {
                    z10 = false;
                    qVar6.X(1790760446);
                    if (!resourceTags.isEmpty()) {
                        qVar6.X(-965037494);
                        qVar2 = qVar5;
                        d.g(p2.f(qVar2, 18), qVar6);
                        ResourceTagsRow(resourceTags, qVar6, 0);
                        qVar6.p(false);
                    } else {
                        qVar2 = qVar5;
                        qVar6.X(-964930823);
                        qVar6.p(false);
                    }
                    qVar6.p(false);
                }
                String bio = data.getBio();
                if (bio == null) {
                    qVar6.X(1790971679);
                    qVar6.p(z10);
                    qVar3 = qVar6;
                } else {
                    qVar6.X(1790971680);
                    d.g(p2.f(qVar2, 12), qVar6);
                    ExpandableTextKt.m1085ExpandableText0Zdzm9U(bio, 3, p2.e(qVar2, 1.0f), elevenLabsTheme.getTypo(qVar6, i16).getBodySmall400(), defpackage.f.A(elevenLabsTheme, qVar6, i16), defpackage.f.b(elevenLabsTheme, qVar6, i16), 0, qVar6, 432, 64);
                    q qVar7 = qVar6;
                    qVar7.p(z10);
                    qVar3 = qVar7;
                }
                qVar3.p(true);
                tVar3 = tVar5;
                qVar = qVar3;
            } else {
                qVar4.R();
                tVar3 = tVar2;
                qVar = qVar4;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new p(header, tVar3, i10, i11, 25);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar4.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z AuthorProfileHeader$lambda$1(AuthorProfileSection.Header header, t tVar, int i10, int i11, m mVar, int i12) {
        AuthorProfileHeader(header, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileHeader(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1865498043);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileHeaderKt.INSTANCE.m1319getLambda$1506057371$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 29);
        }
    }

    public static final z Preview_AuthorProfileHeader$lambda$0(int i10, m mVar, int i11) {
        Preview_AuthorProfileHeader(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileHeader_MinimalInfo(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1379699541);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileHeaderKt.INSTANCE.m1318getLambda$121607339$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 0);
        }
    }

    public static final z Preview_AuthorProfileHeader_MinimalInfo$lambda$0(int i10, m mVar, int i11) {
        Preview_AuthorProfileHeader_MinimalInfo(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void ResourceTagsRow(List<AuthorProfileResourceTag> list, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        q qVar = (q) mVar;
        qVar.Z(-1109162374);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            float f10 = 8;
            d.b(null, j.g(f10), j.g(f10), null, 0, 0, k.d(-1935827723, true, new b(list, (q2) qVar.j(j1.f13138r), 13), qVar), qVar, 1573296, 57);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new v(i10, 2, list);
        }
    }

    public static final z ResourceTagsRow$lambda$0(List list, q2 q2Var, v0 v0Var, m mVar, int i10) {
        boolean z6;
        v0Var.getClass();
        int i11 = 16;
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AuthorProfileResourceTag authorProfileResourceTag = (AuthorProfileResourceTag) it.next();
                z1.g a10 = z1.h.a();
                i3.q qVar2 = i3.q.f13017a;
                t c5 = m3.h.c(qVar2, a10);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i12 = ElevenLabsTheme.$stable;
                t h10 = n.h(c5, elevenLabsTheme.getColor(qVar, i12).getSelectable().m2140getInactiveBg0d7_KjU(), h0.f26395b);
                boolean h11 = qVar.h(q2Var) | qVar.h(authorProfileResourceTag);
                Object L = qVar.L();
                if (h11 || L == l.f33918a) {
                    L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c(q2Var, authorProfileResourceTag, 5);
                    qVar.h0(L);
                }
                t F = d.F(n.p(h10, false, null, null, null, (ho.a) L, 15), 10, 6);
                k2 a11 = i2.a(j.g(4), i3.d.f13005z0, qVar, 54);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c10 = a.c(F, qVar);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a11, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c10, qVar);
                CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(authorProfileResourceTag.getIcon(), p2.o(qVar2, i11), new p3.x(elevenLabsTheme.getColor(qVar, i12).getSelectable().m2141getInactiveText0d7_KjU()), f4.q.f8840c, null, null, null, qVar, 3120, 112);
                q qVar3 = qVar;
                j7.d(authorProfileResourceTag.getTitle(), null, elevenLabsTheme.getColor(qVar, i12).getSelectable().m2141getInactiveText0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i12).getBodyXSmall500(), qVar3, 0, 0, 131066);
                qVar = qVar3;
                qVar.p(true);
                i11 = 16;
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ResourceTagsRow$lambda$0$0$0$0(q2 q2Var, AuthorProfileResourceTag authorProfileResourceTag) {
        q2Var.openUri(authorProfileResourceTag.getUrl());
        return z.f31622a;
    }

    public static final z ResourceTagsRow$lambda$1(List list, int i10, m mVar, int i11) {
        ResourceTagsRow(list, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void StatsColumn(String str, String str2, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        int i13;
        String str3 = str;
        q qVar2 = (q) mVar;
        qVar2.Z(-562411740);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str3)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = i11;
        if ((i14 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i14 & 1, z6)) {
            x a10 = w.a(j.g(2), i3.d.B0, qVar2, 6);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c5 = a.c(i3.q.f13017a, qVar2);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(g.f11907f, a10, qVar2);
            r.J(g.f11906e, l4, qVar2);
            r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar2);
            r.J(g.f11905d, c5, qVar2);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            j7.d(str2, null, defpackage.f.b(elevenLabsTheme, qVar2, i15), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i15).getBodyMedium700(), qVar2, (i14 >> 3) & 14, 0, 131066);
            str3 = str;
            j7.d(str3, null, defpackage.f.A(elevenLabsTheme, qVar2, i15), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i15).getBodySmall400(), qVar2, i14 & 14, 0, 131066);
            qVar = qVar2;
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i(str3, str2, i10, 22);
        }
    }

    public static final z StatsColumn$lambda$1(String str, String str2, int i10, m mVar, int i11) {
        StatsColumn(str, str2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
