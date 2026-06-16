package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.ui.components.r0;
import io.elevenlabs.readerapp.ui.screens.authenticated.c1;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import qc.x;
import r1.p;
import r1.p2;
import s4.y0;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001aC\u0010\u000b\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", DiagnosticsEntry.NAME_KEY, "email", "Li3/t;", "modifier", "Lh5/f;", "size", "photoUrl", "Lsn/z;", "AccountAvatar-hGBTI10", "(Ljava/lang/String;Ljava/lang/String;Li3/t;FLjava/lang/String;Lu2/m;II)V", "AccountAvatar", "initials", "Ls4/y0;", "textStyle", "InitialsPlaceholder", "(Ljava/lang/String;Ls4/y0;Lu2/m;I)V", "extractInitials", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Preview_AccountAvatar", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountAvatarKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x005b  */
    /* renamed from: AccountAvatar-hGBTI10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1235AccountAvatarhGBTI10(String str, String str2, t tVar, float f10, String str3, m mVar, int i10, int i11) {
        int i12;
        String str4;
        t tVar2;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        String str5;
        int i17;
        boolean z6;
        t tVar3;
        float f12;
        r1 r10;
        float f13;
        String str6;
        boolean z10;
        boolean z11;
        final y0 smRegular500;
        float f14;
        String str7;
        boolean z12;
        int i18;
        int i19;
        q qVar = (q) mVar;
        qVar.Z(2085468172);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            str4 = str2;
            if (qVar.f(str4)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        } else {
            str4 = str2;
        }
        int i20 = i11 & 4;
        if (i20 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                f11 = f10;
                if (qVar.c(f11)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    str5 = str3;
                    if (qVar.f(str5)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    if ((i12 & 9363) == 9362) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar.O(i12 & 1, z6)) {
                        i3.q qVar2 = i3.q.f13017a;
                        if (i20 != 0) {
                            tVar3 = qVar2;
                        } else {
                            tVar3 = tVar2;
                        }
                        if (i14 != 0) {
                            f13 = 56;
                        } else {
                            f13 = f11;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str5;
                        }
                        if ((i12 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i12 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z13 = z10 | z11;
                        Object L = qVar.L();
                        if (z13 || L == l.f33918a) {
                            L = extractInitials(str, str2);
                            qVar.h0(L);
                        }
                        final String str8 = (String) L;
                        if (h5.f.a(f13, 48) >= 0) {
                            qVar.X(-1614804872);
                            smRegular500 = EchoTheme.INSTANCE.getTypography(qVar, EchoTheme.$stable).getLgRegular500(qVar, EchoThemeTypography.$stable);
                        } else {
                            qVar.X(-1614803624);
                            smRegular500 = EchoTheme.INSTANCE.getTypography(qVar, EchoTheme.$stable).getSmRegular500(qVar, EchoThemeTypography.$stable);
                        }
                        qVar.p(false);
                        t c5 = m3.h.c(p2.o(tVar3, f13), z1.h.f39128a);
                        f1 d10 = p.d(i3.d.f13001e, false);
                        int hashCode = Long.hashCode(qVar.T);
                        o l4 = qVar.l();
                        t c10 = i3.a.c(c5, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        r.J(h4.g.f11907f, d10, qVar);
                        r.J(h4.g.f11906e, l4, qVar);
                        r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                        r.F(h4.g.f11909h, qVar);
                        r.J(h4.g.f11905d, c10, qVar);
                        if (str6 == null || n.m0(str6)) {
                            f14 = f13;
                            str7 = str6;
                            z12 = true;
                            qVar.X(122630448);
                            InitialsPlaceholder(str8, smRegular500, qVar, 0);
                            qVar.p(false);
                        } else {
                            qVar.X(122271437);
                            t d11 = p2.d(qVar2, 1.0f);
                            final int i21 = 0;
                            c3.j d12 = k.d(-2038520460, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.components.a
                                @Override // ho.r
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    z AccountAvatar_hGBTI10$lambda$1$0;
                                    z AccountAvatar_hGBTI10$lambda$1$1;
                                    switch (i21) {
                                        case 0:
                                            int intValue = ((Integer) obj4).intValue();
                                            AccountAvatar_hGBTI10$lambda$1$0 = AccountAvatarKt.AccountAvatar_hGBTI10$lambda$1$0(str8, smRegular500, (x) obj, (qc.e) obj2, (m) obj3, intValue);
                                            return AccountAvatar_hGBTI10$lambda$1$0;
                                        default:
                                            int intValue2 = ((Integer) obj4).intValue();
                                            AccountAvatar_hGBTI10$lambda$1$1 = AccountAvatarKt.AccountAvatar_hGBTI10$lambda$1$1(str8, smRegular500, (x) obj, (qc.d) obj2, (m) obj3, intValue2);
                                            return AccountAvatar_hGBTI10$lambda$1$1;
                                    }
                                }
                            }, qVar);
                            final int i22 = 1;
                            c3.j d13 = k.d(19421354, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.components.a
                                @Override // ho.r
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    z AccountAvatar_hGBTI10$lambda$1$0;
                                    z AccountAvatar_hGBTI10$lambda$1$1;
                                    switch (i22) {
                                        case 0:
                                            int intValue = ((Integer) obj4).intValue();
                                            AccountAvatar_hGBTI10$lambda$1$0 = AccountAvatarKt.AccountAvatar_hGBTI10$lambda$1$0(str8, smRegular500, (x) obj, (qc.e) obj2, (m) obj3, intValue);
                                            return AccountAvatar_hGBTI10$lambda$1$0;
                                        default:
                                            int intValue2 = ((Integer) obj4).intValue();
                                            AccountAvatar_hGBTI10$lambda$1$1 = AccountAvatarKt.AccountAvatar_hGBTI10$lambda$1$1(str8, smRegular500, (x) obj, (qc.d) obj2, (m) obj3, intValue2);
                                            return AccountAvatar_hGBTI10$lambda$1$1;
                                    }
                                }
                            }, qVar);
                            int i23 = ((i12 >> 12) & 14) | 1597872;
                            f14 = f13;
                            str7 = str6;
                            qc.m.d(str7, d11, d12, null, d13, qVar, i23, 48, 128936);
                            qVar.p(false);
                            z12 = true;
                        }
                        qVar.p(z12);
                        f12 = f14;
                        str5 = str7;
                    } else {
                        qVar.R();
                        tVar3 = tVar2;
                        f12 = f11;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new b(str, str4, tVar3, f12, str5, i10, i11);
                        return;
                    }
                    return;
                }
                str5 = str3;
                if ((i12 & 9363) == 9362) {
                }
                if (!qVar.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            f11 = f10;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            str5 = str3;
            if ((i12 & 9363) == 9362) {
            }
            if (!qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        f11 = f10;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        str5 = str3;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z AccountAvatar_hGBTI10$lambda$1$0(String str, y0 y0Var, x xVar, qc.e eVar, m mVar, int i10) {
        boolean z6;
        xVar.getClass();
        eVar.getClass();
        if ((i10 & 129) != 128) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            InitialsPlaceholder(str, y0Var, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AccountAvatar_hGBTI10$lambda$1$1(String str, y0 y0Var, x xVar, qc.d dVar, m mVar, int i10) {
        boolean z6;
        xVar.getClass();
        dVar.getClass();
        if ((i10 & 129) != 128) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            InitialsPlaceholder(str, y0Var, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AccountAvatar_hGBTI10$lambda$2(String str, String str2, t tVar, float f10, String str3, int i10, int i11, m mVar, int i12) {
        m1235AccountAvatarhGBTI10(str, str2, tVar, f10, str3, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void InitialsPlaceholder(String str, y0 y0Var, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        y0 y0Var2 = y0Var;
        q qVar = (q) mVar;
        qVar.Z(-1954230659);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(y0Var2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            t d10 = p2.d(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i14 = EchoTheme.$stable;
            t h10 = l1.n.h(d10, echoTheme.getColors(qVar, i14).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), h0.f26395b);
            f1 d11 = p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d11, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            j7.d(str, null, echoTheme.getColors(qVar, i14).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, y0Var, qVar, i11 & 14, (i11 << 18) & 29360128, 130042);
            y0Var2 = y0Var;
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(str, y0Var2, i10, 12);
        }
    }

    public static final z InitialsPlaceholder$lambda$1(String str, y0 y0Var, int i10, m mVar, int i11) {
        InitialsPlaceholder(str, y0Var, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountAvatar(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1656381201);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountAvatarKt.INSTANCE.m1237getLambda$937152009$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 15);
        }
    }

    public static final z Preview_AccountAvatar$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountAvatar(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final String extractInitials(String str, String str2) {
        String str3 = "";
        if (str == null || n.m0(str)) {
            if (str2 == null || n.m0(str2)) {
                str = "";
            } else {
                str = n.G0(str2, '@');
            }
        }
        List A0 = n.A0(str, new char[]{' ', '.', '-', '_'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0) {
            if (!n.m0((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            str3 = tn.o.E0(tn.o.b1(arrayList, 2), "", null, null, new r0(20), 30);
        } else if (!n.m0(str)) {
            str3 = n.J0(2, str);
        }
        if (n.m0(str3)) {
            str3 = "??";
        }
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static final CharSequence extractInitials$lambda$1(String str) {
        str.getClass();
        return String.valueOf(n.f0(str));
    }
}
