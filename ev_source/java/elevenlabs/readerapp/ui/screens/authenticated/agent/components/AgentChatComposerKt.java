package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import a2.a2;
import a2.v;
import a2.y1;
import a2.z1;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.g;
import ho.l;
import ho.p;
import i1.e2;
import i3.k;
import i3.q;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.e0;
import io.elevenlabs.readerapp.ui.components.m0;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.d1;
import q2.d5;
import q2.j7;
import q2.x2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import s4.y0;
import sn.z;
import u2.m;
import u2.r;
import u2.r1;
import u2.z0;
import wq.n;
import z1.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "", "Lsn/z;", "onSend", "Lkotlin/Function0;", "onStop", "", "isAgentResponding", "Li3/t;", "modifier", "enabled", "AgentChatComposer", "(Lho/l;Lho/a;ZLi3/t;ZLu2/m;II)V", "Preview_AgentChatComposer_Idle", "(Lu2/m;I)V", "Preview_AgentChatComposer_Responding", "", "MAX_INPUT_LENGTH", TokenNames.I, "Lh5/f;", "PillMinHeight", TokenNames.F, "ButtonSize", "SendIconSize", "StopIconSize", ParameterNames.TEXT, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentChatComposerKt {
    private static final int MAX_INPUT_LENGTH = 2000;
    private static final float PillMinHeight = 56;
    private static final float ButtonSize = 40;
    private static final float SendIconSize = 20;
    private static final float StopIconSize = 12;

    /* JADX WARN: Removed duplicated region for block: B:100:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AgentChatComposer(final l lVar, final ho.a aVar, final boolean z6, t tVar, boolean z10, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        t tVar3;
        boolean z13;
        r1 r10;
        t tVar4;
        boolean z14;
        final boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i16;
        int i17;
        q qVar;
        EchoTheme echoTheme;
        boolean z20;
        boolean z21;
        int i18;
        int i19;
        int i20;
        boolean z22 = z6;
        lVar.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1406408718);
        if ((i10 & 6) == 0) {
            if (qVar2.h(lVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.g(z22)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z11 = z10;
                if (qVar2.g(z11)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (qVar2.O(i12 & 1, z12)) {
                    q qVar3 = q.f13017a;
                    if (i21 != 0) {
                        tVar4 = qVar3;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    Object[] objArr = new Object[0];
                    Object L = qVar2.L();
                    Object obj = u2.l.f33918a;
                    if (L == obj) {
                        L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(7);
                        qVar2.h0(L);
                    }
                    final z0 z0Var = (z0) f3.m.e(objArr, (ho.a) L, qVar2, 48);
                    if (z14 && n.L0(AgentChatComposer$lambda$1(z0Var)).toString().length() > 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    t j4 = p2.j(p2.e(tVar4, 1.0f), PillMinHeight);
                    EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                    int i22 = EchoTheme.$stable;
                    EchoThemeColors.Fill fill = echoTheme2.getColors(qVar2, i22).getFill();
                    int i23 = EchoThemeColors.Fill.$stable;
                    t tVar5 = tVar4;
                    t F = r1.d.F(l1.n.h(j4, fill.getDenary(qVar2, i23), h.b(echoTheme2.getRadii(qVar2, i22).getFull())), 6, 4);
                    k kVar = i3.d.f13005z0;
                    u0 u0Var = j.f29228a;
                    k2 a10 = i2.a(i.m(echoTheme2, qVar2, i22), kVar, qVar2, 48);
                    int hashCode = Long.hashCode(qVar2.T);
                    o l4 = qVar2.l();
                    t c5 = i3.a.c(F, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = g.f11903b;
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
                    String AgentChatComposer$lambda$1 = AgentChatComposer$lambda$1(z0Var);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    t F2 = r1.d.F(new m1(1.0f, true), echoTheme2.getSpacings(qVar2, i22).getX4(), echoTheme2.getSpacings(qVar2, i22).getX3());
                    y0 baseRegular400 = echoTheme2.getTypography(qVar2, i22).getBaseRegular400(qVar2, EchoThemeTypography.$stable);
                    EchoThemeColors.Text text = echoTheme2.getColors(qVar2, i22).getText();
                    int i24 = EchoThemeColors.Text.$stable;
                    y0 a11 = y0.a(baseRegular400, text.getPrimary(qVar2, i24), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
                    d1 d1Var = new d1(i.v(i22, i24, echoTheme2, qVar2, qVar2));
                    a2 a2Var = new a2(0, 4, 119);
                    boolean g10 = qVar2.g(z15) | qVar2.f(z0Var);
                    int i25 = i12 & 14;
                    if (i25 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z23 = z16 | g10;
                    Object L2 = qVar2.L();
                    if (z23 || L2 == obj) {
                        L2 = new io.elevenlabs.readerapp.ui.components.explore.j(z15, lVar, z0Var);
                        qVar2.h0(L2);
                    }
                    z1 z1Var = new z1(null, null, (l) L2, 31);
                    boolean f10 = qVar2.f(z0Var);
                    Object L3 = qVar2.L();
                    if (f10 || L3 == obj) {
                        L3 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.a
                            @Override // ho.l
                            public final Object invoke(Object obj2) {
                                z AgentChatComposer$lambda$3$1$0;
                                AgentChatComposer$lambda$3$1$0 = AgentChatComposerKt.AgentChatComposer$lambda$3$1$0(z0.this, (String) obj2);
                                return AgentChatComposer$lambda$3$1$0;
                            }
                        };
                        qVar2.h0(L3);
                    }
                    v.a(AgentChatComposer$lambda$1, (l) L3, F2, z14, a11, a2Var, z1Var, true, 0, 0, null, null, null, d1Var, c3.k.d(-295880365, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.b
                        @Override // ho.q
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            z AgentChatComposer$lambda$3$2;
                            int intValue = ((Integer) obj4).intValue();
                            AgentChatComposer$lambda$3$2 = AgentChatComposerKt.AgentChatComposer$lambda$3$2(z0.this, (p) obj2, (m) obj3, intValue);
                            return AgentChatComposer$lambda$3$2;
                        }
                    }, qVar2), qVar2, ((i12 >> 3) & 7168) | 102236160, 196608, 15888);
                    boolean z24 = z14;
                    if ((i12 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i12 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean g11 = z18 | z17 | qVar2.g(z15) | qVar2.f(z0Var);
                    if (i25 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z25 = g11 | z19;
                    Object L4 = qVar2.L();
                    if (!z25 && L4 != obj) {
                        i16 = i23;
                        i17 = i22;
                        z20 = z15;
                        qVar = qVar3;
                        echoTheme = echoTheme2;
                        z22 = z6;
                    } else {
                        i16 = i23;
                        i17 = i22;
                        qVar = qVar3;
                        echoTheme = echoTheme2;
                        ho.a aVar2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.c
                            @Override // ho.a
                            public final Object invoke() {
                                z AgentChatComposer$lambda$3$3$0;
                                AgentChatComposer$lambda$3$3$0 = AgentChatComposerKt.AgentChatComposer$lambda$3$3$0(z6, aVar, z15, lVar, z0Var);
                                return AgentChatComposer$lambda$3$3$0;
                            }
                        };
                        z20 = z15;
                        z22 = z6;
                        qVar2.h0(aVar2);
                        L4 = aVar2;
                    }
                    ho.a aVar3 = (ho.a) L4;
                    t o6 = p2.o(qVar, ButtonSize);
                    if (!z22 && !z20) {
                        z21 = false;
                    } else {
                        z21 = true;
                    }
                    long primary = echoTheme.getColors(qVar2, i17).getFill().getPrimary(qVar2, i16);
                    EchoThemeColors.Icon icon = echoTheme.getColors(qVar2, i17).getIcon();
                    int i26 = EchoThemeColors.Icon.$stable;
                    x2 q = d5.q(primary, icon.getOnFillPrimary(qVar2, i26), echoTheme.getColors(qVar2, i17).getFill().getQuaternary(qVar2, i16), echoTheme.getColors(qVar2, i17).getIcon().getInactive(qVar2, i26), qVar2, 0);
                    qVar2 = qVar2;
                    d5.g(aVar3, o6, z21, q, null, c3.k.d(1986650228, true, new m0(z22, 1), qVar2), qVar2, 1572912, 48);
                    qVar2.p(true);
                    z13 = z24;
                    tVar3 = tVar5;
                } else {
                    qVar2.R();
                    tVar3 = tVar2;
                    z13 = z11;
                }
                r10 = qVar2.r();
                if (r10 != null) {
                    r10.f34012d = new e0(lVar, aVar, z22, tVar3, z13, i10, i11);
                    return;
                }
                return;
            }
            z11 = z10;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar2.O(i12 & 1, z12)) {
            }
            r10 = qVar2.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        z11 = z10;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar2.O(i12 & 1, z12)) {
        }
        r10 = qVar2.r();
        if (r10 != null) {
        }
    }

    public static final z0 AgentChatComposer$lambda$0$0() {
        return r.A("");
    }

    private static final String AgentChatComposer$lambda$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z AgentChatComposer$lambda$3$0$0(boolean z6, l lVar, z0 z0Var, y1 y1Var) {
        y1Var.getClass();
        AgentChatComposer$submit(z6, lVar, z0Var);
        return z.f31622a;
    }

    public static final z AgentChatComposer$lambda$3$1$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(n.J0(2000, str));
        return z.f31622a;
    }

    public static final z AgentChatComposer$lambda$3$2(z0 z0Var, p pVar, m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        pVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).h(pVar)) {
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
            f1 d10 = r1.p.d(i3.d.f13000d, false);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c5 = i3.a.c(q.f13017a, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
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
            if (AgentChatComposer$lambda$1(z0Var).length() == 0) {
                qVar2.X(-1313491234);
                String R = kj.c.R(qVar2, R.string.chat_support_input_placeholder);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i13 = EchoTheme.$stable;
                j7.d(R, null, echoTheme.getColors(qVar2, i13).getText().getPlaceholder(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i13).getBaseRegular400(qVar2, EchoThemeTypography.$stable), qVar2, 0, 0, 131066);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(-1313212823);
                qVar.p(false);
            }
            j0.c.q(i11 & 14, pVar, qVar, true);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z AgentChatComposer$lambda$3$3$0(boolean z6, ho.a aVar, boolean z10, l lVar, z0 z0Var) {
        if (z6) {
            aVar.invoke();
        } else {
            AgentChatComposer$submit(z10, lVar, z0Var);
        }
        return z.f31622a;
    }

    public static final z AgentChatComposer$lambda$3$4(boolean z6, m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            e2.f(Boolean.valueOf(z6), null, null, "send_stop_crossfade", ComposableSingletons$AgentChatComposerKt.INSTANCE.getLambda$1598651059$app_productionRelease(), qVar, 27648, 6);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AgentChatComposer$lambda$4(l lVar, ho.a aVar, boolean z6, t tVar, boolean z10, int i10, int i11, m mVar, int i12) {
        AgentChatComposer(lVar, aVar, z6, tVar, z10, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void AgentChatComposer$submit(boolean z6, l lVar, z0 z0Var) {
        if (!z6) {
            return;
        }
        String obj = n.L0(AgentChatComposer$lambda$1(z0Var)).toString();
        z0Var.setValue("");
        lVar.invoke(obj);
    }

    public static final void Preview_AgentChatComposer_Idle(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(155776380);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AgentChatComposerKt.INSTANCE.m1264getLambda$75335978$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 4);
        }
    }

    public static final z Preview_AgentChatComposer_Idle$lambda$0(int i10, m mVar, int i11) {
        Preview_AgentChatComposer_Idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AgentChatComposer_Responding(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-499096363);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AgentChatComposerKt.INSTANCE.getLambda$579205807$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 3);
        }
    }

    public static final z Preview_AgentChatComposer_Responding$lambda$0(int i10, m mVar, int i11) {
        Preview_AgentChatComposer_Responding(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
