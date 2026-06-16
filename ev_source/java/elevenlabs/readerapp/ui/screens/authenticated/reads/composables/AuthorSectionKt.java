package io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables;

import c3.o;
import h4.e;
import h4.f;
import h4.g;
import h4.h;
import ho.a;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.ReadDetailsAuthorSection;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.AuthorPictureKt;
import io.elevenlabs.readerapp.ui.components.AuthorPictureSize;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kj.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m2.k1;
import q2.j7;
import r1.d;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsAuthorSection;", "author", "Lkotlin/Function0;", "Lsn/z;", "onAuthorClick", "Li3/t;", "modifier", "AuthorSection", "(Lio/elevenlabs/domain/model/ReadDetailsAuthorSection;Lho/a;Li3/t;Lu2/m;II)V", "Preview_AuthorSection", "(Lu2/m;I)V", "Preview_AuthorSectionWithAvatar", "Preview_AuthorSectionMinimal", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AuthorSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthorSection(ReadDetailsAuthorSection readDetailsAuthorSection, a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z10;
        int i14;
        int i15;
        readDetailsAuthorSection.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1544540563);
        if ((i10 & 6) == 0) {
            if (qVar.h(readDetailsAuthorSection)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
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
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                t e10 = p2.e(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                t G = d.G(e10, echoTheme.getSpacings(qVar, i17).getX5(), u.P, 2);
                x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(G, qVar);
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
                String R = c.R(qVar, R.string.read_details_author);
                EchoThemeTypography typography = echoTheme.getTypography(qVar, i17);
                int i18 = EchoThemeTypography.$stable;
                y0 baseRegular500 = typography.getBaseRegular500(qVar, i18);
                EchoThemeColors.Text text = echoTheme.getColors(qVar, i17).getText();
                int i19 = EchoThemeColors.Text.$stable;
                t tVar5 = tVar4;
                j7.d(R, p2.e(qVar2, 1.0f), text.getPrimary(qVar, i19), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar, 48, 0, 131064);
                i.o(echoTheme, qVar, i17, qVar2, qVar);
                t c10 = m3.h.c(p2.e(qVar2, 1.0f), echoTheme.getShapes(qVar, i17).getMd(qVar, EchoThemeShapes.$stable));
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                if (z10 || L == l.f33918a) {
                    L = new fm.g(26, aVar);
                    qVar.h0(L);
                }
                t p10 = n.p(c10, false, null, null, null, (a) L, 15);
                k2 a11 = i2.a(j.f29228a, i3.d.f13005z0, qVar, 48);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c11 = i3.a.c(p10, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar, a11, qVar);
                r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                r.J(eVar4, c11, qVar);
                AuthorPictureKt.AuthorPicture(readDetailsAuthorSection.getAvatarUrl(), AuthorPictureSize.Small, null, qVar, 48, 4);
                d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i17).getX4()), qVar);
                String name = readDetailsAuthorSection.getName();
                y0 baseRegular5002 = echoTheme.getTypography(qVar, i17).getBaseRegular500(qVar, i18);
                long v9 = i.v(i17, i19, echoTheme, qVar, qVar);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                j7.d(name, new m1(1.0f, true), v9, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular5002, qVar, 0, 0, 131064);
                qVar = qVar;
                qVar.p(true);
                String bio = readDetailsAuthorSection.getBio();
                if (bio != null && !wq.n.m0(bio)) {
                    qVar.X(368898596);
                    d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i17).getX4()), qVar);
                    j7.d(bio, p2.e(qVar2, 1.0f), i.b(i17, i19, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i17).getSmRegular400(qVar, i18), qVar, 48, 0, 131064);
                    qVar = qVar;
                    qVar.p(false);
                } else {
                    qVar.X(369195545);
                    qVar.p(false);
                }
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new om.a(readDetailsAuthorSection, aVar, tVar3, i10, i11, 0);
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

    public static final z AuthorSection$lambda$0$0$0(a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z AuthorSection$lambda$1(ReadDetailsAuthorSection readDetailsAuthorSection, a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        AuthorSection(readDetailsAuthorSection, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AuthorSection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1308184647);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsAuthorSection readDetailsAuthorSection = new ReadDetailsAuthorSection(null, "Matt Haig", "M. Haig", "Matt Haig is a British author of fiction and non-fiction books for children and adults. He has written for The Guardian and has been a judge for the Costa Book Awards.", "123");
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new k1(20);
                qVar.h0(L);
            }
            AuthorSection(readDetailsAuthorSection, (a) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 20);
        }
    }

    public static final z Preview_AuthorSection$lambda$1(int i10, m mVar, int i11) {
        Preview_AuthorSection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorSectionMinimal(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1497118302);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsAuthorSection readDetailsAuthorSection = new ReadDetailsAuthorSection(null, "Matt Haig", null, null, "123");
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new k1(19);
                qVar.h0(L);
            }
            AuthorSection(readDetailsAuthorSection, (a) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 19);
        }
    }

    public static final z Preview_AuthorSectionMinimal$lambda$1(int i10, m mVar, int i11) {
        Preview_AuthorSectionMinimal(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorSectionWithAvatar(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-2097237062);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsAuthorSection readDetailsAuthorSection = new ReadDetailsAuthorSection("https://example.com/avatar.jpg", "Matt Haig", null, "Matt Haig is a British author of fiction and non-fiction books for children and adults.", "123");
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new k1(21);
                qVar.h0(L);
            }
            AuthorSection(readDetailsAuthorSection, (a) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 21);
        }
    }

    public static final z Preview_AuthorSectionWithAvatar$lambda$1(int i10, m mVar, int i11) {
        Preview_AuthorSectionWithAvatar(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
