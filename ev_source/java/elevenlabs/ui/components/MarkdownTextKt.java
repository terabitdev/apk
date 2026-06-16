package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u008b\u0001\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", ParameterNames.TEXT, "Li3/t;", "modifier", "Lp3/x;", "color", "Le5/k;", "align", "Ls4/y0;", "style", "Lkotlin/Function1;", "Lsn/z;", "onLinkClick", "Lkotlin/Function0;", "onClick", "", "onTextLayout", "maxLines", "MarkdownText-6lElgYI", "(Ljava/lang/String;Li3/t;JILs4/y0;Lho/l;Lho/a;Lho/l;ILu2/m;II)V", "MarkdownText", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MarkdownTextKt {
    /* JADX WARN: Removed duplicated region for block: B:135:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: MarkdownText-6lElgYI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1841MarkdownText6lElgYI(final String str, i3.t tVar, long j4, int i10, s4.y0 y0Var, ho.l lVar, ho.a aVar, ho.l lVar2, int i11, u2.m mVar, final int i12, final int i13) {
        int i14;
        i3.t tVar2;
        int i15;
        long j10;
        int i16;
        s4.y0 y0Var2;
        int i17;
        int i18;
        int i19;
        ho.a aVar2;
        int i20;
        int i21;
        ho.l lVar3;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z6;
        u2.q qVar;
        final ho.l lVar4;
        final i3.t tVar3;
        final int i27;
        final long j11;
        final ho.a aVar3;
        final s4.y0 y0Var3;
        final ho.l lVar5;
        final int i28;
        u2.r1 r10;
        i3.t tVar4;
        s4.y0 y0Var4;
        ho.l lVar6;
        ho.l lVar7;
        int i29;
        i3.t tVar5;
        ho.a aVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i30;
        int i31;
        int i32;
        int i33;
        str.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1020631491);
        if ((i12 & 6) == 0) {
            if (qVar2.f(str)) {
                i33 = 4;
            } else {
                i33 = 2;
            }
            i14 = i33 | i12;
        } else {
            i14 = i12;
        }
        int i34 = i13 & 2;
        if (i34 != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i14 |= i15;
            if ((i12 & 384) != 0) {
                j10 = j4;
                if ((i13 & 4) == 0 && qVar2.e(j10)) {
                    i32 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i32 = 128;
                }
                i14 |= i32;
            } else {
                j10 = j4;
            }
            if ((i12 & 3072) != 0) {
                if ((i13 & 8) == 0) {
                    i16 = i10;
                    if (qVar2.d(i16)) {
                        i31 = 2048;
                        i14 |= i31;
                    }
                } else {
                    i16 = i10;
                }
                i31 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i14 |= i31;
            } else {
                i16 = i10;
            }
            if ((i12 & 24576) != 0) {
                if ((i13 & 16) == 0) {
                    y0Var2 = y0Var;
                    if (qVar2.f(y0Var2)) {
                        i30 = 16384;
                        i14 |= i30;
                    }
                } else {
                    y0Var2 = y0Var;
                }
                i30 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i14 |= i30;
            } else {
                y0Var2 = y0Var;
            }
            i17 = i13 & 32;
            if (i17 == 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (qVar2.h(lVar)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i14 |= i18;
            }
            i19 = i13 & 64;
            if (i19 == 0) {
                i14 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i12 & 1572864) == 0) {
                    if (qVar2.h(aVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i14 |= i20;
                }
            }
            i21 = i13 & 128;
            if (i21 == 0) {
                i14 |= 12582912;
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                if ((i12 & 12582912) == 0) {
                    if (qVar2.h(lVar3)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
            }
            int i35 = i14;
            i23 = i13 & RpcError.MAX_MESSAGE_BYTES;
            if (i23 == 0) {
                i35 |= 100663296;
                i24 = i23;
            } else if ((i12 & 100663296) == 0) {
                i24 = i23;
                if (qVar2.d(i11)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i35 |= i25;
            } else {
                i24 = i23;
            }
            i26 = i35;
            boolean z13 = false;
            if ((i26 & 38347923) == 38347922) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i26 & 1, z6)) {
                qVar2.T();
                if ((i12 & 1) != 0 && !qVar2.y()) {
                    qVar2.R();
                    if ((i13 & 4) != 0) {
                        i26 &= -897;
                    }
                    if ((i13 & 8) != 0) {
                        i26 &= -7169;
                    }
                    if ((i13 & 16) != 0) {
                        i26 &= -57345;
                    }
                    ho.l lVar8 = lVar3;
                    tVar5 = tVar2;
                    i27 = i16;
                    lVar6 = lVar8;
                    i29 = i11;
                    aVar4 = aVar2;
                    y0Var4 = y0Var2;
                    lVar7 = lVar;
                } else {
                    if (i34 != 0) {
                        tVar4 = i3.q.f13017a;
                    } else {
                        tVar4 = tVar2;
                    }
                    if ((i13 & 4) != 0) {
                        j10 = defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar2, 6);
                        i26 &= -897;
                    }
                    if ((i13 & 8) != 0) {
                        i26 &= -7169;
                        i27 = 5;
                    } else {
                        i27 = i16;
                    }
                    if ((i13 & 16) != 0) {
                        y0Var4 = ElevenLabsTheme.INSTANCE.getTypo(qVar2, 6).getBody();
                        i26 &= -57345;
                    } else {
                        y0Var4 = y0Var2;
                    }
                    lVar6 = null;
                    if (i17 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if (i21 == 0) {
                        lVar6 = lVar3;
                    }
                    if (i24 != 0) {
                        tVar5 = tVar4;
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                        tVar5 = tVar4;
                    }
                    aVar4 = aVar2;
                }
                qVar2.q();
                if ((((i26 & 57344) ^ 24576) > 16384 && qVar2.f(y0Var4)) || (i26 & 24576) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((((i26 & 896) ^ 384) > 256 && qVar2.e(j10)) || (i26 & 384) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = z11 | z10;
                if ((((i26 & 7168) ^ 3072) > 2048 && qVar2.d(i27)) || (i26 & 3072) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z15 = z14 | z12;
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (z15 || L == eVar) {
                    L = s4.y0.a(y0Var4, j10, 0L, null, null, null, 0L, i27, 0L, null, null, 16744446);
                    qVar2.h0(L);
                }
                s4.y0 y0Var5 = (s4.y0) L;
                if ((i26 & 14) == 4) {
                    z13 = true;
                }
                Object L2 = qVar2.L();
                if (z13 || L2 == eVar) {
                    L2 = wq.u.T(str, "\u2029", Separators.SP);
                    qVar2.h0(L2);
                }
                qVar = qVar2;
                ho.l lVar9 = lVar6;
                ho.l lVar10 = lVar7;
                kj.c.a((String) L2, tVar5, 0L, i29, Integer.valueOf(R.font.inter_500_medium), y0Var5, aVar4, 0, false, 0L, 0L, 0L, false, lVar10, lVar9, qVar, (i26 & 112) | ((i26 >> 12) & 57344), (i26 >> 15) & 112, ((i26 >> 6) & 7168) | ((i26 >> 9) & 57344));
                y0Var3 = y0Var4;
                j11 = j10;
                tVar3 = tVar5;
                i28 = i29;
                aVar3 = aVar4;
                lVar4 = lVar10;
                lVar5 = lVar9;
            } else {
                qVar = qVar2;
                qVar.R();
                lVar4 = lVar;
                tVar3 = tVar2;
                i27 = i16;
                j11 = j10;
                aVar3 = aVar2;
                y0Var3 = y0Var2;
                lVar5 = lVar3;
                i28 = i11;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.l1
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z MarkdownText_6lElgYI$lambda$2;
                        MarkdownText_6lElgYI$lambda$2 = MarkdownTextKt.MarkdownText_6lElgYI$lambda$2(str, tVar3, j11, i27, y0Var3, lVar4, aVar3, lVar5, i28, i12, i13, (u2.m) obj, ((Integer) obj2).intValue());
                        return MarkdownText_6lElgYI$lambda$2;
                    }
                };
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 384) != 0) {
        }
        if ((i12 & 3072) != 0) {
        }
        if ((i12 & 24576) != 0) {
        }
        i17 = i13 & 32;
        if (i17 == 0) {
        }
        i19 = i13 & 64;
        if (i19 == 0) {
        }
        i21 = i13 & 128;
        if (i21 == 0) {
        }
        int i352 = i14;
        i23 = i13 & RpcError.MAX_MESSAGE_BYTES;
        if (i23 == 0) {
        }
        i26 = i352;
        boolean z132 = false;
        if ((i26 & 38347923) == 38347922) {
        }
        if (!qVar2.O(i26 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z MarkdownText_6lElgYI$lambda$2(String str, i3.t tVar, long j4, int i10, s4.y0 y0Var, ho.l lVar, ho.a aVar, ho.l lVar2, int i11, int i12, int i13, u2.m mVar, int i14) {
        m1841MarkdownText6lElgYI(str, tVar, j4, i10, y0Var, lVar, aVar, lVar2, i11, mVar, u2.r.M(i12 | 1), i13);
        return sn.z.f31622a;
    }
}
