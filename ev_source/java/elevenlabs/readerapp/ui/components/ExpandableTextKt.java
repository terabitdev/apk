package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0018²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"", ParameterNames.TEXT, "", "maxLinesCollapsed", "Li3/t;", "modifier", "Ls4/y0;", "style", "Lp3/x;", "color", "toggleColor", "Le5/k;", "textAlign", "Lsn/z;", "ExpandableText-0Zdzm9U", "(Ljava/lang/String;ILi3/t;Ls4/y0;JJILu2/m;II)V", "ExpandableText", "Preview_ExpandableText_Collapsed", "(Lu2/m;I)V", "Preview_ExpandableText_Short", "", "isExpanded", "Ls4/h;", "collapsedText", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExpandableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:114:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* renamed from: ExpandableText-0Zdzm9U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1085ExpandableText0Zdzm9U(final String str, final int i10, i3.t tVar, s4.y0 y0Var, long j4, long j10, int i11, u2.m mVar, final int i12, final int i13) {
        int i14;
        i3.t tVar2;
        int i15;
        s4.y0 y0Var2;
        long j11;
        long j12;
        final int i16;
        boolean z6;
        u2.q qVar;
        final i3.t tVar3;
        final s4.y0 y0Var3;
        final long j13;
        final long j14;
        r1 r10;
        s4.y0 y0Var4;
        s4.y0 y0Var5;
        boolean z10;
        boolean z11;
        s4.h hVar;
        int i17;
        boolean z12;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        str.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(310995230);
        if ((i12 & 6) == 0) {
            if (qVar2.f(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i14 = i23 | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (qVar2.d(i10)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i14 |= i22;
        }
        int i24 = i13 & 4;
        if (i24 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i14 |= i15;
            if ((i12 & 3072) != 0) {
                if ((i13 & 8) == 0) {
                    y0Var2 = y0Var;
                    if (qVar2.f(y0Var2)) {
                        i21 = 2048;
                        i14 |= i21;
                    }
                } else {
                    y0Var2 = y0Var;
                }
                i21 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i14 |= i21;
            } else {
                y0Var2 = y0Var;
            }
            if ((i12 & 24576) != 0) {
                j11 = j4;
                if ((i13 & 16) == 0 && qVar2.e(j11)) {
                    i20 = 16384;
                } else {
                    i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i14 |= i20;
            } else {
                j11 = j4;
            }
            if ((196608 & i12) != 0) {
                j12 = j10;
                if ((i13 & 32) == 0 && qVar2.e(j12)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i14 |= i19;
            } else {
                j12 = j10;
            }
            if ((1572864 & i12) != 0) {
                if ((i13 & 64) == 0) {
                    i16 = i11;
                    if (qVar2.d(i16)) {
                        i18 = 1048576;
                        i14 |= i18;
                    }
                } else {
                    i16 = i11;
                }
                i18 = 524288;
                i14 |= i18;
            } else {
                i16 = i11;
            }
            boolean z13 = true;
            if ((599187 & i14) == 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i14 & 1, z6)) {
                qVar2.T();
                int i25 = i12 & 1;
                i3.t tVar4 = i3.q.f13017a;
                if (i25 != 0 && !qVar2.y()) {
                    qVar2.R();
                    if ((i13 & 8) != 0) {
                        i14 &= -7169;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                    }
                    y0Var5 = y0Var2;
                } else {
                    if (i24 != 0) {
                        tVar2 = tVar4;
                    }
                    if ((i13 & 8) != 0) {
                        y0Var4 = EchoTheme.INSTANCE.getTypography(qVar2, EchoTheme.$stable).getSmRegular500(qVar2, EchoThemeTypography.$stable);
                        i14 &= -7169;
                    } else {
                        y0Var4 = y0Var2;
                    }
                    if ((i13 & 16) != 0) {
                        j11 = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getText().getWhiteSecondary(qVar2, EchoThemeColors.Text.$stable);
                        i14 &= -57345;
                    }
                    if ((i13 & 32) != 0) {
                        j12 = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getText().getWhitePrimary(qVar2, EchoThemeColors.Text.$stable);
                        i14 &= -458753;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        y0Var5 = y0Var4;
                        i16 = 5;
                    } else {
                        y0Var5 = y0Var4;
                    }
                }
                long j15 = j12;
                long j16 = j11;
                qVar2.q();
                int i26 = i14 & 14;
                if (i26 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (z10 || L == eVar) {
                    L = u2.r.A(Boolean.FALSE);
                    qVar2.h0(L);
                }
                u2.z0 z0Var = (u2.z0) L;
                if (i26 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object L2 = qVar2.L();
                if (z11 || L2 == eVar) {
                    L2 = u2.r.A(null);
                    qVar2.h0(L2);
                }
                u2.z0 z0Var2 = (u2.z0) L2;
                String R = kj.c.R(qVar2, R.string.read_more_text);
                String R2 = kj.c.R(qVar2, R.string.read_less_text);
                s4.p0 p0Var = new s4.p0(j15, 0L, (w4.g0) null, (w4.a0) null, (w4.b0) null, (w4.u) null, (String) null, 0L, (e5.a) null, (e5.p) null, (a5.c) null, 0L, (e5.l) null, (p3.a1) null, 65534);
                int i27 = i14;
                if (ExpandableText_0Zdzm9U$lambda$1(z0Var)) {
                    s4.e eVar2 = new s4.e();
                    eVar2.d(str);
                    eVar2.d(Separators.SP);
                    int i28 = eVar2.i(p0Var);
                    try {
                        eVar2.d(R2);
                        eVar2.g(i28);
                        hVar = eVar2.k();
                    } catch (Throwable th) {
                        eVar2.g(i28);
                        throw th;
                    }
                } else if (ExpandableText_0Zdzm9U$lambda$4(z0Var2) != null) {
                    hVar = ExpandableText_0Zdzm9U$lambda$4(z0Var2);
                    hVar.getClass();
                } else {
                    hVar = new s4.h(str);
                }
                if (ExpandableText_0Zdzm9U$lambda$1(z0Var)) {
                    i17 = Integer.MAX_VALUE;
                } else {
                    i17 = i10;
                }
                i3.t a10 = i1.i0.a(tVar2, null, 3);
                if (ExpandableText_0Zdzm9U$lambda$4(z0Var2) != null) {
                    qVar2.X(-1781226196);
                    if (!ExpandableText_0Zdzm9U$lambda$1(z0Var)) {
                        R2 = R;
                    }
                    boolean f10 = qVar2.f(z0Var);
                    String str2 = R2;
                    Object L3 = qVar2.L();
                    if (f10 || L3 == eVar) {
                        L3 = new a2.d0(z0Var, 6);
                        qVar2.h0(L3);
                    }
                    tVar4 = l1.n.p(tVar4, false, str2, null, null, (ho.a) L3, 13);
                    qVar2.p(false);
                } else {
                    qVar2.X(-1781221082);
                    qVar2.p(false);
                }
                i3.t then = a10.then(tVar4);
                e5.k kVar = new e5.k(i16);
                boolean f11 = qVar2.f(z0Var2) | qVar2.f(z0Var);
                if ((i27 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean f12 = z12 | f11 | qVar2.f(R);
                if (i26 != 4) {
                    z13 = false;
                }
                boolean f13 = f12 | z13 | qVar2.f(p0Var);
                Object L4 = qVar2.L();
                if (f13 || L4 == eVar) {
                    L4 = new io.elevenlabs.highlighter.h(i10, R, z0Var2, z0Var, str, p0Var);
                    qVar2.h0(L4);
                }
                qVar = qVar2;
                j7.e(hVar, then, j16, 0L, 0L, kVar, 0L, 2, false, i17, 0, null, (ho.l) L4, y0Var5, qVar, (i27 >> 6) & 896, ((i27 >> 18) & 14) | 384 | ((i27 << 15) & 234881024), 109560);
                tVar3 = tVar2;
                j13 = j16;
                y0Var3 = y0Var5;
                j14 = j15;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
                y0Var3 = y0Var2;
                j13 = j11;
                j14 = j12;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.p
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z ExpandableText_0Zdzm9U$lambda$9;
                        int intValue = ((Integer) obj2).intValue();
                        ExpandableText_0Zdzm9U$lambda$9 = ExpandableTextKt.ExpandableText_0Zdzm9U$lambda$9(str, i10, tVar3, y0Var3, j13, j14, i16, i12, i13, (u2.m) obj, intValue);
                        return ExpandableText_0Zdzm9U$lambda$9;
                    }
                };
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 3072) != 0) {
        }
        if ((i12 & 24576) != 0) {
        }
        if ((196608 & i12) != 0) {
        }
        if ((1572864 & i12) != 0) {
        }
        boolean z132 = true;
        if ((599187 & i14) == 599186) {
        }
        if (!qVar2.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final boolean ExpandableText_0Zdzm9U$lambda$1(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void ExpandableText_0Zdzm9U$lambda$2(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final s4.h ExpandableText_0Zdzm9U$lambda$4(u2.z0 z0Var) {
        return (s4.h) z0Var.getValue();
    }

    public static final sn.z ExpandableText_0Zdzm9U$lambda$7$0(u2.z0 z0Var) {
        ExpandableText_0Zdzm9U$lambda$2(z0Var, !ExpandableText_0Zdzm9U$lambda$1(z0Var));
        return sn.z.f31622a;
    }

    public static final sn.z ExpandableText_0Zdzm9U$lambda$8$0(int i10, String str, u2.z0 z0Var, u2.z0 z0Var2, String str2, s4.p0 p0Var, s4.u0 u0Var) {
        CharSequence charSequence;
        u0Var.getClass();
        if (ExpandableText_0Zdzm9U$lambda$4(z0Var) == null && !ExpandableText_0Zdzm9U$lambda$1(z0Var2) && u0Var.d()) {
            s4.x xVar = u0Var.f31145b;
            if (xVar.f31165f >= i10) {
                int c5 = (xVar.c(i10 - 1, true) - ("… " + str).length()) - 1;
                if (c5 < 0) {
                    c5 = 0;
                }
                s4.e eVar = new s4.e();
                String substring = str2.substring(0, c5);
                int length = substring.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i11 = length - 1;
                        if (!oo.f0.r0(substring.charAt(length))) {
                            charSequence = substring.subSequence(0, length + 1);
                            break;
                        }
                        if (i11 < 0) {
                            break;
                        }
                        length = i11;
                    }
                }
                charSequence = "";
                eVar.d(charSequence.toString());
                eVar.d("… ");
                int i12 = eVar.i(p0Var);
                try {
                    eVar.d(str);
                    eVar.g(i12);
                    z0Var.setValue(eVar.k());
                } catch (Throwable th) {
                    eVar.g(i12);
                    throw th;
                }
            }
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExpandableText_0Zdzm9U$lambda$9(String str, int i10, i3.t tVar, s4.y0 y0Var, long j4, long j10, int i11, int i12, int i13, u2.m mVar, int i14) {
        m1085ExpandableText0Zdzm9U(str, i10, tVar, y0Var, j4, j10, i11, mVar, u2.r.M(i12 | 1), i13);
        return sn.z.f31622a;
    }

    public static final void Preview_ExpandableText_Collapsed(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1213923936);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$ExpandableTextKt.INSTANCE.getLambda$2128074678$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 0);
        }
    }

    public static final sn.z Preview_ExpandableText_Collapsed$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExpandableText_Collapsed(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExpandableText_Short(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1237992539);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$ExpandableTextKt.INSTANCE.m1031getLambda$780560015$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 1);
        }
    }

    public static final sn.z Preview_ExpandableText_Short$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExpandableText_Short(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
