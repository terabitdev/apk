package io.elevenlabs.ui.components.headers;

import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.e;
import h4.g;
import h4.h;
import ho.q;
import i3.d;
import i3.f;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.ui.components.u0;
import io.elevenlabs.ui.components.g2;
import io.elevenlabs.ui.components.s2;
import io.elevenlabs.ui.components.u1;
import io.elevenlabs.ui.components.y2;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.w0;
import p3.x;
import q2.j7;
import r1.b3;
import r1.c3;
import r1.d2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.l2;
import r1.m2;
import r1.p;
import r1.p2;
import r1.w;
import r1.z1;
import s4.y0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001ao\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\u0011\u001aW\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0099\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "title", "Li3/t;", "modifier", "titleModifier", "Lkotlin/Function1;", "Lr1/l2;", "Lsn/z;", "actions", "Lio/elevenlabs/ui/components/headers/EchoHeaderStyle;", "style", "EchoHeader", "(Ljava/lang/String;Li3/t;Li3/t;Lho/q;Lio/elevenlabs/ui/components/headers/EchoHeaderStyle;Lu2/m;II)V", "Li3/f;", "verticalAlignment", "Lr1/s;", "headerBackground", "(Lho/q;Li3/t;Lho/q;Lio/elevenlabs/ui/components/headers/EchoHeaderStyle;Li3/f;Lho/q;Lu2/m;II)V", "Lr1/b3;", "windowInsets", "", "titleMaxLines", "Header", "(Ljava/lang/String;Li3/t;Lho/q;Lr1/b3;Li3/f;ILu2/m;II)V", "Lh5/f;", "titleSpacing", "actionsSpacing", "Lr1/z1;", "paddingValues", "Lp3/x;", "backgroundColor", "Header-ShfnhV8", "(Li3/t;Lho/q;FLho/q;FLho/q;Lr1/z1;Lr1/b3;Li3/f;JLu2/m;II)V", "Preview_Header", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HeaderKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EchoHeaderStyle.values().length];
            try {
                iArr[EchoHeaderStyle.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EchoHeaderStyle.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoHeader(q qVar, t tVar, q qVar2, EchoHeaderStyle echoHeaderStyle, f fVar, q qVar3, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        q qVar4;
        int i15;
        int i16;
        int ordinal;
        int i17;
        int i18;
        int i19;
        int i20;
        q qVar5;
        int i21;
        boolean z6;
        u2.q qVar6;
        f fVar2;
        t tVar3;
        q qVar7;
        EchoHeaderStyle echoHeaderStyle2;
        r1 r10;
        int i22;
        t tVar4;
        q qVar8;
        EchoHeaderStyle echoHeaderStyle3;
        f fVar3;
        float x02;
        d2 d2Var;
        int i23;
        qVar.getClass();
        u2.q qVar9 = (u2.q) mVar;
        qVar9.Z(225197746);
        if ((i10 & 6) == 0) {
            if (qVar9.h(qVar)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar9.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                qVar4 = qVar2;
                if (qVar9.h(qVar4)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (echoHeaderStyle == null) {
                        ordinal = -1;
                    } else {
                        ordinal = echoHeaderStyle.ordinal();
                    }
                    if (qVar9.d(ordinal)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 16;
                if (i18 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (qVar9.f(fVar)) {
                        i19 = 16384;
                    } else {
                        i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i19;
                    i20 = i11 & 32;
                    if (i20 == 0) {
                        i12 |= 196608;
                    } else if ((196608 & i10) == 0) {
                        qVar5 = qVar3;
                        if (qVar9.h(qVar5)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                        if ((74899 & i12) != 74898) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar9.O(i12 & 1, z6)) {
                            if (i24 != 0) {
                                tVar4 = i3.q.f13017a;
                                i22 = i16;
                            } else {
                                i22 = i16;
                                tVar4 = tVar2;
                            }
                            if (i14 != 0) {
                                qVar8 = ComposableSingletons$HeaderKt.INSTANCE.getLambda$1828532025$ui_release();
                            } else {
                                qVar8 = qVar4;
                            }
                            if (i22 != 0) {
                                echoHeaderStyle3 = EchoHeaderStyle.Default;
                            } else {
                                echoHeaderStyle3 = echoHeaderStyle;
                            }
                            if (i18 != 0) {
                                fVar3 = d.f13005z0;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i20 != 0) {
                                qVar5 = null;
                            }
                            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                            int i25 = iArr[echoHeaderStyle3.ordinal()];
                            if (i25 != 1) {
                                if (i25 == 2) {
                                    qVar9.X(1666684852);
                                    x02 = EchoTheme.INSTANCE.getSpacings(qVar9, 6).getX1();
                                    qVar9.p(false);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(1666681014, qVar9, false);
                                }
                            } else {
                                qVar9.X(1666683092);
                                x02 = EchoTheme.INSTANCE.getSpacings(qVar9, 6).getX0();
                                qVar9.p(false);
                            }
                            float f10 = x02;
                            int i26 = iArr[echoHeaderStyle3.ordinal()];
                            if (i26 != 1) {
                                if (i26 == 2) {
                                    qVar9.X(1666694262);
                                    float x52 = EchoTheme.INSTANCE.getSpacings(qVar9, 6).getX5();
                                    d2 d2Var2 = new d2(x52, x52, x52, x52);
                                    qVar9.p(false);
                                    d2Var = d2Var2;
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(1666686208, qVar9, false);
                                }
                            } else {
                                qVar9.X(127710592);
                                EchoTheme echoTheme = EchoTheme.INSTANCE;
                                d2 d2Var3 = new d2(echoTheme.getSpacings(qVar9, 6).getX5(), echoTheme.getSpacings(qVar9, 6).getX6(), 6, echoTheme.getSpacings(qVar9, 6).getX4());
                                qVar9.p(false);
                                d2Var = d2Var3;
                            }
                            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                            float x12 = echoTheme2.getSpacings(qVar9, 6).getX1();
                            long D = i.D(6, 0, echoTheme2, qVar9, qVar9);
                            int i27 = i12 << 3;
                            qVar6 = qVar9;
                            f fVar4 = fVar3;
                            m1896HeaderShfnhV8(tVar4, qVar, x12, qVar8, f10, qVar5, d2Var, null, fVar4, D, qVar6, ((i12 >> 3) & 14) | (i27 & 112) | (i27 & 7168) | (458752 & i12) | ((i12 << 12) & 234881024), 128);
                            echoHeaderStyle2 = echoHeaderStyle3;
                            tVar3 = tVar4;
                            qVar7 = qVar8;
                            fVar2 = fVar4;
                        } else {
                            qVar6 = qVar9;
                            qVar6.R();
                            fVar2 = fVar;
                            tVar3 = tVar2;
                            qVar7 = qVar4;
                            echoHeaderStyle2 = echoHeaderStyle;
                        }
                        q qVar10 = qVar5;
                        r10 = qVar6.r();
                        if (r10 != null) {
                            r10.f34012d = new u0(qVar, tVar3, qVar7, echoHeaderStyle2, fVar2, qVar10, i10, i11, 10);
                            return;
                        }
                        return;
                    }
                    qVar5 = qVar3;
                    if ((74899 & i12) != 74898) {
                    }
                    if (qVar9.O(i12 & 1, z6)) {
                    }
                    q qVar102 = qVar5;
                    r10 = qVar6.r();
                    if (r10 != null) {
                    }
                }
                i20 = i11 & 32;
                if (i20 == 0) {
                }
                qVar5 = qVar3;
                if ((74899 & i12) != 74898) {
                }
                if (qVar9.O(i12 & 1, z6)) {
                }
                q qVar1022 = qVar5;
                r10 = qVar6.r();
                if (r10 != null) {
                }
            }
            qVar4 = qVar2;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            i18 = i11 & 16;
            if (i18 != 0) {
            }
            i20 = i11 & 32;
            if (i20 == 0) {
            }
            qVar5 = qVar3;
            if ((74899 & i12) != 74898) {
            }
            if (qVar9.O(i12 & 1, z6)) {
            }
            q qVar10222 = qVar5;
            r10 = qVar6.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        qVar4 = qVar2;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        i18 = i11 & 16;
        if (i18 != 0) {
        }
        i20 = i11 & 32;
        if (i20 == 0) {
        }
        qVar5 = qVar3;
        if ((74899 & i12) != 74898) {
        }
        if (qVar9.O(i12 & 1, z6)) {
        }
        q qVar102222 = qVar5;
        r10 = qVar6.r();
        if (r10 != null) {
        }
    }

    public static final z EchoHeader$lambda$0(t tVar, String str, y0 y0Var, l2 l2Var, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
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
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            j7.d(str, l2Var.b(i3.q.f13017a, 1.0f, true).then(tVar), i.v(6, 0, EchoTheme.INSTANCE, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 1, 0, null, y0Var, qVar, 0, 24576, 114680);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z EchoHeader$lambda$1(String str, t tVar, t tVar2, q qVar, EchoHeaderStyle echoHeaderStyle, int i10, int i11, m mVar, int i12) {
        EchoHeader(str, tVar, tVar2, qVar, echoHeaderStyle, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z EchoHeader$lambda$2(q qVar, t tVar, q qVar2, EchoHeaderStyle echoHeaderStyle, f fVar, q qVar3, int i10, int i11, m mVar, int i12) {
        EchoHeader(qVar, tVar, qVar2, echoHeaderStyle, fVar, qVar3, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(String str, t tVar, q qVar, b3 b3Var, f fVar, int i10, m mVar, int i11, int i12) {
        int i13;
        t tVar2;
        int i14;
        int i15;
        q qVar2;
        int i16;
        b3 b3Var2;
        int i17;
        f fVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z6;
        u2.q qVar3;
        t tVar3;
        q qVar4;
        b3 b3Var3;
        f fVar3;
        int i22;
        r1 r10;
        t tVar4;
        b3 b3Var4;
        f fVar4;
        q qVar5;
        t tVar5;
        int i23;
        int i24;
        int i25;
        int i26;
        str.getClass();
        u2.q qVar6 = (u2.q) mVar;
        qVar6.Z(-2053524550);
        if ((i11 & 6) == 0) {
            if (qVar6.f(str)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i13 = i26 | i11;
        } else {
            i13 = i11;
        }
        int i27 = i12 & 2;
        if (i27 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            tVar2 = tVar;
            if (qVar6.f(tVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
            i15 = i12 & 4;
            if (i15 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                qVar2 = qVar;
                if (qVar6.h(qVar2)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i13 |= i16;
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        b3Var2 = b3Var;
                        if (qVar6.f(b3Var2)) {
                            i25 = 2048;
                            i13 |= i25;
                        }
                    } else {
                        b3Var2 = b3Var;
                    }
                    i25 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i13 |= i25;
                } else {
                    b3Var2 = b3Var;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    fVar2 = fVar;
                    if (qVar6.f(fVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i13 |= i18;
                    i19 = i12 & 32;
                    if (i19 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        i20 = i10;
                        if (qVar6.d(i20)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                        if ((74899 & i13) != 74898) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar6.O(i13 & 1, z6)) {
                            qVar6.T();
                            if ((i11 & 1) != 0 && !qVar6.y()) {
                                qVar6.R();
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                i23 = i13;
                                b3Var4 = b3Var2;
                                fVar4 = fVar2;
                                i24 = i20;
                                qVar5 = qVar2;
                                tVar5 = tVar2;
                            } else {
                                if (i27 != 0) {
                                    tVar4 = i3.q.f13017a;
                                } else {
                                    tVar4 = tVar2;
                                }
                                if (i15 != 0) {
                                    qVar2 = ComposableSingletons$HeaderKt.INSTANCE.getLambda$25680833$ui_release();
                                }
                                if ((i12 & 8) != 0) {
                                    WeakHashMap weakHashMap = c3.f29142x;
                                    i13 &= -7169;
                                    b3Var2 = r1.u0.e(qVar6).f29149g;
                                }
                                if (i17 != 0) {
                                    fVar2 = d.f13005z0;
                                }
                                b3Var4 = b3Var2;
                                fVar4 = fVar2;
                                qVar5 = qVar2;
                                tVar5 = tVar4;
                                i23 = i13;
                                if (i19 != 0) {
                                    i24 = 2;
                                } else {
                                    i24 = i20;
                                }
                            }
                            qVar6.q();
                            int i28 = ((i23 >> 3) & 14) | 48 | ((i23 << 3) & 7168);
                            int i29 = i23 << 12;
                            qVar3 = qVar6;
                            m1896HeaderShfnhV8(tVar5, k.d(735042135, true, new y2(str, i24), qVar6), u.P, qVar5, u.P, null, null, b3Var4, fVar4, 0L, qVar3, i28 | (29360128 & i29) | (i29 & 234881024), 628);
                            i22 = i24;
                            tVar3 = tVar5;
                            qVar4 = qVar5;
                            b3Var3 = b3Var4;
                            fVar3 = fVar4;
                        } else {
                            qVar3 = qVar6;
                            qVar3.R();
                            tVar3 = tVar2;
                            qVar4 = qVar2;
                            b3Var3 = b3Var2;
                            fVar3 = fVar2;
                            i22 = i20;
                        }
                        r10 = qVar3.r();
                        if (r10 != null) {
                            r10.f34012d = new g2(str, tVar3, qVar4, b3Var3, fVar3, i22, i11, i12);
                            return;
                        }
                        return;
                    }
                    i20 = i10;
                    if ((74899 & i13) != 74898) {
                    }
                    if (qVar6.O(i13 & 1, z6)) {
                    }
                    r10 = qVar3.r();
                    if (r10 != null) {
                    }
                }
                fVar2 = fVar;
                i19 = i12 & 32;
                if (i19 == 0) {
                }
                i20 = i10;
                if ((74899 & i13) != 74898) {
                }
                if (qVar6.O(i13 & 1, z6)) {
                }
                r10 = qVar3.r();
                if (r10 != null) {
                }
            }
            qVar2 = qVar;
            if ((i11 & 3072) == 0) {
            }
            i17 = i12 & 16;
            if (i17 != 0) {
            }
            fVar2 = fVar;
            i19 = i12 & 32;
            if (i19 == 0) {
            }
            i20 = i10;
            if ((74899 & i13) != 74898) {
            }
            if (qVar6.O(i13 & 1, z6)) {
            }
            r10 = qVar3.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 4;
        if (i15 == 0) {
        }
        qVar2 = qVar;
        if ((i11 & 3072) == 0) {
        }
        i17 = i12 & 16;
        if (i17 != 0) {
        }
        fVar2 = fVar;
        i19 = i12 & 32;
        if (i19 == 0) {
        }
        i20 = i10;
        if ((74899 & i13) != 74898) {
        }
        if (qVar6.O(i13 & 1, z6)) {
        }
        r10 = qVar3.r();
        if (r10 != null) {
        }
    }

    public static final z Header$lambda$0(String str, int i10, l2 l2Var, m mVar, int i11) {
        int i12;
        boolean z6;
        int i13;
        l2Var.getClass();
        if ((i11 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i11 | i13;
        } else {
            i12 = i11;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i12 & 1, z6)) {
            j7.d(str, l2Var.b(i3.q.f13017a, 1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, i10, 0, null, ElevenLabsTheme.INSTANCE.getTypo(qVar, 6).getTitleLarge700Inter(), qVar, 0, 384, 110588);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Header$lambda$1(String str, t tVar, q qVar, b3 b3Var, f fVar, int i10, int i11, int i12, m mVar, int i13) {
        Header(str, tVar, qVar, b3Var, fVar, i10, mVar, r.M(i11 | 1), i12);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* renamed from: Header-ShfnhV8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1896HeaderShfnhV8(t tVar, final q qVar, float f10, q qVar2, float f11, q qVar3, z1 z1Var, b3 b3Var, f fVar, long j4, m mVar, final int i10, final int i11) {
        int i12;
        int i13;
        q qVar4;
        int i14;
        float f12;
        int i15;
        q qVar5;
        int i16;
        z1 z1Var2;
        b3 b3Var2;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        final float f13;
        final f fVar2;
        final q qVar6;
        final float f14;
        final q qVar7;
        final z1 z1Var3;
        final b3 b3Var3;
        final long j10;
        r1 r10;
        t tVar2;
        float f15;
        q qVar8;
        float f16;
        q qVar9;
        z1 z1Var4;
        b3 b3Var4;
        f fVar3;
        long j11;
        int i21;
        t tVar3;
        boolean z10;
        long j12;
        t h10;
        t tVar4;
        t tVar5;
        z1 z1Var5;
        boolean z11;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        qVar.getClass();
        u2.q qVar10 = (u2.q) mVar;
        qVar10.Z(-5807276);
        int i29 = i11 & 1;
        if (i29 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar10.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar10.h(qVar)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i12 |= i28;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0 && qVar10.c(f10)) {
                i27 = RpcError.MAX_MESSAGE_BYTES;
                i12 |= i27;
            }
            i27 = 128;
            i12 |= i27;
        }
        int i30 = i11 & 8;
        if (i30 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            qVar4 = qVar2;
            if (qVar10.h(qVar4)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
            if ((i10 & 24576) != 0) {
                if ((i11 & 16) == 0) {
                    f12 = f11;
                    if (qVar10.c(f12)) {
                        i26 = 16384;
                        i12 |= i26;
                    }
                } else {
                    f12 = f11;
                }
                i26 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i12 |= i26;
            } else {
                f12 = f11;
            }
            i15 = i11 & 32;
            if (i15 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                qVar5 = qVar3;
                if (qVar10.h(qVar5)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        z1Var2 = z1Var;
                        if (qVar10.f(z1Var2)) {
                            i25 = 1048576;
                            i12 |= i25;
                        }
                    } else {
                        z1Var2 = z1Var;
                    }
                    i25 = 524288;
                    i12 |= i25;
                } else {
                    z1Var2 = z1Var;
                }
                if ((12582912 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        b3Var2 = b3Var;
                        if (qVar10.f(b3Var2)) {
                            i24 = 8388608;
                            i12 |= i24;
                        }
                    } else {
                        b3Var2 = b3Var;
                    }
                    i24 = 4194304;
                    i12 |= i24;
                } else {
                    b3Var2 = b3Var;
                }
                i17 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i17 != 0) {
                    i12 |= 100663296;
                    i18 = i29;
                } else {
                    i18 = i29;
                    if ((i10 & 100663296) == 0) {
                        if (qVar10.f(fVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                }
                if ((i10 & 805306368) == 0) {
                    if ((i11 & 512) == 0) {
                        i22 = i12;
                        if (qVar10.e(j4)) {
                            i23 = 536870912;
                            i20 = i22 | i23;
                        }
                    } else {
                        i22 = i12;
                    }
                    i23 = 268435456;
                    i20 = i22 | i23;
                } else {
                    i20 = i12;
                }
                if ((i20 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar10.O(i20 & 1, z6)) {
                    qVar10.T();
                    int i31 = i10 & 1;
                    i3.q qVar11 = i3.q.f13017a;
                    if (i31 != 0 && !qVar10.y()) {
                        qVar10.R();
                        if ((i11 & 4) != 0) {
                            i20 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i20 &= -57345;
                        }
                        if ((i11 & 64) != 0) {
                            i20 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                        }
                        if ((i11 & 512) != 0) {
                            i20 &= -1879048193;
                        }
                        f15 = f10;
                        i21 = i20;
                        qVar8 = qVar4;
                        f16 = f12;
                        qVar9 = qVar5;
                        z1Var4 = z1Var2;
                        b3Var4 = b3Var2;
                        tVar3 = tVar;
                        fVar3 = fVar;
                        j11 = j4;
                    } else {
                        if (i18 != 0) {
                            tVar2 = qVar11;
                        } else {
                            tVar2 = tVar;
                        }
                        t tVar6 = tVar2;
                        if ((i11 & 4) != 0) {
                            f15 = ElevenLabsTheme.INSTANCE.getSpacings(qVar10, 6).m2357getX5D9Ej5fM();
                            i20 &= -897;
                        } else {
                            f15 = f10;
                        }
                        if (i30 != 0) {
                            qVar8 = ComposableSingletons$HeaderKt.INSTANCE.m1893getLambda$1251442835$ui_release();
                        } else {
                            qVar8 = qVar4;
                        }
                        if ((i11 & 16) != 0) {
                            f16 = ElevenLabsTheme.INSTANCE.getSpacings(qVar10, 6).m2355getX3D9Ej5fM();
                            i20 &= -57345;
                        } else {
                            f16 = f12;
                        }
                        if (i15 != 0) {
                            qVar9 = null;
                        } else {
                            qVar9 = qVar5;
                        }
                        if ((i11 & 64) != 0) {
                            float m2357getX5D9Ej5fM = ElevenLabsTheme.INSTANCE.getSpacings(qVar10, 6).m2357getX5D9Ej5fM();
                            z1Var4 = new d2(m2357getX5D9Ej5fM, m2357getX5D9Ej5fM, m2357getX5D9Ej5fM, m2357getX5D9Ej5fM);
                            i20 &= -3670017;
                        } else {
                            z1Var4 = z1Var2;
                        }
                        if ((i11 & 128) != 0) {
                            WeakHashMap weakHashMap = c3.f29142x;
                            b3Var4 = r1.u0.e(qVar10).f29149g;
                            i20 &= -29360129;
                        } else {
                            b3Var4 = b3Var2;
                        }
                        if (i17 != 0) {
                            fVar3 = d.f13005z0;
                        } else {
                            fVar3 = fVar;
                        }
                        if ((i11 & 512) != 0) {
                            j11 = i.d(ElevenLabsTheme.INSTANCE, qVar10, 6);
                            i20 &= -1879048193;
                        } else {
                            j11 = j4;
                        }
                        i21 = i20;
                        tVar3 = tVar6;
                    }
                    qVar10.q();
                    t e10 = p2.e(qVar11, 1.0f);
                    tVar = tVar3;
                    float f17 = f16;
                    f1 d10 = p.d(d.f12998b, false);
                    int hashCode = Long.hashCode(qVar10.T);
                    o l4 = qVar10.l();
                    t c5 = i3.a.c(e10, qVar10);
                    h.f11920i.getClass();
                    h4.f fVar4 = g.f11903b;
                    qVar10.b0();
                    if (qVar10.S) {
                        qVar10.k(fVar4);
                    } else {
                        qVar10.k0();
                    }
                    e eVar = g.f11907f;
                    r.J(eVar, d10, qVar10);
                    e eVar2 = g.f11906e;
                    r.J(eVar2, l4, qVar10);
                    Integer valueOf = Integer.valueOf(hashCode);
                    float f18 = f15;
                    e eVar3 = g.f11908g;
                    r.y(qVar10, valueOf, eVar3);
                    h4.d dVar = g.f11909h;
                    r.F(dVar, qVar10);
                    q qVar12 = qVar8;
                    e eVar4 = g.f11905d;
                    r.J(eVar4, c5, qVar10);
                    if (qVar9 != null) {
                        qVar10.X(-656693908);
                        qVar9.invoke(r1.t.f29349a, qVar10, Integer.valueOf(6 | ((i21 >> 12) & 112)));
                        z10 = false;
                    } else {
                        z10 = false;
                        qVar10.X(1117342632);
                    }
                    qVar10.p(z10);
                    t disableClickThrough = ComposeExtensionsKt.disableClickThrough(tVar);
                    w0 w0Var = h0.f26395b;
                    if (qVar9 == null) {
                        h10 = n.h(qVar11, j11, w0Var);
                        j12 = j11;
                    } else {
                        j12 = j11;
                        h10 = n.h(qVar11, x.f26437l, w0Var);
                    }
                    t then = disableClickThrough.then(h10);
                    r1.x a10 = w.a(j.f29230c, d.B0, qVar10, 0);
                    int hashCode2 = Long.hashCode(qVar10.T);
                    o l7 = qVar10.l();
                    t c10 = i3.a.c(then, qVar10);
                    qVar10.b0();
                    q qVar13 = qVar9;
                    if (qVar10.S) {
                        qVar10.k(fVar4);
                    } else {
                        qVar10.k0();
                    }
                    r.J(eVar, a10, qVar10);
                    r.J(eVar2, l7, qVar10);
                    defpackage.f.u(hashCode2, qVar10, eVar3, qVar10, dVar);
                    r.J(eVar4, c10, qVar10);
                    if (b3Var4 != null) {
                        tVar4 = r1.d.Q(b3Var4);
                    } else {
                        tVar4 = qVar11;
                    }
                    if (b3Var4 != null) {
                        tVar5 = r1.d.p(qVar11, b3Var4);
                    } else {
                        tVar5 = qVar11;
                    }
                    r1.d.g(tVar4.then(tVar5), qVar10);
                    t D = r1.d.D(qVar11, z1Var4);
                    int i32 = (((i21 >> 18) & 896) >> 3) & 112;
                    k2 a11 = i2.a(j.f29228a, fVar3, qVar10, i32);
                    int hashCode3 = Long.hashCode(qVar10.T);
                    o l10 = qVar10.l();
                    t c11 = i3.a.c(D, qVar10);
                    qVar10.b0();
                    b3 b3Var5 = b3Var4;
                    if (qVar10.S) {
                        qVar10.k(fVar4);
                    } else {
                        qVar10.k0();
                    }
                    r.J(eVar, a11, qVar10);
                    r.J(eVar2, l10, qVar10);
                    defpackage.f.u(hashCode3, qVar10, eVar3, qVar10, dVar);
                    r.J(eVar4, c11, qVar10);
                    Object valueOf2 = Integer.valueOf(6 | (i21 & 112));
                    Object obj = m2.f29267a;
                    qVar.invoke(obj, qVar10, valueOf2);
                    Object L = qVar10.L();
                    if (L == l.f33918a) {
                        L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(24);
                        qVar10.h0(L);
                    }
                    if (!kotlin.jvm.internal.m.c(qVar12, (ho.a) L)) {
                        qVar10.X(-1722456486);
                        r1.d.g(p2.s(qVar11, f18), qVar10);
                        k2 a12 = i2.a(j.g(f17), fVar3, qVar10, i32);
                        z1Var5 = z1Var4;
                        int hashCode4 = Long.hashCode(qVar10.T);
                        o l11 = qVar10.l();
                        t c12 = i3.a.c(qVar11, qVar10);
                        qVar10.b0();
                        if (qVar10.S) {
                            qVar10.k(fVar4);
                        } else {
                            qVar10.k0();
                        }
                        r.J(eVar, a12, qVar10);
                        r.J(eVar2, l11, qVar10);
                        defpackage.f.u(hashCode4, qVar10, eVar3, qVar10, dVar);
                        r.J(eVar4, c12, qVar10);
                        qVar12.invoke(obj, qVar10, Integer.valueOf(6 | ((i21 >> 6) & 112)));
                        z11 = true;
                        qVar10.p(true);
                        qVar10.p(false);
                    } else {
                        z1Var5 = z1Var4;
                        z11 = true;
                        qVar10.X(-1722129746);
                        qVar10.p(false);
                    }
                    p.n.t(qVar10, z11, z11, z11);
                    f14 = f17;
                    qVar7 = qVar13;
                    b3Var3 = b3Var5;
                    fVar2 = fVar3;
                    qVar6 = qVar12;
                    z1Var3 = z1Var5;
                    f13 = f18;
                    j10 = j12;
                } else {
                    qVar10.R();
                    f13 = f10;
                    fVar2 = fVar;
                    qVar6 = qVar4;
                    f14 = f12;
                    qVar7 = qVar5;
                    z1Var3 = z1Var2;
                    b3Var3 = b3Var2;
                    j10 = j4;
                }
                final t tVar7 = tVar;
                r10 = qVar10.r();
                if (r10 != null) {
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.headers.b
                        @Override // ho.p
                        public final Object invoke(Object obj2, Object obj3) {
                            z Header_ShfnhV8$lambda$1;
                            int intValue = ((Integer) obj3).intValue();
                            Header_ShfnhV8$lambda$1 = HeaderKt.Header_ShfnhV8$lambda$1(t.this, qVar, f13, qVar6, f14, qVar7, z1Var3, b3Var3, fVar2, j10, i10, i11, (m) obj2, intValue);
                            return Header_ShfnhV8$lambda$1;
                        }
                    };
                    return;
                }
                return;
            }
            qVar5 = qVar3;
            if ((1572864 & i10) == 0) {
            }
            if ((12582912 & i10) == 0) {
            }
            i17 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i17 != 0) {
            }
            if ((i10 & 805306368) == 0) {
            }
            if ((i20 & 306783379) != 306783378) {
            }
            if (qVar10.O(i20 & 1, z6)) {
            }
            final t tVar72 = tVar;
            r10 = qVar10.r();
            if (r10 != null) {
            }
        }
        qVar4 = qVar2;
        if ((i10 & 24576) != 0) {
        }
        i15 = i11 & 32;
        if (i15 == 0) {
        }
        qVar5 = qVar3;
        if ((1572864 & i10) == 0) {
        }
        if ((12582912 & i10) == 0) {
        }
        i17 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i17 != 0) {
        }
        if ((i10 & 805306368) == 0) {
        }
        if ((i20 & 306783379) != 306783378) {
        }
        if (qVar10.O(i20 & 1, z6)) {
        }
        final t tVar722 = tVar;
        r10 = qVar10.r();
        if (r10 != null) {
        }
    }

    public static final z Header_ShfnhV8$lambda$1(t tVar, q qVar, float f10, q qVar2, float f11, q qVar3, z1 z1Var, b3 b3Var, f fVar, long j4, int i10, int i11, m mVar, int i12) {
        m1896HeaderShfnhV8(tVar, qVar, f10, qVar2, f11, qVar3, z1Var, b3Var, fVar, j4, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_Header(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1255430968);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.x a10 = w.a(j.f29230c, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
            h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            EchoHeader("Header", null, null, null, null, qVar, 6, 30);
            qVar = qVar;
            Header("Header", null, null, null, null, 0, qVar, 6, 62);
            Header("Header with very long title that won't fit the screen", null, null, null, null, 0, qVar, 6, 62);
            ComposableSingletons$HeaderKt composableSingletons$HeaderKt = ComposableSingletons$HeaderKt.INSTANCE;
            Header("Header", null, composableSingletons$HeaderKt.m1895getLambda$928325014$ui_release(), null, null, 0, qVar, 390, 58);
            Header("Header with very long title that won't fit the screen", null, composableSingletons$HeaderKt.m1894getLambda$746591765$ui_release(), null, null, 0, qVar, 390, 58);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 25);
        }
    }

    public static final z Preview_Header$lambda$1(int i10, m mVar, int i11) {
        Preview_Header(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoHeader(String str, t tVar, t tVar2, q qVar, EchoHeaderStyle echoHeaderStyle, m mVar, int i10, int i11) {
        int i12;
        t tVar3;
        int i13;
        t tVar4;
        int i14;
        q qVar2;
        int i15;
        u2.q qVar3;
        t tVar5;
        t tVar6;
        EchoHeaderStyle echoHeaderStyle2;
        r1 r10;
        int i16;
        t tVar7;
        y0 lgCompact500;
        str.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(1923808942);
        if ((i10 & 6) == 0) {
            i12 = (qVar4.f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar3 = tVar;
            i12 |= qVar4.f(tVar3) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                tVar4 = tVar2;
                i12 |= qVar4.f(tVar4) ? RpcError.MAX_MESSAGE_BYTES : 128;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    qVar2 = qVar;
                    i12 |= qVar4.h(qVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i15 = i11 & 16;
                    if (i15 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        i12 |= qVar4.d(echoHeaderStyle == null ? -1 : echoHeaderStyle.ordinal()) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    if (!qVar4.O(i12 & 1, (i12 & 9363) == 9362)) {
                        i3.q qVar5 = i3.q.f13017a;
                        if (i17 != 0) {
                            i16 = i13;
                            tVar7 = qVar5;
                        } else {
                            i16 = i13;
                            tVar7 = tVar3;
                        }
                        t tVar8 = i16 != 0 ? qVar5 : tVar4;
                        if (i14 != 0) {
                            qVar2 = ComposableSingletons$HeaderKt.INSTANCE.getLambda$1513030983$ui_release();
                        }
                        echoHeaderStyle2 = i15 != 0 ? EchoHeaderStyle.Default : echoHeaderStyle;
                        int i18 = WhenMappings.$EnumSwitchMapping$0[echoHeaderStyle2.ordinal()];
                        if (i18 == 1) {
                            qVar4.X(1944465978);
                            lgCompact500 = EchoTheme.INSTANCE.getTypography(qVar4, 6).getLgCompact500(qVar4, 0);
                            qVar4.p(false);
                        } else if (i18 == 2) {
                            qVar4.X(1944468125);
                            lgCompact500 = EchoTheme.INSTANCE.getTypography(qVar4, 6).getTwoXlRegular500(qVar4, 0);
                            qVar4.p(false);
                        } else {
                            throw com.google.android.gms.internal.play_billing.b.h(1944463853, qVar4, false);
                        }
                        c3.j d10 = k.d(-1438484751, true, new s2(tVar8, str, lgCompact500, 1), qVar4);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        qVar3 = qVar4;
                        m1896HeaderShfnhV8(tVar7, d10, u.P, qVar2, echoTheme.getSpacings(qVar4, 6).getX1(), null, null, null, null, i.D(6, 0, echoTheme, qVar4, qVar4), qVar3, ((i12 >> 3) & 14) | 48 | (i12 & 7168), 484);
                        tVar6 = tVar8;
                        tVar5 = tVar7;
                    } else {
                        qVar3 = qVar4;
                        qVar3.R();
                        tVar5 = tVar3;
                        tVar6 = tVar4;
                        echoHeaderStyle2 = echoHeaderStyle;
                    }
                    q qVar6 = qVar2;
                    r10 = qVar3.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(str, tVar5, tVar6, qVar6, echoHeaderStyle2, i10, i11);
                        return;
                    }
                    return;
                }
                qVar2 = qVar;
                i15 = i11 & 16;
                if (i15 == 0) {
                }
                if (!qVar4.O(i12 & 1, (i12 & 9363) == 9362)) {
                }
                q qVar62 = qVar2;
                r10 = qVar3.r();
                if (r10 == null) {
                }
            }
            tVar4 = tVar2;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            qVar2 = qVar;
            i15 = i11 & 16;
            if (i15 == 0) {
            }
            if (!qVar4.O(i12 & 1, (i12 & 9363) == 9362)) {
            }
            q qVar622 = qVar2;
            r10 = qVar3.r();
            if (r10 == null) {
            }
        }
        tVar3 = tVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        tVar4 = tVar2;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        qVar2 = qVar;
        i15 = i11 & 16;
        if (i15 == 0) {
        }
        if (!qVar4.O(i12 & 1, (i12 & 9363) == 9362)) {
        }
        q qVar6222 = qVar2;
        r10 = qVar3.r();
        if (r10 == null) {
        }
    }
}
