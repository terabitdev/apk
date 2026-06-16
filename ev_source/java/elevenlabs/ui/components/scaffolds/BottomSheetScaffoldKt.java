package io.elevenlabs.ui.components.scaffolds;

import a2.h3;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import fr.d0;
import h4.e;
import h4.f;
import h4.h;
import ho.p;
import ho.r;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.g;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.EchoCloseButtonKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.b1;
import p3.h0;
import q2.u5;
import q2.y3;
import q2.z3;
import r1.b3;
import r1.c3;
import r1.i2;
import r1.j;
import r1.k2;
import r1.l2;
import r1.m0;
import r1.m2;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001ag\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001ay\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\r2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0004\b\u0018\u0010\u001e\u001ai\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"", "skipPartiallyExpanded", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "", "headerTitle", "showCloseButton", "Lkotlin/Function1;", "Lr1/l2;", "headerActions", "Lio/elevenlabs/ui/components/scaffolds/BottomSheetControl;", "header", "Lkotlin/Function2;", "Lr1/y;", "children", "EchoBottomSheetScaffold", "(ZLho/a;Ljava/lang/String;ZLho/q;Lho/q;Lho/r;Lu2/m;II)V", "sheetGesturesEnabled", "Lp3/x;", "containerColor", "Lh5/f;", "topCornersRadius", "title", "BottomSheetScaffold-jb-40ds", "(ZZJFLho/a;Ljava/lang/String;Lho/r;Lu2/m;II)V", "BottomSheetScaffold", "actionsRight", "Lr1/s;", "child", "(ZZJFLho/a;Lho/r;Lho/r;Lu2/m;II)V", "shouldDismissOnBackPress", "(ZZJFLho/a;ZLho/r;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BottomSheetScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006f  */
    /* renamed from: BottomSheetScaffold-jb-40ds */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1899BottomSheetScaffoldjb40ds(boolean z6, boolean z10, long j4, float f10, final ho.a aVar, boolean z11, final r rVar, m mVar, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z12;
        int i14;
        long j10;
        int i15;
        float f11;
        int i16;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        q qVar;
        final boolean z15;
        final boolean z16;
        final long j11;
        final float f12;
        final boolean z17;
        r1 r10;
        float f13;
        float f14;
        long j12;
        int i19;
        boolean z18;
        boolean z19;
        Object L;
        Object obj;
        z0 H;
        Object L2;
        boolean f15;
        Object L3;
        int i20;
        int i21;
        int i22;
        aVar.getClass();
        rVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(1516144122);
        int i23 = i11 & 1;
        if (i23 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar2.g(z6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            z12 = z10;
            if (qVar2.g(z12)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 384) != 0) {
                j10 = j4;
                if ((i11 & 4) == 0 && qVar2.e(j10)) {
                    i22 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i22 = 128;
                }
                i12 |= i22;
            } else {
                j10 = j4;
            }
            i15 = i11 & 8;
            if (i15 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                f11 = f10;
                if (qVar2.c(f11)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i16;
                if ((i10 & 24576) == 0) {
                    if (qVar2.h(aVar)) {
                        i21 = 16384;
                    } else {
                        i21 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i21;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    z13 = z11;
                    if (qVar2.g(z13)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                    if ((i10 & 1572864) == 0) {
                        if (qVar2.h(rVar)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) == 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!qVar2.O(i12 & 1, z14)) {
                        qVar2.T();
                        if ((i10 & 1) != 0 && !qVar2.y()) {
                            qVar2.R();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            z15 = z6;
                            i19 = i12;
                            j12 = j10;
                            f14 = f11;
                        } else {
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z6;
                            }
                            if (i24 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 4) != 0) {
                                j10 = i.d(ElevenLabsTheme.INSTANCE, qVar2, 6);
                                i12 &= -897;
                            }
                            if (i15 != 0) {
                                f13 = 28;
                            } else {
                                f13 = f11;
                            }
                            f14 = f13;
                            if (i17 != 0) {
                                z18 = z12;
                                j12 = j10;
                                i19 = i12;
                                z19 = true;
                                qVar2.q();
                                u5 f16 = y3.f(i19 & 14, z15, qVar2, 2);
                                L = qVar2.L();
                                obj = l.f33918a;
                                if (L == obj) {
                                    L = u2.r.q(qVar2);
                                    qVar2.h0(L);
                                }
                                d0 d0Var = (d0) L;
                                H = u2.r.H(aVar, qVar2);
                                L2 = qVar2.L();
                                if (L2 == obj) {
                                    L2 = new BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1(d0Var, f16, H);
                                    qVar2.h0(L2);
                                }
                                BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1 bottomSheetScaffoldKt$BottomSheetScaffold$control$1$1 = (BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1) L2;
                                b1 none = ElevenLabsTheme.INSTANCE.getShapes(qVar2, 6).getNone();
                                long m2490getClear0d7_KjU = ReaderColors.Transparent.INSTANCE.m2490getClear0d7_KjU();
                                z3 z3Var = new z3(z19, 2);
                                f15 = qVar2.f(H);
                                L3 = qVar2.L();
                                if (!f15 || L3 == obj) {
                                    L3 = new a2.d0(H, 21);
                                    qVar2.h0(L3);
                                }
                                qVar = qVar2;
                                y3.a((ho.a) L3, null, f16, u.P, z18, none, m2490getClear0d7_KjU, 0L, u.P, 0L, null, new io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.a(3), z3Var, k.d(-1693814184, true, new io.elevenlabs.readerapp.ui.screens.authenticated.series.b(f14, j12, rVar, bottomSheetScaffoldKt$BottomSheetScaffold$control$1$1), qVar2), qVar, ((i19 << 9) & 57344) | 1572864);
                                z17 = z19;
                                z16 = z18;
                                j11 = j12;
                                f12 = f14;
                            } else {
                                j12 = j10;
                                i19 = i12;
                            }
                        }
                        z19 = z13;
                        z18 = z12;
                        qVar2.q();
                        u5 f162 = y3.f(i19 & 14, z15, qVar2, 2);
                        L = qVar2.L();
                        obj = l.f33918a;
                        if (L == obj) {
                        }
                        d0 d0Var2 = (d0) L;
                        H = u2.r.H(aVar, qVar2);
                        L2 = qVar2.L();
                        if (L2 == obj) {
                        }
                        BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1 bottomSheetScaffoldKt$BottomSheetScaffold$control$1$12 = (BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1) L2;
                        b1 none2 = ElevenLabsTheme.INSTANCE.getShapes(qVar2, 6).getNone();
                        long m2490getClear0d7_KjU2 = ReaderColors.Transparent.INSTANCE.m2490getClear0d7_KjU();
                        z3 z3Var2 = new z3(z19, 2);
                        f15 = qVar2.f(H);
                        L3 = qVar2.L();
                        if (!f15) {
                        }
                        L3 = new a2.d0(H, 21);
                        qVar2.h0(L3);
                        qVar = qVar2;
                        y3.a((ho.a) L3, null, f162, u.P, z18, none2, m2490getClear0d7_KjU2, 0L, u.P, 0L, null, new io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.a(3), z3Var2, k.d(-1693814184, true, new io.elevenlabs.readerapp.ui.screens.authenticated.series.b(f14, j12, rVar, bottomSheetScaffoldKt$BottomSheetScaffold$control$1$12), qVar2), qVar, ((i19 << 9) & 57344) | 1572864);
                        z17 = z19;
                        z16 = z18;
                        j11 = j12;
                        f12 = f14;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        z15 = z6;
                        z16 = z12;
                        j11 = j10;
                        f12 = f11;
                        z17 = z13;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new p() { // from class: io.elevenlabs.ui.components.scaffolds.b
                            @Override // ho.p
                            public final Object invoke(Object obj2, Object obj3) {
                                z BottomSheetScaffold_jb_40ds$lambda$8;
                                int intValue = ((Integer) obj3).intValue();
                                BottomSheetScaffold_jb_40ds$lambda$8 = BottomSheetScaffoldKt.BottomSheetScaffold_jb_40ds$lambda$8(z15, z16, j11, f12, aVar, z17, rVar, i10, i11, (m) obj2, intValue);
                                return BottomSheetScaffold_jb_40ds$lambda$8;
                            }
                        };
                        return;
                    }
                    return;
                }
                z13 = z11;
                if ((i10 & 1572864) == 0) {
                }
                if ((i12 & 599187) == 599186) {
                }
                if (!qVar2.O(i12 & 1, z14)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            f11 = f10;
            if ((i10 & 24576) == 0) {
            }
            i17 = i11 & 32;
            if (i17 != 0) {
            }
            z13 = z11;
            if ((i10 & 1572864) == 0) {
            }
            if ((i12 & 599187) == 599186) {
            }
            if (!qVar2.O(i12 & 1, z14)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        z12 = z10;
        if ((i10 & 384) != 0) {
        }
        i15 = i11 & 8;
        if (i15 == 0) {
        }
        f11 = f10;
        if ((i10 & 24576) == 0) {
        }
        i17 = i11 & 32;
        if (i17 != 0) {
        }
        z13 = z11;
        if ((i10 & 1572864) == 0) {
        }
        if ((i12 & 599187) == 599186) {
        }
        if (!qVar2.O(i12 & 1, z14)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$0(String str, r rVar, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean h10;
        int i12;
        int i13;
        yVar.getClass();
        bottomSheetControl.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(yVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = ((q) mVar).f(bottomSheetControl);
            } else {
                h10 = ((q) mVar).h(bottomSheetControl);
            }
            if (h10) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            HeaderKt.EchoHeader(str, null, null, k.d(-2094646725, true, new h3(bottomSheetControl, 8), qVar), null, qVar, 3072, 22);
            rVar.invoke(yVar, bottomSheetControl, qVar, Integer.valueOf(i11 & 126));
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$0$0(BottomSheetControl bottomSheetControl, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(bottomSheetControl);
            Object L = qVar.L();
            if (h10 || L == l.f33918a) {
                L = new g(bottomSheetControl, 3);
                qVar.h0(L);
            }
            CloseButtonKt.CloseButton((ho.a) L, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$0$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$1(boolean z6, boolean z10, long j4, float f10, ho.a aVar, String str, r rVar, int i10, int i11, m mVar, int i12) {
        m1898BottomSheetScaffoldjb40ds(z6, z10, j4, f10, aVar, str, rVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$2(r rVar, r rVar2, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean h10;
        int i12;
        yVar.getClass();
        bottomSheetControl.getClass();
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = ((q) mVar).f(bottomSheetControl);
            } else {
                h10 = ((q) mVar).h(bottomSheetControl);
            }
            if (h10) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            f1 d10 = r1.p.d(d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
            h.f11920i.getClass();
            f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar);
            e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            int i13 = (i11 & 112) | 6;
            rVar.invoke(r1.t.f29349a, bottomSheetControl, qVar, Integer.valueOf(i13));
            t e11 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            t f10 = i.f(elevenLabsTheme, qVar, 6, e11);
            u0 u0Var = j.f29228a;
            k2 a10 = i2.a(j.h(elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), d.D0), d.f13004y0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(f10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            rVar2.invoke(m2.f29267a, bottomSheetControl, qVar, Integer.valueOf(i13));
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$3(boolean z6, boolean z10, long j4, float f10, ho.a aVar, r rVar, r rVar2, int i10, int i11, m mVar, int i12) {
        m1897BottomSheetScaffoldjb40ds(z6, z10, j4, f10, aVar, rVar, rVar2, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$5$0(s2 s2Var) {
        ((ho.a) s2Var.getValue()).invoke();
        return z.f31622a;
    }

    public static final b3 BottomSheetScaffold_jb_40ds$lambda$6(m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.X(644490788);
        m0 m0Var = new m0(0);
        qVar.p(false);
        return m0Var;
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$7(float f10, long j4, r rVar, BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1 bottomSheetScaffoldKt$BottomSheetScaffold$control$1$1, y yVar, m mVar, int i10) {
        boolean z6;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.e eVar = j.f29231d;
            WeakHashMap weakHashMap = c3.f29142x;
            t h10 = n.h(m3.h.c(r1.d.p(r1.d.P(i3.q.f13017a, new o1(u0.e(qVar).f29155m, 16)), new o1(u0.e(qVar).f29155m, 16)), z1.h.d(f10, f10)), j4, h0.f26395b);
            x a10 = w.a(eVar, d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            f fVar = h4.g.f11903b;
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
            rVar.invoke(r1.z.f29398a, bottomSheetScaffoldKt$BottomSheetScaffold$control$1$1, qVar, 54);
            r1.d.g(r1.d.N(u0.e(qVar).f29155m), qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z BottomSheetScaffold_jb_40ds$lambda$8(boolean z6, boolean z10, long j4, float f10, ho.a aVar, boolean z11, r rVar, int i10, int i11, m mVar, int i12) {
        m1899BottomSheetScaffoldjb40ds(z6, z10, j4, f10, aVar, z11, rVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoBottomSheetScaffold(boolean z6, ho.a aVar, String str, boolean z10, ho.q qVar, ho.q qVar2, r rVar, m mVar, int i10, int i11) {
        int i12;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        int i17;
        ho.q qVar3;
        int i18;
        int i19;
        ho.q qVar4;
        int i20;
        boolean z11;
        q qVar5;
        boolean z12;
        boolean z13;
        String str3;
        ho.q qVar6;
        ho.q qVar7;
        r1 r10;
        boolean z14;
        String str4;
        int i21;
        int i22;
        aVar.getClass();
        rVar.getClass();
        q qVar8 = (q) mVar;
        qVar8.Z(-1966062699);
        int i23 = i11 & 1;
        if (i23 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar8.g(z6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar8.h(aVar)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        int i24 = i11 & 4;
        if (i24 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            str2 = str;
            if (qVar8.f(str2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            i15 = i11 & 8;
            if (i15 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (qVar8.g(z10)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i16;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    qVar3 = qVar;
                    if (qVar8.h(qVar3)) {
                        i18 = 16384;
                    } else {
                        i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i18;
                    i19 = i11 & 32;
                    if (i19 == 0) {
                        i12 |= 196608;
                    } else if ((196608 & i10) == 0) {
                        qVar4 = qVar2;
                        if (qVar8.h(qVar4)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                        if ((i10 & 1572864) == 0) {
                            if (qVar8.h(rVar)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (qVar8.O(i12 & 1, z11)) {
                            if (i23 != 0) {
                                z14 = true;
                            } else {
                                z14 = z6;
                            }
                            if (i24 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (i15 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if (i17 != 0) {
                                qVar6 = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1900getLambda$1154728543$ui_release();
                            } else {
                                qVar6 = qVar3;
                            }
                            if (i19 != 0) {
                                qVar7 = k.d(-998485863, true, new a2.b3(str4, qVar6, z13, 2), qVar8);
                            } else {
                                qVar7 = qVar4;
                            }
                            EchoTheme echoTheme = EchoTheme.INSTANCE;
                            qVar5 = qVar8;
                            m1899BottomSheetScaffoldjb40ds(z14, false, i.D(6, 0, echoTheme, qVar8, qVar8), echoTheme.getRadii(qVar8, 6).getFourXl(), aVar, false, (r) k.d(1242806343, true, new io.elevenlabs.readerapp.e(qVar7, rVar, 7), qVar8), (m) qVar5, (i12 & 14) | 1572864 | ((i12 << 9) & 57344), 34);
                            str3 = str4;
                            z12 = z14;
                        } else {
                            qVar5 = qVar8;
                            qVar5.R();
                            z12 = z6;
                            z13 = z10;
                            str3 = str2;
                            qVar6 = qVar3;
                            qVar7 = qVar4;
                        }
                        r10 = qVar5.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.q(z12, aVar, str3, z13, qVar6, qVar7, rVar, i10, i11);
                            return;
                        }
                        return;
                    }
                    qVar4 = qVar2;
                    if ((i10 & 1572864) == 0) {
                    }
                    if ((i12 & 599187) != 599186) {
                    }
                    if (qVar8.O(i12 & 1, z11)) {
                    }
                    r10 = qVar5.r();
                    if (r10 != null) {
                    }
                }
                qVar3 = qVar;
                i19 = i11 & 32;
                if (i19 == 0) {
                }
                qVar4 = qVar2;
                if ((i10 & 1572864) == 0) {
                }
                if ((i12 & 599187) != 599186) {
                }
                if (qVar8.O(i12 & 1, z11)) {
                }
                r10 = qVar5.r();
                if (r10 != null) {
                }
            }
            i17 = i11 & 16;
            if (i17 != 0) {
            }
            qVar3 = qVar;
            i19 = i11 & 32;
            if (i19 == 0) {
            }
            qVar4 = qVar2;
            if ((i10 & 1572864) == 0) {
            }
            if ((i12 & 599187) != 599186) {
            }
            if (qVar8.O(i12 & 1, z11)) {
            }
            r10 = qVar5.r();
            if (r10 != null) {
            }
        }
        str2 = str;
        i15 = i11 & 8;
        if (i15 == 0) {
        }
        i17 = i11 & 16;
        if (i17 != 0) {
        }
        qVar3 = qVar;
        i19 = i11 & 32;
        if (i19 == 0) {
        }
        qVar4 = qVar2;
        if ((i10 & 1572864) == 0) {
        }
        if ((i12 & 599187) != 599186) {
        }
        if (qVar8.O(i12 & 1, z11)) {
        }
        r10 = qVar5.r();
        if (r10 != null) {
        }
    }

    public static final z EchoBottomSheetScaffold$lambda$0(String str, ho.q qVar, boolean z6, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        int i11;
        boolean z10;
        boolean h10;
        int i12;
        bottomSheetControl.getClass();
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = ((q) mVar).f(bottomSheetControl);
            } else {
                h10 = ((q) mVar).h(bottomSheetControl);
            }
            if (h10) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar2 = (q) mVar;
        if (qVar2.O(i11 & 1, z10)) {
            if (str == null) {
                str = "";
            }
            HeaderKt.EchoHeader(str, null, null, k.d(-2113831793, true, new a2.b3(3, qVar, bottomSheetControl, z6), qVar2), null, qVar2, 3072, 22);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z EchoBottomSheetScaffold$lambda$0$0(ho.q qVar, boolean z6, BottomSheetControl bottomSheetControl, l2 l2Var, m mVar, int i10) {
        boolean z10;
        int i11;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(l2Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar2 = (q) mVar;
        if (qVar2.O(i10 & 1, z10)) {
            qVar.invoke(l2Var, qVar2, Integer.valueOf(i10 & 14));
            if (z6) {
                qVar2.X(-352378552);
                boolean h10 = qVar2.h(bottomSheetControl);
                Object L = qVar2.L();
                if (h10 || L == l.f33918a) {
                    L = new g(bottomSheetControl, 4);
                    qVar2.h0(L);
                }
                EchoCloseButtonKt.EchoCloseButton((ho.a) L, qVar2, 0);
                qVar2.p(false);
            } else {
                qVar2.X(-352306477);
                qVar2.p(false);
            }
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z EchoBottomSheetScaffold$lambda$0$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z EchoBottomSheetScaffold$lambda$1(ho.q qVar, r rVar, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean h10;
        int i12;
        int i13;
        yVar.getClass();
        bottomSheetControl.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(yVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = ((q) mVar).f(bottomSheetControl);
            } else {
                h10 = ((q) mVar).h(bottomSheetControl);
            }
            if (h10) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar2 = (q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            qVar.invoke(bottomSheetControl, qVar2, Integer.valueOf((i11 >> 3) & 14));
            rVar.invoke(yVar, bottomSheetControl, qVar2, Integer.valueOf(i11 & 126));
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z EchoBottomSheetScaffold$lambda$2(boolean z6, ho.a aVar, String str, boolean z10, ho.q qVar, ho.q qVar2, r rVar, int i10, int i11, m mVar, int i12) {
        EchoBottomSheetScaffold(z6, aVar, str, z10, qVar, qVar2, rVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0069  */
    /* renamed from: BottomSheetScaffold-jb-40ds */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1897BottomSheetScaffoldjb40ds(boolean z6, boolean z10, long j4, float f10, ho.a aVar, r rVar, r rVar2, m mVar, int i10, int i11) {
        boolean z11;
        int i12;
        boolean z12;
        long j10;
        int i13;
        float f11;
        q qVar;
        boolean z13;
        boolean z14;
        long j11;
        float f12;
        r1 r10;
        float f13;
        aVar.getClass();
        rVar.getClass();
        rVar2.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-918983115);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            z11 = z6;
        } else if ((i10 & 6) == 0) {
            z11 = z6;
            i12 = (qVar2.g(z11) ? 4 : 2) | i10;
        } else {
            z11 = z6;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            z12 = z10;
            i12 |= qVar2.g(z12) ? 32 : 16;
            if ((i10 & 384) != 0) {
                j10 = j4;
                i12 |= ((i11 & 4) == 0 && qVar2.e(j10)) ? RpcError.MAX_MESSAGE_BYTES : 128;
            } else {
                j10 = j4;
            }
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                f11 = f10;
                i12 |= qVar2.c(f11) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                if ((i10 & 24576) == 0) {
                    i12 |= qVar2.h(aVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                if ((196608 & i10) == 0) {
                    i12 |= qVar2.h(rVar) ? 131072 : 65536;
                }
                if ((i10 & 1572864) == 0) {
                    i12 |= qVar2.h(rVar2) ? 1048576 : 524288;
                }
                if (qVar2.O(i12 & 1, (599187 & i12) != 599186)) {
                    qVar2.T();
                    if ((i10 & 1) == 0 || qVar2.y()) {
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 4) != 0) {
                            j10 = i.d(ElevenLabsTheme.INSTANCE, qVar2, 6);
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            f13 = 28;
                            long j12 = j10;
                            boolean z15 = z11;
                            boolean z16 = z12;
                            qVar2.q();
                            qVar = qVar2;
                            m1899BottomSheetScaffoldjb40ds(z15, z16, j12, f13, aVar, false, (r) k.d(104166503, true, new io.elevenlabs.readerapp.e(rVar2, rVar, 8), qVar2), (m) qVar, (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                            z13 = z15;
                            z14 = z16;
                            j11 = j12;
                            f12 = f13;
                        }
                    } else {
                        qVar2.R();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                    }
                    f13 = f11;
                    long j122 = j10;
                    boolean z152 = z11;
                    boolean z162 = z12;
                    qVar2.q();
                    qVar = qVar2;
                    m1899BottomSheetScaffoldjb40ds(z152, z162, j122, f13, aVar, false, (r) k.d(104166503, true, new io.elevenlabs.readerapp.e(rVar2, rVar, 8), qVar2), (m) qVar, (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                    z13 = z152;
                    z14 = z162;
                    j11 = j122;
                    f12 = f13;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    z13 = z11;
                    z14 = z12;
                    j11 = j10;
                    f12 = f11;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new a(z13, z14, j11, f12, aVar, rVar, rVar2, i10, i11);
                    return;
                }
                return;
            }
            f11 = f10;
            if ((i10 & 24576) == 0) {
            }
            if ((196608 & i10) == 0) {
            }
            if ((i10 & 1572864) == 0) {
            }
            if (qVar2.O(i12 & 1, (599187 & i12) != 599186)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        z12 = z10;
        if ((i10 & 384) != 0) {
        }
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        f11 = f10;
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        if ((i10 & 1572864) == 0) {
        }
        if (qVar2.O(i12 & 1, (599187 & i12) != 599186)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0069  */
    /* renamed from: BottomSheetScaffold-jb-40ds */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1898BottomSheetScaffoldjb40ds(boolean z6, boolean z10, long j4, float f10, ho.a aVar, String str, r rVar, m mVar, int i10, int i11) {
        boolean z11;
        int i12;
        boolean z12;
        long j10;
        int i13;
        float f11;
        q qVar;
        boolean z13;
        boolean z14;
        long j11;
        float f12;
        r1 r10;
        float f13;
        aVar.getClass();
        str.getClass();
        rVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(636771);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            z11 = z6;
        } else if ((i10 & 6) == 0) {
            z11 = z6;
            i12 = (qVar2.g(z11) ? 4 : 2) | i10;
        } else {
            z11 = z6;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            z12 = z10;
            i12 |= qVar2.g(z12) ? 32 : 16;
            if ((i10 & 384) != 0) {
                j10 = j4;
                i12 |= ((i11 & 4) == 0 && qVar2.e(j10)) ? RpcError.MAX_MESSAGE_BYTES : 128;
            } else {
                j10 = j4;
            }
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                f11 = f10;
                i12 |= qVar2.c(f11) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                if ((i10 & 24576) == 0) {
                    i12 |= qVar2.h(aVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                if ((196608 & i10) == 0) {
                    i12 |= qVar2.f(str) ? 131072 : 65536;
                }
                if ((i10 & 1572864) == 0) {
                    i12 |= qVar2.h(rVar) ? 1048576 : 524288;
                }
                if (qVar2.O(i12 & 1, (599187 & i12) != 599186)) {
                    qVar2.T();
                    if ((i10 & 1) == 0 || qVar2.y()) {
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 4) != 0) {
                            j10 = i.d(ElevenLabsTheme.INSTANCE, qVar2, 6);
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            f13 = 28;
                            long j12 = j10;
                            boolean z15 = z11;
                            boolean z16 = z12;
                            qVar2.q();
                            qVar = qVar2;
                            m1899BottomSheetScaffoldjb40ds(z16, z15, j12, f13, aVar, false, (r) k.d(-406485007, true, new io.elevenlabs.readerapp.e(str, rVar, 6), qVar2), (m) qVar, ((i12 >> 3) & 14) | 1572864 | ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                            z14 = z16;
                            z13 = z15;
                            j11 = j12;
                            f12 = f13;
                        }
                    } else {
                        qVar2.R();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                    }
                    f13 = f11;
                    long j122 = j10;
                    boolean z152 = z11;
                    boolean z162 = z12;
                    qVar2.q();
                    qVar = qVar2;
                    m1899BottomSheetScaffoldjb40ds(z162, z152, j122, f13, aVar, false, (r) k.d(-406485007, true, new io.elevenlabs.readerapp.e(str, rVar, 6), qVar2), (m) qVar, ((i12 >> 3) & 14) | 1572864 | ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                    z14 = z162;
                    z13 = z152;
                    j11 = j122;
                    f12 = f13;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    z13 = z11;
                    z14 = z12;
                    j11 = j10;
                    f12 = f11;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new a(z13, z14, j11, f12, aVar, str, rVar, i10, i11);
                    return;
                }
                return;
            }
            f11 = f10;
            if ((i10 & 24576) == 0) {
            }
            if ((196608 & i10) == 0) {
            }
            if ((i10 & 1572864) == 0) {
            }
            if (qVar2.O(i12 & 1, (599187 & i12) != 599186)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        z12 = z10;
        if ((i10 & 384) != 0) {
        }
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        f11 = f10;
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        if ((i10 & 1572864) == 0) {
        }
        if (qVar2.O(i12 & 1, (599187 & i12) != 599186)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }
}
