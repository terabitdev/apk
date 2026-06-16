package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import a2.a2;
import a2.y1;
import a2.z1;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.f;
import h4.g;
import ho.l;
import ho.p;
import i1.e2;
import i3.k;
import i3.t;
import i4.j1;
import i4.l1;
import i4.m2;
import ib.i;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import n3.v;
import p3.d1;
import q2.d5;
import q2.j7;
import r1.d;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import s4.y0;
import sn.z;
import u2.e;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import z1.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u001ao\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "value", "Lkotlin/Function1;", "Lsn/z;", "onValueChange", "Lkotlin/Function0;", "onSendMessage", "onSwitchToVoiceMode", "Li3/t;", "modifier", "Ln3/v;", "focusRequester", "", "autoFocus", "enabled", "ChatInput", "(Ljava/lang/String;Lho/l;Lho/a;Lho/a;Li3/t;Ln3/v;ZZLu2/m;II)V", "Preview_ChatInput_Empty", "(Lu2/m;I)V", "Preview_ChatInput_WithText", "", "MAX_INPUT_LENGTH", TokenNames.I, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ChatInputKt {
    private static final int MAX_INPUT_LENGTH = 2000;

    /* JADX WARN: Removed duplicated region for block: B:110:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatInput(String str, l lVar, ho.a aVar, ho.a aVar2, t tVar, v vVar, boolean z6, boolean z10, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        v vVar2;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        boolean z12;
        String str2;
        boolean z13;
        q qVar;
        boolean z14;
        v vVar3;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        int i20;
        int i21;
        int i22;
        int i23;
        str.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-142200804);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar2)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        }
        int i24 = i11 & 16;
        if (i24 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 32;
            if (i14 == 0) {
                i12 |= 196608;
                vVar2 = vVar;
            } else {
                vVar2 = vVar;
                if ((i10 & 196608) == 0) {
                    if (qVar2.f(vVar2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
            }
            i16 = i11 & 64;
            if (i16 == 0) {
                i12 |= 1572864;
                z11 = z6;
            } else {
                z11 = z6;
                if ((i10 & 1572864) == 0) {
                    if (qVar2.g(z11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
            }
            i18 = i11 & 128;
            if (i18 == 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (qVar2.g(z10)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((i12 & 4793491) == 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!qVar2.O(i12 & 1, z12)) {
                i3.q qVar3 = i3.q.f13017a;
                if (i24 != 0) {
                    tVar4 = qVar3;
                } else {
                    tVar4 = tVar2;
                }
                e eVar = u2.l.f33918a;
                if (i14 != 0) {
                    Object L = qVar2.L();
                    if (L == eVar) {
                        L = new v();
                        qVar2.h0(L);
                    }
                    vVar2 = (v) L;
                }
                if (i16 != 0) {
                    z11 = true;
                }
                if (i18 != 0) {
                    z15 = true;
                } else {
                    z15 = z10;
                }
                m2 m2Var = (m2) qVar2.j(j1.f13137p);
                Boolean valueOf = Boolean.valueOf(z11);
                Boolean valueOf2 = Boolean.valueOf(z15);
                if ((i12 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z25 = z16;
                if ((29360128 & i12) == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z26 = z25 | z17;
                if ((458752 & i12) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z27 = z26 | z18;
                Object L2 = qVar2.L();
                if (z27 || L2 == eVar) {
                    L2 = new ChatInputKt$ChatInput$2$1(z11, z15, vVar2, null);
                    qVar2.h0(L2);
                }
                r.g(valueOf, valueOf2, (p) L2, qVar2);
                t u6 = d.u(d.O(p2.e(p2.j(tVar4, 56), 1.0f), new qm.a(3)));
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i25 = EchoTheme.$stable;
                EchoThemeColors.Fill fill = echoTheme.getColors(qVar2, i25).getFill();
                t tVar5 = tVar4;
                int i26 = EchoThemeColors.Fill.$stable;
                t F = d.F(n.h(u6, fill.getDenary(qVar2, i26), h.b(echoTheme.getRadii(qVar2, i25).getFull())), 6, 4);
                k kVar = i3.d.f13005z0;
                u0 u0Var = j.f29228a;
                k2 a10 = i2.a(i.m(echoTheme, qVar2, i25), kVar, qVar2, 48);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(F, qVar2);
                h4.h.f11920i.getClass();
                boolean z28 = z15;
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
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t F2 = d.F(n3.d.j(new m1(1.0f, true), vVar2), echoTheme.getSpacings(qVar2, i25).getX4(), echoTheme.getSpacings(qVar2, i25).getX3());
                y0 baseRegular400 = echoTheme.getTypography(qVar2, i25).getBaseRegular400(qVar2, EchoThemeTypography.$stable);
                EchoThemeColors.Text text = echoTheme.getColors(qVar2, i25).getText();
                int i27 = EchoThemeColors.Text.$stable;
                y0 a11 = y0.a(baseRegular400, text.getPrimary(qVar2, i27), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
                d1 d1Var = new d1(i.v(i25, i27, echoTheme, qVar2, qVar2));
                a2 a2Var = new a2(0, 4, 119);
                int i28 = i12 & 14;
                if (i28 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                int i29 = i12 & 896;
                if (i29 == 256) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z29 = z19 | z20;
                Object L3 = qVar2.L();
                if (z29 || L3 == eVar) {
                    L3 = new a(0, str, aVar);
                    qVar2.h0(L3);
                }
                z1 z1Var = new z1(null, null, (l) L3, 31);
                if ((i12 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                Object L4 = qVar2.L();
                if (z21 || L4 == eVar) {
                    L4 = new g3.m(lVar, 4);
                    qVar2.h0(L4);
                }
                int i30 = i12;
                boolean z30 = z11;
                v vVar4 = vVar2;
                a2.v.a(str, (l) L4, F2, z28, a11, a2Var, z1Var, true, 0, 0, null, null, null, d1Var, c3.k.d(1658455805, true, new b(str, 0), qVar2), qVar2, ((i12 >> 12) & 7168) | i28 | 102236160, 196608, 15888);
                if (i28 == 4) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (i29 == 256) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean f10 = z23 | z22 | qVar2.f(m2Var);
                if ((i30 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z31 = f10 | z24;
                Object L5 = qVar2.L();
                if (!z31 && L5 != eVar) {
                    str2 = str;
                } else {
                    io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f fVar2 = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f((Object) str, (sn.d) aVar, (Object) m2Var, aVar2, 4);
                    str2 = str;
                    qVar2.h0(fVar2);
                    L5 = fVar2;
                }
                d5.g((ho.a) L5, p2.o(qVar3, 40), z28, d5.q(echoTheme.getColors(qVar2, i25).getFill().getPrimary(qVar2, i26), echoTheme.getColors(qVar2, i25).getIcon().getOnFillPrimary(qVar2, EchoThemeColors.Icon.$stable), 0L, 0L, qVar2, 12), null, c3.k.d(-725298274, true, new id.b(str2, 2, (byte) 0), qVar2), qVar2, ((i30 >> 15) & 896) | 1572912, 48);
                qVar2.p(true);
                qVar = qVar2;
                tVar3 = tVar5;
                z13 = z28;
                z14 = z30;
                vVar3 = vVar4;
            } else {
                str2 = str;
                qVar2.R();
                z13 = z10;
                qVar = qVar2;
                z14 = z11;
                vVar3 = vVar2;
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.m(str2, lVar, aVar, aVar2, tVar3, vVar3, z14, z13, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        i16 = i11 & 64;
        if (i16 == 0) {
        }
        i18 = i11 & 128;
        if (i18 == 0) {
        }
        if ((i12 & 4793491) == 4793490) {
        }
        if (!qVar2.O(i12 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ChatInput$lambda$2$0$0(String str, ho.a aVar, y1 y1Var) {
        y1Var.getClass();
        if (!wq.n.m0(str)) {
            aVar.invoke();
        }
        return z.f31622a;
    }

    public static final z ChatInput$lambda$2$1$0(l lVar, String str) {
        str.getClass();
        lVar.invoke(wq.n.J0(2000, str));
        return z.f31622a;
    }

    public static final z ChatInput$lambda$2$2(String str, p pVar, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        pVar.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).h(pVar)) {
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
        q qVar2 = (q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            f1 d10 = r1.p.d(i3.d.f13000d, false);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar2);
            h4.h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(g.f11907f, d10, qVar2);
            r.J(g.f11906e, l4, qVar2);
            r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar2);
            r.J(g.f11905d, c5, qVar2);
            if (str.length() == 0) {
                qVar2.X(-859425805);
                String R = kj.c.R(qVar2, R.string.assistant_text_input_placeholder);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i13 = EchoTheme.$stable;
                j7.d(R, null, echoTheme.getColors(qVar2, i13).getText().getPlaceholder(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i13).getBaseRegular400(qVar2, EchoThemeTypography.$stable), qVar2, 0, 0, 131066);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(-859146433);
                qVar.p(false);
            }
            j0.c.q(i11 & 14, pVar, qVar, true);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z ChatInput$lambda$2$3$0(String str, ho.a aVar, m2 m2Var, ho.a aVar2) {
        if (!wq.n.m0(str)) {
            aVar.invoke();
        } else {
            if (m2Var != null) {
                ((l1) m2Var).a();
            }
            aVar2.invoke();
        }
        return z.f31622a;
    }

    public static final z ChatInput$lambda$2$4(String str, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            e2.f(Boolean.valueOf(!wq.n.m0(str)), null, null, "icon_crossfade", ComposableSingletons$ChatInputKt.INSTANCE.m1280getLambda$1250437027$app_productionRelease(), qVar, 27648, 6);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ChatInput$lambda$3(String str, l lVar, ho.a aVar, ho.a aVar2, t tVar, v vVar, boolean z6, boolean z10, int i10, int i11, m mVar, int i12) {
        ChatInput(str, lVar, aVar, aVar2, tVar, vVar, z6, z10, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ChatInput_Empty(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1233679406);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChatInputKt.INSTANCE.m1281getLambda$1359853804$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 21);
        }
    }

    public static final z Preview_ChatInput_Empty$lambda$0(int i10, m mVar, int i11) {
        Preview_ChatInput_Empty(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ChatInput_WithText(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1258661208);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChatInputKt.INSTANCE.m1282getLambda$522510158$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 20);
        }
    }

    public static final z Preview_ChatInput_WithText$lambda$0(int i10, m mVar, int i11) {
        Preview_ChatInput_WithText(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
