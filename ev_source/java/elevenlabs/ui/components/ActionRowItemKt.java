package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aI\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "Li3/t;", "modifier", "", "iconStart", "iconEnd", "Lkotlin/Function0;", "Lsn/z;", "onPress", "ActionRowItem", "(Ljava/lang/String;Li3/t;Ljava/lang/Integer;Ljava/lang/Integer;Lho/a;Lu2/m;II)V", "Preview_ActionRowGroup", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ActionRowItemKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActionRowItem(final String str, i3.t tVar, Integer num, Integer num2, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        Integer num3;
        int i15;
        int i16;
        Integer num4;
        int i17;
        int i18;
        ho.a aVar2;
        int i19;
        boolean z6;
        i3.t tVar3;
        Integer num5;
        Integer num6;
        ho.a aVar3;
        u2.r1 r10;
        final i3.t tVar4;
        final Integer num7;
        int i20;
        ho.a aVar4;
        int i21;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-750171029);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                num3 = num;
                if (qVar.f(num3)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    num4 = num2;
                    if (qVar.f(num4)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        aVar2 = aVar;
                        if (qVar.h(aVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        if ((i12 & 9363) != 9362) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar.O(i12 & 1, z6)) {
                            if (i22 != 0) {
                                tVar4 = i3.q.f13017a;
                            } else {
                                tVar4 = tVar2;
                            }
                            final Integer num8 = null;
                            if (i14 != 0) {
                                num7 = null;
                            } else {
                                num7 = num3;
                            }
                            if (i16 == 0) {
                                num8 = num4;
                            }
                            if (i18 != 0) {
                                Object L = qVar.L();
                                if (L == u2.l.f33918a) {
                                    L = new a(0);
                                    qVar.h0(L);
                                }
                                ho.a aVar5 = (ho.a) L;
                                i20 = i12;
                                aVar4 = aVar5;
                            } else {
                                i20 = i12;
                                aVar4 = aVar2;
                            }
                            Integer num9 = num8;
                            ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar4, null, 0L, false, 0, null, false, null, c3.k.d(-961188089, true, new ho.q() { // from class: io.elevenlabs.ui.components.b
                                @Override // ho.q
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    sn.z ActionRowItem$lambda$1;
                                    int intValue = ((Integer) obj3).intValue();
                                    ActionRowItem$lambda$1 = ActionRowItemKt.ActionRowItem$lambda$1(i3.t.this, num7, str, num8, (r1.s) obj, (u2.m) obj2, intValue);
                                    return ActionRowItem$lambda$1;
                                }
                            }, qVar), qVar, (i20 & 14) | 805306368 | ((i20 >> 9) & 112), 508);
                            aVar3 = aVar4;
                            tVar3 = tVar4;
                            num5 = num7;
                            num6 = num9;
                        } else {
                            qVar.R();
                            tVar3 = tVar2;
                            num5 = num3;
                            num6 = num4;
                            aVar3 = aVar2;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(str, tVar3, num5, num6, aVar3, i10, i11);
                            return;
                        }
                        return;
                    }
                    aVar2 = aVar;
                    if ((i12 & 9363) != 9362) {
                    }
                    if (qVar.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                num4 = num2;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                aVar2 = aVar;
                if ((i12 & 9363) != 9362) {
                }
                if (qVar.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            num3 = num;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            num4 = num2;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            aVar2 = aVar;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        num3 = num;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        num4 = num2;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        aVar2 = aVar;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ActionRowItem$lambda$1(i3.t tVar, Integer num, String str, Integer num2, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        h4.e eVar;
        h4.d dVar;
        h4.e eVar2;
        h4.f fVar;
        h4.e eVar3;
        h4.e eVar4;
        boolean z10;
        i3.l lVar = i3.d.f13001e;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 48;
            i3.t e10 = r1.p2.e(r1.p2.b(tVar, t2.u.P, f10, 1), 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t G = r1.d.G(e10, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2);
            r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            h4.e eVar5 = h4.g.f11907f;
            u2.r.J(eVar5, a10, qVar);
            h4.e eVar6 = h4.g.f11906e;
            u2.r.J(eVar6, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar7 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar7);
            h4.d dVar2 = h4.g.f11909h;
            u2.r.F(dVar2, qVar);
            h4.e eVar8 = h4.g.f11905d;
            u2.r.J(eVar8, c5, qVar);
            i3.q qVar2 = i3.q.f13017a;
            if (num != null) {
                qVar.X(-1951578483);
                i3.t o6 = r1.p2.o(qVar2, f10);
                f4.f1 d10 = r1.p.d(lVar, false);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(o6, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar5, d10, qVar);
                u2.r.J(eVar6, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar7, qVar, dVar2);
                u2.r.J(eVar8, c10, qVar);
                eVar3 = eVar8;
                eVar2 = eVar7;
                dVar = dVar2;
                eVar = eVar6;
                fVar = fVar2;
                eVar4 = eVar5;
                q2.y2.a(kd.a.M(num.intValue(), qVar, 0), null, r1.p2.o(qVar2, 20), echoTheme.getColors(qVar, i11).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
                qVar.p(true);
                r1.d.g(r1.p2.s(qVar2, echoTheme.getSpacings(qVar, i11).getX3()), qVar);
                qVar.p(false);
            } else {
                eVar = eVar6;
                dVar = dVar2;
                eVar2 = eVar7;
                fVar = fVar2;
                eVar3 = eVar8;
                eVar4 = eVar5;
                qVar.X(-1951069153);
                qVar.p(false);
            }
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            h4.e eVar9 = eVar;
            h4.e eVar10 = eVar4;
            h4.f fVar3 = fVar;
            j7.d(str, new r1.m1(1.0f, true), echoTheme.getColors(qVar, i11).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar, i11).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 24960, 110584);
            if (num2 != null) {
                qVar.X(-1950706546);
                r1.d.g(r1.p2.s(qVar2, echoTheme.getSpacings(qVar, i11).getX3()), qVar);
                i3.t o10 = r1.p2.o(qVar2, f10);
                f4.f1 d11 = r1.p.d(lVar, false);
                int hashCode3 = Long.hashCode(qVar.T);
                c3.o l10 = qVar.l();
                i3.t c11 = i3.a.c(o10, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar3);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar10, d11, qVar);
                u2.r.J(eVar9, l10, qVar);
                defpackage.f.u(hashCode3, qVar, eVar2, qVar, dVar);
                u2.r.J(eVar3, c11, qVar);
                q2.y2.a(kd.a.M(num2.intValue(), qVar, 0), null, r1.p2.o(qVar2, 20), echoTheme.getColors(qVar, i11).getIcon().getTertiary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
                z10 = true;
                qVar.p(true);
                qVar.p(false);
            } else {
                z10 = true;
                qVar.X(-1950198177);
                qVar.p(false);
            }
            qVar.p(z10);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ActionRowItem$lambda$2(String str, i3.t tVar, Integer num, Integer num2, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        ActionRowItem(str, tVar, num, num2, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ActionRowGroup(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2017054168);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
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
                L = new a(1);
                qVar.h0(L);
            }
            ActionRowItem("ActionRowItem", null, null, null, (ho.a) L, qVar, 24582, 14);
            Integer valueOf = Integer.valueOf(R.drawable.apple);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(2);
                qVar.h0(L2);
            }
            ActionRowItem("ActionRowItem", null, null, valueOf, (ho.a) L2, qVar, 24582, 6);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(3);
                qVar.h0(L3);
            }
            ActionRowItem("ActionRowItem with very long text that takes more than a line", null, null, null, (ho.a) L3, qVar, 24582, 14);
            Integer valueOf2 = Integer.valueOf(R.drawable.external);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(4);
                qVar.h0(L4);
            }
            ActionRowItem("ActionRowItem with very long text that takes more than a line", null, null, valueOf2, (ho.a) L4, qVar, 24582, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 18);
        }
    }

    public static final sn.z Preview_ActionRowGroup$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ActionRowGroup(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
