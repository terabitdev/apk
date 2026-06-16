package io.elevenlabs.ui.echo.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import ho.a;
import ho.p;
import i3.d;
import i3.t;
import io.elevenlabs.readerapp.ui.components.a0;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.components.ButtonIconContainerSize;
import io.elevenlabs.ui.echo.components.ButtonIconKt;
import io.livekit.android.rpc.RpcError;
import j0.c;
import j1.f;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import p1.g;
import p3.b1;
import p3.h0;
import p3.i0;
import p3.y0;
import p4.b0;
import p4.y;
import q2.e5;
import q2.y2;
import r1.d2;
import r1.p2;
import sn.z;
import t2.u;
import u2.e;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\u001ak\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001ay\u0010\u0015\u001a\u00020\u00052\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006\"²\u0006\f\u0010\u001f\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, d2 = {"", ParameterNames.ICON, "", "accessibilityLabel", "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "Lh5/f;", "iconSize", "Lp3/x;", "iconTint", "Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize;", "containerSize", "Lp3/b1;", "containerShape", "", "isLoading", "ButtonIcon-FhKo8ac", "(ILjava/lang/String;Lho/a;Li3/t;FJLio/elevenlabs/ui/echo/components/ButtonIconContainerSize;Lp3/b1;ZLu2/m;II)V", "ButtonIcon", "Lp1/l;", "interactionSource", "loaderSize", "tint", "ButtonIcon-bFRE0qE", "(Lho/p;Ljava/lang/String;Lho/a;Li3/t;Lp1/l;FLio/elevenlabs/ui/echo/components/ButtonIconContainerSize;Lp3/b1;JZLu2/m;II)V", "Preview_ButtonIcon", "(Lu2/m;I)V", "Preview_ButtonIcon_Loading", "isPressed", "", "scale", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ButtonIconKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: ButtonIcon-FhKo8ac */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1961ButtonIconFhKo8ac(final int i10, final String str, final a aVar, t tVar, float f10, long j4, ButtonIconContainerSize buttonIconContainerSize, b1 b1Var, boolean z6, m mVar, final int i11, final int i12) {
        int i13;
        t tVar2;
        int i14;
        int i15;
        float f11;
        int i16;
        long j10;
        b1 b1Var2;
        int i17;
        int i18;
        boolean z10;
        q qVar;
        final t tVar3;
        final float f12;
        final long j11;
        final b1 b1Var3;
        final ButtonIconContainerSize buttonIconContainerSize2;
        final boolean z11;
        r1 r10;
        int i19;
        ButtonIconContainerSize buttonIconContainerSize3;
        boolean z12;
        boolean z13;
        ButtonIconContainerSize buttonIconContainerSize4;
        t tVar4;
        Object L;
        e eVar;
        Object L2;
        z0 z0Var;
        Object L3;
        float f13;
        int i20;
        int i21;
        boolean h10;
        int i22;
        int i23;
        int i24;
        int i25;
        str.getClass();
        aVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-581435342);
        if ((i11 & 6) == 0) {
            if (qVar2.d(i10)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i13 = i25 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar2.f(str)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i13 |= i24;
        }
        if ((i11 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i23 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i23 = 128;
            }
            i13 |= i23;
        }
        int i26 = i12 & 8;
        if (i26 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                f11 = f10;
                if (qVar2.c(f11)) {
                    i16 = 16384;
                } else {
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i16;
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        j10 = j4;
                        if (qVar2.e(j10)) {
                            i22 = 131072;
                            i13 |= i22;
                        }
                    } else {
                        j10 = j4;
                    }
                    i22 = 65536;
                    i13 |= i22;
                } else {
                    j10 = j4;
                }
                if ((1572864 & i11) == 0) {
                    if ((i12 & 64) == 0) {
                        if ((2097152 & i11) == 0) {
                            h10 = qVar2.f(buttonIconContainerSize);
                        } else {
                            h10 = qVar2.h(buttonIconContainerSize);
                        }
                        if (h10) {
                            i21 = 1048576;
                            i13 |= i21;
                        }
                    }
                    i21 = 524288;
                    i13 |= i21;
                }
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        b1Var2 = b1Var;
                        if (qVar2.f(b1Var2)) {
                            i20 = 8388608;
                            i13 |= i20;
                        }
                    } else {
                        b1Var2 = b1Var;
                    }
                    i20 = 4194304;
                    i13 |= i20;
                } else {
                    b1Var2 = b1Var;
                }
                i17 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i17 != 0) {
                    i13 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (qVar2.g(z6)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i13 |= i18;
                }
                if ((i13 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (qVar2.O(i13 & 1, z10)) {
                    qVar2.T();
                    if ((i11 & 1) != 0 && !qVar2.y()) {
                        qVar2.R();
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                        }
                        buttonIconContainerSize4 = buttonIconContainerSize;
                        z13 = z6;
                    } else {
                        if (i26 != 0) {
                            tVar2 = i3.q.f13017a;
                        }
                        if (i15 != 0) {
                            f11 = 24;
                        }
                        if ((i12 & 32) != 0) {
                            j10 = EchoTheme.INSTANCE.getColors(qVar2, 6).getIcon().getPrimary(qVar2, 0);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float x2_5 = EchoTheme.INSTANCE.getSpacings(qVar2, 6).getX2_5();
                            i19 = -29360129;
                            buttonIconContainerSize3 = new ButtonIconContainerSize.WrapIcon(new d2(x2_5, x2_5, x2_5, x2_5));
                            i13 &= -3670017;
                        } else {
                            i19 = -29360129;
                            buttonIconContainerSize3 = buttonIconContainerSize;
                        }
                        if ((i12 & 128) != 0) {
                            z12 = false;
                            i13 &= i19;
                            b1Var2 = EchoTheme.INSTANCE.getShapes(qVar2, 6).getFull(qVar2, 0);
                        } else {
                            z12 = false;
                        }
                        if (i17 != 0) {
                            buttonIconContainerSize4 = buttonIconContainerSize3;
                            tVar4 = tVar2;
                            z13 = z12;
                            final float f14 = f11;
                            final long j12 = j10;
                            b1 b1Var4 = b1Var2;
                            qVar2.q();
                            L = qVar2.L();
                            eVar = l.f33918a;
                            if (L == eVar) {
                                L = c.o(qVar2);
                            }
                            p1.l lVar = (p1.l) L;
                            L2 = qVar2.L();
                            if (L2 == eVar) {
                                L2 = r.A(Boolean.FALSE);
                                qVar2.h0(L2);
                            }
                            z0Var = (z0) L2;
                            L3 = qVar2.L();
                            if (L3 == eVar) {
                                L3 = new g(lVar, z0Var, null, 1);
                                qVar2.h0(L3);
                            }
                            r.f((p) L3, lVar, qVar2);
                            if (!ButtonIcon_FhKo8ac$lambda$1(z0Var)) {
                                f13 = 0.8f;
                            } else {
                                f13 = 1.0f;
                            }
                            final s2 b10 = f.b(f13, j1.e.r(0.5f, 200.0f, 4, null), null, qVar2, 48, 28);
                            final ButtonIconContainerSize buttonIconContainerSize5 = buttonIconContainerSize4;
                            int i27 = i13 << 3;
                            qVar = qVar2;
                            m1962ButtonIconbFRE0qE(k.d(-1936818214, true, new p() { // from class: um.a
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    z ButtonIcon_FhKo8ac$lambda$3;
                                    int intValue = ((Integer) obj2).intValue();
                                    ButtonIcon_FhKo8ac$lambda$3 = ButtonIconKt.ButtonIcon_FhKo8ac$lambda$3(i10, buttonIconContainerSize5, f14, b10, j12, (m) obj, intValue);
                                    return ButtonIcon_FhKo8ac$lambda$3;
                                }
                            }, qVar2), str, aVar, tVar4, lVar, f14, buttonIconContainerSize4, b1Var4, j12, z13, qVar, (i13 & 112) | 24582 | (i13 & 896) | (i13 & 7168) | (458752 & i27) | (3670016 & i13) | (29360128 & i13) | ((i13 << 9) & 234881024) | (i27 & 1879048192), 0);
                            tVar3 = tVar4;
                            f12 = f14;
                            buttonIconContainerSize2 = buttonIconContainerSize4;
                            b1Var3 = b1Var4;
                            j11 = j12;
                            z11 = z13;
                        } else {
                            z13 = z6;
                            buttonIconContainerSize4 = buttonIconContainerSize3;
                        }
                    }
                    tVar4 = tVar2;
                    final float f142 = f11;
                    final long j122 = j10;
                    b1 b1Var42 = b1Var2;
                    qVar2.q();
                    L = qVar2.L();
                    eVar = l.f33918a;
                    if (L == eVar) {
                    }
                    p1.l lVar2 = (p1.l) L;
                    L2 = qVar2.L();
                    if (L2 == eVar) {
                    }
                    z0Var = (z0) L2;
                    L3 = qVar2.L();
                    if (L3 == eVar) {
                    }
                    r.f((p) L3, lVar2, qVar2);
                    if (!ButtonIcon_FhKo8ac$lambda$1(z0Var)) {
                    }
                    final s2 b102 = f.b(f13, j1.e.r(0.5f, 200.0f, 4, null), null, qVar2, 48, 28);
                    final ButtonIconContainerSize buttonIconContainerSize52 = buttonIconContainerSize4;
                    int i272 = i13 << 3;
                    qVar = qVar2;
                    m1962ButtonIconbFRE0qE(k.d(-1936818214, true, new p() { // from class: um.a
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z ButtonIcon_FhKo8ac$lambda$3;
                            int intValue = ((Integer) obj2).intValue();
                            ButtonIcon_FhKo8ac$lambda$3 = ButtonIconKt.ButtonIcon_FhKo8ac$lambda$3(i10, buttonIconContainerSize52, f142, b102, j122, (m) obj, intValue);
                            return ButtonIcon_FhKo8ac$lambda$3;
                        }
                    }, qVar2), str, aVar, tVar4, lVar2, f142, buttonIconContainerSize4, b1Var42, j122, z13, qVar, (i13 & 112) | 24582 | (i13 & 896) | (i13 & 7168) | (458752 & i272) | (3670016 & i13) | (29360128 & i13) | ((i13 << 9) & 234881024) | (i272 & 1879048192), 0);
                    tVar3 = tVar4;
                    f12 = f142;
                    buttonIconContainerSize2 = buttonIconContainerSize4;
                    b1Var3 = b1Var42;
                    j11 = j122;
                    z11 = z13;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    tVar3 = tVar2;
                    f12 = f11;
                    j11 = j10;
                    b1Var3 = b1Var2;
                    buttonIconContainerSize2 = buttonIconContainerSize;
                    z11 = z6;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new p() { // from class: um.b
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z ButtonIcon_FhKo8ac$lambda$4;
                            ButtonIcon_FhKo8ac$lambda$4 = ButtonIconKt.ButtonIcon_FhKo8ac$lambda$4(i10, str, aVar, tVar3, f12, j11, buttonIconContainerSize2, b1Var3, z11, i11, i12, (m) obj, ((Integer) obj2).intValue());
                            return ButtonIcon_FhKo8ac$lambda$4;
                        }
                    };
                    return;
                }
                return;
            }
            f11 = f10;
            if ((196608 & i11) == 0) {
            }
            if ((1572864 & i11) == 0) {
            }
            if ((12582912 & i11) == 0) {
            }
            i17 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i17 != 0) {
            }
            if ((i13 & 38347923) != 38347922) {
            }
            if (qVar2.O(i13 & 1, z10)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        f11 = f10;
        if ((196608 & i11) == 0) {
        }
        if ((1572864 & i11) == 0) {
        }
        if ((12582912 & i11) == 0) {
        }
        i17 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i17 != 0) {
        }
        if ((i13 & 38347923) != 38347922) {
        }
        if (qVar2.O(i13 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* renamed from: ButtonIcon-bFRE0qE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1962ButtonIconbFRE0qE(final p pVar, final String str, final a aVar, t tVar, p1.l lVar, float f10, ButtonIconContainerSize buttonIconContainerSize, b1 b1Var, long j4, boolean z6, m mVar, final int i10, final int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        p1.l lVar2;
        int i15;
        int i16;
        float f11;
        int i17;
        b1 b1Var2;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        q qVar;
        final ButtonIconContainerSize buttonIconContainerSize2;
        final boolean z11;
        final t tVar3;
        final p1.l lVar3;
        final b1 b1Var3;
        final long j10;
        r1 r10;
        ButtonIconContainerSize buttonIconContainerSize3;
        int i22;
        b1 b1Var4;
        long j11;
        int i23;
        long j12;
        boolean z12;
        t o6;
        boolean z13;
        long j13;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean h10;
        int i28;
        int i29;
        int i30;
        pVar.getClass();
        str.getClass();
        aVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1164605067);
        if ((i10 & 6) == 0) {
            if (qVar2.h(pVar)) {
                i30 = 4;
            } else {
                i30 = 2;
            }
            i12 = i30 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i12 |= i29;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i28 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i28 = 128;
            }
            i12 |= i28;
        }
        int i31 = i11 & 8;
        if (i31 != 0) {
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
                lVar2 = lVar;
                if (qVar2.f(lVar2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (qVar2.c(f11)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            if ((2097152 & i10) == 0) {
                                h10 = qVar2.f(buttonIconContainerSize);
                            } else {
                                h10 = qVar2.h(buttonIconContainerSize);
                            }
                            if (h10) {
                                i27 = 1048576;
                                i12 |= i27;
                            }
                        }
                        i27 = 524288;
                        i12 |= i27;
                    }
                    if ((12582912 & i10) != 0) {
                        if ((i11 & 128) == 0) {
                            b1Var2 = b1Var;
                            if (qVar2.f(b1Var2)) {
                                i26 = 8388608;
                                i12 |= i26;
                            }
                        } else {
                            b1Var2 = b1Var;
                        }
                        i26 = 4194304;
                        i12 |= i26;
                    } else {
                        b1Var2 = b1Var;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                            i24 = i12;
                            if (qVar2.e(j4)) {
                                i25 = 67108864;
                                i18 = i24 | i25;
                            }
                        } else {
                            i24 = i12;
                        }
                        i25 = 33554432;
                        i18 = i24 | i25;
                    } else {
                        i18 = i12;
                    }
                    i19 = i11 & 512;
                    if (i19 == 0) {
                        i18 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        i20 = i19;
                        if (qVar2.g(z6)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i18 |= i21;
                        if ((i18 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (qVar2.O(i18 & 1, z10)) {
                            qVar2.T();
                            int i32 = i10 & 1;
                            t tVar4 = i3.q.f13017a;
                            e eVar = l.f33918a;
                            if (i32 != 0 && !qVar2.y()) {
                                qVar2.R();
                                if ((i11 & 64) != 0) {
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                }
                                if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                                    i18 &= -234881025;
                                }
                                buttonIconContainerSize3 = buttonIconContainerSize;
                                z11 = z6;
                                b1Var4 = b1Var2;
                                i23 = i18;
                                j12 = j4;
                            } else {
                                if (i31 != 0) {
                                    tVar2 = tVar4;
                                }
                                if (i14 != 0) {
                                    Object L = qVar2.L();
                                    if (L == eVar) {
                                        L = c.o(qVar2);
                                    }
                                    lVar2 = (p1.l) L;
                                }
                                if (i16 != 0) {
                                    f11 = 24;
                                }
                                if ((i11 & 64) != 0) {
                                    float x2_5 = EchoTheme.INSTANCE.getSpacings(qVar2, 6).getX2_5();
                                    buttonIconContainerSize3 = new ButtonIconContainerSize.WrapIcon(new d2(x2_5, x2_5, x2_5, x2_5));
                                    i18 &= -3670017;
                                } else {
                                    buttonIconContainerSize3 = buttonIconContainerSize;
                                }
                                if ((i11 & 128) != 0) {
                                    i22 = 0;
                                    b1Var4 = EchoTheme.INSTANCE.getShapes(qVar2, 6).getFull(qVar2, 0);
                                    i18 &= -29360129;
                                } else {
                                    i22 = 0;
                                    b1Var4 = b1Var2;
                                }
                                if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                                    j11 = EchoTheme.INSTANCE.getColors(qVar2, 6).getIcon().getPrimary(qVar2, i22);
                                    i18 &= -234881025;
                                } else {
                                    j11 = j4;
                                }
                                if (i20 != 0) {
                                    i23 = i18;
                                    j12 = j11;
                                    z11 = false;
                                } else {
                                    z11 = z6;
                                    i23 = i18;
                                    j12 = j11;
                                }
                            }
                            qVar2.q();
                            p1.l lVar4 = lVar2;
                            boolean z14 = buttonIconContainerSize3 instanceof ButtonIconContainerSize.WrapIcon;
                            if (z14) {
                                z12 = z14;
                                o6 = tVar4;
                            } else {
                                z12 = z14;
                                if (buttonIconContainerSize3 instanceof ButtonIconContainerSize.Fixed) {
                                    o6 = p2.o(tVar4, ((ButtonIconContainerSize.Fixed) buttonIconContainerSize3).m1960getSizeD9Ej5fM());
                                } else {
                                    c6.p();
                                    return;
                                }
                            }
                            t tVar5 = tVar2;
                            b1 b1Var5 = b1Var4;
                            t n2 = n.n(h.c(tVar2.then(o6), b1Var4), lVar4, e5.b(u.P, 3, j12, false), false, new p4.k(0), aVar, 12);
                            long j14 = j12;
                            if ((i23 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            Object L2 = qVar2.L();
                            if (z13 || L2 == eVar) {
                                L2 = new lc.q(str, 24);
                                qVar2.h0(L2);
                            }
                            t c5 = p4.q.c(n2, true, (ho.l) L2);
                            f1 d10 = r1.p.d(d.f13001e, false);
                            int hashCode = Long.hashCode(qVar2.T);
                            o l4 = qVar2.l();
                            t c10 = i3.a.c(c5, qVar2);
                            h4.h.f11920i.getClass();
                            h4.f fVar = h4.g.f11903b;
                            qVar2.b0();
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            r.J(h4.g.f11907f, d10, qVar2);
                            r.J(h4.g.f11906e, l4, qVar2);
                            r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                            r.F(h4.g.f11909h, qVar2);
                            r.J(h4.g.f11905d, c10, qVar2);
                            if (z11) {
                                qVar2.X(-1867453382);
                                if (z12) {
                                    tVar4 = r1.d.D(tVar4, ((ButtonIconContainerSize.WrapIcon) buttonIconContainerSize3).getPadding());
                                } else if (!(buttonIconContainerSize3 instanceof ButtonIconContainerSize.Fixed)) {
                                    c6.p();
                                    return;
                                }
                                LoaderKt.m1840LoadereopBjH0(p2.o(tVar4, f11), j14, 0L, null, qVar2, (i23 >> 21) & 112, 12);
                                j13 = j14;
                                qVar = qVar2;
                                qVar.p(false);
                            } else {
                                qVar = qVar2;
                                j13 = j14;
                                qVar.X(-1866901303);
                                c.q(i23 & 14, pVar, qVar, false);
                            }
                            qVar.p(true);
                            buttonIconContainerSize2 = buttonIconContainerSize3;
                            lVar3 = lVar4;
                            b1Var3 = b1Var5;
                            j10 = j13;
                            tVar3 = tVar5;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            buttonIconContainerSize2 = buttonIconContainerSize;
                            z11 = z6;
                            tVar3 = tVar2;
                            lVar3 = lVar2;
                            b1Var3 = b1Var2;
                            j10 = j4;
                        }
                        final float f12 = f11;
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new p() { // from class: um.c
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    z ButtonIcon_bFRE0qE$lambda$3;
                                    int intValue = ((Integer) obj2).intValue();
                                    ButtonIcon_bFRE0qE$lambda$3 = ButtonIconKt.ButtonIcon_bFRE0qE$lambda$3(p.this, str, aVar, tVar3, lVar3, f12, buttonIconContainerSize2, b1Var3, j10, z11, i10, i11, (m) obj, intValue);
                                    return ButtonIcon_bFRE0qE$lambda$3;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i20 = i19;
                    if ((i18 & 306783379) != 306783378) {
                    }
                    if (qVar2.O(i18 & 1, z10)) {
                    }
                    final float f122 = f11;
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                f11 = f10;
                if ((1572864 & i10) == 0) {
                }
                if ((12582912 & i10) != 0) {
                }
                if ((i10 & 100663296) != 0) {
                }
                i19 = i11 & 512;
                if (i19 == 0) {
                }
                i20 = i19;
                if ((i18 & 306783379) != 306783378) {
                }
                if (qVar2.O(i18 & 1, z10)) {
                }
                final float f1222 = f11;
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            lVar2 = lVar;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            f11 = f10;
            if ((1572864 & i10) == 0) {
            }
            if ((12582912 & i10) != 0) {
            }
            if ((i10 & 100663296) != 0) {
            }
            i19 = i11 & 512;
            if (i19 == 0) {
            }
            i20 = i19;
            if ((i18 & 306783379) != 306783378) {
            }
            if (qVar2.O(i18 & 1, z10)) {
            }
            final float f12222 = f11;
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        lVar2 = lVar;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        f11 = f10;
        if ((1572864 & i10) == 0) {
        }
        if ((12582912 & i10) != 0) {
        }
        if ((i10 & 100663296) != 0) {
        }
        i19 = i11 & 512;
        if (i19 == 0) {
        }
        i20 = i19;
        if ((i18 & 306783379) != 306783378) {
        }
        if (qVar2.O(i18 & 1, z10)) {
        }
        final float f122222 = f11;
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final boolean ButtonIcon_FhKo8ac$lambda$1(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    private static final float ButtonIcon_FhKo8ac$lambda$2(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final z ButtonIcon_FhKo8ac$lambda$3(int i10, ButtonIconContainerSize buttonIconContainerSize, float f10, s2 s2Var, long j4, m mVar, int i11) {
        boolean z6;
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            u3.c M = kd.a.M(i10, qVar, 0);
            boolean z10 = buttonIconContainerSize instanceof ButtonIconContainerSize.WrapIcon;
            t tVar = i3.q.f13017a;
            if (z10) {
                tVar = r1.d.D(tVar, ((ButtonIconContainerSize.WrapIcon) buttonIconContainerSize).getPadding());
            } else if (!(buttonIconContainerSize instanceof ButtonIconContainerSize.Fixed)) {
                c6.p();
                return null;
            }
            t o6 = p2.o(tVar, f10);
            boolean f11 = qVar.f(s2Var);
            Object L = qVar.L();
            if (f11 || L == l.f33918a) {
                L = new a0(s2Var, 3);
                qVar.h0(L);
            }
            y2.a(M, null, h0.r(o6, (ho.l) L), j4, qVar, u3.c.$stable | 48, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ButtonIcon_FhKo8ac$lambda$3$0$0(s2 s2Var, i0 i0Var) {
        i0Var.getClass();
        y0 y0Var = (y0) i0Var;
        y0Var.r(ButtonIcon_FhKo8ac$lambda$2(s2Var));
        y0Var.s(ButtonIcon_FhKo8ac$lambda$2(s2Var));
        return z.f31622a;
    }

    public static final z ButtonIcon_FhKo8ac$lambda$4(int i10, String str, a aVar, t tVar, float f10, long j4, ButtonIconContainerSize buttonIconContainerSize, b1 b1Var, boolean z6, int i11, int i12, m mVar, int i13) {
        m1961ButtonIconFhKo8ac(i10, str, aVar, tVar, f10, j4, buttonIconContainerSize, b1Var, z6, mVar, r.M(i11 | 1), i12);
        return z.f31622a;
    }

    public static final z ButtonIcon_bFRE0qE$lambda$1$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z ButtonIcon_bFRE0qE$lambda$3(p pVar, String str, a aVar, t tVar, p1.l lVar, float f10, ButtonIconContainerSize buttonIconContainerSize, b1 b1Var, long j4, boolean z6, int i10, int i11, m mVar, int i12) {
        m1962ButtonIconbFRE0qE(pVar, str, aVar, tVar, lVar, f10, buttonIconContainerSize, b1Var, j4, z6, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ButtonIcon(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-482403125);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.ic_play;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new u2.b0(4);
                qVar.h0(L);
            }
            m1961ButtonIconFhKo8ac(i11, "Play", (a) L, null, u.P, 0L, null, null, false, qVar, 432, 504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 2);
        }
    }

    public static final z Preview_ButtonIcon$lambda$1(int i10, m mVar, int i11) {
        Preview_ButtonIcon(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ButtonIcon_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1453799400);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.ic_play;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new u2.b0(3);
                qVar.h0(L);
            }
            m1961ButtonIconFhKo8ac(i11, "Play", (a) L, null, u.P, 0L, null, null, true, qVar, 100663728, 248);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 1);
        }
    }

    public static final z Preview_ButtonIcon_Loading$lambda$1(int i10, m mVar, int i11) {
        Preview_ButtonIcon_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
