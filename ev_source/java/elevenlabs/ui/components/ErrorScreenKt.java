package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aI\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a]\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u000f\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u000f\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0012¨\u0006\u0018"}, d2 = {"Li3/t;", "modifier", "", "title", ParameterNames.TEXT, "Lp3/x;", "backgroundColor", "Lkotlin/Function0;", "Lsn/z;", "onRetry", "ErrorScreen-uDo3WH8", "(Li3/t;Ljava/lang/String;Ljava/lang/String;JLho/a;Lu2/m;II)V", "ErrorScreen", "button", "centerButton", "ErrorScreen-V-9fs2A", "(Li3/t;Ljava/lang/String;Ljava/lang/String;Lho/p;Lho/p;JLu2/m;II)V", "Preview_ErrorScreen", "(Lu2/m;I)V", "Preview_ErrorScreen_with_button", "Preview_ErrorScreen_with_small_button", "Preview_ErrorScreen_with_custom_text", "Preview_ErrorScreen_with_custom_text_multiline", "Preview_ErrorScreen_with_center_small_button", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ErrorScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0069  */
    /* renamed from: ErrorScreen-V-9fs2A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1836ErrorScreenV9fs2A(i3.t tVar, String str, String str2, ho.p pVar, ho.p pVar2, long j4, u2.m mVar, int i10, int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        String str3;
        int i14;
        int i15;
        String str4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j10;
        boolean z6;
        ho.p pVar3;
        i3.t tVar3;
        String str5;
        u2.q qVar;
        String str6;
        long j11;
        ho.p pVar4;
        u2.r1 r10;
        ho.p pVar5;
        boolean z10;
        String str7;
        String str8;
        int i21;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1924759451);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            str3 = str;
            if (qVar2.f(str3)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                str4 = str2;
                if (qVar2.f(str4)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                i17 = i11 & 8;
                if (i17 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (qVar2.h(pVar)) {
                        i18 = 2048;
                    } else {
                        i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i18;
                    i19 = i11 & 16;
                    if (i19 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (qVar2.h(pVar2)) {
                            i20 = 16384;
                        } else {
                            i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i20;
                        if ((196608 & i10) == 0) {
                            if ((i11 & 32) == 0) {
                                j10 = j4;
                                if (qVar2.e(j10)) {
                                    i21 = 131072;
                                    i12 |= i21;
                                }
                            } else {
                                j10 = j4;
                            }
                            i21 = 65536;
                            i12 |= i21;
                        } else {
                            j10 = j4;
                        }
                        if ((74899 & i12) != 74898) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar2.O(i12 & 1, z6)) {
                            qVar2.T();
                            int i24 = i10 & 1;
                            i3.q qVar3 = i3.q.f13017a;
                            if (i24 != 0 && !qVar2.y()) {
                                qVar2.R();
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                pVar3 = pVar;
                                pVar5 = pVar2;
                            } else {
                                if (i22 != 0) {
                                    tVar2 = qVar3;
                                }
                                pVar5 = null;
                                if (i23 != 0) {
                                    str3 = null;
                                }
                                if (i15 != 0) {
                                    str4 = null;
                                }
                                if (i17 != 0) {
                                    pVar3 = ComposableSingletons$ErrorScreenKt.INSTANCE.m1812getLambda$1852603355$ui_release();
                                } else {
                                    pVar3 = pVar;
                                }
                                if (i19 == 0) {
                                    pVar5 = pVar2;
                                }
                                if ((i11 & 32) != 0) {
                                    j10 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar2, 6);
                                    i12 &= -458753;
                                }
                            }
                            qVar2.q();
                            i3.t h10 = l1.n.h(tVar2, j10, p3.h0.f26395b);
                            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                            i3.t x10 = ib.i.x(elevenLabsTheme, qVar2, 6, h10);
                            i3.j jVar = i3.d.C0;
                            r1.x a10 = r1.w.a(r1.j.f29230c, jVar, qVar2, 48);
                            int hashCode = Long.hashCode(qVar2.T);
                            c3.o l4 = qVar2.l();
                            i3.t c5 = i3.a.c(x10, qVar2);
                            h4.h.f11920i.getClass();
                            i3.t tVar4 = tVar2;
                            h4.f fVar = h4.g.f11903b;
                            qVar2.b0();
                            int i25 = i12;
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            h4.e eVar = h4.g.f11907f;
                            u2.r.J(eVar, a10, qVar2);
                            h4.e eVar2 = h4.g.f11906e;
                            u2.r.J(eVar2, l4, qVar2);
                            Integer valueOf = Integer.valueOf(hashCode);
                            h4.e eVar3 = h4.g.f11908g;
                            u2.r.y(qVar2, valueOf, eVar3);
                            h4.d dVar = h4.g.f11909h;
                            u2.r.F(dVar, qVar2);
                            String str9 = str3;
                            h4.e eVar4 = h4.g.f11905d;
                            u2.r.J(eVar4, c5, qVar2);
                            String str10 = str4;
                            if (1.0f <= 0.0d) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            i3.t x11 = ib.i.x(elevenLabsTheme, qVar2, 6, r1.p2.e(new r1.m1(1.0f, true), 1.0f));
                            r1.x a11 = r1.w.a(r1.j.f29232e, jVar, qVar2, 54);
                            long j12 = j10;
                            int hashCode2 = Long.hashCode(qVar2.T);
                            c3.o l7 = qVar2.l();
                            i3.t c10 = i3.a.c(x11, qVar2);
                            qVar2.b0();
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            u2.r.J(eVar, a11, qVar2);
                            u2.r.J(eVar2, l7, qVar2);
                            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                            u2.r.J(eVar4, c10, qVar2);
                            if (str9 == null) {
                                qVar2.X(658816193);
                                str7 = kj.c.R(qVar2, R.string.error_screen_title);
                                z10 = false;
                                qVar2.p(false);
                            } else {
                                z10 = false;
                                qVar2.X(658815914);
                                qVar2.p(false);
                                str7 = str9;
                            }
                            j7.d(str7, null, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, 6).getTitleLarge700Inter(), qVar2, 0, 0, 130046);
                            if (str10 == null) {
                                qVar2.X(658823363);
                                String R = kj.c.R(qVar2, R.string.error_screen_content);
                                qVar2.p(z10);
                                str8 = R;
                            } else {
                                qVar2.X(658823115);
                                qVar2.p(z10);
                                str8 = str10;
                            }
                            j7.d(str8, r1.d.I(qVar3, t2.u.P, elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), t2.u.P, t2.u.P, 13), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, 6).getBodyLarge500(), qVar2, 0, 0, 130044);
                            if (pVar5 != null) {
                                qVar2.X(-1051022530);
                                r1.d.g(r1.p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), qVar2);
                                j0.c.q((i25 >> 12) & 14, pVar5, qVar2, z10);
                            } else {
                                qVar2.X(-1050912015);
                                qVar2.p(z10);
                            }
                            qVar2.p(true);
                            j0.c.q((i25 >> 9) & 14, pVar3, qVar2, true);
                            pVar4 = pVar5;
                            qVar = qVar2;
                            str5 = str9;
                            str6 = str10;
                            j11 = j12;
                            tVar3 = tVar4;
                        } else {
                            qVar2.R();
                            pVar3 = pVar;
                            tVar3 = tVar2;
                            str5 = str3;
                            qVar = qVar2;
                            str6 = str4;
                            j11 = j10;
                            pVar4 = pVar2;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.k(tVar3, str5, str6, pVar3, pVar4, j11, i10, i11);
                            return;
                        }
                        return;
                    }
                    if ((196608 & i10) == 0) {
                    }
                    if ((74899 & i12) != 74898) {
                    }
                    if (qVar2.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                i19 = i11 & 16;
                if (i19 == 0) {
                }
                if ((196608 & i10) == 0) {
                }
                if ((74899 & i12) != 74898) {
                }
                if (qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            str4 = str2;
            i17 = i11 & 8;
            if (i17 != 0) {
            }
            i19 = i11 & 16;
            if (i19 == 0) {
            }
            if ((196608 & i10) == 0) {
            }
            if ((74899 & i12) != 74898) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        str3 = str;
        i15 = i11 & 4;
        if (i15 == 0) {
        }
        str4 = str2;
        i17 = i11 & 8;
        if (i17 != 0) {
        }
        i19 = i11 & 16;
        if (i19 == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        if ((74899 & i12) != 74898) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0053  */
    /* renamed from: ErrorScreen-uDo3WH8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1837ErrorScreenuDo3WH8(i3.t tVar, String str, String str2, long j4, final ho.a aVar, u2.m mVar, final int i10, final int i11) {
        final i3.t tVar2;
        int i12;
        int i13;
        String str3;
        int i14;
        int i15;
        String str4;
        int i16;
        long j10;
        boolean z6;
        final String str5;
        final String str6;
        final long j11;
        u2.r1 r10;
        i3.t tVar3;
        String str7;
        i3.t tVar4;
        int i17;
        int i18;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(267049111);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            str3 = str;
            if (qVar.f(str3)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                str4 = str2;
                if (qVar.f(str4)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        j10 = j4;
                        if (qVar.e(j10)) {
                            i18 = 2048;
                            i12 |= i18;
                        }
                    } else {
                        j10 = j4;
                    }
                    i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i12 |= i18;
                } else {
                    j10 = j4;
                }
                if ((i10 & 24576) == 0) {
                    if (qVar.h(aVar)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    qVar.T();
                    if ((i10 & 1) != 0 && !qVar.y()) {
                        qVar.R();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        str7 = str4;
                        tVar4 = tVar2;
                    } else {
                        if (i19 != 0) {
                            tVar3 = i3.q.f13017a;
                        } else {
                            tVar3 = tVar2;
                        }
                        if (i20 != 0) {
                            str3 = null;
                        }
                        if (i15 != 0) {
                            str4 = null;
                        }
                        if ((i11 & 8) != 0) {
                            j10 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar, 6);
                            i12 &= -7169;
                        }
                        str7 = str4;
                        tVar4 = tVar3;
                    }
                    long j12 = j10;
                    String str8 = str7;
                    String str9 = str3;
                    qVar.q();
                    m1836ErrorScreenV9fs2A(tVar4, str9, str8, c3.k.d(900828765, true, new d2(aVar, 1), qVar), null, j12, qVar, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896) | ((i12 << 6) & 458752), 16);
                    tVar2 = tVar4;
                    str5 = str9;
                    str6 = str8;
                    j11 = j12;
                } else {
                    qVar.R();
                    str5 = str3;
                    str6 = str4;
                    j11 = j10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.z0
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z ErrorScreen_uDo3WH8$lambda$1;
                            int intValue = ((Integer) obj2).intValue();
                            ErrorScreen_uDo3WH8$lambda$1 = ErrorScreenKt.ErrorScreen_uDo3WH8$lambda$1(i3.t.this, str5, str6, j11, aVar, i10, i11, (u2.m) obj, intValue);
                            return ErrorScreen_uDo3WH8$lambda$1;
                        }
                    };
                    return;
                }
                return;
            }
            str4 = str2;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        str3 = str;
        i15 = i11 & 4;
        if (i15 == 0) {
        }
        str4 = str2;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ErrorScreen_V_9fs2A$lambda$1(i3.t tVar, String str, String str2, ho.p pVar, ho.p pVar2, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1836ErrorScreenV9fs2A(tVar, str, str2, pVar, pVar2, j4, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ErrorScreen_uDo3WH8$lambda$0(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new o(5, aVar);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, r1.p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ErrorScreen_uDo3WH8$lambda$0$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ErrorScreen_uDo3WH8$lambda$1(i3.t tVar, String str, String str2, long j4, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        m1837ErrorScreenuDo3WH8(tVar, str, str2, j4, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ErrorScreen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(471258362);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1836ErrorScreenV9fs2A(null, null, null, null, null, 0L, qVar, 0, 63);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 7);
        }
    }

    public static final sn.z Preview_ErrorScreen$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ErrorScreen(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ErrorScreen_with_button(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1274558086);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1836ErrorScreenV9fs2A(null, null, null, ComposableSingletons$ErrorScreenKt.INSTANCE.m1811getLambda$1581190708$ui_release(), null, 0L, qVar, 3072, 55);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 3);
        }
    }

    public static final sn.z Preview_ErrorScreen_with_button$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ErrorScreen_with_button(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ErrorScreen_with_center_small_button(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-682167754);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1836ErrorScreenV9fs2A(null, null, null, null, ComposableSingletons$ErrorScreenKt.INSTANCE.getLambda$1449939249$ui_release(), 0L, qVar, 24576, 47);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 6);
        }
    }

    public static final sn.z Preview_ErrorScreen_with_center_small_button$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ErrorScreen_with_center_small_button(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ErrorScreen_with_custom_text(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2064432483);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1836ErrorScreenV9fs2A(null, "Title", "Text,", null, null, 0L, qVar, 432, 57);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 5);
        }
    }

    public static final sn.z Preview_ErrorScreen_with_custom_text$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ErrorScreen_with_custom_text(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ErrorScreen_with_custom_text_multiline(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(952713675);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1836ErrorScreenV9fs2A(null, "Title that takes more than one line", "Text that takes more than one line. It should take two lines or more.,", null, null, 0L, qVar, 432, 57);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 4);
        }
    }

    public static final sn.z Preview_ErrorScreen_with_custom_text_multiline$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ErrorScreen_with_custom_text_multiline(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ErrorScreen_with_small_button(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(771244030);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1836ErrorScreenV9fs2A(null, null, null, ComposableSingletons$ErrorScreenKt.INSTANCE.m1810getLambda$1308823868$ui_release(), null, 0L, qVar, 3072, 55);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 8);
        }
    }

    public static final sn.z Preview_ErrorScreen_with_small_button$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ErrorScreen_with_small_button(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
