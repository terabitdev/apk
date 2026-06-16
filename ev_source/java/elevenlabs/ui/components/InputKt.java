package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u00ad\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u00ad\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u001b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006)²\u0006\u000e\u0010\u001f\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lsn/z;", "onValueChange", "Li3/t;", "modifier", "inputModifier", "Lio/elevenlabs/ui/components/InputState;", RemoteConfigConstants.ResponseFieldKey.STATE, Constants.ScionAnalytics.PARAM_LABEL, "hint", "placeholder", "Lkotlin/Function0;", "iconStart", "La2/a2;", "keyboardOptions", "La2/z1;", "keyboardActions", "Ly4/d0;", "visualTransformation", "", "singleLine", "", "minLines", "Input", "(Ljava/lang/String;Lho/l;Li3/t;Li3/t;Lio/elevenlabs/ui/components/InputState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/p;La2/a2;La2/z1;Ly4/d0;ZILu2/m;III)V", "Ly4/w;", "(Ly4/w;Lho/l;Li3/t;Li3/t;Lio/elevenlabs/ui/components/InputState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/p;La2/a2;La2/z1;Ly4/d0;ZILu2/m;III)V", "Preview_Input", "(Lu2/m;I)V", "textFieldValueState", "lastTextValue", "isFocused", "a", "b", "c", "d", "e", "f", "g", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class InputKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputState.values().length];
            try {
                iArr[InputState.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputState.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputState.Disabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputState.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Input(final y4.w wVar, final ho.l lVar, i3.t tVar, i3.t tVar2, InputState inputState, String str, String str2, String str3, ho.p pVar, a2.a2 a2Var, a2.z1 z1Var, y4.d0 d0Var, boolean z6, int i10, u2.m mVar, int i11, int i12, int i13) {
        int i14;
        i3.t tVar3;
        int i15;
        i3.t tVar4;
        int i16;
        int i17;
        String str4;
        int i18;
        String str5;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        InputState inputState2;
        final a2.a2 a2Var2;
        boolean z10;
        String str6;
        i3.t tVar5;
        final i3.t tVar6;
        u2.q qVar;
        String str7;
        ho.p pVar2;
        final a2.z1 z1Var2;
        final y4.d0 d0Var2;
        int i31;
        u2.r1 r10;
        u2.q qVar2;
        ho.p pVar3;
        i3.q qVar3;
        h4.e eVar;
        h4.d dVar;
        h4.e eVar2;
        h4.f fVar;
        String str8;
        h4.e eVar3;
        float f10;
        h4.e eVar4;
        i3.t tVar7;
        InputState inputState3;
        String str9;
        i3.l lVar2;
        ElevenLabsTheme elevenLabsTheme;
        u2.q qVar4;
        boolean z11;
        boolean z12;
        float f11;
        i3.l lVar3 = i3.d.f13000d;
        wVar.getClass();
        lVar.getClass();
        str3.getClass();
        u2.q qVar5 = (u2.q) mVar;
        qVar5.Z(1574750660);
        if ((i11 & 6) == 0) {
            i14 = (qVar5.f(wVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= qVar5.h(lVar) ? 32 : 16;
        }
        int i32 = i13 & 4;
        if (i32 != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            tVar3 = tVar;
            i14 |= qVar5.f(tVar3) ? RpcError.MAX_MESSAGE_BYTES : 128;
            i15 = i13 & 8;
            int i33 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i15 == 0) {
                i14 |= 3072;
            } else if ((i11 & 3072) == 0) {
                tVar4 = tVar2;
                i14 |= qVar5.f(tVar4) ? 2048 : 1024;
                i16 = i13 & 16;
                if (i16 != 0) {
                    i14 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    i14 |= qVar5.d(inputState == null ? -1 : inputState.ordinal()) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i17 = i13 & 32;
                if (i17 != 0) {
                    i14 |= 196608;
                    str4 = str;
                } else {
                    str4 = str;
                    if ((i11 & 196608) == 0) {
                        i14 |= qVar5.f(str4) ? 131072 : 65536;
                    }
                }
                i18 = i13 & 64;
                if (i18 != 0) {
                    i14 |= 1572864;
                    str5 = str2;
                } else {
                    str5 = str2;
                    if ((i11 & 1572864) == 0) {
                        i14 |= qVar5.f(str5) ? 1048576 : 524288;
                    }
                }
                if ((i11 & 12582912) == 0) {
                    i14 |= qVar5.f(str3) ? 8388608 : 4194304;
                }
                i19 = i13 & RpcError.MAX_MESSAGE_BYTES;
                if (i19 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i14 |= qVar5.h(pVar) ? 67108864 : 33554432;
                }
                i20 = i13 & 512;
                if (i20 != 0) {
                    i21 = i20;
                    i22 = i14 | 805306368;
                } else {
                    if ((i11 & 805306368) == 0) {
                        i21 = i20;
                        i14 |= qVar5.f(a2Var) ? 536870912 : 268435456;
                    } else {
                        i21 = i20;
                    }
                    i22 = i14;
                }
                i23 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i23 != 0) {
                    i24 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    i24 = i12 | (qVar5.f(z1Var) ? 4 : 2);
                } else {
                    i24 = i12;
                }
                i25 = i13 & 2048;
                if (i25 != 0) {
                    i24 |= 48;
                    i26 = i25;
                } else if ((i12 & 48) == 0) {
                    i26 = i25;
                    i24 |= qVar5.f(d0Var) ? 32 : 16;
                } else {
                    i26 = i25;
                }
                int i34 = i24;
                i27 = i13 & 4096;
                if (i27 != 0) {
                    i28 = i34 | 384;
                } else if ((i12 & 384) == 0) {
                    i28 = i34 | (qVar5.g(z6) ? RpcError.MAX_MESSAGE_BYTES : 128);
                } else {
                    i28 = i34;
                }
                i29 = i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i29 != 0) {
                    i30 = i28 | 3072;
                } else {
                    int i35 = i28;
                    if ((i12 & 3072) == 0) {
                        if (qVar5.d(i10)) {
                            i33 = 2048;
                        }
                        i30 = i35 | i33;
                    } else {
                        i30 = i35;
                    }
                }
                if (qVar5.O(i22 & 1, (i22 & 306783379) == 306783378 || (i30 & 1171) != 1170)) {
                    i3.q qVar6 = i3.q.f13017a;
                    i3.t tVar8 = i32 != 0 ? qVar6 : tVar3;
                    i3.t tVar9 = i15 != 0 ? qVar6 : tVar4;
                    InputState inputState4 = i16 != 0 ? InputState.Default : inputState;
                    String str10 = i17 != 0 ? null : str4;
                    if (i18 != 0) {
                        str5 = null;
                    }
                    ho.p pVar4 = i19 == 0 ? pVar : null;
                    a2.a2 a2Var3 = i21 != 0 ? a2.a2.f773e : a2Var;
                    a2.z1 z1Var3 = i23 != 0 ? a2.z1.f1256d : z1Var;
                    y4.d0 d0Var3 = i26 != 0 ? y4.c0.f38288a : d0Var;
                    boolean z13 = i27 != 0 ? true : z6;
                    int i36 = i29 != 0 ? 1 : i10;
                    Object L = qVar5.L();
                    u2.e eVar5 = u2.l.f33918a;
                    if (L == eVar5) {
                        L = u2.r.A(Boolean.FALSE);
                        qVar5.h0(L);
                    }
                    final u2.z0 z0Var = (u2.z0) L;
                    ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                    ColorScheme color = elevenLabsTheme2.getColor(qVar5, 6);
                    float f12 = pVar4 != null ? 20 : 0;
                    i3.t a10 = m3.h.a(r1.p2.e(tVar8, 1.0f), ((Number) j1.f.b(inputState4 == InputState.Disabled ? 0.3f : 1.0f, null, "opacity", qVar5, 3072, 22).getValue()).floatValue());
                    i3.t tVar10 = tVar8;
                    boolean z14 = ((i22 & 14) == 4) | ((i22 & 29360128) == 8388608);
                    Object L2 = qVar5.L();
                    if (z14 || L2 == eVar5) {
                        L2 = new u2(str3, wVar, 1);
                        qVar2 = qVar5;
                        qVar2.h0(L2);
                    } else {
                        qVar2 = qVar5;
                    }
                    i3.t c5 = p4.q.c(a10, true, (ho.l) L2);
                    r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                    ho.p pVar5 = pVar4;
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    i3.t c10 = i3.a.c(c5, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar2 = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar2);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar6 = h4.g.f11907f;
                    u2.r.J(eVar6, a11, qVar2);
                    h4.e eVar7 = h4.g.f11906e;
                    u2.r.J(eVar7, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar8 = h4.g.f11908g;
                    u2.r.y(qVar2, valueOf, eVar8);
                    h4.d dVar2 = h4.g.f11909h;
                    u2.r.F(dVar2, qVar2);
                    h4.e eVar9 = h4.g.f11905d;
                    u2.r.J(eVar9, c10, qVar2);
                    InputLabelHintContainerKt.InputLabelHintContainer(str10, str5, qVar2, (i22 >> 15) & 126, 0);
                    f4.f1 d10 = r1.p.d(z13 ? lVar3 : i3.d.f12997a, false);
                    InputState inputState5 = inputState4;
                    int hashCode2 = Long.hashCode(qVar2.T);
                    c3.o l7 = qVar2.l();
                    i3.t c11 = i3.a.c(qVar6, qVar2);
                    qVar2.b0();
                    String str11 = str5;
                    if (qVar2.S) {
                        qVar2.k(fVar2);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(eVar6, d10, qVar2);
                    u2.r.J(eVar7, l7, qVar2);
                    defpackage.f.u(hashCode2, qVar2, eVar8, qVar2, dVar2);
                    u2.r.J(eVar9, c11, qVar2);
                    if (!wq.n.m0(str3) && wq.n.m0(wVar.f38321a.f31041b)) {
                        qVar2.X(-1613322516);
                        float f13 = f12;
                        i3.t I = r1.d.I(r1.d.G(qVar6, elevenLabsTheme2.getSpacings(qVar2, 6).m2356getX4D9Ej5fM(), t2.u.P, 2), f13, t2.u.P, t2.u.P, t2.u.P, 14);
                        f10 = f13;
                        if (z13) {
                            z12 = false;
                            f11 = 0;
                        } else {
                            f11 = 12;
                            z12 = false;
                        }
                        u2.q qVar7 = qVar2;
                        str8 = str10;
                        tVar7 = tVar10;
                        inputState3 = inputState5;
                        str9 = str11;
                        pVar3 = pVar5;
                        qVar3 = qVar6;
                        elevenLabsTheme = elevenLabsTheme2;
                        lVar2 = lVar3;
                        eVar = eVar7;
                        dVar = dVar2;
                        eVar2 = eVar8;
                        fVar = fVar2;
                        eVar3 = eVar6;
                        eVar4 = eVar9;
                        j7.d(str3, r1.d.I(I, t2.u.P, f11, t2.u.P, t2.u.P, 13), color.getText().m2187getTertiary0d7_KjU(), 0L, null, 0L, null, 0L, z13 ? 2 : 1, false, z13 ? 1 : com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, null, elevenLabsTheme2.getTypo(qVar2, 6).getBodySmall500(), qVar7, (i22 >> 21) & 14, 0, 110584);
                        qVar4 = qVar7;
                        qVar4.p(z12);
                    } else {
                        pVar3 = pVar5;
                        qVar3 = qVar6;
                        eVar = eVar7;
                        dVar = dVar2;
                        eVar2 = eVar8;
                        fVar = fVar2;
                        str8 = str10;
                        eVar3 = eVar6;
                        f10 = f12;
                        eVar4 = eVar9;
                        tVar7 = tVar10;
                        inputState3 = inputState5;
                        str9 = str11;
                        lVar2 = lVar3;
                        elevenLabsTheme = elevenLabsTheme2;
                        qVar4 = qVar2;
                        qVar4.X(-1612741638);
                        qVar4.p(false);
                    }
                    final long b10 = defpackage.f.b(elevenLabsTheme, qVar4, 6);
                    ElevenLabsTheme elevenLabsTheme3 = elevenLabsTheme;
                    i3.q qVar8 = qVar3;
                    final float f14 = f10;
                    a2Var2 = a2Var3;
                    d0Var2 = d0Var3;
                    tVar6 = tVar9;
                    z1Var2 = z1Var3;
                    final boolean z15 = z13;
                    final int i37 = i36;
                    final InputState inputState6 = inputState3;
                    u2.r.a(l2.y0.f21297a.a(new l2.x0(b10, elevenLabsTheme.getColor(qVar4, 6).getBackground().m2005getSecondary0d7_KjU())), c3.k.d(-1464673272, true, new ho.p() { // from class: io.elevenlabs.ui.components.h1
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z Input$lambda$13$0$0;
                            int intValue = ((Integer) obj2).intValue();
                            Input$lambda$13$0$0 = InputKt.Input$lambda$13$0$0(InputState.this, b10, tVar6, f14, z15, i37, wVar, lVar, a2Var2, z1Var2, d0Var2, z0Var, (u2.m) obj, intValue);
                            return Input$lambda$13$0$0;
                        }
                    }, qVar4), qVar4, 56);
                    ho.p pVar6 = pVar3;
                    if (pVar6 != null) {
                        qVar4.X(-1609990419);
                        i3.t I2 = r1.d.I(r1.p2.o(r1.p2.c(r1.p2.e(qVar8, 1.0f), 1.0f), 16), elevenLabsTheme3.getSpacings(qVar4, 6).m2353getX2D9Ej5fM(), t2.u.P, t2.u.P, t2.u.P, 14);
                        f4.f1 d11 = r1.p.d(lVar2, false);
                        z11 = z15;
                        int hashCode3 = Long.hashCode(qVar4.T);
                        c3.o l10 = qVar4.l();
                        i3.t c12 = i3.a.c(I2, qVar4);
                        qVar4.b0();
                        if (qVar4.S) {
                            qVar4.k(fVar);
                        } else {
                            qVar4.k0();
                        }
                        u2.r.J(eVar3, d11, qVar4);
                        u2.r.J(eVar, l10, qVar4);
                        defpackage.f.u(hashCode3, qVar4, eVar2, qVar4, dVar);
                        u2.r.J(eVar4, c12, qVar4);
                        j0.c.r((i22 >> 24) & 14, pVar6, qVar4, true, false);
                    } else {
                        z11 = z15;
                        qVar4.X(-1609608902);
                        qVar4.p(false);
                    }
                    qVar4.p(true);
                    qVar4.p(true);
                    z10 = z11;
                    pVar2 = pVar6;
                    qVar = qVar4;
                    str7 = str8;
                    tVar5 = tVar7;
                    inputState2 = inputState3;
                    i31 = i37;
                    str6 = str9;
                } else {
                    qVar5.R();
                    inputState2 = inputState;
                    a2Var2 = a2Var;
                    z10 = z6;
                    str6 = str5;
                    tVar5 = tVar3;
                    tVar6 = tVar4;
                    qVar = qVar5;
                    str7 = str4;
                    pVar2 = pVar;
                    z1Var2 = z1Var;
                    d0Var2 = d0Var;
                    i31 = i10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.highlighter.q(wVar, lVar, tVar5, tVar6, inputState2, str7, str6, str3, pVar2, a2Var2, z1Var2, d0Var2, z10, i31, i11, i12, i13, 2);
                    return;
                }
                return;
            }
            tVar4 = tVar2;
            i16 = i13 & 16;
            if (i16 != 0) {
            }
            i17 = i13 & 32;
            if (i17 != 0) {
            }
            i18 = i13 & 64;
            if (i18 != 0) {
            }
            if ((i11 & 12582912) == 0) {
            }
            i19 = i13 & RpcError.MAX_MESSAGE_BYTES;
            if (i19 != 0) {
            }
            i20 = i13 & 512;
            if (i20 != 0) {
            }
            i23 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i23 != 0) {
            }
            i25 = i13 & 2048;
            if (i25 != 0) {
            }
            int i342 = i24;
            i27 = i13 & 4096;
            if (i27 != 0) {
            }
            i29 = i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i29 != 0) {
            }
            if (qVar5.O(i22 & 1, (i22 & 306783379) == 306783378 || (i30 & 1171) != 1170)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar3 = tVar;
        i15 = i13 & 8;
        int i332 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i15 == 0) {
        }
        tVar4 = tVar2;
        i16 = i13 & 16;
        if (i16 != 0) {
        }
        i17 = i13 & 32;
        if (i17 != 0) {
        }
        i18 = i13 & 64;
        if (i18 != 0) {
        }
        if ((i11 & 12582912) == 0) {
        }
        i19 = i13 & RpcError.MAX_MESSAGE_BYTES;
        if (i19 != 0) {
        }
        i20 = i13 & 512;
        if (i20 != 0) {
        }
        i23 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i23 != 0) {
        }
        i25 = i13 & 2048;
        if (i25 != 0) {
        }
        int i3422 = i24;
        i27 = i13 & 4096;
        if (i27 != 0) {
        }
        i29 = i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i29 != 0) {
        }
        if (qVar5.O(i22 & 1, (i22 & 306783379) == 306783378 || (i30 & 1171) != 1170)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final y4.w Input$lambda$1(u2.z0 z0Var) {
        return (y4.w) z0Var.getValue();
    }

    private static final boolean Input$lambda$10(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void Input$lambda$11(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z Input$lambda$12$0(String str, y4.w wVar, p4.b0 b0Var) {
        String str2;
        b0Var.getClass();
        if (!wq.n.m0(wVar.f38321a.f31041b)) {
            str2 = " - " + wVar;
        } else {
            str2 = "";
        }
        p4.y.d(str + str2, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z Input$lambda$13$0$0(InputState inputState, long j4, i3.t tVar, float f10, boolean z6, int i10, y4.w wVar, ho.l lVar, a2.a2 a2Var, a2.z1 z1Var, y4.d0 d0Var, u2.z0 z0Var, u2.m mVar, int i11) {
        boolean z10;
        boolean z11;
        u2.z0 z0Var2;
        float f11;
        long b10;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z10)) {
            if (inputState == InputState.Disabled) {
                z11 = true;
            } else {
                z11 = false;
            }
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            s4.y0 bodySmall500 = elevenLabsTheme.getTypo(qVar, 6).getBodySmall500();
            p3.d1 d1Var = new p3.d1(j4);
            i3.t e10 = r1.p2.e(tVar, 1.0f);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                z0Var2 = z0Var;
                L = new e1(z0Var2, 5);
                qVar.h0(L);
            } else {
                z0Var2 = z0Var;
            }
            i3.t s10 = n3.d.s(e10, (ho.l) L);
            if (Input$lambda$10(z0Var2)) {
                f11 = 2;
            } else {
                f11 = 1;
            }
            float f12 = ((h5.f) j1.f.a(f11, null, "focus", qVar, 384, 10).getValue()).f12083a;
            int i12 = WhenMappings.$EnumSwitchMapping$0[inputState.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            qVar.X(1198312942);
                            qVar.p(false);
                            b10 = ReaderColors.INSTANCE.m2449getRed5000d7_KjU();
                        } else {
                            throw com.google.android.gms.internal.play_billing.b.h(1198295337, qVar, false);
                        }
                    } else {
                        qVar.X(1198310107);
                        b10 = p3.x.b(0.05f, elevenLabsTheme.getColor(qVar, 6).getText().m2185getPrimary0d7_KjU());
                        qVar.p(false);
                    }
                } else {
                    qVar.X(1198303111);
                    if (Input$lambda$10(z0Var2)) {
                        qVar.X(1198304602);
                        b10 = p3.x.b(0.2f, elevenLabsTheme.getColor(qVar, 6).getText().m2185getPrimary0d7_KjU());
                    } else {
                        qVar.X(1198306490);
                        b10 = p3.x.b(0.1f, elevenLabsTheme.getColor(qVar, 6).getText().m2185getPrimary0d7_KjU());
                    }
                    qVar.p(false);
                    qVar.p(false);
                }
            } else {
                qVar.X(1198297191);
                if (Input$lambda$10(z0Var2)) {
                    qVar.X(1198298682);
                    b10 = p3.x.b(0.2f, elevenLabsTheme.getColor(qVar, 6).getText().m2185getPrimary0d7_KjU());
                } else {
                    qVar.X(1198300570);
                    b10 = p3.x.b(0.1f, elevenLabsTheme.getColor(qVar, 6).getText().m2185getPrimary0d7_KjU());
                }
                qVar.p(false);
                qVar.p(false);
            }
            i3.t I = r1.d.I(r1.d.F(l1.n.j(f12, ((p3.x) i1.w2.a(b10, null, "border", qVar, 384, 10).getValue()).f26440a, s10, elevenLabsTheme.getShapes(qVar, 6).getMd()), elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, 6).m2355getX3D9Ej5fM()), f10, t2.u.P, t2.u.P, t2.u.P, 14);
            i3.t tVar2 = i3.q.f13017a;
            if (!z6 && i10 == 1) {
                qVar.X(1198331565);
                tVar2 = l1.n.y(tVar2, l1.n.x(qVar), true, true);
            } else {
                qVar.X(1198332912);
            }
            qVar.p(false);
            a2.v.b(wVar, lVar, I.then(tVar2), false, z11, bodySmall500, a2Var, z1Var, z6, 0, i10, d0Var, null, null, d1Var, null, qVar, 0, 0, 45576);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Input$lambda$13$0$0$0$0(u2.z0 z0Var, n3.z zVar) {
        zVar.getClass();
        Input$lambda$11(z0Var, ((n3.a0) zVar).b());
        return sn.z.f31622a;
    }

    public static final sn.z Input$lambda$14(y4.w wVar, ho.l lVar, i3.t tVar, i3.t tVar2, InputState inputState, String str, String str2, String str3, ho.p pVar, a2.a2 a2Var, a2.z1 z1Var, y4.d0 d0Var, boolean z6, int i10, int i11, int i12, int i13, u2.m mVar, int i14) {
        Input(wVar, lVar, tVar, tVar2, inputState, str, str2, str3, pVar, a2Var, z1Var, d0Var, z6, i10, mVar, u2.r.M(i11 | 1), u2.r.M(i12), i13);
        return sn.z.f31622a;
    }

    public static final sn.z Input$lambda$3$0(y4.w wVar, u2.z0 z0Var) {
        if (!s4.x0.b(wVar.f38322b, Input$lambda$1(z0Var).f38322b) || !kotlin.jvm.internal.m.c(wVar.f38323c, Input$lambda$1(z0Var).f38323c)) {
            z0Var.setValue(wVar);
        }
        return sn.z.f31622a;
    }

    private static final String Input$lambda$5(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Input$lambda$7$0(ho.l lVar, u2.z0 z0Var, u2.z0 z0Var2, y4.w wVar) {
        wVar.getClass();
        z0Var.setValue(wVar);
        String Input$lambda$5 = Input$lambda$5(z0Var2);
        s4.h hVar = wVar.f38321a;
        boolean c5 = kotlin.jvm.internal.m.c(Input$lambda$5, hVar.f31041b);
        z0Var2.setValue(hVar.f31041b);
        if (!c5) {
            lVar.invoke(hVar.f31041b);
        }
        return sn.z.f31622a;
    }

    public static final sn.z Input$lambda$8(String str, ho.l lVar, i3.t tVar, i3.t tVar2, InputState inputState, String str2, String str3, String str4, ho.p pVar, a2.a2 a2Var, a2.z1 z1Var, y4.d0 d0Var, boolean z6, int i10, int i11, int i12, int i13, u2.m mVar, int i14) {
        Input(str, lVar, tVar, tVar2, inputState, str2, str3, str4, pVar, a2Var, z1Var, d0Var, z6, i10, mVar, u2.r.M(i11 | 1), u2.r.M(i12), i13);
        return sn.z.f31622a;
    }

    public static final void Preview_Input(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2127761338);
        boolean z10 = true;
        boolean z11 = false;
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            l1.f2 x10 = l1.n.x(qVar);
            i3.q qVar2 = i3.q.f13017a;
            float f10 = 10;
            i3.t E = r1.d.E(l1.n.y(qVar2, x10, true, true), f10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            qVar.X(-753650577);
            tn.e eVar = (tn.e) InputState.getEntries();
            eVar.getClass();
            g1.a1 a1Var = new g1.a1(eVar, 9);
            while (a1Var.hasNext()) {
                InputState inputState = (InputState) a1Var.next();
                r1.d.g(r1.p2.f(qVar2, f10), qVar);
                i3.q qVar3 = qVar2;
                float f11 = f10;
                g1.a1 a1Var2 = a1Var;
                u2.q qVar4 = qVar;
                j7.d(defpackage.f.C("Input with ", inputState.name(), " state"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar4, 0, 0, 262142);
                qVar = qVar4;
                r1.d.g(r1.p2.f(qVar3, f11), qVar);
                Object L = qVar.L();
                u2.e eVar2 = u2.l.f33918a;
                if (L == eVar2) {
                    L = u2.r.A("");
                    qVar.h0(L);
                }
                u2.z0 z0Var = (u2.z0) L;
                String Preview_Input$lambda$0$1 = Preview_Input$lambda$0$1(z0Var);
                Object L2 = qVar.L();
                if (L2 == eVar2) {
                    L2 = new e1(z0Var, 4);
                    qVar.h0(L2);
                }
                Input(Preview_Input$lambda$0$1, (ho.l) L2, (i3.t) null, (i3.t) null, inputState, (String) null, (String) null, "Placeholder", (ho.p) null, (a2.a2) null, (a2.z1) null, (y4.d0) null, false, 0, (u2.m) qVar, 12582960, 0, 16236);
                r1.d.g(r1.p2.f(qVar3, f11), qVar);
                Object L3 = qVar.L();
                if (L3 == eVar2) {
                    L3 = u2.r.A("");
                    qVar.h0(L3);
                }
                u2.z0 z0Var2 = (u2.z0) L3;
                String Preview_Input$lambda$0$5 = Preview_Input$lambda$0$5(z0Var2);
                Object L4 = qVar.L();
                if (L4 == eVar2) {
                    L4 = new e1(z0Var2, 6);
                    qVar.h0(L4);
                }
                Input(Preview_Input$lambda$0$5, (ho.l) L4, (i3.t) null, (i3.t) null, inputState, "Input label", "Input hint", "Placeholder", (ho.p) null, (a2.a2) null, (a2.z1) null, (y4.d0) null, false, 0, (u2.m) qVar, 14352432, 0, 16140);
                r1.d.g(r1.p2.f(qVar3, f11), qVar);
                Object L5 = qVar.L();
                if (L5 == eVar2) {
                    L5 = u2.r.A("");
                    qVar.h0(L5);
                }
                u2.z0 z0Var3 = (u2.z0) L5;
                String Preview_Input$lambda$0$9 = Preview_Input$lambda$0$9(z0Var3);
                Object L6 = qVar.L();
                if (L6 == eVar2) {
                    L6 = new e1(z0Var3, 7);
                    qVar.h0(L6);
                }
                ComposableSingletons$InputKt composableSingletons$InputKt = ComposableSingletons$InputKt.INSTANCE;
                Input(Preview_Input$lambda$0$9, (ho.l) L6, (i3.t) null, (i3.t) null, inputState, "Input label", "Input hint", "Placeholder", composableSingletons$InputKt.getLambda$2072510817$ui_release(), (a2.a2) null, (a2.z1) null, (y4.d0) null, false, 0, (u2.m) qVar, 115015728, 0, 15884);
                r1.d.g(r1.p2.f(qVar3, f11), qVar);
                Object L7 = qVar.L();
                if (L7 == eVar2) {
                    L7 = u2.r.A("");
                    qVar.h0(L7);
                }
                u2.z0 z0Var4 = (u2.z0) L7;
                String Preview_Input$lambda$0$13 = Preview_Input$lambda$0$13(z0Var4);
                Object L8 = qVar.L();
                if (L8 == eVar2) {
                    L8 = new e1(z0Var4, 8);
                    qVar.h0(L8);
                }
                Input(Preview_Input$lambda$0$13, (ho.l) L8, (i3.t) null, (i3.t) null, inputState, "Input label", "Input hint", "Very long placeholder that normally should take few lines", (ho.p) null, (a2.a2) null, (a2.z1) null, (y4.d0) null, false, 0, (u2.m) qVar, 14352432, 0, 16140);
                r1.d.g(r1.p2.f(qVar3, f11), qVar);
                Object L9 = qVar.L();
                if (L9 == eVar2) {
                    L9 = u2.r.A("");
                    qVar.h0(L9);
                }
                u2.z0 z0Var5 = (u2.z0) L9;
                String Preview_Input$lambda$0$17 = Preview_Input$lambda$0$17(z0Var5);
                Object L10 = qVar.L();
                if (L10 == eVar2) {
                    L10 = new e1(z0Var5, 9);
                    qVar.h0(L10);
                }
                Input(Preview_Input$lambda$0$17, (ho.l) L10, (i3.t) null, (i3.t) null, inputState, "Input label", "Input hint", "Very long placeholder that normally should take few lines", composableSingletons$InputKt.m1815getLambda$1858989981$ui_release(), (a2.a2) null, (a2.z1) null, (y4.d0) null, false, 0, (u2.m) qVar, 115015728, 0, 15884);
                r1.d.g(r1.p2.f(qVar3, f11), qVar);
                Object L11 = qVar.L();
                if (L11 == eVar2) {
                    L11 = u2.r.A("Very long prefilled text that takes much of space xyz");
                    qVar.h0(L11);
                }
                u2.z0 z0Var6 = (u2.z0) L11;
                String Preview_Input$lambda$0$21 = Preview_Input$lambda$0$21(z0Var6);
                Object L12 = qVar.L();
                if (L12 == eVar2) {
                    L12 = new e1(z0Var6, 10);
                    qVar.h0(L12);
                }
                Input(Preview_Input$lambda$0$21, (ho.l) L12, (i3.t) null, (i3.t) null, inputState, "Input label", "Input hint", "Very long placeholder that normally should take few lines", (ho.p) null, (a2.a2) null, (a2.z1) null, (y4.d0) null, false, 0, (u2.m) qVar, 14352432, 0, 16140);
                r1.d.g(r1.p2.f(qVar3, f11), qVar);
                Object L13 = qVar.L();
                if (L13 == eVar2) {
                    L13 = u2.r.A("Very long prefilled text that takes much of space xyz");
                    qVar.h0(L13);
                }
                u2.z0 z0Var7 = (u2.z0) L13;
                String Preview_Input$lambda$0$25 = Preview_Input$lambda$0$25(z0Var7);
                Object L14 = qVar.L();
                if (L14 == eVar2) {
                    L14 = new e1(z0Var7, 11);
                    qVar.h0(L14);
                }
                Input(Preview_Input$lambda$0$25, (ho.l) L14, (i3.t) null, (i3.t) null, inputState, "Input label", "Input hint", "Very long placeholder that normally should take few lines", composableSingletons$InputKt.m1814getLambda$1495523483$ui_release(), (a2.a2) null, (a2.z1) null, (y4.d0) null, false, 0, (u2.m) qVar, 115015728, 0, 15884);
                r1.d.g(r1.p2.f(qVar3, f11), qVar);
                d5.e(null, t2.u.P, 0L, qVar, 0, 7);
                qVar2 = qVar3;
                a1Var = a1Var2;
                z10 = true;
                z11 = false;
                f10 = f11;
            }
            qVar.p(z11);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 15);
        }
    }

    private static final String Preview_Input$lambda$0$1(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_Input$lambda$0$11$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    private static final String Preview_Input$lambda$0$13(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_Input$lambda$0$15$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    private static final String Preview_Input$lambda$0$17(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_Input$lambda$0$19$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    private static final String Preview_Input$lambda$0$21(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_Input$lambda$0$23$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    private static final String Preview_Input$lambda$0$25(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_Input$lambda$0$27$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Input$lambda$0$3$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    private static final String Preview_Input$lambda$0$5(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_Input$lambda$0$7$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    private static final String Preview_Input$lambda$0$9(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_Input$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Input(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Input(String str, ho.l lVar, i3.t tVar, i3.t tVar2, InputState inputState, String str2, String str3, String str4, ho.p pVar, a2.a2 a2Var, a2.z1 z1Var, y4.d0 d0Var, boolean z6, int i10, u2.m mVar, int i11, int i12, int i13) {
        int i14;
        i3.t tVar3;
        int i15;
        int i16;
        int i17;
        String str5;
        int i18;
        String str6;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        u2.q qVar;
        i3.t tVar4;
        InputState inputState2;
        ho.p pVar2;
        a2.a2 a2Var2;
        int i31;
        String str7;
        String str8;
        i3.t tVar5;
        a2.z1 z1Var2;
        y4.d0 d0Var2;
        boolean z10;
        u2.r1 r10;
        int i32;
        i3.t tVar6;
        int i33;
        a2.a2 a2Var3;
        str.getClass();
        lVar.getClass();
        str4.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1906132401);
        if ((i11 & 6) == 0) {
            i14 = (qVar2.f(str) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= qVar2.h(lVar) ? 32 : 16;
        }
        int i34 = i13 & 4;
        if (i34 != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            tVar3 = tVar;
            i14 |= qVar2.f(tVar3) ? RpcError.MAX_MESSAGE_BYTES : 128;
            i15 = i13 & 8;
            int i35 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i15 == 0) {
                i14 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i14 |= qVar2.f(tVar2) ? 2048 : 1024;
                i16 = i13 & 16;
                if (i16 != 0) {
                    i14 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    i14 |= qVar2.d(inputState == null ? -1 : inputState.ordinal()) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i17 = i13 & 32;
                if (i17 != 0) {
                    i14 |= 196608;
                    str5 = str2;
                } else {
                    str5 = str2;
                    if ((i11 & 196608) == 0) {
                        i14 |= qVar2.f(str5) ? 131072 : 65536;
                    }
                }
                i18 = i13 & 64;
                if (i18 != 0) {
                    i14 |= 1572864;
                    str6 = str3;
                } else {
                    str6 = str3;
                    if ((i11 & 1572864) == 0) {
                        i14 |= qVar2.f(str6) ? 1048576 : 524288;
                    }
                }
                if ((i11 & 12582912) == 0) {
                    i14 |= qVar2.f(str4) ? 8388608 : 4194304;
                }
                i19 = i13 & RpcError.MAX_MESSAGE_BYTES;
                if (i19 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i20 = i14 | (qVar2.h(pVar) ? 67108864 : 33554432);
                    i21 = i13 & 512;
                    if (i21 == 0) {
                        i20 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        i22 = i21;
                        i20 |= qVar2.f(a2Var) ? 536870912 : 268435456;
                        i23 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                        if (i23 != 0) {
                            i25 = i12 | 6;
                            i24 = i23;
                        } else if ((i12 & 6) == 0) {
                            i24 = i23;
                            i25 = i12 | (qVar2.f(z1Var) ? 4 : 2);
                        } else {
                            i24 = i23;
                            i25 = i12;
                        }
                        i26 = i13 & 2048;
                        if (i26 != 0) {
                            i25 |= 48;
                            i27 = i26;
                        } else if ((i12 & 48) == 0) {
                            i27 = i26;
                            i25 |= qVar2.f(d0Var) ? 32 : 16;
                        } else {
                            i27 = i26;
                        }
                        int i36 = i25;
                        i28 = i13 & 4096;
                        if (i28 != 0) {
                            i29 = i36 | 384;
                        } else {
                            int i37 = i36;
                            if ((i12 & 384) == 0) {
                                i37 |= qVar2.g(z6) ? RpcError.MAX_MESSAGE_BYTES : 128;
                            }
                            i29 = i37;
                        }
                        i30 = i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        if (i30 != 0) {
                            i29 |= 3072;
                        } else if ((i12 & 3072) == 0) {
                            if (qVar2.d(i10)) {
                                i35 = 2048;
                            }
                            i29 |= i35;
                            if (!qVar2.O(i20 & 1, (i20 & 306783379) == 306783378 || (i29 & 1171) != 1170)) {
                                i3.q qVar3 = i3.q.f13017a;
                                i3.t tVar7 = i34 != 0 ? qVar3 : tVar3;
                                if (i15 != 0) {
                                    tVar6 = qVar3;
                                    i32 = i28;
                                } else {
                                    i32 = i28;
                                    tVar6 = tVar2;
                                }
                                InputState inputState3 = i16 != 0 ? InputState.Default : inputState;
                                String str9 = i17 != 0 ? null : str5;
                                String str10 = i18 != 0 ? null : str6;
                                ho.p pVar3 = i19 != 0 ? null : pVar;
                                if (i22 != 0) {
                                    int i38 = i20;
                                    a2Var3 = a2.a2.f773e;
                                    i33 = i38;
                                } else {
                                    i33 = i20;
                                    a2Var3 = a2Var;
                                }
                                a2.z1 z1Var3 = i24 != 0 ? a2.z1.f1256d : z1Var;
                                y4.d0 d0Var3 = i27 != 0 ? y4.c0.f38288a : d0Var;
                                boolean z11 = i32 != 0 ? true : z6;
                                int i39 = i30 != 0 ? 1 : i10;
                                Object L = qVar2.L();
                                Object obj = u2.l.f33918a;
                                if (L == obj) {
                                    L = u2.r.A(new y4.w(str, 0L, 6));
                                    qVar2.h0(L);
                                }
                                u2.z0 z0Var = (u2.z0) L;
                                y4.w a10 = y4.w.a(Input$lambda$1(z0Var), str);
                                boolean f10 = qVar2.f(a10);
                                Object L2 = qVar2.L();
                                if (f10 || L2 == obj) {
                                    L2 = new b0(a10, z0Var, 1);
                                    qVar2.h0(L2);
                                }
                                u2.r.j((ho.a) L2, qVar2);
                                boolean z12 = (i33 & 14) == 4;
                                Object L3 = qVar2.L();
                                if (z12 || L3 == obj) {
                                    L3 = u2.r.A(str);
                                    qVar2.h0(L3);
                                }
                                u2.z0 z0Var2 = (u2.z0) L3;
                                boolean f11 = qVar2.f(z0Var2) | ((i33 & 112) == 32);
                                Object L4 = qVar2.L();
                                if (f11 || L4 == obj) {
                                    L4 = new a2.r(lVar, z0Var, z0Var2, 2);
                                    qVar2.h0(L4);
                                }
                                qVar = qVar2;
                                Input(a10, (ho.l) L4, tVar7, tVar6, inputState3, str9, str10, str4, pVar3, a2Var3, z1Var3, d0Var3, z11, i39, qVar, i33 & 2147483520, i29 & 8190, 0);
                                tVar5 = tVar7;
                                tVar4 = tVar6;
                                inputState2 = inputState3;
                                str7 = str9;
                                str8 = str10;
                                pVar2 = pVar3;
                                a2Var2 = a2Var3;
                                z1Var2 = z1Var3;
                                d0Var2 = d0Var3;
                                z10 = z11;
                                i31 = i39;
                            } else {
                                qVar = qVar2;
                                qVar.R();
                                tVar4 = tVar2;
                                inputState2 = inputState;
                                pVar2 = pVar;
                                a2Var2 = a2Var;
                                i31 = i10;
                                str7 = str5;
                                str8 = str6;
                                tVar5 = tVar3;
                                z1Var2 = z1Var;
                                d0Var2 = d0Var;
                                z10 = z6;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new io.elevenlabs.highlighter.q(str, lVar, tVar5, tVar4, inputState2, str7, str8, str4, pVar2, a2Var2, z1Var2, d0Var2, z10, i31, i11, i12, i13, 1);
                                return;
                            }
                            return;
                        }
                        if (!qVar2.O(i20 & 1, (i20 & 306783379) == 306783378 || (i29 & 1171) != 1170)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    i22 = i21;
                    i23 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i23 != 0) {
                    }
                    i26 = i13 & 2048;
                    if (i26 != 0) {
                    }
                    int i362 = i25;
                    i28 = i13 & 4096;
                    if (i28 != 0) {
                    }
                    i30 = i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    if (i30 != 0) {
                    }
                    if (!qVar2.O(i20 & 1, (i20 & 306783379) == 306783378 || (i29 & 1171) != 1170)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                i20 = i14;
                i21 = i13 & 512;
                if (i21 == 0) {
                }
                i22 = i21;
                i23 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i23 != 0) {
                }
                i26 = i13 & 2048;
                if (i26 != 0) {
                }
                int i3622 = i25;
                i28 = i13 & 4096;
                if (i28 != 0) {
                }
                i30 = i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i30 != 0) {
                }
                if (!qVar2.O(i20 & 1, (i20 & 306783379) == 306783378 || (i29 & 1171) != 1170)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            i16 = i13 & 16;
            if (i16 != 0) {
            }
            i17 = i13 & 32;
            if (i17 != 0) {
            }
            i18 = i13 & 64;
            if (i18 != 0) {
            }
            if ((i11 & 12582912) == 0) {
            }
            i19 = i13 & RpcError.MAX_MESSAGE_BYTES;
            if (i19 != 0) {
            }
            i20 = i14;
            i21 = i13 & 512;
            if (i21 == 0) {
            }
            i22 = i21;
            i23 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i23 != 0) {
            }
            i26 = i13 & 2048;
            if (i26 != 0) {
            }
            int i36222 = i25;
            i28 = i13 & 4096;
            if (i28 != 0) {
            }
            i30 = i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i30 != 0) {
            }
            if (!qVar2.O(i20 & 1, (i20 & 306783379) == 306783378 || (i29 & 1171) != 1170)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar3 = tVar;
        i15 = i13 & 8;
        int i352 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i15 == 0) {
        }
        i16 = i13 & 16;
        if (i16 != 0) {
        }
        i17 = i13 & 32;
        if (i17 != 0) {
        }
        i18 = i13 & 64;
        if (i18 != 0) {
        }
        if ((i11 & 12582912) == 0) {
        }
        i19 = i13 & RpcError.MAX_MESSAGE_BYTES;
        if (i19 != 0) {
        }
        i20 = i14;
        i21 = i13 & 512;
        if (i21 == 0) {
        }
        i22 = i21;
        i23 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i23 != 0) {
        }
        i26 = i13 & 2048;
        if (i26 != 0) {
        }
        int i362222 = i25;
        i28 = i13 & 4096;
        if (i28 != 0) {
        }
        i30 = i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i30 != 0) {
        }
        if (!qVar2.O(i20 & 1, (i20 & 306783379) == 306783378 || (i29 & 1171) != 1170)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }
}
