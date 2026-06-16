package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.y2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"", "url", "Lio/elevenlabs/readerapp/ui/components/AuthorPictureSize;", "size", "Li3/t;", "modifier", "Lsn/z;", "AuthorPicture", "(Ljava/lang/String;Lio/elevenlabs/readerapp/ui/components/AuthorPictureSize;Li3/t;Lu2/m;II)V", "AuthorPictureFallback", "(Lio/elevenlabs/readerapp/ui/components/AuthorPictureSize;Li3/t;Lu2/m;II)V", "Preview_AuthorPicture_Small_Fallback", "(Lu2/m;I)V", "Preview_AuthorPicture_Medium_Fallback", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthorPictureKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthorPicture(String str, AuthorPictureSize authorPictureSize, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        AuthorPictureSize authorPictureSize2;
        r1 r10;
        i3.t tVar3;
        int i14;
        int i15;
        authorPictureSize.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1599668573);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(authorPictureSize.ordinal())) {
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
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                i3.t o6 = p2.o(qVar2, authorPictureSize.getDp());
                z1.g gVar = z1.h.f39128a;
                i3.t c5 = m3.h.c(o6, gVar);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                i3.t then = tVar3.then(l1.n.j(1, echoTheme.getColors(qVar, i17).getBorder().getSenaryAlpha(qVar, EchoThemeColors.Border.$stable), c5, gVar));
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c10 = i3.a.c(then, qVar);
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
                authorPictureSize2 = authorPictureSize;
                AuthorPictureFallback(authorPictureSize2, l1.n.h(p2.o(qVar2, authorPictureSize.getDp()), echoTheme.getColors(qVar, i17).getFill().getDenaryAlpha(qVar, EchoThemeColors.Fill.$stable), gVar), qVar, (i12 >> 3) & 14, 0);
                if (str != null) {
                    qVar.X(-1338178464);
                    CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str, m3.h.c(p2.o(qVar2, authorPictureSize2.getDp()), gVar), null, f4.q.f8839b, null, null, null, qVar, (i12 & 14) | 3072, 116);
                    qVar.p(false);
                } else {
                    qVar.X(-1337952629);
                    qVar.p(false);
                }
                qVar.p(true);
                tVar2 = tVar3;
            } else {
                authorPictureSize2 = authorPictureSize;
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(str, authorPictureSize2, tVar2, i10, i11, 9);
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

    public static final sn.z AuthorPicture$lambda$1(String str, AuthorPictureSize authorPictureSize, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        AuthorPicture(str, authorPictureSize, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AuthorPictureFallback(AuthorPictureSize authorPictureSize, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(702254900);
        if ((i10 & 6) == 0) {
            if (qVar.d(authorPictureSize.ordinal())) {
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
            if (qVar.f(tVar2)) {
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
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i15 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(tVar4, qVar);
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
                u2.r.J(h4.g.f11905d, c5, qVar);
                y2.a(kd.a.M(R.drawable.author_picture_fallback, qVar, 0), null, p2.o(qVar2, authorPictureSize.getDp() * 0.5f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getText().getTertiary(qVar, EchoThemeColors.Text.$stable), qVar, u3.c.$stable | 48, 0);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.p(authorPictureSize, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z AuthorPictureFallback$lambda$1(AuthorPictureSize authorPictureSize, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        AuthorPictureFallback(authorPictureSize, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_AuthorPicture_Medium_Fallback(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1272973417);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AuthorPicture(null, AuthorPictureSize.Large, null, qVar, 54, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 26);
        }
    }

    public static final sn.z Preview_AuthorPicture_Medium_Fallback$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorPicture_Medium_Fallback(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AuthorPicture_Small_Fallback(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1228092359);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AuthorPicture(null, AuthorPictureSize.Small, null, qVar, 54, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 25);
        }
    }

    public static final sn.z Preview_AuthorPicture_Small_Fallback$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorPicture_Small_Fallback(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
